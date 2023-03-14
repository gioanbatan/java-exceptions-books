package exercise.exceptions.books;

import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Library {
    public static void main(String[] args) {
        // Istanza di Scanner per input da tastiera
        Scanner scan = new Scanner(System.in);

        // Presentazione e richiesta numero di libri da inserire
        System.out.println("Ciao! Benvenuto in biblioteca!");
        System.out.print("\nQuanti libri vuoi inserire? ");
        Book[] books = new Book[Integer.parseInt(scan.nextLine())];

        // Ciclo inserimento libri
        for (int i = 0; i < books.length; i++) {
            // Inserimento dati libro
            System.out.println();
            System.out.println("Creazione di un nuovo libro.");

            System.out.print("Titolo: ");
            String title = scan.nextLine();

            System.out.print("Numero di pagine: ");
            int pages = Integer.parseInt(scan.nextLine());

            System.out.print("Nome dell'autore: ");
            String author = scan.nextLine();

            System.out.print("Nome dell'editore: ");
            String publisher = scan.nextLine();

            try {
                books[i] = new Book(title, pages, author, publisher);
            } catch (Exception e) {
                System.out.println(e);
            }
        }

        // Chiusura scan input
        scan.close();

        // Ciclo stampa su schermo
        for (int i = 0; i < books.length; i++) {
            System.out.println(books[i].toString());
            System.out.println();
        }

        // Gestione file
        // Creazione del file
        FileWriter myFileWriter = null;
        try {
            myFileWriter = new FileWriter("library.txt");
            for (int i = 0; i < books.length; i++) {
                myFileWriter.write(books[i].toString() + "\n");
            }
        } catch (IOException e) {
            System.out.println("Errore nella scrittura del file." + e);
        } finally {
            if (myFileWriter != null) {
                try {
                    myFileWriter.close();
                } catch (IOException e) {
                    System.out.println("Errore file");
                    e.printStackTrace();
                }
            }
        }
    }
}