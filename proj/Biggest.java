package proj;
import java.util.Scanner;
public class Biggest {
	public static void main(String args[]) {
		Scanner scanner=new Scanner(System.in);
		int a=scanner.nextInt();
		int b=scanner.nextInt();
		int c=scanner.nextInt();
		if(a>=b&&a>=c) {
			System.out.println(a+" is the biggest");
		}
		else if (b>=a&&b>=c) {
			System.out.println(b+" is the biggest");
		}
		else {
			System.out.println(c+" is the biggest");
		}
		scanner.close();
}
}
