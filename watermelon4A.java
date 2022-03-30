
import java.util.Scanner;

public class watermelon4A {

	public static void main (String args []) {
		Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        
        if(a % 2 == 0){
            if(a == 2){
                System.out.println("NO");
            }
            else{
                System.out.println("YES");
            }
        }
        else{
            System.out.println("NO");
        }
	}
}
