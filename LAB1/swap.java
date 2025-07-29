package LAB1;
import java.util.Scanner;
public class swap {
		public static void main(String args[]) {
		Scanner scanner=new Scanner(System.in);
		int A;
		int B;
		int temp;
		System.out.println("Enter value of A");
		A=scanner.nextInt();
		System.out.println("Enter value of B");
		B=scanner.nextInt();
		System.out.println("Before Swapping");
				System.out.println(A);
		System.out.println(B);
		temp=A;
		A=B;
		B=temp;
		System.out.println("After swapping");
		System.out.println(A);
		System.out.println(B);
		scanner.close();
		
	}
	}


