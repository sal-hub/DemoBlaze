import java.util.HashSet;

public class HashSet_HashMap {

	public static void main(String[] args) {
		//Its a class & it  is coming from interface of iteam where every ieam is unique
		//It does not allow duplicte value & index
		
		HashSet<String> name =new HashSet<String>();
		
		//To add item we use.add();
		
		name.add("Razin");
		name.add("Mustafa");
		name.add("Saima");
		name.add("Atika");
		name.add("Farzana");
		name.add("Atika");
		name.add("Farzana");
		System.out.println("Name: "+ name);
		
		//To check an iteam exist or not .contains()
		
		System.out.println(name.contains("Saima"));
		System.out.println(name.contains("Any name"));
		
		//To Remove an item
		name.remove("Saima");
		System.out.println(name);
		
		//name.clear();
		//System.out.println(name);
		
		//To find out how many items there .size();
		
		System.out.println(name.size());
		
		
		// For-each-Loop
	
		for(String i:name) {
		System.out.println(i);
			
			
		}
	}

}
