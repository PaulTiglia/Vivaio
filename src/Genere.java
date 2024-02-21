public class Genere {
    private String nome;
    private double prezzo;
    private boolean haFiore;
    private boolean eOccupata;

    public Genere(String nome, double prezzo, boolean haFiore, boolean eOccupata){
        this.nome = nome;
        this.prezzo = prezzo;
        this.haFiore = haFiore;
        this.eOccupata = eOccupata;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getPrezzo() {
        return prezzo;
    }

    public void setPrezzo(double prezzo) {
        this.prezzo = prezzo;
    }

    public boolean isHaFiore() {
        return haFiore;
    }

    public void setHaFiore(boolean haFiore) {
        this.haFiore = haFiore;
    }

    public boolean iseOccupata() {
        return eOccupata;
    }

    public void seteOccupata(boolean eOccupata) {
        this.eOccupata = eOccupata;
    }
}
