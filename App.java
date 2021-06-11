
public class App {

	public static void main(String[] args) {
		
		// Controller als statische Klasse
		
		// Namenslisten  --> Array
		String [] dogNames = {"Fifi", "Boo", "Cassie", "Bonzo"};
		String [][] catAttributes = {{"Suzan","26"},{"Grizabella","29"}};
		String [][] tomcatAttributes = {{"Alonzo","30"},{"RumTumTugger","45"}};
		
		// Init Dogs
		for (int i = 0; i < dogNames.length; i++) {
			Controller.addNewDog(dogNames[i]);
		} 
		 
		// Init Cats
		for (int i = 0; i < catAttributes.length; i++) {
			Controller.addNewCat(catAttributes[i]);
		}
		
		// Init Tomcats
		for (int i = 0; i < tomcatAttributes.length; i++) {
			Controller.addNewTomcat(tomcatAttributes[i]);
		}
		
		System.out.println("----------------");
		
		// Hund --> Katze/Kater: Name??
		Controller.getSomeRandomDog().askACatItsName();		
		// Katze/Kater --> Katze/Kater: Name??
		Controller.getSomeRandomFelidae().askACatItsName();
		
		System.out.println("----------------");
		
		// Katze/Kater --> Katze/Kater: Alter??
		Controller.getSomeRandomFelidae().askACatHerAge();
		Controller.getSomeRandomFelidae().askACatHerAge();
		Controller.getSomeRandomFelidae().askACatHerAge();
		Controller.getSomeRandomFelidae().askACatHerAge();
		Controller.getSomeRandomFelidae().askACatHerAge();
		
		System.out.println("----------------");
		
		Controller.getSomeRandomDog().petSounds();
		Controller.getSomeRandomFelidae().petSounds();
		

	}

}
