import java.util.Scanner;

public class main{
    public static void main (String args[])
{
    Scanner sc = new Scanner(System.in);
    String first = sc.nextLine();
    String second = sc.nextLine();
    int compare = first.compareToIgnoreCase(second);
   if(compare > 0) {
    System.out.println(1);
   }
   else{
    if(compare <0) {
        System.out.println(-1);
    }
    else{
        System.out.println(0);
    }
   }
}}