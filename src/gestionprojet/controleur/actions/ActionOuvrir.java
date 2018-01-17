package gestionprojet.controleur.actions;
import gestionprojet.view.ui.*;
import javax.swing.AbstractAction;
import javax.swing.JFileChooser;


import java.io.File;
import java.io.FileNotFoundException;

import java.awt.event.ActionEvent;

public class ActionOuvrir extends AbstractAction{
	private static final long serialVersionUID = 1L;
	public static final String NOM_ACTION = "Ouvrir";
	
	public ActionOuvrir(){
		super(NOM_ACTION);
	}
	
	@Override
	public void actionPerformed(ActionEvent e) {
		JFileChooser ch = new JFileChooser();
		ch.setDialogTitle("Ouvrir");
		if(ch.showOpenDialog(null)==JFileChooser.APPROVE_OPTION){
			File fichier = ch.getSelectedFile();
		}
	}
	
}
