public class Vivaio {
    private Vivaista[] vivaisti = new Vivaista[10];
    private Pianta[] piante = new Pianta[1000];
    private Genere[] generi = new Genere[50];
    private Ordine[] ordini = new Ordine[1000];

    Genere rosa = new Genere("rosa", 2.50);
    Genere palma = new Genere("palma", 5.00);

    public boolean aggiungiVivaista(Vivaista vivaista){
        for (int i = 0; i < vivaisti.length; i++) {
            if(vivaisti[i] == null){
                vivaisti[i] = vivaista;
                return true;
            }
        }
        return false;
    }

    public boolean aggiungiPianta(Pianta pianta){
        for (int i = 0; i < piante.length; i++) {
            if(piante[i] == null){
                piante[i] = pianta;
                return true;
            }
        }
        return false;
    }

    public boolean aggiungiGenere(Genere genere){
        for (int i = 0; i < generi.length; i++) {
            if(generi[i] == null){
                generi[i] = genere;
                return true;
            }
        }
        return false;
    }

    public boolean aggiungiOrdine(Ordine ordine, String codice){
        for (int i = 0; i < generi.length; i++) {
            if(ordini[i] == null){
                ordini[i] = ordine;
                eliminaPianta(codice);
                return true;
            }
        }
        return false;
    }

   public int ricercaPianta(String codice){
       for (int i = 0; i < piante.length; i++) {
           if(this.piante[i].getCodice().equals(codice)){
               return i;
           }
       }
       return -1;
   }

    public int ricercaVivaista(String nome){
        for (int i = 0; i < vivaisti.length; i++) {
            if(this.vivaisti[i].getNome().equals(nome)){
                return i;
            }
        }
        return -1;
    }

    public int ricercaGenere(String nome){
        for (int i = 0; i < generi.length; i++) {
            if(this.generi[i].getNome().equals(nome)){
                return i;
            }
        }
        return -1;
    }

    public boolean eliminaPianta(String codice){
        int n = piante.length;
        int esitoRicerca = ricercaPianta(codice);
        if(esitoRicerca == -1){
            return false;
        }
        this.piante[esitoRicerca] = this.piante[n - 1];
        this.piante[n - 1] = null;
        n--;
        return true;
    }

    public boolean eliminaVivaista(String nome){
        int n = vivaisti.length;
        int esitoRicerca = ricercaVivaista(nome);
        if(esitoRicerca == -1){
            return false;
        }
        this.vivaisti[esitoRicerca] = this.vivaisti[n - 1];
        this.vivaisti[n - 1] = null;
        n--;
        return true;
    }

    public boolean eliminaGenere(String nome){
        int n = generi.length;
        int esitoRicerca = ricercaGenere(nome);
        if(esitoRicerca == -1){
            return false;
        }
        this.generi[esitoRicerca] = this.generi[n - 1];
        this.generi[n - 1] = null;
        n--;
        return true;
    }

    public Vivaista[] getVivaisti() {
        return vivaisti;
    }

    public void setVivaisti(Vivaista[] vivaisti) {
        this.vivaisti = vivaisti;
    }

    public Pianta[] getPiante() {
        return piante;
    }

    public void setPiante(Pianta[] piante) {
        this.piante = piante;
    }

    public Genere[] getGeneri() {
        return generi;
    }

    public void setGeneri(Genere[] generi) {
        this.generi = generi;
    }
}
