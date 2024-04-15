package CentroEducativo.vistas;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.GridBagLayout;
import java.awt.GridBagConstraints;
import java.awt.Insets;
import javax.swing.JLabel;
import javax.swing.JComboBox;
import javax.swing.JButton;
import java.awt.Color;
import javax.swing.ImageIcon;
import javax.swing.JList;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class PanelValoracionMateria extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					PanelValoracionMateria frame = new PanelValoracionMateria();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public PanelValoracionMateria() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 350);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		GridBagLayout gbl_contentPane = new GridBagLayout();
		gbl_contentPane.columnWidths = new int[]{0, 0};
		gbl_contentPane.rowHeights = new int[]{84, 175, 0, 0};
		gbl_contentPane.columnWeights = new double[]{1.0, Double.MIN_VALUE};
		gbl_contentPane.rowWeights = new double[]{1.0, 1.0, 1.0, Double.MIN_VALUE};
		contentPane.setLayout(gbl_contentPane);
		
		JPanel panel = new JPanel();
		panel.setBackground(new Color(189, 177, 255));
		GridBagConstraints gbc_panel = new GridBagConstraints();
		gbc_panel.insets = new Insets(0, 0, 5, 0);
		gbc_panel.fill = GridBagConstraints.BOTH;
		gbc_panel.gridx = 0;
		gbc_panel.gridy = 0;
		contentPane.add(panel, gbc_panel);
		GridBagLayout gbl_panel = new GridBagLayout();
		gbl_panel.columnWidths = new int[]{0, 0, 0};
		gbl_panel.rowHeights = new int[]{0, 0, 0, 0, 0};
		gbl_panel.columnWeights = new double[]{0.0, 1.0, Double.MIN_VALUE};
		gbl_panel.rowWeights = new double[]{0.0, 0.0, 0.0, 0.0, Double.MIN_VALUE};
		panel.setLayout(gbl_panel);
		
		JLabel lblMateria = new JLabel("Materia:");
		GridBagConstraints gbc_lblMateria = new GridBagConstraints();
		gbc_lblMateria.anchor = GridBagConstraints.EAST;
		gbc_lblMateria.insets = new Insets(0, 0, 5, 5);
		gbc_lblMateria.gridx = 0;
		gbc_lblMateria.gridy = 0;
		panel.add(lblMateria, gbc_lblMateria);
		
		JComboBox comboBox = new JComboBox();
		GridBagConstraints gbc_comboBox = new GridBagConstraints();
		gbc_comboBox.insets = new Insets(0, 0, 5, 0);
		gbc_comboBox.fill = GridBagConstraints.HORIZONTAL;
		gbc_comboBox.gridx = 1;
		gbc_comboBox.gridy = 0;
		panel.add(comboBox, gbc_comboBox);
		
		JLabel lblProfesor = new JLabel("Profesor:");
		GridBagConstraints gbc_lblProfesor = new GridBagConstraints();
		gbc_lblProfesor.anchor = GridBagConstraints.EAST;
		gbc_lblProfesor.insets = new Insets(0, 0, 5, 5);
		gbc_lblProfesor.gridx = 0;
		gbc_lblProfesor.gridy = 1;
		panel.add(lblProfesor, gbc_lblProfesor);
		
		JComboBox comboBox_2 = new JComboBox();
		GridBagConstraints gbc_comboBox_2 = new GridBagConstraints();
		gbc_comboBox_2.insets = new Insets(0, 0, 5, 0);
		gbc_comboBox_2.fill = GridBagConstraints.HORIZONTAL;
		gbc_comboBox_2.gridx = 1;
		gbc_comboBox_2.gridy = 1;
		panel.add(comboBox_2, gbc_comboBox_2);
		
		JLabel lblNota = new JLabel("Nota:");
		GridBagConstraints gbc_lblNota = new GridBagConstraints();
		gbc_lblNota.anchor = GridBagConstraints.EAST;
		gbc_lblNota.insets = new Insets(0, 0, 5, 5);
		gbc_lblNota.gridx = 0;
		gbc_lblNota.gridy = 2;
		panel.add(lblNota, gbc_lblNota);
		
		JComboBox comboBox_1 = new JComboBox();
		GridBagConstraints gbc_comboBox_1 = new GridBagConstraints();
		gbc_comboBox_1.insets = new Insets(0, 0, 5, 0);
		gbc_comboBox_1.fill = GridBagConstraints.HORIZONTAL;
		gbc_comboBox_1.gridx = 1;
		gbc_comboBox_1.gridy = 2;
		panel.add(comboBox_1, gbc_comboBox_1);
		
		JButton btnBotnActualizarAlumnado = new JButton("Botón actualizar alumnado");
		GridBagConstraints gbc_btnBotnActualizarAlumnado = new GridBagConstraints();
		gbc_btnBotnActualizarAlumnado.anchor = GridBagConstraints.EAST;
		gbc_btnBotnActualizarAlumnado.gridx = 1;
		gbc_btnBotnActualizarAlumnado.gridy = 3;
		panel.add(btnBotnActualizarAlumnado, gbc_btnBotnActualizarAlumnado);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBackground(new Color(249, 240, 107));
		GridBagConstraints gbc_panel_1 = new GridBagConstraints();
		gbc_panel_1.insets = new Insets(0, 0, 5, 0);
		gbc_panel_1.fill = GridBagConstraints.BOTH;
		gbc_panel_1.gridx = 0;
		gbc_panel_1.gridy = 1;
		contentPane.add(panel_1, gbc_panel_1);
		GridBagLayout gbl_panel_1 = new GridBagLayout();
		gbl_panel_1.columnWidths = new int[]{0, 166, -22, 0, 0, 0, 0, 0, 0, 0};
		gbl_panel_1.rowHeights = new int[]{0, 71, 0, 0, 0};
		gbl_panel_1.columnWeights = new double[]{0.0, 0.0, 1.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, Double.MIN_VALUE};
		gbl_panel_1.rowWeights = new double[]{0.0, 1.0, 0.0, 0.0, 0.0};
		panel_1.setLayout(gbl_panel_1);
		
		JLabel lblNewLabel = new JLabel("Alumnado no seleccionado");
		GridBagConstraints gbc_lblNewLabel = new GridBagConstraints();
		gbc_lblNewLabel.gridwidth = 2;
		gbc_lblNewLabel.insets = new Insets(0, 0, 5, 5);
		gbc_lblNewLabel.gridx = 0;
		gbc_lblNewLabel.gridy = 0;
		panel_1.add(lblNewLabel, gbc_lblNewLabel);
		
		JLabel lblAlumnadoSeleccionado = new JLabel("Alumnado seleccionado");
		GridBagConstraints gbc_lblAlumnadoSeleccionado = new GridBagConstraints();
		gbc_lblAlumnadoSeleccionado.gridwidth = 2;
		gbc_lblAlumnadoSeleccionado.insets = new Insets(0, 0, 5, 0);
		gbc_lblAlumnadoSeleccionado.gridx = 7;
		gbc_lblAlumnadoSeleccionado.gridy = 0;
		panel_1.add(lblAlumnadoSeleccionado, gbc_lblAlumnadoSeleccionado);
		
		JPanel panel_3 = new JPanel();
		panel_3.setBackground(new Color(255, 120, 0));
		GridBagConstraints gbc_panel_3 = new GridBagConstraints();
		gbc_panel_3.insets = new Insets(0, 0, 0, 5);
		gbc_panel_3.gridwidth = 5;
		gbc_panel_3.gridheight = 4;
		gbc_panel_3.fill = GridBagConstraints.BOTH;
		gbc_panel_3.gridx = 2;
		gbc_panel_3.gridy = 1;
		panel_1.add(panel_3, gbc_panel_3);
		GridBagLayout gbl_panel_3 = new GridBagLayout();
		gbl_panel_3.columnWidths = new int[]{0, 0, 0, 0};
		gbl_panel_3.rowHeights = new int[]{0, 0, 0, 0, 0, 0, 0};
		gbl_panel_3.columnWeights = new double[]{0.0, 0.0, 0.0, Double.MIN_VALUE};
		gbl_panel_3.rowWeights = new double[]{0.0, 0.0, 0.0, 0.0, 0.0, 0.0, Double.MIN_VALUE};
		panel_3.setLayout(gbl_panel_3);
		
		JButton button = new JButton("<<");
		button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		GridBagConstraints gbc_button = new GridBagConstraints();
		gbc_button.insets = new Insets(0, 0, 5, 5);
		gbc_button.gridx = 1;
		gbc_button.gridy = 1;
		panel_3.add(button, gbc_button);
		
		JButton button_1 = new JButton("<");
		button_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		GridBagConstraints gbc_button_1 = new GridBagConstraints();
		gbc_button_1.insets = new Insets(0, 0, 5, 5);
		gbc_button_1.gridx = 1;
		gbc_button_1.gridy = 2;
		panel_3.add(button_1, gbc_button_1);
		
		JButton button_2 = new JButton(">");
		button_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		GridBagConstraints gbc_button_2 = new GridBagConstraints();
		gbc_button_2.insets = new Insets(0, 0, 5, 5);
		gbc_button_2.gridx = 1;
		gbc_button_2.gridy = 3;
		panel_3.add(button_2, gbc_button_2);
		
		JButton button_3 = new JButton(">>");
		GridBagConstraints gbc_button_3 = new GridBagConstraints();
		gbc_button_3.insets = new Insets(0, 0, 5, 5);
		gbc_button_3.gridx = 1;
		gbc_button_3.gridy = 4;
		panel_3.add(button_3, gbc_button_3);
		
		JList list = new JList();
		GridBagConstraints gbc_list = new GridBagConstraints();
		gbc_list.gridheight = 4;
		gbc_list.gridwidth = 2;
		gbc_list.insets = new Insets(0, 0, 0, 5);
		gbc_list.fill = GridBagConstraints.BOTH;
		gbc_list.gridx = 0;
		gbc_list.gridy = 1;
		panel_1.add(list, gbc_list);
		
		JList list_1 = new JList();
		GridBagConstraints gbc_list_1 = new GridBagConstraints();
		gbc_list_1.gridwidth = 2;
		gbc_list_1.gridheight = 4;
		gbc_list_1.fill = GridBagConstraints.BOTH;
		gbc_list_1.gridx = 7;
		gbc_list_1.gridy = 1;
		panel_1.add(list_1, gbc_list_1);
		
		JPanel panel_2 = new JPanel();
		GridBagConstraints gbc_panel_2 = new GridBagConstraints();
		gbc_panel_2.fill = GridBagConstraints.BOTH;
		gbc_panel_2.gridx = 0;
		gbc_panel_2.gridy = 2;
		contentPane.add(panel_2, gbc_panel_2);
		GridBagLayout gbl_panel_2 = new GridBagLayout();
		gbl_panel_2.columnWidths = new int[]{0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0};
		gbl_panel_2.rowHeights = new int[]{0, 0};
		gbl_panel_2.columnWeights = new double[]{0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, Double.MIN_VALUE};
		gbl_panel_2.rowWeights = new double[]{0.0, Double.MIN_VALUE};
		panel_2.setLayout(gbl_panel_2);
		
		JButton btnGuardarLasNotas = new JButton("Guardar las notas de todos los alumnos seleccionados");
		GridBagConstraints gbc_btnGuardarLasNotas = new GridBagConstraints();
		gbc_btnGuardarLasNotas.insets = new Insets(0, 0, 0, 5);
		gbc_btnGuardarLasNotas.gridx = 7;
		gbc_btnGuardarLasNotas.gridy = 0;
		panel_2.add(btnGuardarLasNotas, gbc_btnGuardarLasNotas);
	}

}
