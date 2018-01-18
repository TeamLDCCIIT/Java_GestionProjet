package gestionprojet.controleur.actions;

import javax.swing.AbstractAction;

import gestionprojet.view.ui.Fenetre.FenetreOptionProjet;

import java.awt.event.ActionEvent;

public class ActionCreationP extends AbstractAction{
	private static final long serialVersionUID = 1L;
	public static final String NOM_ACTION ="Valider";
	FenetreOptionProjet fenetre;
	
	public ActionCreationP(FenetreOptionProjet fenetre){
		super(NOM_ACTION);
		this.fenetre = fenetre;
	}
	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		fenetre.AfficherCreationProjet();
	}
	

}
