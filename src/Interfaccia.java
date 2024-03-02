import java.util.Scanner;
public class Interfaccia {
    int scelta = 0;
    String nome;
    double prezzo;
    String data;
    String codice;
    String genere;
    Genere[] generi = new Genere[50];
    int nGeneri = 0;
    Scanner sc = new Scanner(System.in);
    Vivaio v = new Vivaio();
    public void stampaInterfaccia(){
        boolean uscita = true;
        while(uscita){
            System.out.println("\n\t\tMENU VIVAIO");
            System.out.println("1. Aggiungi Vivaista");
            System.out.println("2. Aggiungi Pianta");
            System.out.println("3. Aggiungi Genere");
            System.out.println("4. Elimina Vivaista");
            System.out.println("5. Elimina Pianta");
            System.out.println("6. Elimina Genere");
            System.out.println("7. Ricerca Pianta");
            System.out.println("8. Ricerca Vivaista");
            System.out.println("9. Ricerca Genere");
            System.out.println("10. Nuovo Ordine");
            System.out.println("11. Esci");
            System.out.print("\nDigita la scelta: ");
            scelta = sc.nextInt();
            switch(scelta){
                case 1:
                    System.out.print("Aggiungi nome: ");
                    nome = sc.nextLine();
                    System.out.print("Aggiungi genere: ");
                    genere = sc.nextLine();
                    Vivaista vivaista = new Vivaista(nome, genere);
                    break;

                case 2:
                    System.out.print("Aggiungi codice pianta: ");
                    codice = sc.nextLine();
                    codice = sc.nextLine();
                    System.out.print("Aggiungi genere pianta: ");
                    genere = sc.nextLine();
                    System.out.print("Aggiungi data pianta: ");
                    data = sc.nextLine();
                    Pianta p = new Pianta(codice, genere, data);
                    System.out.println("PIANTA AGGIUNTA");
                    break;

                case 3:
                    System.out.print("Aggiungi nome: ");
                    nome = sc.nextLine();
                    nome = sc.nextLine();
                    System.out.print("Aggiungi prezzo: ");
                    prezzo = sc.nextDouble();
                    Genere g = new Genere(nome, prezzo);
                    break;

                case 4:
                    System.out.print("Inserisci nome: ");
                    nome = sc.nextLine();
                    System.out.println("Vivaista ELIMINATO");
                    v.eliminaVivaista(nome);
                    break;

                case 5:
                    System.out.print("Inserisci codice: ");
                    codice = sc.nextLine();
                    System.out.println("Pianta ELIMINATA");
                    v.eliminaPianta(codice);
                    break;

                case 6:
                    System.out.print("Inserisci nome: ");
                    nome = sc.nextLine();
                    System.out.println("Genere ELIMINATO");
                    v.eliminaGenere(nome);
                    break;

                case 7:
                    System.out.print("Inserisci codice pianta: ");
                    codice = sc.nextLine();
                    v.ricercaPianta(codice);
                    break;

                case 8:
                    System.out.print("Inserisci nome vivaista: ");
                    nome = sc.nextLine();
                    v.ricercaVivaista(nome);
                    break;

                case 9:
                    System.out.print("Inserisci nome genere: ");
                    nome = sc.nextLine();
                    v.ricercaGenere(nome);
                    break;

                case 10:
                    System.out.println("Inserisci ordine: ");
                    break;

                case 11:
                    uscita = false;
            }
        }
    }
}
