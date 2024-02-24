public class Ordine {
    private int quantita;
    private Genere genere;

    public Ordine(int quantita, Genere genere){
        this.quantita = quantita;
        this.genere = genere;
    }

    public int getQuantita() {
        return quantita;
    }

    public void setQuantita(int quantita) {
        this.quantita = quantita;
    }

    public Genere getGenere() {
        return genere;
    }

    public void setGenere(Genere genere) {
        this.genere = genere;
    }
}
