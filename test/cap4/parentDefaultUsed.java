package cap4;

import static org.junit.Assert.*;

import org.junit.Test;

public class parentDefaultUsed {
	
	@Test
	public void parentDefaultUsed(){
		Parent parent = new ParentImpl();
		parent.welcome();
		assertEquals("Parent: Hi!", parent.getLastMessage());
	}

}
