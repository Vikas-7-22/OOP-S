package proj;

import java.util.Scanner;

public class Oddeven {
	public static void main(String args[]) {
		Scanner scanner=new Scanner(System.in);
		int number=scanner.nextInt();
		if(number%2==0) {
			System.out.println("EVEN");
		}else {
			System.out.println("ODD");
		}
		scanner.close();
}
}
