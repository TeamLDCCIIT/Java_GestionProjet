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
		
		nom = ((PanneauHautLot) fenetreO.getPanneauHaut()).getNom().getText();
		dateDebut= (Date) ((PanneauHautLot) fenetreO.getPanneauHaut()).getDateDebut().getModel().getValue();
		dateFin = (Date) ((PanneauHautLot) fenetreO.getPanneauHaut()).getDateFin().getModel().getValue();
		description = ((PanneauHautLot) fenetreO.getPanneauHaut()).getDescription().getText();
		fenetreDeP.getProject().getLotList().add(new Lot(nom, dateDebut,dateFin,description));
		fenetreDeP.afficherCalendrier();
		fenetreDeP.validate();
		fenetreO.dispose();
		}

	
}
