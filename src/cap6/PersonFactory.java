package cap6;

public interface PersonFactory<P extends Person> {
	P create(String firstName, String lastName);
}