package esercizio_2;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);



            System.out.println("Inserire in numero N: ");
            int n = Integer.parseInt(scanner.nextLine());

            List<Integer> numeri = new ArrayList<>();
            for (int i = 0; i<n; i++){
                int numeroCasuale = (int) Math.random();
                numeri.add(numeroCasuale);
            };
        System.out.println(numeri);

    }


}
