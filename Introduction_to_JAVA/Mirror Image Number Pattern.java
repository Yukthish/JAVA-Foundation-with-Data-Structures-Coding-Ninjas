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
            int dot=1;
            int num=i;
            while(dot<=i){
                System.out.print(dot);
                num=num+1;
                dot=dot+1;
             
            }
            i++;
            System.out.println();
            
        }
	}

}
