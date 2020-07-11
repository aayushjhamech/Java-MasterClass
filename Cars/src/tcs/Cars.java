package tcs;
public class Cars 
{
	private int id;
	private String name;
	private String fuel;
	private int mill;
	
	Cars(int id, String name, String fuel, int mill)
	{
		this.id= id;
		this.name= name;
		this.fuel= fuel;
		this.mill= mill;
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

	public String getFuel() {
		return fuel;
	}

	public void setFuel(String fuel) {
		this.fuel = fuel;
	}

	public int getMill() {
		return mill;
	}

	public void setMill(int mill) {
		this.mill = mill;
	}
	
	

}
