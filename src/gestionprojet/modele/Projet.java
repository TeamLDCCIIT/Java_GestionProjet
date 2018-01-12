package gestionprojet.modele;
import java.util.ArrayList;
import java.util.Date;

/*
 * Par Céline MERAND
 * Le 08/01/2018
 */

public class Projet {

	//Attributs
	private Date startDate;
	private Date endDate;
	public String name;
	public ArrayList<Lot> lotListe = new ArrayList<Lot>();
	public Calendrier calendrier;
	public ArrayList<Personne> lotMembre = new ArrayList<Personne>();
	
	//Constructeur
	public Projet(String name, Date startDate, Date endDate, Calendrier calendrier) {
		this.name = name;
		this.startDate = startDate;
		this.endDate = endDate;
		this.calendrier = calendrier;
	}
	
	//Accesseurs
	/*
	 *Non possibilité de modifier le nom ou les dates du projet 
	 *--> faciliter le projet au départ 
	 */
	
	public Date getStartDate(){
		return this.startDate;
	}
	
	public Date getEndDate(){
		return this.endDate;
	}
	
	public String getName(){
		return this.name;
	}
	
	//Méthodes

}
