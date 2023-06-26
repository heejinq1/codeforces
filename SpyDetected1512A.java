import java.io.*;

public class SpyDetected1512A {

    // SpyDetected1512A
    public static void main(String[] args) throws IOException {

        BufferedReader bfn = new BufferedReader(new InputStreamReader(System.in));
        String str = bfn.readLine();
        int n = Integer.parseInt(str);
        int result = 0;
        for(int i =0; i< n; i++){
            int size = Integer.parseInt(bfn.readLine());
            String[] temp = (bfn.readLine()).split(" ");
            
            if(temp[0].equals(temp[1])){
                for(int j=2; j< temp.length; j++){
                if(!temp[0].equals(temp[j])){
                    result = j+1;
                    break;
                }
            }}
            
            else{
                if(!temp[0].equals(temp[1]) && temp[1].equals(temp[2])){
                    result =1;
                }
                else result =2;
            }
            
            
            System.out.println(result);
        }
        
        
       

    }
}
