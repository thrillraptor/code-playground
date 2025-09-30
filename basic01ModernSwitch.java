import java.util.Scanner;

public class basic01ModernSwitch {
    public static void main(String[] Args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Do you accept ?");
        String accept = input.nextLine();

        char a = accept.charAt(0);
        switch (a) {
            case 'y', 'Y' -> System.out.println("Accepted");
            default -> System.out.println("Not Accepted");
        }
 
        int day = 1;
        String dayname = switch(day) {
            case 1 -> "Monday";
            default -> "Unknown";
        };

        System.out.println(dayname);
        input.close();
    }
}
