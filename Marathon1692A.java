import java.io.*;
import java.util.Arrays;

public class Marathon1692A {

    // Marathon1692A
    public static void main(String[] args) throws IOException {

        BufferedReader bfn = new BufferedReader(new InputStreamReader(System.in));
        String str = bfn.readLine();
        int n = Integer.parseInt(str);

        for (int i = 0; i < n; i++) {
            String[] temp = (bfn.readLine()).split(" ");
            int timur = Integer.parseInt(temp[0]);
            int result = 0;
            for(int j =1; j< temp.length; j++){
                if(Integer.parseInt(temp[j])> timur)
                result++;
            }
            System.out.println(result);
        }
    }
}
