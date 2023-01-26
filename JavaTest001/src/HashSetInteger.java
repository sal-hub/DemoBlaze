import java.util.HashSet;

public class HashSetInteger {

	public static void main(String[] args) {
		
		HashSet<Integer> number = new HashSet<Integer>();
		number.add(10);
		number.add(23);
		number.add(20);
		number.add(30);
		number.add(40);
		number.add(50);
		number.add(70);
		System.out.println(number);
		
		
		//show which numbers between 10 to 40
		for(int i=10; i<=15; i++) {
			
			if (number.contains(i)) {
			System.out.println(i + " found in the Hashset.");	
			
			}
			
			else {
				System.out.println(i + " not found in the Hashset");
				
			}
			
		}

	}

}
