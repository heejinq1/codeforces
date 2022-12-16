
import java.util.Scanner;

public class Tram116A {

    public static void main(String args[]) throws Exception {

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        n = n * 2;
        int[] arr = new int[n];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();

        }
        int capacity = 0;
        int result = 0;
        for(int i = 0 ; i < arr.length ; i+=2){
            capacity = capacity - arr[i] +arr[i+1];
            if(result  < capacity){
                result= capacity;
            }
        }
        System.out.println(result);
    }
}
