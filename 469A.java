import java.io.*;
import java.math.BigInteger;
import java.util.*;

public class Main {

    // 469A
    public static void main(String args[]) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        String[] x = (br.readLine()).split(" ");
        String[] y = (br.readLine()).split(" ");

        boolean foundx = false;
        boolean foundy = false;
        boolean failed = false;
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j < x.length; j++) {
                if (Integer.toString(i).equals(x[j])) {
                    foundx = true;
                    continue;
                }
            }
            for (int k = 1; k < y.length; k++) {
                if (Integer.toString(i).equals(y[k])) {
                    foundy = true;
                    continue;
                }
            }
            if (!foundx && !foundy) {
                failed = true;
                break;
            } else {
                foundx = false;
                foundy = false;
            }
        }
        if (failed) {
            System.out.println("Oh, my keyboard!");
        } else {
            System.out.println("I become the guy.");
        }

    }
}
