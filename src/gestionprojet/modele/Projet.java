package gestionprojet.modele;
import java.util.ArrayList;
import java.util.Date;

/*
 * Par Céline MERAND
 * Le 08/01/2018
 */

public class Projet {

	//Attributs
	private String name;
	private ArrayList<Lot> lotList = new ArrayList<Lot>();
	private Calendrier calendar;
	private ArrayList<Personne> lotResponsible = new ArrayList<Personne>();
	
	//Constructeur
	//TODO ajouter les listes ?
	public Projet(String name, Calendrier calendar) {
		this.name = name;
		this.calendar = calendar;
	}
	
	//----------------------Accesseurs--------------------------
	/* 
	 *Non possibilité de modifier le nom ou les dates du projet 
	 *--> faciliter le projet au départ 
	 */
	public String getName(){
		return this.name;
	}
	
	public ArrayList<Lot> getLotList(){
		return this.lotList;
	}
	
	public Calendrier getCalendar(){
		return this.calendar;
	}
	
	public ArrayList<Personne> getLotResponsible(){
		return this.lotResponsible;
	}
	
	//------------------------Mutateurs--------------------------	
	public void setName(String name){
		this.name = name;
	}
	
	public void setLotList(ArrayList<Lot> lotList){
		this.lotList = lotList;
	}
	
	public void setCalendar(Calendrier calendar){
		this.calendar = calendar;
	}
	
	public void setLotResponsible(ArrayList<Personne> lotResponsible){
		this.lotResponsible = lotResponsible;
	}
	
	//Méthodes

}
