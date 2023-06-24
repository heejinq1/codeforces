import java.io.*;

public class QueueAtTheSchool226B {
    public static void main(String[] args) throws IOException{
        BufferedReader bfn = new BufferedReader(new InputStreamReader(System.in));
        String str = bfn.readLine();
        int n = Integer.parseInt(str.substring(0, str.indexOf(" ")));
        int t = Integer.parseInt(str.substring(str.indexOf(" ")+1));
        String q = bfn.readLine();

        for (int i = 0; i < t; i++) {
            q = q.replaceAll("BG", "GB");
        }
        System.out.print(q);
    }
}
