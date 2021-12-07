package banana;

public class BananaDriver {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Server server = new Server();
		
		Phone phone = new Phone(server, "Á¤¹Î");
		phone = new Phone(server, "ÁöÈ£");
		phone = new Phone(server, "½Å¿µ");
		phone = new Phone(server, "ÁøÇõ");
	}

}
