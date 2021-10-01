package zoo;

public class Animal {
	public String sound = "";
	
	public Animal() {
		// ??
	}
	
	public String getSound() {
		return sound;
	}
	
	public void getSound(String sound) {
		this.sound = sound;
	}
	public void makeSound() {
		System.out.println(sound);
	}
}
