package proj;

import java.util.Scanner;

public class Sphere {
	public static void main(String args[]) {
		Scanner scanner=new Scanner(System.in);
		int R=scanner.nextInt();
		double k=(4f/3)*3.14;
		double Volume=k*R*R*R;
		System.out.println("Volume of a sphere "+Volume);
		scanner.close();
}
}