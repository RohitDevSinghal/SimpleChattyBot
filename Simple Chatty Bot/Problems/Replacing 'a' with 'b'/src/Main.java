import java.util.Scanner;
class Main {
    public static void main(String[] args) {
        // put your code here
        Scanner scan = new Scanner(System.in);
        String text = scan.next();
        System.out.println(text.replace('a', 'b'));
    }
}