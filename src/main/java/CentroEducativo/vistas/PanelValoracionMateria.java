package CentroEducativo.vistas;

import javax.swing.DefaultListModel;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.JPanel;

import CentroEducativo.controladores.ControladorEstudiante;
import CentroEducativo.controladores.ControladorMateria;
import CentroEducativo.controladores.ControladorProfesor;
import CentroEducativo.controladores.ControladorValoracionMateria;
import CentroEducativo.controladores.SuperControlador;
import CentroEducativo.entidades.Estudiante;
import CentroEducativo.entidades.Materia;
import CentroEducativo.entidades.Profesor;

import java.awt.GridBagLayout;
import java.awt.GridBagConstraints;
import java.awt.Insets;
import java.awt.Color;
import javax.swing.JList;
import javax.swing.JOptionPane;

import java.awt.event.ActionListener;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.awt.event.ActionEvent;
import javax.swing.JFormattedTextField;

public class PanelValoracionMateria extends JPanel {

	private static final long serialVersionUID = 1L;
	JComboBox<Materia> comboBoxMateria;
	JComboBox<Profesor> comboBoxProfesor;
	JComboBox<Integer> comboBoxNota;
	JList<Estudiante> listNoSeleccionados;
	JList<Estudiante> listSeleccionados;
	private DefaultListModel<Estudiante> listMNoSeleccionados;
	private DefaultListModel<Estudiante> listMSeleccionados;
	private JFormattedTextField jftf;

