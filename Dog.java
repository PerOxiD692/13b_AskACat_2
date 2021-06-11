

public class Dog extends Pet {

	private String name;

	/**
	 * @param name
	 * 
	 */
	public Dog(String name) {
		this.name = name;
	}

	/**
	 * @return the name
	 */
	public String getName() {
		return name;
	}
	
	// Frag irgendeine Katze --> Namen
	public void askACatItsName() {
		System.out.println(Controller.getSomeRandomFelidae().getName(this));
	}

	@Override
	public void petSounds() {
		System.out.println(this.name + ": Bark!");	
	}
	
	
	
}
