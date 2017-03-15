import java.io.PrintStream;
import java.util.HashMap;
import java.util.Scanner;

public class Wertyu {

	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		PrintStream out = new PrintStream(System.out);				

		char[] badChars = {'1', '2', '3', '4', '5', '6', '7', '8','9', '0', '-', '=',
				'W', 'E', 'R', 'T', 'Y', 'U', 'I', 'O', 'P', '[', ']',  
				'S', 'D', 'F', 'G', 'H', 'J', 'K', 'L', ';', '\'', 
				'X', 'C', 'V', 'B', 'N', 'M', ',', '.', '/', ' '};
		//ArrayList test = new 
		char[] goodChars = {'`', '1', '2', '3', '4', '5', '6', '7', '8','9', '0','-',
				'Q', 'W', 'E', 'R', 'T', 'Y', 'U', 'I', 'O', 'P', '[',
				'A', 'S', 'D', 'F', 'G', 'H', 'J', 'K', 'L', ';', 
				'Z', 'X', 'C', 'V', 'B', 'N', 'M', ',', '.', ' '};
		
		HashMap<Character, Character> charMap = new HashMap<Character, Character>();
		
		out.println(badChars.length);
		out.println(goodChars.length);
		
		for(int i = 0; i < goodChars.length; i++)
		{
			charMap.put(badChars[i], goodChars[i]);
		}
		
		while(sc.hasNextLine())
		{
		String input = sc.nextLine();
		String output = "";
		/*if(input.equals("QAZ"))
		{
			return;
		}
		else{*/
			for(int i = 0; i < input.length(); i++)
			{	
				char inputChar = input.charAt(i);
				char replacement = charMap.get(inputChar);
				//out.print(replacement);
				output = output + replacement;
				//out.print(output);
			}
			
		//}
		out.println(output);
		}

	}

}
