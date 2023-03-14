package exercise.exceptions.books;

import java.io.File;
import java.io.FileNotFoundException;
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

        System.out.println("\n-------------------\n\n");
        
        // Chiusura scan input
        scan.close();

        // Gestione file
        // Creazione del file
        FileWriter myFileWriter = null;
        try {
            myFileWriter = new FileWriter("library.txt");
            for (int i = 0; i < books.length; i++) {
                myFileWriter.write(books[i].toString() + "\n");
                myFileWriter.write("-------------------------\n\n");
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

        // Lettura del file
        Scanner reader = null;
        try {
            reader = new Scanner(new File("./library.txt"));
            while (reader.hasNext()) {
                String line = reader.nextLine();
                System.out.println(line);
            }
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } finally {
            if (reader != null) {
                try {
                    reader.close();
                } catch (IllegalStateException ise) {
                    ise.printStackTrace();
                }
            }
        }
    }
}