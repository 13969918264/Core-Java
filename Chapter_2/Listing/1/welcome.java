/**
 * This program displays a greeting for the reader
 * @version 1.8_121
 * @date  2019-06-08
 * @author 赵子豪 
 */
public class welcome{
	public static void main(String[] args)
	{
		String greeting = "Welcome to core java!";
		System.out.println(greeting);
		for (int i = 0; i < greeting.length();  i++)
			System.out.print("=");
		System.out.println();
	}
}
