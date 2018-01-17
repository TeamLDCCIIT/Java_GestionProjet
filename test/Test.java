import gestionprojet.modele.Calendrier;

public class Test {

	public Test() {
	}

	public static void main(String[] args) {
			Calendrier c1 = new Calendrier("2017-01-01", "2017-10-21");
			
			System.out.println(c1.getStartDate());
			System.out.println(c1.getEndDate());
			System.out.println(c1.getDurationInDays());
			System.out.println(c1.getDatesBetween());
			System.out.println(c1.getDatesBetween().size());
	}

}
