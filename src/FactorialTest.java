import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Scanner;
public class FactorialTest {

	/**
	 * @param args
	 * @throws InterruptedException 
	 */
	public static void main(String[] args) throws InterruptedException {
		
		
		FactorialCash fc = new FactorialCash();
		
				
	    System.out.println("¬вед≥ть числo : "); 
	 
	     Scanner in = new Scanner(System.in);
	        int a = in.nextInt();
		
		
		System.out.println(Factorial.fact(a));
		
		
		System.out.println(fc.factorial(a));
		System.out.println(fc.factorial(a));
		

	}

}
