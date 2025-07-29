package LAB1;
import java.util.Scanner;
public class Variousinput {
		public static void main(String args[]) {
			Scanner sc=new Scanner(System.in);
			int a;
			float b;
			char ch;
			System.out.println("Enter a integer");
			a=sc.nextInt();
			System.out.println("Enter a float");
			b=sc.nextFloat();
			System.out.println("Enter a character");
			ch=sc.next().charAt(0);
			System.out.println("Enter Your name");
			sc.nextLine();
			String name=sc.nextLine();
			System.out.println("Integer value is "+a);
			System.out.println("Float value is "+b);	
			System.out.println("Character value is "+ch);
			System.out.println("Your name is "+name);
			sc.close();
			
	}
		}

