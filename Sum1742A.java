import java.io.*;

public class Sum1742A {

    // Sum1742A
    public static void main(String[] args) throws IOException {

        BufferedReader bfn = new BufferedReader(new InputStreamReader(System.in));
        String str = bfn.readLine();
        int n = Integer.parseInt(str);
        for(int i =0; i < n; i++)
        {   
            String[] temp = (bfn.readLine()).split(" ");
            if(Integer.parseInt(temp[0])+ Integer.parseInt(temp[1]) == Integer.parseInt(temp[2]))
            System.out.println("Yes");
            else if(Integer.parseInt(temp[1])+ Integer.parseInt(temp[2]) == Integer.parseInt(temp[0]))
            System.out.println("Yes");
            else if(Integer.parseInt(temp[0])+ Integer.parseInt(temp[2]) == Integer.parseInt(temp[1]))
            System.out.println("Yes");
            else System.out.println("NO");
        }
        





       

    }
}
