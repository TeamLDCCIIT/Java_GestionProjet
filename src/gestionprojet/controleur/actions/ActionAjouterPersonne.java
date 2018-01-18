package gestionprojet.controleur.actions;

import java.awt.event.ActionEvent;

import javax.swing.AbstractAction;

import gestionprojet.modele.Projet;
import gestionprojet.view.ui.Fenetre.FenetreGestionDeProjet;

public class ActionAjouterPersonne extends AbstractAction {
	public static final String NOM_ACTION = "Ajouter";
	private Projet projet;
	/**
	 * @param projet
	 */
	public ActionAjouterPersonne(Projet projet){
		super(NOM_ACTION);
		this.projet = projet;
	}
	
	@Override
	public void actionPerformed(ActionEvent arg0) {
		
		
	}

}
