import java.util.*;
import java.math.*;
import java.lang.*;
import java.io.*;

class tstClass{
    
    private static String nearestPalindrome(String n){
        
        long num = Long.parseLong(n);
        for(long i = 1;;i++){
            if(isPalindrome(num + i))
                return ("" + (num + i));
        }
        
    }
    
    private static boolean isPalindrome(long x){
        
        long t = x, rev = 0;
        while(t > 0){
            rev = 10 * rev + t % 10;
            t = t / 10;
        }
        return rev ==x;
    }
    
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        
        String n = sc.next();
        System.out.println(nearest_palindrome(n));
    }
}