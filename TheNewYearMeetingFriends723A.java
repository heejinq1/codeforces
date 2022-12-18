import java.util.Scanner;

public class TheNewYearMeetingFriends723A {

    public static void main(String args[]) throws Exception {

        Scanner sc = new Scanner(System.in);
        int x1 = sc.nextInt();
        int x2 = sc.nextInt();
        int x3 = sc.nextInt();

        int toX1 = Math.abs(x1 - x2) + Math.abs(x1 - x3);
        int toX2 = Math.abs(x2 - x1) + Math.abs(x2 - x3);
        int toX3 = Math.abs(x3 - x1) + Math.abs(x3 - x2);
        int movement_needed = (x1 + x2 + x3) / 3;
        int midPoint = Math.abs(movement_needed - x1) + Math.abs(movement_needed - x2) + Math.abs(movement_needed - x3);
        if (toX1 <= toX2 && toX1 <= toX3 && toX1 <= midPoint) {
            System.out.println(toX1);
        } else {
            if (toX2 <= toX1 && toX2 <= toX3 && toX2 <= midPoint) {
                System.out.println(toX2);
            } else {
                if (toX3 <= toX1 && toX3 <= toX2 && toX3 <= midPoint) {
                    System.out.println(toX3);
                } else {
                    System.out.println(midPoint);
                }
            }

        }

    }
}
