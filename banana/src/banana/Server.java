package banana;

import java.util.ArrayList;

public class Server {
	ArrayList<Client> clients = new ArrayList<Client>();
	
	public Server() {
		
	}
	
	public void register(Client client) {
		clients.add(client);
	}
	
	public void remove(Client client) {
		clients.remove(client);
	}

	public void newMsg(String msg) {
		for (Client client : clients) {
			client.update(msg);
		}
	}
}
