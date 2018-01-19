package gestionprojet.controleur.actions;

import javax.swing.AbstractAction;

import gestionprojet.modele.Lot;
import gestionprojet.view.ui.Fenetre.FenetreGestionDeProjet;
import gestionprojet.view.ui.Fenetre.FenetreOptionLot;
import gestionprojet.view.ui.Panneau.PanneauHautLot;
import gestionprojet.view.ui.Panneau.PanneauHautProjet;

import java.awt.event.ActionEvent;
import java.util.Date;

public class ActionCreationL extends AbstractAction {

	private static final long serialVersionUID = 1L;
	public static final String NOM_ACTION ="Valider";
	
	/**
	 * Action qui créer un lot et l'ajoutee au calendrier
	 */
	public ActionCreationL(){
		super(NOM_ACTION);
	}
	@Override
	public void actionPerformed(ActionEvent e) {
		String nom;
		Date dateDebut;
		Date dateFin;
		String description;

		FenetreGestionDeProjet fenetreDeP = FenetreGestionDeProjet.getInstance();
		FenetreOptionLot fenetreO = FenetreOptionLot.getInstance();
		
		PanneauHautLot panneauHaut = ((PanneauHautLot) fenetreO.getPanneauHaut());

		nom = panneauHaut.getNom().getText();
		dateDebut= (Date) panneauHaut.getDateDebut().getModel().getValue();
		dateFin = (Date) panneauHaut.getDateFin().getModel().getValue();
		description = panneauHaut.getDescription().getText();
		
		if(!nom.isEmpty() && dateDebut!=null && dateFin!=null && description!=null){
		fenetreDeP.getProject().getLotList().add(new Lot(nom, dateDebut,dateFin,description));
		
		fenetreO.dispose();
		fenetreDeP.refreshTableau();
		}
	}


}
