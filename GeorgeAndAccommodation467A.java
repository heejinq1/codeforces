import java.io.*;

public class GeorgeAndAccommodation467A {

    //GeorgeAndAccommodation467A
    public static void main(String[] args) throws IOException{
        int result =0;
        BufferedReader bfn = new BufferedReader(new InputStreamReader(System.in));
        String str = bfn.readLine();
        int n = Integer.parseInt(str);
        for(int i = 0; i < n; i++){
            str = bfn.readLine();
            int p = Integer.parseInt(str.substring(0, str.indexOf(" ")));
            int q = Integer.parseInt(str.substring(str.indexOf(" ")+1));
            if(q>= p+2){
                result++;
            }
        }
        System.out.println(result);
    }
}
