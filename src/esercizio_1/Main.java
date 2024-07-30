package esercizio_1;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Inserisci un numero intero N per indicare il numero di parole:");
        int n = Integer.parseInt(scanner.nextLine());

        Set<String> elencoParole = new HashSet<>();
        Set <String> elencoParoleDuplicate = new HashSet<>();

        for (int i=0; i<n;i++){
            System.out.println("Inserisci la " + (i+1) + "° parola:");
            String parola = scanner.nextLine();
            if (!elencoParole.add(parola)){
                elencoParoleDuplicate.add(parola);
            }
            elencoParole.add(parola);
        }

        System.out.println("Ecco l'elenco delle parole uguali: " + elencoParoleDuplicate);
        System.out.println("Ecco l'elenco delle parole distinte: "  + elencoParole);
        System.out.println("Ecco il NUMERO delle parole distinte: " + elencoParole.size());

    }
}
