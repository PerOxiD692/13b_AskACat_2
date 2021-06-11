

public class SuperCat extends Pet{

	protected String name;
	
	public SuperCat(String name) {
		this.name = name;
	}

	// Frag irgendeine Katze --> Namen
	public void askACatItsName() {	
		System.out.println(Controller.getSomeRandomFelidae().getName(this));
	}
	
	
	// Frag irgendeine Katze --> Alter
	// (Cat) felidae | (Tomcat) felidae :: Downcasting
	public void askACatHerAge() {
		SuperCat felidae = Controller.getSomeRandomFelidae();
		if (felidae instanceof Cat) {
			System.out.println(((Cat) felidae).tellYourAge(this));	
		} else {
			System.out.println(((Tomcat) felidae).tellYourAge(this));
		}
	}
	
	// Frag irgendeine Katze --> Name
	// (Dog) pet | (SuperCat) pet :: Downcasting
	public String getName(Pet pet) {
		
		if (pet instanceof Dog) 
		{	
			return "Sorry " + ((Dog) pet).getName() + ", you're not a cat!";
		}
		else {
			if (((SuperCat) pet).name != this.name) {
				return "O.K. " + ((SuperCat) pet).name + ", my name is: " + ((SuperCat) pet).name + ".";
			} else {
				return "Yes, sometimes you don't know who you are, " + ((SuperCat) pet).name + ".";
			}
		}
	}
	
	@Override
	public void petSounds() {
		System.out.println(this.name + ": Meeeoow!");	
	}

}
