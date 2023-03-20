package practica.jugo;

import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.JTextArea;

public class AlmacenamientoSPJ {

    int ubicacion, iteracion;
    private List<SaboresPorJugos> listaCompleta = new ArrayList<>();
    JTextArea hoja = new JTextArea();

    public void agregadoCompleto(int idJugo, String nombreJugo, int idSabor, String nombreSabor, double porcentaje) {
        SaboresPorJugos saborJugo = new SaboresPorJugos();
        saborJugo.setIdJugo(idJugo);
        saborJugo.setNombreJugo(nombreJugo);
        saborJugo.setIdSabor(idSabor);
        saborJugo.setNombreSabor(nombreSabor);
        saborJugo.setPorcentaje(porcentaje);
        listaCompleta.add(saborJugo);
    }

    public void modificarCompleto(int idJugo, String nombreJugo, int idSabor, String nombreSabor, double porcentaje) {
        SaboresPorJugos saborJugo = new SaboresPorJugos();
        saborJugo.setIdJugo(idJugo);
        saborJugo.setNombreJugo(nombreJugo);
        saborJugo.setIdSabor(idSabor);
        saborJugo.setNombreSabor(nombreSabor);
        saborJugo.setPorcentaje(porcentaje);
        listaCompleta.add(ubicacion, saborJugo);
    }
    
   

    public String listarCompleta() {
         //inicio de cambios
    int datoIdJugo=0;
    String datoNombreJugo="";
    String salida="";
    String salidaSabor ="";
    String salidaJugo= "" ;
    for(SaboresPorJugos particularidad:listaCompleta){
        if(particularidad.getIdJugo()!=datoIdJugo){
            if(datoIdJugo != 0) { //agrega la salida del jugo previo antes de cambiar al nuevo jugo
                salidaJugo += "\n" + salidaSabor; //agrega la lista de sabores al jugo previo
                salida += salidaJugo + "\n"; //agrega el jugo previo a la salida completa
                salidaSabor = ""; //reinicia la lista de sabores
            }
            datoIdJugo=particularidad.getIdJugo();
            datoNombreJugo=particularidad.getNombreJugo();
            salidaJugo = "\n\nidJugo: "+datoIdJugo+"\nJugo: "+datoNombreJugo; //inicia la salida del nuevo jugo
        }
        salidaSabor += "\nIdSabor: " + particularidad.getIdSabor() + "\nSabor: " + particularidad.getNombreSabor() + "\nPorcentaje: " + particularidad.getPorcentaje()+"\n";
    }

    //agrega la salida del último jugo
    salidaJugo += "\n" + salidaSabor;
    salida += salidaJugo + "\n";

    //fin de cambios realizados
    return salida;

    }

    public void mostrarListaCompleta() {
        hoja.setText(listarCompleta());
        JOptionPane.showMessageDialog(null, hoja);
    }

    public boolean busquedaJugosC(int idJugo) {
        boolean existe = false;
        this.iteracion = 0;
        for (SaboresPorJugos particularidad : listaCompleta) {
            if (particularidad.getIdJugo() == (idJugo)) {
                existe = true;
                this.ubicacion = this.iteracion;
            }
            this.iteracion++;
        }
        return existe;
    }

    public boolean busquedaSaboresC(int idSabor) {
        boolean existe = false;
        this.iteracion = 0;
        for (SaboresPorJugos particularidad : listaCompleta) {
            if (particularidad.getIdSabor() == (idSabor)) {
                existe = true;
                this.ubicacion = this.iteracion;
            }
            this.iteracion++;
        }
        return existe;
    }
    
    public void eliminarDatos(){
        listaCompleta.remove(ubicacion);
    }
    
    

}
