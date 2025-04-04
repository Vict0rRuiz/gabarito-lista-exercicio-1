package Ex07;

public class Bola {
    private String nome;
    private double raio;

    public Bola(String nome, double raio) {
        this.nome = nome;
        this.raio = raio;
    }

    public Bola maiorBola(Bola a, Bola b) {
        Bola aux = null;
        if(raio > a.raio && raio < b.raio) {
            aux = this;
        }
        else if(a.raio > b.raio) {
            aux = a;
        }else{
            aux = b;
        }
        return aux;
    }

    public String retornarDados() {
        return nome + " " + raio;
    }
}
