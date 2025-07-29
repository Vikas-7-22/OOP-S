package LAB1;
import java.util.Scanner;
public class Fahrenheit {
	public static void main(String args[]) {
	Scanner scanner=new Scanner(System.in);
	float a;
	a=scanner.nextFloat();
	float Celsius;
	Celsius=(5.0f/9)*(a-32);
	System.out.println(Celsius);
	scanner.close();
}
}