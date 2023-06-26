import java.io.*;

public class PlusOrMinus1807A {

    // PlusOrMinus1807A
    public static void main(String[] args) throws IOException {

        BufferedReader bfn = new BufferedReader(new InputStreamReader(System.in));
        String str = bfn.readLine();
        int n = Integer.parseInt(str);
        for(int i = 0; i < n; i++){
            str = bfn.readLine();
            String[] temp = str.split(" ");
            if(Integer.parseInt(temp[0])+Integer.parseInt(temp[1]) == Integer.parseInt(temp[2])){
                System.out.println("+");
            }
            else System.out.println("-");
        }
    }
}
