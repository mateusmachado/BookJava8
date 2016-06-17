package cap3;

public class Artist {

	private String name;
	private String lastName;
	private String location;

	public Artist(String name, String lastName, String location) {
		super();
		this.name = name;
		this.lastName = lastName;
		this.location = location;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getLocation() {
		return location;
	}

	public void setLocation(String location) {
		this.location = location;
	}

}
