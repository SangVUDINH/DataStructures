package sort.arrays;


public class Recursion {
	
	public static void main(String[] args) {
		System.out.println(iterativeFactorive(3));
		System.out.println(recursiveFactorive(3));
	}

	public static int iterativeFactorive (int num) {
		if (num ==0) {
			return 1;
		}
		
		int factorial = 1;
		
		for(int i =1 ; i<= num;i++) {
			factorial *=i;
		}
		
		return factorial;
	}
	
	public static int recursiveFactorive (int num) {
		if (num ==0) {
			return 1;
		}
		return num *recursiveFactorive(num-1);
	}
}
