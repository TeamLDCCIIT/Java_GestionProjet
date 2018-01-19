package gestionprojet.controleur.actions;
import java.awt.Window;
import java.awt.event.ActionEvent;

import javax.swing.AbstractAction;

public class ActionAnnuler extends AbstractAction{
	private static final long serialVersionUID = 1L;
	public static final String NOM_ACTION = "Annuler";
	Window fenetre;
	
	/**
	 * Action permettant d'annuler toutes actions de créations ou modifications
	 * @param fenetre
	 */
	public ActionAnnuler(Window fenetre){
		super(NOM_ACTION);
		this.fenetre = fenetre;
	}
	
	@Override
	public void actionPerformed(ActionEvent e) {
		fenetre.dispose();		
	}
}
