
public class Array_OddEven {

	public static void main(String[] args) {
		int a[]={20,56,88,3,32,67};
		System.out.println("Odd Numbers:");  
		
		for(int i=0; i<a.length; i++){  
		if(a[i]%2!=0){  
		
		System.out.println(a[i]);  
		}  
		}  
		System.out.println("Even Numbers:");  
		for(int i=0;  i<a.length;  i++){  
		if(a[i]%2==0){  
		System.out.println(a[i]);  
		}  
		}  
		}
}