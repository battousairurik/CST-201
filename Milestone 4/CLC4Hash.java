package Examples;

import java.util.Hashtable;

public class CLC4Hash {
	
	Hashtable<Integer, Client> table = new Hashtable<Integer, Client>(11);
	
	private void addClients (){
		Client person = new Client (1234567, "Adam");
		addToTable(person);
		person = new Client (3455352, "Brenda");
		addToTable(person);
		person = new Client (9837373, "Brendon");
		addToTable(person);
		person = new Client (9871122, "Charles");
		addToTable(person);
		person = new Client (7894563, "Jeremiah");
		addToTable(person);
		person = new Client (8231573, "Katherine");
		addToTable(person);
		person = new Client (7574532, "Patrick");
		addToTable(person);
		person = new Client (1909383, "Raymond");
		addToTable(person);
		person = new Client (9296632, "Thorsten");
		addToTable(person);
	}
	private void addToTable (Client name){
		int key, number = name.getPhoneNumber();
		int salt = name.getClientName().length();
		key = hash(number, salt);
		do {
			if (table.get(key) == null){
				table.put(key, name);
				break;
			}
			key++;
			if (key > table.size()){key = 0;}
		} while (table.get(key) != null && key <= table.size());
	}
	private int convertNumber (int number){
		char [] space = Integer.toString(number).toCharArray();
		int temp = 0;
		for (int x = 0; x < 7; x++){
			temp += Character.getNumericValue(space[x]);
		}
		
		return temp;
	}
	private int hash (int num, int salt){
		int temp = convertNumber(num);
		int key = (temp + salt) % 11;
		return key;
	}
	private void displayTable (){
		for (int x = 0; x < 11; x++){
			if (table.get(x) != null)
				System.out.println(table.get(x).getClientName() + " " + table.get(x).getPhoneNumber());
		}
	}
	private void searchTable (int key, int salt){
		System.out.println(table.get(hash(key, salt)).getClientName());
		
	}
	public static void main(String[] args) {
		CLC4Hash example = new CLC4Hash();
		example.addClients();
		example.displayTable();
		example.searchTable(1234567, 4);
	}
}

class Client {
	
	private int phoneNumber;
	private String clientName;
	
	public Client (int number, String name){
		phoneNumber = number;
		clientName = name;
	}
	public int getPhoneNumber (){
		return phoneNumber;
	}
	public String getClientName (){
		return clientName;
	}
}
