import java.util.HashMap;

public class HashMapEx {

	public static void main(String[] args) {
	//We use map only to update, search, 
		//does not maintain any order
		// It has One null value, one key value
		// We can keep all String, Integer value
		
		 HashMap<String, String> capitals = new HashMap<String, String>();

		    // Add keys and values (Country, City)
		    capitals.put("Bangladesh", "Dhaka");
		    capitals.put("India", "New Delhi");
		    capitals.put("Swiss", "Bern");
		    capitals.put("Canada", "Toranto");
		    capitals.put("Germany", "Berlin");
		    System.out.println("Name of the Capitals: " +capitals);
		    
		    //access an item .get()
		    capitals.remove("Canada");
		    
		    // to clear
		    System.out.println(capitals.get("Canada"));
		    
		    //remove an iteam   .remove()
		    
		    System.out.println(capitals);
		    
		    //To clear 
		    
		    //To find the size   .size()
		    System.out.println(capitals.size());
		    
		    // Loop both type
		    
		    
		    
		
	}

}
