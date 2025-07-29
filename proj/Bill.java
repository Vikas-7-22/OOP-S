package proj;
import java.util.Scanner;
public class Bill {
	public static void main(String args[]) {
		Scanner scanner=new Scanner(System.in);
		int bill=scanner.nextInt();
		int Maintanance=scanner.nextInt();
		int GST=scanner.nextInt();
		int Total=bill+Maintanance+GST;
		System.out.println("Toatal bill: "+Total);
		int discount;
		if(Total>1000) {
			discount=Total*10/100;
		}
		else {
			discount=Total*5/100;
		}
		int A=Total-discount;
		System.out.println("Discounted Price: "+discount);
		System.out.println("Amount To Pay:"+A);
		scanner.close();
	}
}

