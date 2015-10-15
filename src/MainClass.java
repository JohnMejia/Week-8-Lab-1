import java.util.Scanner;

public class MainClass {

	public static void main(String[] args) 
	{
		String name;
		int bYear;
		
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("What is your name?");
		name = input.next();
		System.out.println("What is your birthyear?");
		bYear = input.nextInt();
		
		int age = 2015 - bYear;
		
		System.out.printf("Hello %s, you are %d years old today!", name, age);
		
	}

}
