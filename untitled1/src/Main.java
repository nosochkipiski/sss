import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String soz = scanner.nextLine();
        char s =scanner.nextLine().charAt(0);
        System.out.println(soz.indexOf(s));
        }
    }