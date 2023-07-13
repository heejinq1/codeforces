import java.util.Scanner;

public class HelpfulMaths339A {
	public static void main(String args[]) {
		
		Scanner sc = new Scanner(System.in);
		String s = sc.nextLine();
		
		String ones= "";
		String twos = "";
		String threes = "";
		for(int i = 0; i < s.length() ; i++) {
            if(!Character.toString(s.charAt(i)).equals("+")){
                if(Character.toString(s.charAt(i)).equals("1")) {
                    ones+= "1"+ "+";
                }
                else {
                    if(Character.toString(s.charAt(i)).equals("2")){
                        twos+= "2" +"+";
                    }
                    else {
                        threes+= "3" + "+";
                    }
                }
            }
			
		}
		String result = ones+twos+threes;
		System.out.println(result.substring(0, result.length()-1));
	}
}
