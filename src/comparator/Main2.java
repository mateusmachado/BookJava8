package comparator;

import java.util.function.BiFunction;

public class Main2 {

	BiFunction<String, Integer, Usuario> createUser = Usuario::new;
	Usuario rodrigo = createUser.apply("Rodrigo Turini", 50);
	Usuario paulo = createUser.apply("Paulo Silveira", 300);

}
