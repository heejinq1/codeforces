import java.io.*;

public class CalculatingFunction486A {

    //CalculatingFunction486A
    public static void main(String[] args) throws IOException{
        
        BufferedReader bfn = new BufferedReader(new InputStreamReader(System.in));
        String str = bfn.readLine();
        Long n = Long.parseLong(str);
        Long result=0L;
        if (n%2 == 0) result = n/2;
		else result = (-1)*(n/2 + 1);
        System.out.println(result);
    }
}
