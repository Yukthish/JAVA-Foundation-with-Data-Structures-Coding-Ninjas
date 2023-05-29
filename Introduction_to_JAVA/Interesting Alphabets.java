import java.util.Scanner;
public class Solution {
	public static void main(String[] args) {
		
		 Scanner s=new Scanner(System.in);
    int n=s.nextInt();
    int n1=n;
    int i=1;
    while(i<=n){
 
        int j=1;
        int c=('A'+n1-1);
        while(j<=i){
           
              System.out.print((char)(c));
              j++;
              c++;
             
        }   
        System.out.println();
        n1--;
        i++;
       
    } 
	
	}
}