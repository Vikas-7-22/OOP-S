package proj;

import java.util.Scanner;

public class Prime {
	public static void main(String args[]) {
		Scanner scanner=new Scanner(System.in);
		int n=scanner.nextInt();
		int i;
		int c=0;
		scanner.close();
	for(i=1;i<=n;i++)
	{
		if(n%i==0)
		c++;		
	}
	if(c==2){
	System.out.println(n+" is a prime");
	n--;
	}
	else{ 
	 System.out.println(n+" is not a prime");
	}

}
}