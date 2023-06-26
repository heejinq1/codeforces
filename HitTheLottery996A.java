import java.io.*;

public class HitTheLottery996A {

    // HitTheLottery996A
    public static void main(String[] args) throws IOException {

        BufferedReader bfn = new BufferedReader(new InputStreamReader(System.in));
        String str = bfn.readLine();
        int n = Integer.parseInt(str);
        int hund = n/100;
        int twen = (n-(hund*100))/20;
        int ten= (n-(hund*100)-(twen*20))/10;
        int five = (n-(hund*100)-(twen*20)-(ten*10))/5;
        int ones =(n-(hund*100)-(twen*20)-(ten*10)-(five*5));
        n=hund+twen+ten+five+ones;
        System.out.println(n);
        
        
       

    }
}
