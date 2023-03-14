package practica.jugo;


public class SaboresPorJugos {

    private String nombreSabor,nombreJugo;
    private int  idJugo,idSabor;
    public SaboresPorJugos(String nombreSabor, String nombreJugo, int idJugo, int idSabor) {
        this.nombreSabor = nombreSabor;
        this.nombreJugo = nombreJugo;
        this.idJugo = idJugo;
        this.idSabor = idSabor;
    }

    public SaboresPorJugos() {
    }

    public String getNombreSabor() {
        return nombreSabor;
    }

    public void setNombreSabor(String nombreSabor) {
        this.nombreSabor = nombreSabor;
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