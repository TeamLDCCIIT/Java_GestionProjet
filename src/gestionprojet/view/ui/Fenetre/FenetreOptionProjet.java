package gestionprojet.view.ui.Fenetre;

import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JFrame;

import gestionprojet.view.ui.Panneau.PanneauBasicProjet;

public class FenetreOptionProjet extends FenetreOption {
//-------------Constantes-------------
	public static final String DEFAULT_TITLE = "Creer un Projet";
//-------------Attribut-------------
	private static FenetreOptionProjet instance;
	
	public static FenetreOptionProjet getInstance() {
		if (instance == null){
			instance = new FenetreOptionProjet();
		}
		return instance;
	}
	
	@Override
	void initPanneauHaut() {
		// TODO Auto-generated method stub
		
	}

	@Override
	void initPanneauBas() {
		// TODO Auto-generated method stub
		
	}



}
