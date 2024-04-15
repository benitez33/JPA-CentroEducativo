package CentroEducativo;

import javax.swing.JFrame;
import javax.swing.JTabbedPane;

import CentroEducativo.vistas.PanelValoracionMateria;

public class Principal extends JFrame {

	static Principal instance = null;

	public static Principal getInstance() {
		if (instance == null) {
			instance = new Principal();
		}
		return instance;
	}

	JTabbedPane panelTabbed;
	PanelValoracionMateria panelValoracionMateria; 

	public PanelValoracionMateria getPanelValoracionMateria() {
		return panelValoracionMateria;
	}

	public void setPanelValoracionMateria(PanelValoracionMateria panelValoracionMateria) {
		this.panelValoracionMateria = panelValoracionMateria;
	}

	public void setPanelTabbed(JTabbedPane panelTabbed) {
		this.panelTabbed = panelTabbed;
	}

	public Principal() {
		super("Gestion de centro Educativo");
		this.setBounds(0, 0, 600, 450);
		panelTabbed = new JTabbedPane();

		panelValoracionMateria = new PanelValoracionMateria();
		
		panelTabbed.addTab("Valoracion materia: ", panelValoracionMateria);
		panelTabbed.setSelectedIndex(0);

		this.getContentPane().add(panelTabbed);

	}

	public JTabbedPane getPanelTabbed() {
		return panelTabbed;
	}

	public static void main(String[] args) {
		Principal.getInstance().setVisible(true);
	}

}
