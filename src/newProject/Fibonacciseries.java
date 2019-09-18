package newProject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Fibonacciseries {
	
	public static void fibonacciseries(int number)
	{
		int fib[]=new int [number+1];
		 fib[0]=0;
		 fib[1]=1;
		 for (int i=2; i<number; i++)
		 {
			 fib[i]=fib[i-2]+fib[i-1];
			 System.out.println(fib[i]);
			 
		 }
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		fibonacciseries(10);
		
		
	}

}
