package LAB1;
import java.util.Scanner;
public class Swapbags {
	public static void main(String args[]) {
		Scanner scanner=new Scanner(System.in);
		int tombag=scanner.nextInt();
		int jerrybag=scanner.nextInt();
	int temp;
	if(tombag<jerrybag) {
	temp=tombag;
	tombag=jerrybag;
	jerrybag=temp;
	System.out.println("Tom: "+tombag+"\nJerry:"+jerrybag);
	}else {
		System.out.println("Tom: "+tombag+"\nJerry:"+jerrybag);
	}
scanner.close();
}
}