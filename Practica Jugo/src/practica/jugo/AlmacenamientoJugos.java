package practica.jugo;

import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.JTextArea;

public class AlmacenamientoJugos {

    private List<Jugos> listaJugos = new ArrayList<>();
    JTextArea hoja = new JTextArea();
    int ubicacion, iteracion;

    public void agregar(int IdJugo, String nombreJugo) {
        Jugos jugo = new Jugos();
        jugo.setIdJugo(IdJugo);
        jugo.setNombreJugo(nombreJugo);
        listaJugos.add(jugo);
    }

    public void modificar(int IdJugo, String nombreJugo) {
        Jugos jugo = new Jugos();
        jugo.setIdJugo(IdJugo);
        jugo.setNombreJugo(nombreJugo);
        listaJugos.set(ubicacion, jugo);
    }

    public String listar() {
        String salida = "";
        for (Jugos particularidad : listaJugos) {
            salida = salida + "Id de Jugo: " + particularidad.getIdJugo() + "\nNombre del Jugo: " + particularidad.getNombreJugo() + "\n";
        }
        return salida;
    }

    public void mostrar() {
        hoja.setText(listar());
        JOptionPane.showMessageDialog(null, hoja);
    }

    public boolean buscar(int idJugo) {
        boolean existe = false;
        this.iteracion = 0;
        for (Jugos particularidad : listaJugos) {
            if (particularidad.getIdJugo() == idJugo) {
                existe = true;
                this.ubicacion = iteracion;
            }
            this.iteracion = this.iteracion + 1;
        }
        System.out.println(existe);

        return existe;
    }

    public String obtenerNombreJugo(int idJugo) {
        for (Jugos jugo : listaJugos) {
            if (jugo.getIdJugo() == idJugo) {
                return jugo.getNombreJugo();
            }
        }
        return "Jugo no encontrado";
    }
    public void eliminarJugo(){
        listaJugos.remove(ubicacion);
    }
}
