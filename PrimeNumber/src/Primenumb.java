import java.util.Scanner;

public class Primenumb {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int number;
		boolean prime = true;
		Scanner input = new Scanner(System.in);
		System.out.println(" please gave a number:");
		number = input.nextInt();
		input.close();
		
		if (number < 1)
			System.out.println("Number need to be greater than 1");
		else if (number == 1)
			System.out.println("1 is neither Prime nor Composite");
		else {
			for (int divisor = 2; divisor <= (number/2); ) {
				prime = false;
				break;
				
			}
		}
		if(prime)
			System.out.printf("%d is a prime", number);
		else 
			System.out.printf("%d is a Composite",number);
		// iteration
		
		for (int i=2; i<number; i++) {
			System.out.println (" with 1st Iteration: " + i );
			if (number % i ==0) {
				prime = false;
				break;
			}
			
		}
		
		
		
	}

}

    
	
	
	


