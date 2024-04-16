package CentroEducativo.controladores;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.NoResultException;
import javax.persistence.Persistence;
import javax.persistence.Query;
import javax.persistence.TypedQuery;

import CentroEducativo.entidades.Entidad;
import CentroEducativo.entidades.Estudiante;
import CentroEducativo.entidades.Materia;
import CentroEducativo.entidades.Profesor;
import CentroEducativo.entidades.ValoracionMateria;

public class SuperControlador {

	private static String nombreTabla = "";
	private Class tipoEntidad;
	private static EntityManager em = null;

	public SuperControlador(String nombreTabla, Class tipoEntidad) {
		this.nombreTabla = nombreTabla;
		this.tipoEntidad = tipoEntidad;
	}

	private static void update(Entidad e) {
		EntityManager em = getEntityManager();
		em.getTransaction().begin();
		em.merge(e);
		em.getTransaction().commit();
	}

	public List<? extends Entidad> findAll() {
		return (List<Entidad>) getEntityManager()
				.createNativeQuery("SELECT * FROM " + nombreTabla + ";", this.tipoEntidad).getResultList();

	}
	
	

	protected static EntityManager getEntityManager() {
		if (em == null) {
			em = Persistence.createEntityManagerFactory("Centro Educativo").createEntityManager();
		}
		return em;
	}

	public static ValoracionMateria obtenerValoracion(Estudiante e, Profesor p, Materia m, Integer nota) {
		try {
			return (ValoracionMateria) getEntityManager().createNativeQuery(
					"SELECT * FROM valoracionmateria where " + e.getId() + " = idEstudiante and " + p.getId()
							+ " = idProfesor and " + m.getId() + " = idMateria and " + nota + " = valoracion;",
					ValoracionMateria.class).getSingleResult();
		}
		catch (NoResultException ex) {
			return null;
		}
		
	}
	
	
	public static void insert(Estudiante e, Profesor p, Materia m, Integer nota) {
		ValoracionMateria v = new ValoracionMateria();
		v.setIdEstudiante(e.getId());
		v.setIdMateria(m.getId());
		v.setIdProfesor(p.getId());
		v.setValoracion(nota);
		
		
		em.getTransaction().begin();
		em.persist(v);
		em.getTransaction().commit();
		
	}
	
	
	public static void update(Estudiante e, Profesor p, Materia m, Integer nota) {
		ValoracionMateria v = obtenerValoracionSinNota(e, p, m);
		
		v.setValoracion(nota);
		
		em.getTransaction().begin();
		em.persist(v);
		em.getTransaction().commit();
		
	}
	
	public static ValoracionMateria obtenerValoracionSinNota(Estudiante e, Profesor p, Materia m) {
		try {
			return (ValoracionMateria) getEntityManager().createNativeQuery(
					"SELECT * FROM valoracionmateria where " + e.getId() + " = idEstudiante and " + p.getId()
							+ " = idProfesor and " + m.getId() + " = idMateria;",
					ValoracionMateria.class).getSingleResult();
		}
		catch (NoResultException ex) {
			return null;
		}
		
	}

}
