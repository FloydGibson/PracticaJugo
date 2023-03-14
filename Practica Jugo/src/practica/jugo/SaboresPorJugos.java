package practica.jugo;


public class SaboresPorJugos {

    private String sabores,nombreJugo;
    private int  idJugo,idSabor;
    public SaboresPorJugos(String sabores, String nombreJugo, int idJugo, int idSabor) {
        this.sabores = sabores;
        this.nombreJugo = nombreJugo;
        this.idJugo = idJugo;
        this.idSabor = idSabor;
    }

    public SaboresPorJugos() {
    }

    public String getSabores() {
        return sabores;
    }

    public void setSabores(String sabores) {
        this.sabores = sabores;
    }

    public String getNombreJugo() {
        return nombreJugo;
    }

    public void setNombreJugo(String nombreJugo) {
        this.nombreJugo = nombreJugo;
    }

    public int getIdJugo() {
        return idJugo;
    }

    public void setIdJugo(int idJugo) {
        this.idJugo = idJugo;
    }

    public int getIdSabor() {
        return idSabor;
    }

    public void setIdSabor(int idSabor) {
        this.idSabor = idSabor;
    }
   
}