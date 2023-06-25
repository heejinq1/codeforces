import java.io.*;

public class AntonAndPolyhedrons785A {

    // AntonAndPolyhedrons785A
    public static void main(String[] args) throws IOException {

        BufferedReader bfn = new BufferedReader(new InputStreamReader(System.in));
        String str = bfn.readLine();
        int n = Integer.parseInt(str);
        int result =0;
        for(int i =0; i < n; i++){
            str = bfn.readLine();
            switch(str){
                case "Tetrahedron": result+=4;break;
                case "Cube": result+=6;break;
                case "Octahedron": result+=8;break;
                case "Dodecahedron": result+=12;break;
                case "Icosahedron": result+=20;break;
            }
        }
        System.out.println(result);
    }
}
