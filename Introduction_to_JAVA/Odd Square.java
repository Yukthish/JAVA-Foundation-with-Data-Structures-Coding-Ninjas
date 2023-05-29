import java.util.Scanner;
public class Main {
	
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
        sc = new Scanner(System.in);
		
		int rows = sc.nextInt();
		
		for (int i = 1; i <= rows; i++) 
		{
			for (int j = i - 1; j < rows; j++ ) 
			{
				System.out.print(j*2+1+"");
			}
			for(int k = 0; k < i - 1; k++) 
			{
				System.out.print(k*2+1+"");
			}
			System.out.println();
		}
	}
}
