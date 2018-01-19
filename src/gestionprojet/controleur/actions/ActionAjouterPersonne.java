package gestionprojet.controleur.actions;

import java.awt.event.ActionEvent;
import java.util.ArrayList;

import javax.swing.AbstractAction;

import gestionprojet.modele.Personne;
import gestionprojet.modele.Projet;
import gestionprojet.view.ui.Fenetre.FenetreGestionDeProjet;
import gestionprojet.view.ui.Fenetre.FenetreOptionProjet;
import gestionprojet.view.ui.Panneau.PanneauBasProjet;

public class ActionAjouterPersonne extends AbstractAction {
	public static final String NOM_ACTION = "Ajouter";
	/**
	 * @param projet
	 */
	public ActionAjouterPersonne(){
		super(NOM_ACTION);
	}
	
	@Override
	public void actionPerformed(ActionEvent arg0) {
		PanneauBasProjet panneauBas = (PanneauBasProjet) FenetreOptionProjet.getInstance().getPanneauBas();
		
		String nom = panneauBas.getNom().getText();
		String prenom = panneauBas.getPrenom().getText();
		String fonction = panneauBas.getFonction().getText();
		ArrayList<Personne> personne = panneauBas.getPersonne();
		
		personne.add(new Personne(nom, prenom, fonction));
		panneauBas.toString(personne);
		FenetreOptionProjet.getInstance().pack();
		
	}

}
