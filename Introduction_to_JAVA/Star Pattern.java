import java.util.Scanner;
public class Solution {


	public static void main(String[] args) {
		

        Scanner s=new Scanner(System.in);
        int n=s.nextInt();
        int i=1;
        while(i<=n){
            int space=1;
            while(space<=n-i){
                System.out.print(" ");
                space=space+1;
            }
            
            int num=1;
            while(num<=i){
                System.out.print('*');
                num=num+1;
              
             }
             int back=i-1;
             while(back>=1){
                System.out.print('*');
                back=back-1;
             }
             System.out.println();
            i++;
            
            
        }
    }
}




		

