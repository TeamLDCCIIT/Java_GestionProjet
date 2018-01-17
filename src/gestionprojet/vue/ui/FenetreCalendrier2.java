package gestionprojet.vue.ui;

import java.awt.BorderLayout;
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
import gestionprojet.modele.Lot;

public class FenetreCalendrier2 extends JFrame {

	// Attributs
	DefaultTableModel model;
	Calendar calendar = new GregorianCalendar();
	JLabel label;
		
	//Constructeur
	public FenetreCalendrier2(Calendrier calendrier) {
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
		
		model = new DefaultTableModel();
		model.addColumn(" ");
		//Ajout des dates dans le tableau
		//TODO ajouter taille mini pour une case
		for(String item :calendrier.getDatesBetween()){
			model.addColumn(item);
		}
					
		//Création du tableau
		JTable table = new JTable(model);
		//Barre de défilements 
		JScrollPane pane = new JScrollPane(table);
		
		this.add(panel, BorderLayout.NORTH);
		this.add(pane, BorderLayout.CENTER);
	}

	
	//Méthodes
	public static void main(String[] arguments) {
		JFrame.setDefaultLookAndFeelDecorated(true);
		FenetreCalendrier2 sc = new FenetreCalendrier2(new Calendrier("2018-01-01","2018-02-21"));
	}
	
	public void addLot(Lot lot){
		//model.addRow(calendrier.get);
		
	}
}
