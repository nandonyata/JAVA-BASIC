import java.util.Scanner;

public class scanner {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Pleas type ur name");

        String name = scan.nextLine();

        System.out.println("Hi " + name);

    }
}
