package main;

import java.time.LocalDate;
import java.time.Period;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class Test {

    public static void main(String[] args) {

        System.out.println("Stampo un testo");

        Scanner sc = new Scanner(System.in);

        System.out.println("Inserisci il nome:");
        String nome = sc.next();

        System.out.println("Inserisci il cognome:");
        String cognome = sc.next();

        System.out.println("Inserisci il tuo giorno di nascita:");
        int giorno = sc.nextInt();

        System.out.println("Inserisci il tuo mese di nascita:");
        int mese = sc.nextInt();

        System.out.println("Inserisci il tuo anno di nascita:");
        int anno = sc.nextInt();

        LocalDate dataNascita = LocalDate.of(anno, mese, giorno);

        String dataTxt = dataNascita.format(
                DateTimeFormatter.ofPattern("EEEE dd MMMM yyyy"));

        int eta = Period.between(dataNascita, LocalDate.now()).getYears();

        System.out.println(nome + " " + cognome
                + " è nato il " + dataTxt
                + " e ha " + eta + " anni.");

        sc.close();
    }
}