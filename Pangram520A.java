import java.io.*;

public class Pangram520A {

    // Pangram520A
    public static void main(String[] args) throws IOException {

        BufferedReader bfn = new BufferedReader(new InputStreamReader(System.in));
        String str = bfn.readLine();
        int n = Integer.parseInt(str);
        str = bfn.readLine();
        str = str.toLowerCase();
        Boolean checking = false;
        if (n >= 26) {

            for (int i = 97; i <= 122; i++) {
                char asciiToChar = (char) i;
                String temp = Character.toString(asciiToChar);
                if (str.contains(temp))
                    checking = true;
                else {
                    checking = false;
                    break;
                }
            }
            if (checking)
                System.out.println("YES");
            else
                System.out.println("NO");

        } else
            System.out.println("NO");

    }
}
