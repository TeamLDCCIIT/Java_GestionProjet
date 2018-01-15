package gestionprojet.controleur.actions;
import gestionprojet.modele.Tache;
import java.awt.event.ActionEvent;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.List;

import javax.swing.AbstractAction;
import javax.swing.JFileChooser;




public class ActionEnregistrer extends AbstractAction{

	private static final long serialVersionUID =1L;
	public static final String NOM_ACTION = "Enregistrer";
	
	public ActionEnregistrer(){
		super(NOM_ACTION);
	}
	
	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		String action = e.getActionCommand();
		if(action.equals(NOM_ACTION)){
			this.enregistrerCalendrier();
		}
	}
	
	@Override
	public void enregistrerCalendrier(){
		// TODO Auto-generated method stub
		JFileChooser ch = new JFileChooser();
		ch.setDialogTitle("Enregistrer");
		if(ch.showSaveDialog(null)==JFileChooser.APPROVE_OPTION){
			File fichier = ch.getSelectedFile();
			List<Tache> taches = FenetreBeAnArtist.getInstance().getPanneauDessin().getVueFormes();
			if(fichier.getName().contains(".xml")){
				EnregistreurXML enregistreur = new EnregistreurXML();
				try {
					enregistreur.enregistreDessin(fichier.getAbsolutePath(), vues);
				} catch (FileNotFoundException ex) {
					// TODO Auto-generated catch block
					ex.printStackTrace();
				}
			}
		
	}
	
	
}
