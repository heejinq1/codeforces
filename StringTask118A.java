import java.io.*;

public class StringTask118A {

    //StringTask118A
    public static void main(String[] args) throws IOException{
        BufferedReader bfn = new BufferedReader(new InputStreamReader(System.in));
        String str = bfn.readLine();
        str = str.toLowerCase();
        str= str.replaceAll("a", "");
        str= str.replaceAll("e", "");
        str= str.replaceAll("i", "");
        str= str.replaceAll("o", "");
        str= str.replaceAll("u", "");
        str= str.replaceAll("y", "");
        char[] temp = str.toCharArray();
        String result= "";
        for(int i=0; i < temp.length; i++){
            result+="."+temp[i];
        }
        System.out.println(result);
    }
}
