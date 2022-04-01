import java.util.*;
public class main{
	
	//  1283A - Minutes Before the New Year	
    public static void main(String []args) {
        Scanner sc= new Scanner(System.in);
        int n = sc.nextInt();
        int minutes = 0;
        for(int i =0 ; i<n ; i++) {
        	int h = sc.nextInt();
        	int m = sc.nextInt();
        	minutes = (23-h)*60 + (60-m);
        	System.out.println(minutes);
        }
        
  }
}
