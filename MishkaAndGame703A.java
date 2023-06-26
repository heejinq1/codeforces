import java.io.*;

public class MishkaAndGame703A {

    // MishkaAndGame703A
    public static void main(String[] args) throws IOException {

        BufferedReader bfn = new BufferedReader(new InputStreamReader(System.in));
        String str = bfn.readLine();
        int n = Integer.parseInt(str);
        int m = 0;
        int c= 0;
        for(int i =0; i < n; i++)
        {   
            String[] temp = (bfn.readLine()).split(" ");
            if(Integer.parseInt(temp[0])> Integer.parseInt(temp[1]))
            m++;
            else if(Integer.parseInt(temp[1])>Integer.parseInt(temp[0]))
            c++;
            
        }
        if(m>c) System.out.println("Mishka");
        else if(c>m) System.out.println("Chris");
        else System.out.println("Friendship is magic!^^");
        





       

    }
}
