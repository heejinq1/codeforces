import java.io.*;

public class YesOrYes1703A {

    //YesOrYes1703A
    public static void main(String[] args) throws IOException{
        
        BufferedReader bfn = new BufferedReader(new InputStreamReader(System.in));
        String str1 = bfn.readLine();
        int n = Integer.parseInt(str1);
        
        for(int i =0; i< n; i++){
            str1 = bfn.readLine();
            str1= str1.toLowerCase();
            if(str1.equals("yes")) System.out.println("YES");
            else System.out.println("NO");
        }
        
    }
}
