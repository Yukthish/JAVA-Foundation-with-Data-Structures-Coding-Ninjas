import java.util.Scanner;
public class Solution {
    
    public static void main(String[] args) {
       int N, i, j;
        Scanner sc = new Scanner(System.in);
      
        N = sc.nextInt();
        System.out.println('*');
        for(i=1; i<=N; i++)
            {
                for(j=1; j<=i; j++)
                    {
                        if(j == 1)
                            System.out.print('*');
                            System.out.print(j);
                    }
                for(j=i-1; j>=1;j--)
                    {		
                        System.out.print(j);
                    }
                System.out.print('*');
                System.out.println();
            }
    
        for(i=N-1; i>=1;i--)
            {	
                for(j=1; j<=i; j++)
                    {
                        if(j == 1)
                            System.out.print('*');
                        System.out.print(j);
                    }
            for(j=i-1; j>=1;j--)
                {
                    System.out.print(j);
                }
            System.out.print('*');
            System.out.println();
        }
            System.out.println('*');
        
    }
}