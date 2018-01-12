package gestionprojet.modele;
import java.util.ArrayList;
import java.util.Date;

/*
 * Par Céline MERAND
 * Le 08/01/2018
 */

public class Lot {

	//Attributs
	//TODO : liste de lots
	private Date startDate;
	private Date endDate;
	private int duration;
	private String name;
	//TODO ordonner la liste en fonction des dates de début et fin de chaque lot
	private ArrayList<Personne> personList = new ArrayList<Personne>();
	private ArrayList<Tache> tasks = new ArrayList<Tache>();
		
	//Constructeur
	public Lot(String name, Date startDate, int duration) {
		this.name = name;
		this.startDate = startDate;
		this.duration = duration;
	}
	
	public Lot(String name, Date startDate, Date endDate){
		this(name, startDate, (int)getDateDiff(startDate, endDate));
	}
	
	//-----------Accesseurs------------
	public Date getStartDate(){
		return this.startDate;
	}
	
	public Date getEndDate(){
		return this.endDate;
	}
	
	public int getDuration(){
		return this.duration;
	}
	
	public String getName(){
		return this.name;
	}
	
	public ArrayList<Personne> getPersonList(){
		return this.personList;
	}
	
	public ArrayList<Tache> getTasks(){
		return this.tasks;
	}
	
	//-------------Mutateurs--------------	
	
	public void setStartDate(Date startDate){
		this.startDate = startDate;
	}
	
	public void setEndDate(Date endDate){
		this.endDate = endDate;
	}
	
	public void setDuration(int duration){
		this.duration = duration;
	}
	
	public void setName(String name){
		this.name = name;
	}
	
	public void setPersonList(ArrayList<Personne> personList){
		this.personList = personList;
	}
	
	public void setTasks(ArrayList<Tache> tasks){
		this.tasks = tasks;
	}
	
	//Méthodes
	public static long getDateDiff(Date date1, Date date2) {
	    long diffInMillies = date2.getTime() - date1.getTime();
	    return diffInMillies/(1000*3600*24);
	}
}
