public class Vivaista {
    private String nome;
    private Genere[] generi = new Genere[100];

    public Vivaista(){

    }

    public Vivaista(String nome, Genere[] generi){
        this.nome = nome;
        this.generi = generi;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

}
