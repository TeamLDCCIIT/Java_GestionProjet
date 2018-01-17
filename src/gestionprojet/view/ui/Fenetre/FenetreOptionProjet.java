package gestionprojet.view.ui.Fenetre;

import java.awt.Color;

import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JFrame;
import javax.swing.JPanel;

import gestionprojet.view.ui.Panneau.PanneauHautProjet;

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
		this.setPanneauHaut(new PanneauHautProjet());
		this.getPanneauHaut().setVisible(true);
		this.getContentPane().add(this.getPanneauHaut());
		
	}

	@Override
	void initPanneauBas() {
		// TODO Auto-generated method stub
		
	}



}
