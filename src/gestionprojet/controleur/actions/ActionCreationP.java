package gestionprojet.controleur.actions;

import javax.swing.AbstractAction;

import gestionprojet.modele.Calendrier;
import gestionprojet.modele.Projet;
import gestionprojet.view.ui.Fenetre.FenetreGestionDeProjet;
import gestionprojet.view.ui.Fenetre.FenetreOptionProjet;
import gestionprojet.view.ui.Panneau.PanneauHautProjet;

import java.awt.event.ActionEvent;
import java.util.Date;

public class ActionCreationP extends AbstractAction{
	private static final long serialVersionUID = 1L;
	public static final String NOM_ACTION ="Valider";
	FenetreOptionProjet fenetre;
	
	public ActionCreationP(){
		super(NOM_ACTION);
		this.fenetre = fenetre;
	}
	@Override
	public void actionPerformed(ActionEvent e) {
		String nom;
		Date dateDebut;
		Date dateFin;
		
		FenetreGestionDeProjet fenetreDeP = FenetreGestionDeProjet.getInstance();
		FenetreOptionProjet fenetreO = FenetreOptionProjet.getInstance();
		
		nom=((PanneauHautProjet)fenetreO.getPanneauHaut()).getNomProjet().getText();
		dateDebut= (Date) ((PanneauHautProjet)fenetreO.getPanneauHaut()).getDatePickerDebut().getModel().getValue();
		dateFin =(Date) ((PanneauHautProjet)fenetreO.getPanneauHaut()).getDatePickerFin().getModel().getValue();
		
		fenetreDeP.setProjet(new Projet(nom, new Calendrier(dateDebut, dateFin)));
		fenetreDeP.setTitle(nom+dateDebut.toString()+dateFin.toString());
		fenetreDeP.pack();
		fenetreO.dispose();
	}
	

}
