package Collection_Framework.Collection_Framework_Set;

import java.util.HashSet;
import java.util.Set;

public class Custom_Class_Set {

	public static void main(String[] args) {
		// Create a Set of Custom_Set_Class
		Set<Custom_Set_Class> cs_Set = new HashSet<>();

		// Add elements to the Set
		cs_Set.add(new Custom_Set_Class("Tushar", 24));
		cs_Set.add(new Custom_Set_Class("John", 30));
		cs_Set.add(new Custom_Set_Class("Tushar", 24)); // Duplicate, will not be added

		// Print the Set
		System.out.println(cs_Set);
	}

}
