import java.util.Scanner;
class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String text = scan.next();
        System.out.println(text.substring(scan.nextInt(), scan.nextInt() + 1));
    }
}