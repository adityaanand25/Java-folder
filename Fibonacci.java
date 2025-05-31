//Write a program to print Fibonacci series up to n terms.
public class Fibonacci {
    public static void main (String[] args) {
        for (int i = 0; i < 20; i++){
            System.out.print((i) + " ");
            int a = 0, b = 1, c;
            for (int j = 2; j <= i; j++) {
                c = a + b;
                a = b;
                b = c;
            }
            System.out.print(b + " ");
        }
    
}
}
