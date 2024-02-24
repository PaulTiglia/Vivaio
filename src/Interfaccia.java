import java.util.Scanner;
public class Interfaccia {
    int scelta = 0;
    Vivaista vivaista = new Vivaista();
    String nome;
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
            System.out.println("7. Nuovo Ordine");
            System.out.println("\nDigita la scelta: ");
            scelta = sc.nextInt();
            switch(scelta){
                case 1:
                    System.out.println("Aggiungi vivaista: ");
                    v.aggiungiVivaista(vivaista);
            }
        }
    }
}
