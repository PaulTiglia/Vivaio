public class Pianta {
    private String codice;
    private String genere;
    private String data;

    public Pianta(String codice, String genere, String data){
        this.codice = codice;
        this.genere = genere;
        this.data = data;
    }

    public void stampa(){
        System.out.println("Codice pianta: " + this.codice);
        System.out.println("Genere pianta: " + this.genere);
        System.out.println("Data: " + this.data);
    }

    public String getCodice() {
        return codice;
    }

    public void setCodice(String codice) {
        this.codice = codice;
    }

    public String getGenere() {
        return genere;
    }

    public void setGenere(String genere) {
        this.genere = genere;
    }

    public String getData() {
        return data;
    }

    public void setData(String data) {
        this.data = data;
    }
}
