package comparator;

public class Usuario {

	private String name;

	public Usuario(String name) {
		super();
		this.name = name;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Override
	public String toString() {
		return "Usuario [name=" + name + "]";
	}

}
