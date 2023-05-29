
import java.util.Scanner;
public class Main {
	
	public static void main(String[] args) {
		
         int n;
        Scanner s=new Scanner(System.in);
        n = s.nextInt();
        int n2; 
        int even=0,odd=0;

        while(n>0)
        {
            n2=n%10;
            n=n/10;
            if((n2%2)!=0){
                odd=odd+n2;
            }
            else{
                even=even+n2;
            }
        }
            System.out.println(even+" "+odd);

	}
}
