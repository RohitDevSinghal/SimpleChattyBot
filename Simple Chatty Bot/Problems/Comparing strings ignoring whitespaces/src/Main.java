import java.util.Scanner;
class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String text = scan.nextLine().replace(" ", "");
        String text2 = scan.nextLine().replace(" ", "");
        System.out.println(text.equals(text2));
    }
}