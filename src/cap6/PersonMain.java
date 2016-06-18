package cap6;

public class PersonMain {

	public static void main(String[] args) {
		PersonFactory<Person> personFactory = Person::new;
		Person person = personFactory.create("Stark", "Snow");
		System.out.println(person);
	}

}
