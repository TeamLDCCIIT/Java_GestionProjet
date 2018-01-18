package gestionprojet.modele;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.Vector;

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
	private String description;
	//TODO ordonner la liste en fonction des dates de début et fin de chaque lot
	private ArrayList<Personne> personList = new ArrayList<Personne>();
	private ArrayList<Tache> tasks = new ArrayList<Tache>();
		
	//Constructeur
	/**
	 * Constructeur
	 * @param name String
	 * @param startDate Date
	 * @param endDate Date
	 */
	public Lot(String name, Date startDate, Date endDate) {
		this.name = name;
		this.startDate = startDate;
		this.endDate = endDate;
	}
	/**
	 * Constructeur
	 * @param name String
	 * @param startDate String
	 * @param endDate String
	 */
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
	/**
	 * Getter
	 * @return startDate Date
	 */
	public Date getStartDate(){
		return this.startDate;
	}
	/**
	 * Getter
	 * @return endDate Date
	 */
	public Date getEndDate(){
		return this.endDate;
	}
	/**
	 * Getter
	 * @return diff int
	 */
	public int getDurationInDays() {
		long diff = this.getEndDate().getTime() - this.getStartDate().getTime();
		diff = diff/(1000 * 60 * 60 * 24) +1;
		return (int)diff;
	}
	/**
	 * Getter
	 * return name String
	 */
	public String getName(){
		return this.name;
	}
	/**
	 * Getter
	 * @return personList ArrayList<Personne>
	 */
	public ArrayList<Personne> getPersonList(){
		return this.personList;
	}
	/**
	 * Getter
	 * @return tasks ArrayList<Tache>
	 */
	public ArrayList<Tache> getTasks(){
		return this.tasks;
	}
	
	public String getDescription(){
		return this.description;
	}
	
	//-------------Mutateurs--------------	
	/**
	 * Setter
	 * @param startDate Date
	 */
	public void setStartDate(Date startDate){
		this.startDate = startDate;
	}
	/**
	 * Setter
	 * @param endDate Date
	 */
	public void setEndDate(Date endDate){
		this.endDate = endDate;
	}
	/**
	 * Setter
	 * @param name String
	 */
	public void setName(String name){
		this.name = name;
	}
	/**
	 * Setter
	 * @param personList ArrayList<Personne>
	 */
	public void setPersonList(ArrayList<Personne> personList){
		this.personList = personList;
	}
	/**
	 * Setter
	 * @param tasks ArrayList<Tache>
	 */
	public void setTasks(ArrayList<Tache> tasks){
		this.tasks = tasks;
	}

	
	public void setDescription(String description){
		this.description = description;
	}
	
	//Méthodes
	//Renvoies la liste des dates entre le début et la fin d'un lot
	public ArrayList<String> getDatesBetween(){
		ArrayList<String> datesInRange = new ArrayList<>();
		
		Calendar calendar = new GregorianCalendar();
		calendar.setTime(this.getStartDate());
		
		Calendar endCalendar = new GregorianCalendar();
		endCalendar.setTime(this.getEndDate());
		
		while(calendar.before(endCalendar)){
			String result = calendar.getTime().toString();
			String[] parts = result.split(" ");
			result = parts[1] +" " + parts[2] + " " + parts[5];
			datesInRange.add(result);
			calendar.add(Calendar.DATE, 1);
		}
		String endResult = endCalendar.getTime().toString();
		String[] parts = endResult.split(" ");
		endResult = parts[1] +" " + parts[2] + " " + parts[5];
		datesInRange.add(endResult);
		
		return datesInRange;
	}
}
