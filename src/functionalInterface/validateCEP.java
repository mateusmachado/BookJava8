package functionalInterface;

public abstract class validateCEP<T> {
	public static void main(String[] args) {

		Validator<String> validateCEP = v -> v.matches("[0-9]{5}-[0-9]{3}");
		System.out.println(validateCEP.validate("1234-567"));
		
	}
}