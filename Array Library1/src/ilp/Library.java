package ilp;

public class Library 
{
	private int id; 
	private String name;
	private String address;
	
	Library(int id, String name, String address)
	{
		this.id= id;
		this.address= address;
		this.name= name;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
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
	
	

}