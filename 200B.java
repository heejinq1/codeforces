import java.io.*;

public class Drinks200B {

    //Drinks200B
    public static void main(String[] args) throws IOException{
        
        BufferedReader bfn = new BufferedReader(new InputStreamReader(System.in));
        String str = bfn.readLine();
        double n = Double.parseDouble(str)*100;
        str = bfn.readLine();
        String[] lst = str.split(" ");
        double result =0.0;
        for(int i = 0; i < lst.length; i++){
            result+= Double.parseDouble(lst[i]);
        }
        result = result/n;
        result=result*100;
        System.out.println(result);
    }
}
