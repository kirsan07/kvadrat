import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner (System.in);
int i = scanner.nextInt();
int m = 0;
int n = 0;
while ( n < i ) {
    System.out.println(n);
    n= m * m;
    m++;
}
    }
}