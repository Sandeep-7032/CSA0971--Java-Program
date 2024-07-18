import java.util.Scanner;

class Addition {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a, b, c;
        System.out.print("Enter two numbers: ");
        a = sc.nextInt();
        b = sc.nextInt();
        c = a + b;
        System.out.println("The sum of two numbers: " + c);
    }
}

