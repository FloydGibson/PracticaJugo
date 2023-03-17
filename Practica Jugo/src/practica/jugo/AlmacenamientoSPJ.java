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
        String salida = "";
        for (SaboresPorJugos particularidad : listaCompleta) {
            salida += "IdJugo: " + particularidad.getIdJugo() + "\nJugo: " + particularidad.getNombreJugo() + "\nIdSabor: " + particularidad.getIdSabor() + "\nSabor: " + particularidad.getNombreSabor() + "\nPorcentaje: " + particularidad.getPorcentaje() + "\n\n";
        }
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

}
