package comparator;

public class Usuario {

	private String name;
	private Integer points;

	public Usuario(String name, Integer points) {
		super();
		this.name = name;
		this.points = points;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Integer getPoints() {
		return points;
	}

	public void setPoints(Integer points) {
		this.points = points;
	}

	@Override
	public String toString() {
		return "Usuario [name=" + name + ", points=" + points + "]";
	}
}
