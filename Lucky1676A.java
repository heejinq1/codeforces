import java.io.*;


public class Lucky1676A {

    // Lucky1676A
    public static void main(String[] args) throws IOException {

        BufferedReader bfn = new BufferedReader(new InputStreamReader(System.in));
        String str = bfn.readLine();
        int n = Integer.parseInt(str);

        for (int i = 0; i < n; i++) {
            String temp = bfn.readLine();
            
            int first = Integer.parseInt(Character.toString(temp.charAt(0)))+ Integer.parseInt(Character.toString(temp.charAt(1)))+ Integer.parseInt(Character.toString(temp.charAt(2)));
            int second = Integer.parseInt(Character.toString(temp.charAt(3)))+ Integer.parseInt(Character.toString(temp.charAt(4)))+ Integer.parseInt(Character.toString(temp.charAt(5)));
            if(first == second)
            System.out.println("YES");
            else System.out.println("NO");
        }
    }
}
