package Ex06;

public class Hora {
    private int hora;
    private int minuto;
    private int segundo;

    public Hora(int hora, int minuto, int segundo) {
        this.hora = validarHora(hora);
        this.minuto = validarMinutoSegundo(minuto);
        this.segundo = validarMinutoSegundo(segundo);
    }

    private int validarHora(int hora) {
        return(hora >= 0 && hora <= 23 ? hora : 0);
    }

    private int validarMinutoSegundo(int valor) {
        return (valor >= 0 && valor <= 59 ? valor : 0);
    }

    public String toString() {
        return String.format("%02d:%02d:%02d", hora, minuto, segundo);
    }
}
