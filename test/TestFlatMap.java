import static org.junit.Assert.*;

import java.util.Arrays;
import java.util.List;

import org.junit.Test;

import cap3.FlatMap;

public class TestFlatMap {

		List<Integer> list1 = Arrays.asList(1,2);
		List<Integer> list2 = Arrays.asList(3,4);
		
		@Test
		public void testFlatMap(){
			List<Integer> finalList = Arrays.asList(1,2,3,4);
			assertEquals(finalList, FlatMap.joinLists(list1, list2));
		}
}
