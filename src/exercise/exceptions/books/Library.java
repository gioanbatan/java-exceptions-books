package exercise.exceptions.books;

import java.util.Scanner;

public class Library {
    public static void main(String[] args) {
        // Istanza di Scanner per input da tastiera
        Scanner scan = new Scanner(System.in);

        // Presentazione e richiesta numero di libri da inserire
        System.out.println("Ciao! Benvenuto in biblioteca!");
        System.out.print("\nQuanti libri vuoi inserire? ");
        int booksQty = scan.nextInt();

        System.out.println("\n");

        // Ciclo inserimento libri
        for (int i = 0; i < booksQty; i++) {
            // Inserimento dati libro
            System.out.println("Creazione di un nuovo libro.");
            System.out.print("Titolo: ");
            System.out.print("Numero di pagine: ");
            System.out.print("Nome dell'autore: ");
            System.out.print("Nome dell'editore: ");


        }
    }
}