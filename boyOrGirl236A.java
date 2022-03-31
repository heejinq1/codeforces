import java.util.*;
public class main{
    public static void main(String []args) {
        Scanner sc= new Scanner(System.in);
        String s= sc.nextLine();
        String p="";       
        char ch[]=s.toCharArray();
        for(int i=0;i<s.length();i++)
        {
            for(int j=i+1;j<s.length();j++)
            {
                if(ch[i]==ch[j])
                {
                    ch[j]=' ';
                }
            }
            p=p+ch[i];
            p = p.replaceAll("\\s",""); 
        }
          
           
        
       
        if(p.length()%2 == 0) {
        	System.out.println("CHAT WITH HER!");
        }
        else
        	System.out.println("IGNORE HIM!");
  }
}