	/**
	 * Create the panel.
	 */
	public PanelValoracionMateria() {
		GridBagLayout gridBagLayout = new GridBagLayout();
		gridBagLayout.columnWidths = new int[] { 0, 0 };
		gridBagLayout.rowHeights = new int[] { 126, 0, 0, 0 };
		gridBagLayout.columnWeights = new double[] { 1.0, Double.MIN_VALUE };
		gridBagLayout.rowWeights = new double[] { 0.0, 1.0, 0.0, Double.MIN_VALUE };
		setLayout(gridBagLayout);

		JPanel panelArriba = new JPanel();
		panelArriba.setBackground(new Color(189, 177, 255));
		GridBagConstraints gbc_panelArriba = new GridBagConstraints();
		gbc_panelArriba.insets = new Insets(0, 0, 5, 0);
		gbc_panelArriba.fill = GridBagConstraints.BOTH;
		gbc_panelArriba.gridx = 0;
		gbc_panelArriba.gridy = 0;
		add(panelArriba, gbc_panelArriba);
		GridBagLayout gbl_panelArriba = new GridBagLayout();
		gbl_panelArriba.columnWidths = new int[] { 0, 0, 0 };
		gbl_panelArriba.rowHeights = new int[] { 0, 0, 0, 0, 0, 0 };
		gbl_panelArriba.columnWeights = new double[] { 0.0, 1.0, Double.MIN_VALUE };
		gbl_panelArriba.rowWeights = new double[] { 0.0, 0.0, 0.0, 0.0, 0.0, Double.MIN_VALUE };
		panelArriba.setLayout(gbl_panelArriba);

		JLabel lblMateria = new JLabel("Materia:");
		GridBagConstraints gbc_lblMateria = new GridBagConstraints();
		gbc_lblMateria.anchor = GridBagConstraints.EAST;
		gbc_lblMateria.insets = new Insets(0, 0, 5, 5);
		gbc_lblMateria.gridx = 0;
		gbc_lblMateria.gridy = 0;
		panelArriba.add(lblMateria, gbc_lblMateria);

		comboBoxMateria = new JComboBox();
		comboBoxMateria.setToolTipText("");
		GridBagConstraints gbc_comboBoxMateria = new GridBagConstraints();
		gbc_comboBoxMateria.insets = new Insets(0, 0, 5, 0);
		gbc_comboBoxMateria.fill = GridBagConstraints.HORIZONTAL;
		gbc_comboBoxMateria.gridx = 1;
		gbc_comboBoxMateria.gridy = 0;
		panelArriba.add(comboBoxMateria, gbc_comboBoxMateria);

		JLabel lblNewLabel = new JLabel("Profesor:");
		GridBagConstraints gbc_lblNewLabel = new GridBagConstraints();
		gbc_lblNewLabel.anchor = GridBagConstraints.EAST;
		gbc_lblNewLabel.insets = new Insets(0, 0, 5, 5);
		gbc_lblNewLabel.gridx = 0;
		gbc_lblNewLabel.gridy = 1;
		panelArriba.add(lblNewLabel, gbc_lblNewLabel);

		comboBoxProfesor = new JComboBox();
		GridBagConstraints gbc_comboBoxProfesor = new GridBagConstraints();
		gbc_comboBoxProfesor.insets = new Insets(0, 0, 5, 0);
		gbc_comboBoxProfesor.fill = GridBagConstraints.HORIZONTAL;
		gbc_comboBoxProfesor.gridx = 1;
		gbc_comboBoxProfesor.gridy = 1;
		panelArriba.add(comboBoxProfesor, gbc_comboBoxProfesor);

		JLabel lblNota = new JLabel("Nota:");
		GridBagConstraints gbc_lblNota = new GridBagConstraints();
		gbc_lblNota.insets = new Insets(0, 0, 5, 5);
		gbc_lblNota.anchor = GridBagConstraints.EAST;
		gbc_lblNota.gridx = 0;
		gbc_lblNota.gridy = 2;
		panelArriba.add(lblNota, gbc_lblNota);

		comboBoxNota = new JComboBox();
		GridBagConstraints gbc_comboBoxNota = new GridBagConstraints();
		gbc_comboBoxNota.insets = new Insets(0, 0, 5, 0);
		gbc_comboBoxNota.fill = GridBagConstraints.HORIZONTAL;
		gbc_comboBoxNota.gridx = 1;
		gbc_comboBoxNota.gridy = 2;
		panelArriba.add(comboBoxNota, gbc_comboBoxNota);

		JButton btnBotonDeActualizado = new JButton("Botón actualizar alumno");
		btnBotonDeActualizado.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				actualizarAlumnado();
			}
		});

		JLabel lblFecha = new JLabel("Fecha:");
		GridBagConstraints gbc_lblFecha = new GridBagConstraints();
		gbc_lblFecha.insets = new Insets(0, 0, 5, 5);
		gbc_lblFecha.anchor = GridBagConstraints.EAST;
		gbc_lblFecha.gridx = 0;
		gbc_lblFecha.gridy = 3;
		panelArriba.add(lblFecha, gbc_lblFecha);

		JFormattedTextField TextFieldFecha = new JFormattedTextField();
		GridBagConstraints gbc_TextFieldFecha = new GridBagConstraints();
		gbc_TextFieldFecha.insets = new Insets(0, 0, 5, 0);
		gbc_TextFieldFecha.fill = GridBagConstraints.HORIZONTAL;
		gbc_TextFieldFecha.gridx = 1;
		gbc_TextFieldFecha.gridy = 3;
		panelArriba.add(getJFormattedTextFieldDatePersonalizado(), gbc_TextFieldFecha);
		GridBagConstraints gbc_btnBotonDeActualizado = new GridBagConstraints();
		gbc_btnBotonDeActualizado.anchor = GridBagConstraints.EAST;
		gbc_btnBotonDeActualizado.gridx = 1;
		gbc_btnBotonDeActualizado.gridy = 4;
		panelArriba.add(btnBotonDeActualizado, gbc_btnBotonDeActualizado);

		JPanel panelCentro = new JPanel();
		panelCentro.setBackground(new Color(249, 240, 107));
		GridBagConstraints gbc_panelCentro = new GridBagConstraints();
		gbc_panelCentro.insets = new Insets(0, 0, 5, 0);
		gbc_panelCentro.fill = GridBagConstraints.BOTH;
		gbc_panelCentro.gridx = 0;
		gbc_panelCentro.gridy = 1;
		add(panelCentro, gbc_panelCentro);
		GridBagLayout gbl_panelCentro = new GridBagLayout();
		gbl_panelCentro.columnWidths = new int[] { 0, 0, 0, 0, 0, 0, 0, 0 };
		gbl_panelCentro.rowHeights = new int[] { 0, 0, 0 };
		gbl_panelCentro.columnWeights = new double[] { 1.0, 0.0, 0.0, 0.0, 0.0, 0.0, 1.0, Double.MIN_VALUE };
		gbl_panelCentro.rowWeights = new double[] { 0.0, 1.0, Double.MIN_VALUE };
		panelCentro.setLayout(gbl_panelCentro);

		JLabel lblAlumnosNoSeleccionados = new JLabel("Alumnado no seleccionado");
		GridBagConstraints gbc_lblAlumnosNoSeleccionados = new GridBagConstraints();
		gbc_lblAlumnosNoSeleccionados.fill = GridBagConstraints.VERTICAL;
		gbc_lblAlumnosNoSeleccionados.insets = new Insets(0, 0, 5, 5);
		gbc_lblAlumnosNoSeleccionados.gridx = 0;
		gbc_lblAlumnosNoSeleccionados.gridy = 0;
		panelCentro.add(lblAlumnosNoSeleccionados, gbc_lblAlumnosNoSeleccionados);

		JLabel lblAlumnadoSeleccionado = new JLabel("Alumnado seleccionado");
		GridBagConstraints gbc_lblAlumnadoSeleccionado = new GridBagConstraints();
		gbc_lblAlumnadoSeleccionado.fill = GridBagConstraints.VERTICAL;
		gbc_lblAlumnadoSeleccionado.insets = new Insets(0, 0, 5, 0);
		gbc_lblAlumnadoSeleccionado.gridx = 6;
		gbc_lblAlumnadoSeleccionado.gridy = 0;
		panelCentro.add(lblAlumnadoSeleccionado, gbc_lblAlumnadoSeleccionado);

		listNoSeleccionados = new JList(this.getListModelNOSeleccionados());
		GridBagConstraints gbc_listNoSeleccionado = new GridBagConstraints();
		gbc_listNoSeleccionado.insets = new Insets(0, 0, 0, 5);
		gbc_listNoSeleccionado.fill = GridBagConstraints.BOTH;
		gbc_listNoSeleccionado.gridx = 0;
		gbc_listNoSeleccionado.gridy = 1;
		panelCentro.add(listNoSeleccionados, gbc_listNoSeleccionado);

		JPanel panel = new JPanel();
		panel.setBackground(new Color(255, 190, 111));
		GridBagConstraints gbc_panel = new GridBagConstraints();
		gbc_panel.fill = GridBagConstraints.HORIZONTAL;
		gbc_panel.gridwidth = 5;
		gbc_panel.insets = new Insets(0, 0, 0, 5);
		gbc_panel.gridx = 1;
		gbc_panel.gridy = 1;
		panelCentro.add(panel, gbc_panel);
		GridBagLayout gbl_panel = new GridBagLayout();
		gbl_panel.columnWidths = new int[] { 0, 0, 0, 0 };
		gbl_panel.rowHeights = new int[] { 0, 0, 0, 0, 0, 0, 0 };
		gbl_panel.columnWeights = new double[] { 0.0, 0.0, 0.0, Double.MIN_VALUE };
		gbl_panel.rowWeights = new double[] { 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, Double.MIN_VALUE };
		panel.setLayout(gbl_panel);

		JButton button_2 = new JButton(">");
		button_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				pasarASeleccionado();
			}
		});

		JButton button_1 = new JButton("<");
		button_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				quitarDeSeleccionado();
			}
		});

		JButton button = new JButton("<<");
		button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				quitarTodosDeSeleccionados();
			}
		});
		GridBagConstraints gbc_button = new GridBagConstraints();
		gbc_button.insets = new Insets(0, 0, 5, 5);
		gbc_button.gridx = 1;
		gbc_button.gridy = 1;
		panel.add(button, gbc_button);
		GridBagConstraints gbc_button_1 = new GridBagConstraints();
		gbc_button_1.insets = new Insets(0, 0, 5, 5);
		gbc_button_1.gridx = 1;
		gbc_button_1.gridy = 2;
		panel.add(button_1, gbc_button_1);
		GridBagConstraints gbc_button_2 = new GridBagConstraints();
		gbc_button_2.insets = new Insets(0, 0, 5, 5);
		gbc_button_2.gridx = 1;
		gbc_button_2.gridy = 3;
		panel.add(button_2, gbc_button_2);

		JButton button_3 = new JButton(">>");
		button_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				pasarTodosASeleccionados();
			}
		});
		GridBagConstraints gbc_button_3 = new GridBagConstraints();
		gbc_button_3.insets = new Insets(0, 0, 5, 5);
		gbc_button_3.gridx = 1;
		gbc_button_3.gridy = 4;
		panel.add(button_3, gbc_button_3);

		listSeleccionados = new JList(this.getListModelSeleccionados());
		GridBagConstraints gbc_listSeleccionado = new GridBagConstraints();
		gbc_listSeleccionado.fill = GridBagConstraints.BOTH;
		gbc_listSeleccionado.gridx = 6;
		gbc_listSeleccionado.gridy = 1;
		panelCentro.add(listSeleccionados, gbc_listSeleccionado);

		JPanel panelAbajo = new JPanel();
		GridBagConstraints gbc_panelAbajo = new GridBagConstraints();
		gbc_panelAbajo.fill = GridBagConstraints.BOTH;
		gbc_panelAbajo.gridx = 0;
		gbc_panelAbajo.gridy = 2;
		add(panelAbajo, gbc_panelAbajo);
		GridBagLayout gbl_panelAbajo = new GridBagLayout();
		gbl_panelAbajo.columnWidths = new int[] { 0, 0 };
		gbl_panelAbajo.rowHeights = new int[] { 15, 0, 0, 0 };
		gbl_panelAbajo.columnWeights = new double[] { 1.0, Double.MIN_VALUE };
		gbl_panelAbajo.rowWeights = new double[] { 0.0, 0.0, 0.0, Double.MIN_VALUE };
		panelAbajo.setLayout(gbl_panelAbajo);

		JButton btnGuardarLasNotas = new JButton("Guardar las notas de todos los alumnos seleccionados");
		btnGuardarLasNotas.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				guardar();
			}
		});
		GridBagConstraints gbc_btnGuardarLasNotas = new GridBagConstraints();
		gbc_btnGuardarLasNotas.insets = new Insets(0, 0, 5, 0);
		gbc_btnGuardarLasNotas.gridx = 0;
		gbc_btnGuardarLasNotas.gridy = 1;
		panelAbajo.add(btnGuardarLasNotas, gbc_btnGuardarLasNotas);

		cargarMaterias();
		cargarProfesores();
		cargarNotas();
	}

	/**
	 * 
	 */
	private void cargarMaterias() {
		List<Materia> lista = (List<Materia>) ControladorMateria.getInstance().findAll();

		for (Materia m : lista) {
			this.comboBoxMateria.addItem(m);
		}
	}

	/**
	 * 
	 */
	private void cargarProfesores() {
		List<Profesor> lista = (List<Profesor>) ControladorProfesor.getInstance().findAll();

		for (Profesor p : lista) {
			this.comboBoxProfesor.addItem(p);
		}
	}

	/**
	 * 
	 */
	private void cargarNotas() {
		for (int i = 0; i <= 10; i++) {
			this.comboBoxNota.addItem(i);
		}
	}

	/**
	 * 
	 */
	private void guardar() {
		List<Estudiante> estudiantes = getEstudiantesSeleccionados();

		if (estudiantes != null) {
			for (Estudiante estudiante : estudiantes) {
				if (SuperControlador.obtenerNota(estudiante, (Profesor) this.comboBoxProfesor.getSelectedItem(),
						(Materia) this.comboBoxMateria.getSelectedItem()) == null) {
					ControladorValoracionMateria.insert(estudiante, (Profesor) this.comboBoxProfesor.getSelectedItem(),
							(Materia) this.comboBoxMateria.getSelectedItem(),
							(Integer) this.comboBoxNota.getSelectedItem(), (Date) this.jftf.getValue());
				} else {
					ControladorValoracionMateria.update(estudiante, (Profesor) this.comboBoxProfesor.getSelectedItem(),
							(Materia) this.comboBoxMateria.getSelectedItem(),
							(Integer) this.comboBoxNota.getSelectedItem(), (Date) this.jftf.getValue());
				}
			}
		}
	}

	/**
	 * 
	 * @return
	 */
	private List<Estudiante> getEstudiantesSeleccionados() {

		List<Estudiante> l = new ArrayList<Estudiante>();
		for (int i = 0; i < this.listMSeleccionados.size(); i++) {
			Estudiante e = this.listMSeleccionados.get(i);
			l.add(this.listMSeleccionados.get(i));
		}

		return l;
	}

	/**
	 * 
	 */
	private void pasarASeleccionado() {
		Estudiante selectedEstudiante = null;
		int selectedIndex = listNoSeleccionados.getSelectedIndex();

		if (selectedIndex != -1) {
			selectedEstudiante = listMNoSeleccionados.getElementAt(selectedIndex);

		}

		listMSeleccionados.addElement(selectedEstudiante);
		listMNoSeleccionados.remove(selectedIndex);

	}

	/**
	 * 
	 */
	private void quitarDeSeleccionado() {
		Estudiante selectedEstudiante = null;
		int selectedIndex = listSeleccionados.getSelectedIndex();

		if (selectedIndex != -1) {
			selectedEstudiante = listMSeleccionados.getElementAt(selectedIndex);
		}

		listMNoSeleccionados.addElement(selectedEstudiante);
		listMSeleccionados.remove(selectedIndex);
	}

	/**
	 * 
	 */
	private void pasarTodosASeleccionados() {

		this.listMNoSeleccionados.removeAllElements();
		this.listMSeleccionados.removeAllElements();

		List<Estudiante> estudiantes = (List<Estudiante>) ControladorEstudiante.getInstance().findAll();

		for (Estudiante estudiante : estudiantes) {
			this.listMSeleccionados.addElement(estudiante);
		}
	}

	/**
	 * 
	 */
	private void quitarTodosDeSeleccionados() {

		this.listMNoSeleccionados.removeAllElements();
		this.listMSeleccionados.removeAllElements();

		List<Estudiante> estudiantes = (List<Estudiante>) ControladorEstudiante.getInstance().findAll();

		for (Estudiante estudiante : estudiantes) {
			this.listMNoSeleccionados.addElement(estudiante);
		}
	}

	/**
	 * 
	 */
	private void actualizarAlumnado() {
		this.listMNoSeleccionados.removeAllElements();
		this.listMSeleccionados.removeAllElements();

		List<Estudiante> estudiantes = (List<Estudiante>) ControladorEstudiante.getInstance().findAll();

		for (Estudiante estudiante : estudiantes) {
			if (SuperControlador.ordenarEstudiantes(estudiante, (Profesor) this.comboBoxProfesor.getSelectedItem(),
					(Materia) this.comboBoxMateria.getSelectedItem(),
					(Integer) this.comboBoxNota.getSelectedItem()) != null) {
				this.listMSeleccionados.addElement(estudiante);
			} else {
				this.listMNoSeleccionados.addElement(estudiante);

			}
		}

	}

	/**
	 * 
	 * @return
	 */
	public DefaultListModel<Estudiante> getListModelNOSeleccionados() {
		if (this.listNoSeleccionados == null) {
			this.listMNoSeleccionados = new DefaultListModel<Estudiante>();

		}
		return listMNoSeleccionados;
	}

	/**
	 * 
	 * @return
	 */
	public DefaultListModel<Estudiante> getListModelSeleccionados() {
		if (this.listMSeleccionados == null) {
			this.listMSeleccionados = new DefaultListModel<Estudiante>();

		}
		return listMSeleccionados;
	}

	/**
	 * 
	 * @return
	 */
	private JFormattedTextField getJFormattedTextFieldDatePersonalizado() {
		jftf = new JFormattedTextField(new JFormattedTextField.AbstractFormatter() {
			SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");

			@Override
			public String valueToString(Object value) throws ParseException {
				if (value != null && value instanceof Date) {
					return sdf.format(((Date) value));
				}
				return "";
			}

			@Override
			public Object stringToValue(String text) throws ParseException {
				try {
					return sdf.parse(text);
				} catch (Exception e) {
					JOptionPane.showMessageDialog(null, "Error en la fecha");
					return null;
				}
			}
		});
		jftf.setColumns(20);
		jftf.setValue(new Date());
		return jftf;
	}

}
