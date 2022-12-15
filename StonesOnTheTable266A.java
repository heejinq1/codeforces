import java.util.Scanner;


public class StonesOnTheTable266A {
 
    public static void main(String args[]) {

        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        String s = sc.next();
        int check = 0;
        char current = s.charAt(0);
        for (int i = 1; i < x; i++) {
            if(current == s.charAt(i)){
                check++;
            }
            else{
                current = s.charAt(i);
            }
        }

        System.out.println(check);
    }
}
