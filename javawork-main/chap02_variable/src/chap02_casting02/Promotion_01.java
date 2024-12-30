package chap02_casting02;
import java.util.Scanner;

public class Promotion_01 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String a = sc.next();
        
        for(int i=0; i<a.length(); i++) {
        	char c = a.charAt(i);
            if(Character.isLowerCase(c))
                System.out.print(Character.toUpperCase(c));
            else
            	System.out.print(Character.toLowerCase(c));
        }
    }

}
