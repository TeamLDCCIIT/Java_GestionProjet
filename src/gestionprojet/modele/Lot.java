package gestionprojet.modele;
import java.text.SimpleDateFormat;
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
	private String name;
	//TODO ordonner la liste en fonction des dates de début et fin de chaque lot
	private ArrayList<Personne> personList = new ArrayList<Personne>();
	private ArrayList<Tache> tasks = new ArrayList<Tache>();
		
	//Constructeur
	public Lot(String name, Date startDate, Date endDate) {
		this.name = name;
		this.startDate = startDate;
		this.endDate = endDate;
	}
	
	public Lot(String name, String startDate, String endDate){
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-mm-dd");
		
		try{
			Date dd = sdf.parse(startDate);
			Date df = sdf.parse(endDate);
			
			if (df.after(dd)) {
				this.name = name;
				this.startDate = dd;
				this.endDate = df;
			} else {
				this.name = name;
				this.startDate = df;
				this.endDate = dd;
			}
		} catch(Exception ex) {
			throw new IllegalArgumentException("Mauvais format !!");
		}
		
	}
	
	//-----------Accesseurs------------
	public Date getStartDate(){
		return this.startDate;
	}
	
	public Date getEndDate(){
		return this.endDate;
	}
	
	public int getDurationInDays() {
		long diff = this.getEndDate().getTime() - this.getStartDate().getTime();
		diff = diff/(1000 * 60 * 60 * 24) +1;
		return (int)diff;
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
	
}
