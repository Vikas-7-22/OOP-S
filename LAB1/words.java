package LAB1;
import java.util.Scanner;
public class words {
	public static void main(String args[]) {
		Scanner scanner=new Scanner(System.in);
		System.out.println("Enter a number 0-9");
		int digit=scanner.nextInt();
		switch(digit) {
		case 0:
			System.out.println("Zero");
			break;
		case 1:
			System.out.println("One");
			break;
		case 2:
			System.out.println("Two");
			break;
		case 3:
			System.out.println("Three");
			break;
		case 4:
			System.out.println("Four");
			break;
		case 5:
            System.out.println("FIVE");
            break;
        case 6:
            System.out.println("SIX");
            break;
        case 7:
            System.out.println("SEVEN");
            break;
        case 8:
            System.out.println("EIGHT");
            break;
        case 9:
            System.out.println("NINE");
            break;
            default: 
            	System.out.println("Incorrect input");
		}
		scanner.close();
		}
		
}

