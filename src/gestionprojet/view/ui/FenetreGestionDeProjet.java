package gestionprojet.view.ui;

import javax.swing.JFrame;

public class FenetreGestionDeProjet extends JFrame {
//-------------Constantes-------------
	public static final String DEFAULT_TITLE = "Application Gestion de Projet";
//-------------Attributs-------------
	private static FenetreGestionDeProjet instance;
//-------------Constructeur-------------
	public FenetreGestionDeProjet() {
		this.setTitle(DEFAULT_TITLE);
		this.setDefaultCloseOperation(EXIT_ON_CLOSE);
		this.setLocationRelativeTo(null);
		this.pack();
	}
//-------------Getter-------------	
	public static FenetreGestionDeProjet getInstance(){
		if (instance==null){
			instance=new FenetreGestionDeProjet();
		}
		return instance;
	}
	
}
