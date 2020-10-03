import java.util.Scanner;
class Main {
    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);
        int a;
        int b;
        boolean asc = true;
        boolean dsc = true;
        a = read.nextInt();
        while (a == 0) {
            a = read.nextInt();
        }
        while (true) {
            b = read.nextInt();
            if (b == 0) {
                break;
            }
            dsc = dsc && a >= b;
            asc = asc && a <= b;
            if (!asc && !dsc) {
                break;
            }
            a = b;
        }
        System.out.println(asc || dsc);
    }
}
