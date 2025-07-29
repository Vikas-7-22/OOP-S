package proj;
import java.util.Scanner;
public class Factorial {
	public static void main(String args[]) {
		Scanner scanner=new Scanner(System.in);
		int number=scanner.nextInt();
		int i=1;
		int fact=1;
		while(i<=number) {
			fact*=i;
			i++;
		}
		System.out.println("Factorial of "+number+" is "+fact);
		scanner.close();
		
}
}