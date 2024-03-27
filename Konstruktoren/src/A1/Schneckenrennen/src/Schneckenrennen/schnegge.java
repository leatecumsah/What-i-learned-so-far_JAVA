package A1.Schneckenrennen.src.Schneckenrennen;

public class schnegge {
	
	
	
	
	public static void main(String[] args) {
		
		

		Rennschnecke schnegge1=new Rennschnecke("Schneggbert");
		Rennschnecke schnegge2=new Rennschnecke("Schneggerich");
		Rennschnecke schnegge3=new Rennschnecke("Schneggiana");
		Rennschnecke schnegge4=new Rennschnecke("Schneggschee");
		Rennschnecke schnegge5=new Rennschnecke("Schnugge");
		
		Rennen schneggenrennen=new Rennen("Schneggerenne", 50);

		schneggenrennen.addRennschnecke(schnegge1);
		schneggenrennen.addRennschnecke(schnegge2);
		schneggenrennen.addRennschnecke(schnegge3);
		schneggenrennen.addRennschnecke(schnegge4);
		schneggenrennen.addRennschnecke(schnegge5);
		//schneggenrennen.addRennschnecke(schnegge1);
		//schneggenrennen.removeRennschnecke(schnegge1.getName());
		
		schneggenrennen.durchfuehren();
		
	}
}
