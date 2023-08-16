package Strings;
import java.util.Scanner;

public class replace {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc= new Scanner(System.in);
		System.out.print("Enter your input string bevarsi- ");  
		String inputstring=  sc.nextLine();
		String otputstring=inputstring.replace("%20", " ");
	    System.out.println(otputstring.replace("/", "\\"));

	}

}
