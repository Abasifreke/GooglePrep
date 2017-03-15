import java.io.*;
import java.util.*;
import java.lang.Math;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */

	Scanner scanner = new Scanner(System.in);
	int N = scanner.nextInt();
	int lhs_diag = 0;
	int rhs_diag = 0;
	int [][] square = new int[N][N];

	for(int i =0; i < N; i++)
	{
	for(int j = 0; j <N; j++)
	{
		square[i][j] = scanner.nextInt();
		
	}
}
	scanner.close();
for(int k = 0; k < N; k++)
{
	lhs_diag += square[k][k];
	rhs_diag += square[k][N-k-1];
}

System.out.print(square);
System.out.printf("lhs_diag = %d and rhs_diag = %d\n", lhs_diag, rhs_diag);
System.out.println(Math.abs(lhs_diag-rhs_diag));
    }
}

