package main;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class Test {
    public static void main(String[] args) {

        System.out.println("stampo un testo");
        Scanner sc = new Scanner(System.in);
        System.out.println("inserisci il nome: ");
        String nome = sc.next();
        System.out.println("inserisci il cognome ");
        String cognome = sc.next();
        System.out.println("Inserisci il tuo giorno di nascita ");
        int giorno = sc.nextInt();
        System.out.println("inserisci il tuo mese id nascita ");
        int mese = sc.nextInt();
        System.out.println("inserisci il tuo anno id nascita ");
        int anno = sc.nextInt();
        LocalDate data = LocalDate.of(anno, mese, giorno);
        String dataTxt = data.format(DateTimeFormatter.ofPattern("EEEE dd MMMM yyyy"));
        System.out.println(nome + " "+cognome + " è nato il " + dataTxt);
    }}
