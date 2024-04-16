package CentroEducativo;

import javax.swing.JFrame;
import javax.swing.JTabbedPane;

import CentroEducativo.vistas.PanelValoracionMateria;

public class Principal extends JFrame{

	static Principal instance = null;

	public static Principal getInstance() {
		if (instance == null) {
			instance = new Principal();
		}
		return instance;
	}
	
	PanelValoracionMateria panelValoracionMateria;
	
	public PanelValoracionMateria getPanelValoracionMateria() {
		return panelValoracionMateria;
	}

	public void setPanelValoracionMateria(PanelValoracionMateria panelValoracionMateria) {
		this.panelValoracionMateria = panelValoracionMateria;
	}

	public Principal() {
		super("Gestion valoración materia");
		this.setBounds(0,0,600,450);
		
		panelValoracionMateria = new PanelValoracionMateria();
		
		this.getContentPane().add(panelValoracionMateria);
		
	}

	public static void main(String[] args) {
		Principal.getInstance().setVisible(true);
	}

}
