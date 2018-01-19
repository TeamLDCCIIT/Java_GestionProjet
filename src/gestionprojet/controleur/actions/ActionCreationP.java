package gestionprojet.controleur.actions;

import javax.swing.AbstractAction;

import gestionprojet.modele.Calendrier;
import gestionprojet.modele.Projet;
import gestionprojet.view.ui.Fenetre.FenetreGestionDeProjet;
import gestionprojet.view.ui.Fenetre.FenetreOptionProjet;
import gestionprojet.view.ui.Panneau.PanneauBasProjet;
import gestionprojet.view.ui.Panneau.PanneauHautProjet;

import java.awt.event.ActionEvent;
import java.util.Date;

public class ActionCreationP extends AbstractAction{
	private static final long serialVersionUID = 1L;
	public static final String NOM_ACTION ="Valider";
	
	public ActionCreationP(){
		super(NOM_ACTION);
	}
	@Override
	public void actionPerformed(ActionEvent e) {
		String nom;
		Date dateDebut;
		Date dateFin;
		
		FenetreGestionDeProjet fenetreDeP = FenetreGestionDeProjet.getInstance();
		FenetreOptionProjet fenetreO = FenetreOptionProjet.getInstance();
		
		PanneauHautProjet panneauHautProjet = ((PanneauHautProjet)fenetreO.getPanneauHaut());
		
		nom=panneauHautProjet.getNomProjet().getText();
		dateDebut= (Date) panneauHautProjet.getDatePickerDebut().getModel().getValue();
		dateFin =(Date) panneauHautProjet.getDatePickerFin().getModel().getValue();
		
		
		if(!nom.isEmpty() && dateDebut!=null && dateFin!=null){
		fenetreDeP.setProjet(new Projet(nom, new Calendrier(dateDebut, dateFin)));
		fenetreDeP.setTitle(nom+"  DU " +dateDebut.toLocaleString()+" AU  " +dateFin.toLocaleString());
		
		fenetreDeP.getProject().setLotResponsible(((PanneauBasProjet) fenetreO.getPanneauBas()).getPersonne());
		fenetreDeP.afficherCalendrier();
		
		fenetreDeP.pack();
		fenetreO.dispose();}
	}
	

}
