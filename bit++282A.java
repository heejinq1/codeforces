import java.util.*;
public class main{
    public static void main(String []args) {
        Scanner sc = new Scanner(System.in);
        String a = sc.nextLine();
        int n = Integer.parseInt(a);
        int result=0;
        for(int i = 0 ; i < n; i++) {
        	String b = sc.nextLine();
        	switch(b) {
        	case "++X": result++; break;
        	case "X++": result++; break;
        	case "--X": result--; break;
        	case "X--": result--; break;
        	}
        		
        }
        
        
        System.out.println(result);
  }
}
