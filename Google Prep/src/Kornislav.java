
import java.io.PrintStream;
import java.util.Scanner;

public class Kornislav {
	
	public static double calculateArea(double a, double b)
	{
		double area = 0.5*a*b*Math.sin(60);
		return area;
	}
	
	
	public static void main(String[] args)
	{
		
		Scanner sc = new Scanner(System.in);
		PrintStream out = new PrintStream(System.out);				
		
		int inputNum = sc.nextInt();
		
		for(int i = 0; i < inputNum; i++)
		{
			int first = sc.nextInt();
			int second = sc.nextInt();
			int third = sc.nextInt();
			
			/*out.println(first);
			out.println(second);
			out.println(third);*/
			
			double area1 = calculateArea(first, second);
			double area2 = calculateArea(first, third);
			double area3 = calculateArea(second, third);
			/*out.println(area1);
			out.println(area2);
			out.println(area3);*/
			
			/*double result1 = Math.max(area1, area2);
			double result2 = Math.max(area1, area3);
			
			double finalResult = Math.max(result1, result2);*/

			double result = 0;
			
			if(result < area1)
				result = area1;
			if(result < area2)
				result = area2;
			if(result < area3)
				result = area3;
			out.println(result);
			
		}
		
		sc.close();
	}

	
}
