import java.util.Scanner;

public class Stringmanipulator 
{

	public static void main(String[] args) 
	{
		Scanner keyboard= new Scanner(System.in);
		System.out.print("Please enter your name:  ");
		
		String name = keyboard.nextLine();
		int nameLength = name.length(); 
		System.out.println(nameLength);
	
		char firstletter = name.charAt(0);
		char lastletter = name.charAt(nameLength-1 );
		System.out.println(firstletter);
		System.out.println(lastletter);
		
		System.out.println("Please tell me which letter you wnat to search for:  ");
		String letter = keyboard.nextLine();
		letter.indexOf(letter);
		
		
		name.substring(0,6);
		System.out.println();
	}


}
