package practica.jugo;

public class Jugos {
private int IdJugo;
private String nombreJugo;

    public Jugos(int IdJugo, String nombreJugo) {
        this.IdJugo = IdJugo;
        this.nombreJugo = nombreJugo;
    }

    public Jugos() {
    }

    public int getIdJugo() {
        return IdJugo;
    }

    public void setIdJugo(int IdJugo) {
        this.IdJugo = IdJugo;
    }

    public String getNombreJugo() {
        return nombreJugo;
    }

    public void setNombreJugo(String nombreJugo) {
        this.nombreJugo = nombreJugo;
    }


}
