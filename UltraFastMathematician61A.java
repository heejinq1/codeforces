import java.io.*;

public class UltraFastMathematician61A {

    //UltraFastMathematician61A
    public static void main(String[] args) throws IOException{
        
        BufferedReader bfn = new BufferedReader(new InputStreamReader(System.in));
        String str1 = bfn.readLine();
        String str2 = bfn.readLine();
        String result="";
        for(int i = 0; i < str1.length(); i++){
            if(str1.charAt(i) == str2.charAt(i)) result+="0";
            else result+="1";
        }
        System.out.println(result);
    }
}
