package proj;
import java.util.Scanner;
public class Perfectnum {
	public static void main(String args[]) {
		Scanner scanner=new Scanner(System.in);
		int sum=0,num;
		num=scanner.nextInt();
	 for (int i = 1; i < num; i++) {
	        if (num % i == 0) {
	            sum += i;
	        }
	    }
	    if (sum == num && num != 0) {
	        System.out.println("It is a Perfect Number: "+ num);
	    } else {
	    	 System.out.println("It is not a Perfect Number: "+ num);
	    }
	    scanner.close();
}
}

