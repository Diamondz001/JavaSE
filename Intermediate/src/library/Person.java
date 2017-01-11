package library;

public class Person {

	private String name;
	private String address;
	private String email;
	private String telephone;
	private int id;
	private static int total;
	
	public Person(String name, String address, String email, String telephone){ //Constructor with full parameters
		this.name = name;
		this.address = address;
		this.email = email;
		this.telephone = telephone;
		total++;
		id = total;
	}
	
	public void updateInfo(String name, String address, String email, String telephone){ //Updates with new information
		this.name = name;
		this.address = address;
		this.email = email;
		this.telephone = telephone;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getTelephone() {
		return telephone;
	}

	public void setTelephone(String telephone) {
		this.telephone = telephone;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public static int getTotal() {
		return total;
	}

	public static void setTotal(int total) {
		Person.total = total;
	}
	
	
}
