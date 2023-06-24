import java.io.*;

public class Presents136A {

    //Presents136A
    public static void main(String[] args) throws IOException{
        
        BufferedReader bfn = new BufferedReader(new InputStreamReader(System.in));
        String str = bfn.readLine();
        int n = Integer.parseInt(str);
        str = bfn.readLine();
        String[] arr = str.split(" ");
        int[] result = new int[arr.length];
        for(int i =0; i < arr.length; i++){
            int current = Integer.parseInt(arr[i]);
            result[current-1]= i+1;
        }
        for(int i = 0 ; i < result.length; i++){
            System.out.print(result[i] +" ");
        }
    }
}
