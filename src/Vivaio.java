public class Vivaio {
    private Vivaista[] vivaisti = new Vivaista[10];
    private Pianta[] piante = new Pianta[1000];
    private Genere[] generi = new Genere[50];

    Genere rosa = new Genere("rosa", 2.50, true, false);
    Genere palma = new Genere("palma", 5.00, false, false);

    public boolean addVivaista(Vivaista vivaista, Genere genere){
        for (int i = 0; i < vivaisti.length; i++) {
            if(vivaisti[i] == null){
                vivaisti[i] = vivaista;
                return true;
            }
        }
        return false;
    }

    public boolean addPianta(Pianta pianta){
        for (int i = 0; i < piante.length; i++) {
            if(piante[i] == null){
                piante[i] = pianta;
                return true;
            }
        }
        return false;
    }

   public int ricercaPianta(String codice){
       for (int i = 0; i < piante.length; i++) {
           if(this.piante[i].getCodice().equals(codice){
               return i;
           }
       }
       return -1;
   }

    public boolean elimina(String codice){
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
