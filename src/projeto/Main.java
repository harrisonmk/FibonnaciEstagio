package projeto;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.print("Digite um número: ");
        int n = scan.nextInt();

        List<Integer> sequencia = fibonacci(n);

        if (sequencia.contains(n)) {
            System.out.printf("%d pertence à sequência de Fibonacci: %s\n", n, sequencia);
        } else {
            System.out.printf("%d não pertence à sequência de Fibonacci: %s\n", n, sequencia);
        }

    }

    public static List<Integer> fibonacci(int n) {
        List<Integer> sequence = new ArrayList<>();

        int a = 0;
        int b = 1;
        sequence.add(a);

        while (b < n) {
            sequence.add(b);
            int c = a + b;
            a = b;
            b = c;
        }

        return sequence;
    }
}
