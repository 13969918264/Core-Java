/**
 * This program displays a greeting for the reader
 * @version 1.8_121
 * @date  2019-06-08
 * @author утвс╨ю 
 */
public class welcome{
	public static void main(String[] args)
	{
		String greeting = "Welcome to Core Java!";
		System.out.println(greeting);
		for (int i = 0; i < greeting.length();  i++)
			System.out.print("=");
		System.out.println();
	}
}
