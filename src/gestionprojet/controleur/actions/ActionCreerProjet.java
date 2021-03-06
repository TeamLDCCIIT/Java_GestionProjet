package gestionprojet.controleur.actions;
import java.awt.event.ActionEvent;

import javax.swing.AbstractAction;

import gestionprojet.view.ui.Fenetre.FenetreGestionDeProjet;
import gestionprojet.view.ui.Fenetre.FenetreOptionProjet;

public class ActionCreerProjet extends AbstractAction{
	private static final long serialVersionUID = 1L;
	public static final String NOM_ACTION = "Nouveau Projet";
	
	/**
	 * Action qui ouvre la fen�tre de creation de projet 
	 */
	public ActionCreerProjet(){
		super(NOM_ACTION);
	}
	@Override
	public void actionPerformed(ActionEvent e) {
		FenetreOptionProjet fenetre = FenetreOptionProjet.getInstance();
		fenetre.getBoutonValider().setAction(new ActionCreationP());
		fenetre.getBoutonAnnule().setAction(new ActionAnnuler(fenetre));
		fenetre.setVisible(true);
		}
	}
	



