package banana;

public class BananaDriver {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Server server = new Server();
		
		Phone phone = new Phone(server, "����");
		phone = new Phone(server, "��ȣ");
		phone = new Phone(server, "�ſ�");
		phone = new Phone(server, "����");
	}

}
