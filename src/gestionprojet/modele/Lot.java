package gestionprojet.modele;
import java.util.ArrayList;
import java.util.Date;

/*
 * Par Céline MERAND
 * Le 08/01/2018
 */

public class Lot {

	//Attributs
	//TODO : liste de lots, revoir previousLot
	public Date startDate;
	public Date endDate;
	public int duration;
	public String name;
	//TODO A REVOIR
	public Lot previousLot;
	//TODO ordonner la liste en fonction des dates de début et fin de chaque lot
	public ArrayList<Personne> personneList = new ArrayList<Personne>();
	public ArrayList<String> toDoList = new ArrayList<String>();
		
	//Constructeur
	public Lot(String name, Date startDate, int duration) {
		this.name = name;
		this.startDate = startDate;
		this.duration = duration;
	}
	
	public Lot(String name, Date startDate, Date endDate){
		this(name, startDate, (int)getDateDiff(startDate, endDate));
	}
	
	//Accesseurs & Mutateurs
	public Date getStartDate(){
		return this.startDate;
	}
	
	public Date getEndDate(){
		return this.endDate;
	}
	
	public String name(){
		return this.name;
	}
		
	public void setStartDate(Date startDate){
		this.startDate = startDate;
	}
	
	public void setEndDate(Date endDate){
		this.endDate = endDate;
	}
	
	public void setName(String name){
		this.name = name;
	}
	
	//Méthodes
	public static long getDateDiff(Date date1, Date date2) {
	    long diffInMillies = date2.getTime() - date1.getTime();
	    return diffInMillies/(1000*3600*24);
	}
}
