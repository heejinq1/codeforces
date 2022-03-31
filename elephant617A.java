import java.util.*;
public class main{
	
	//  617A-Elephant
	
    public static void main(String []args) {
        Scanner sc = new Scanner(System.in);
        int distance = sc.nextInt();
        int steps=0;
        while(distance>0) {
        	if(distance-5>=0) {
        		distance-=5;
        		steps++;
        	}
        	else {
        		if(distance-4>=0) {
        			distance-=4;
        			steps++;
        		}
        		else {
        			if(distance-3>=0) {
        				distance-=3;
        				steps++;
        			}
        			else {
        				if(distance-2>=0) {
        					distance-=2;
        					steps++;        				
        				}
        				else {
        					distance--;
        					steps++;
        				}
        			}
        		}
        	}
        }
        System.out.println(steps);
  }
}
