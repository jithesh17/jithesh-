import java.util.Scanner;//para

class Print {
    int c;

    Print(int x, int y) {
        c = x + y;
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter first value:");
        int a = scanner.nextInt();
        System.out.println("Enter second value:");
        int b = scanner.nextInt();

        
        Print result = new Print(a, b);
        System.out.println("The sum is: " + result.c);
    }
}
