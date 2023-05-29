

import java.lang.Math;
import java.util.Scanner;
public class Solution {
    
    public static void main(String[] args) {
        // Write your code here
        int base, pow;
        Scanner s=new Scanner(System.in);
        base=s.nextInt();
        pow=s.nextInt();
        double res=Math.pow(base, pow);
        int p=(int)(res);
        System.out.println(p);
    }
}