import java.io.*;

public class CodeforcesChecking1791A {

    //CodeforcesChecking1791A
    public static void main(String[] args) throws IOException{
        
        BufferedReader bfn = new BufferedReader(new InputStreamReader(System.in));
        String str1 = bfn.readLine();
        int n = Integer.parseInt(str1);
        String check = "codeforces";
        for(int i =0; i< n; i++){
            str1 = bfn.readLine();
            if(check.contains(str1)) System.out.println("YES");
            else System.out.println("NO");
        }
        
    }
}
