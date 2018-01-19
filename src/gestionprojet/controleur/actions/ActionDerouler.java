package gestionprojet.controleur.actions;
import javax.swing.AbstractAction;

import gestionprojet.view.ui.Fenetre.FenetreOption;

import java.awt.event.ActionEvent;

public class ActionDerouler extends AbstractAction{
	private static final long serialVersionUID = 1L;
	public static final String NOM_ACTION = "Plus";
	FenetreOption fenetre;
	/*
	 * @param fenetre
	 */
	public ActionDerouler(FenetreOption fenetre){
		super(NOM_ACTION);
		this.fenetre = fenetre;
	}

	public void actionPerformed(ActionEvent e) {
			fenetre.afficherMasquer();
		
	}
	
	
}
