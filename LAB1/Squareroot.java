package LAB1;
import java.util.Scanner;
public class Squareroot {
	public static void main(String args[]) {
		Scanner scanner=new Scanner(System.in);
		int number=scanner.nextInt();
		scanner.close();
	
		int i;
		for(i=1;i<=number;i++) {
		System.out.println(Math.sqrt(i));
		}
		
}
}