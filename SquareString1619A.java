import java.io.*;

public class SquareString1619A {

    //SquareString1619A
    public static void main(String[] args) throws IOException{
        
        BufferedReader bfn = new BufferedReader(new InputStreamReader(System.in));
        String str1 = bfn.readLine();
        int n = Integer.parseInt(str1);
        
        for(int i =0; i< n; i++){
            str1 = bfn.readLine();
            if(str1.length()%2 == 0){
                String first= str1.substring(0, (str1.length()/2));
                String second= str1.substring(str1.length()/2);
                if(first.equals(second)) System.out.println("YES");
                else System.out.println("NO");
            }
            else{
                System.out.println("NO");
            }
        }
        
    }
}
