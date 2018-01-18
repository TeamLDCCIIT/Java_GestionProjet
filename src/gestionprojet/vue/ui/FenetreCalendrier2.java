package gestionprojet.vue.ui;

import java.awt.BorderLayout;
import java.awt.Color;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.GregorianCalendar;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.SwingConstants;
import javax.swing.table.DefaultTableModel;

import gestionprojet.modele.Calendrier;
import gestionprojet.modele.Projet;

public class FenetreCalendrier2 extends JFrame {

	// Attributs
	DefaultTableModel model;
	Calendar calendar = new GregorianCalendar();
	JLabel label;
		
	//Constructeur
	public FenetreCalendrier2(Projet projet) {
		//Affichage de la fenêtre
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setTitle("Calendrier Gestion de Projet");
		this.setSize(1500, 800);
		this.setLayout(new BorderLayout());
		this.setVisible(true);

		//Cadre
		label = new JLabel();	
		label.setHorizontalAlignment(SwingConstants.CENTER);
		
		JPanel panel = new JPanel();
		panel.setLayout(new BorderLayout());
		
		//Taille du tableau (lignes, colonnes)
		//TODO Modifier le nombre de colonnes en fonction de la durée du projet
		
		model = new DefaultTableModel(projet.getLotList().size(),0);
		model.addColumn("Lots");
		//Ajout des dates dans le tableau
		for(String item :projet.getCalendar().getDatesBetween()){
			model.addColumn(item);
		}
		
		//Ajouter les lignes des lots ordonnés
		for (int k = 0; k < projet.getLotList().size(); k++){
			model.setValueAt(projet.getLotList().get(k).getName(), k, 0);
		}
					
		//Colorier les cases du tableau pendant la durée d'un lot
				ArrayList<String> projectDuration = projet.getCalendar().getDatesBetween();
				ArrayList<String> lotDuration;
				String value = "1";
				for (int h = 0; h < projet.getLotList().size(); h++){
					 lotDuration = projet.getLotList().get(h).getDatesBetween();
					 for (int i = 0; i < projectDuration.size(); i++){
						 for (int j = 0; j < lotDuration.size(); j++){
							 if (projectDuration.get(i) == lotDuration.get(j)){
								 model.setValueAt(value, h, i+1);
							 }
						 }
					 }
				}
				
				//Création du tableau
				JTable table = new JTable(model);
				//Disable réduction des colonnes
				 table.setAutoResizeMode(JTable.AUTO_RESIZE_OFF);
				//Barre de défilements 
				JScrollPane pane = new JScrollPane(table);
				
		
		this.add(panel, BorderLayout.NORTH);
		this.add(pane, BorderLayout.CENTER);
	}
	
	 //Méthodes	
	  public static void main(String[] arguments) {
	    JFrame.setDefaultLookAndFeelDecorated(true);
	    FenetreCalendrier2 sc = new FenetreCalendrier2(new Projet("Exemple",new Calendrier("2018-01-01","2018-02-21")));
	  }
}
	 
