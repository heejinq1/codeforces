import java.io.*;
import java.math.BigInteger;
import java.util.*;

public class Main {

    // 1328A
    public static void main(String args[]) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine());
        for(int i = 0; i < t; i++){
            String[] temp = (br.readLine()).split(" ");
            long a = Long.parseLong(temp[0]);
            long b = Long.parseLong(temp[1]);
            long count = Long.parseLong("0");
            if(a<=b){
                count+=(b-a);
                
            }
            else{
                if(a%b!=0){
                    
                    count= b-(a%b);
                    
                }
            }
            System.out.println(count);
        }

    }
}
