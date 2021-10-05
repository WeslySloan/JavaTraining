package zoo;

public class Animal {
	public String sound = "";
	
	public Animal(String sound) {
		this.sound = sound;
	}

	public String getSound() {
		return sound;
	}

	public void setSound(String sound) {
		this.sound = sound;
	}
	
	public void makeSound() {
		System.out.println(sound);
	}
}
