import java.io.*;
import java.util.Arrays;

public class IsYourHorseshoeOnTheOtherHoof228A {

    //IsYourHorseshoeOnTheOtherHoof228A

    public static void main(String[] args) throws IOException {

        BufferedReader bfn = new BufferedReader(new InputStreamReader(System.in));
        String[] temp = (bfn.readLine()).split(" ");
        Arrays.sort(temp);
        int min = 1;
        for(int i = 0; i< temp.length-1; i++){
            if(!temp[i].equals(temp[i+1])){
                min++;
            }
        }
        int result = 4- min;
        System.out.println(result);
    }
}
