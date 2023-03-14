package practica.jugo;

import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.JTextArea;

public class AlmacenamientoSabores {

    private List<Sabores> listaSabores = new ArrayList<>();
    JTextArea hoja = new JTextArea();
    int ubicacion, iteracion;

    public void agregar(int idSabor, String nombreSabor) {
        Sabores sabor = new Sabores();
        sabor.setIdSabor(idSabor);
        sabor.setNombreSabor(nombreSabor);
        listaSabores.add(sabor);
    }

    public void modificar(int idSabor, String nombreSabor) {
        Sabores sabor = new Sabores();
        sabor.setIdSabor(idSabor);
        sabor.setNombreSabor(nombreSabor);
        listaSabores.set(ubicacion, sabor);
    }

    public String listar() {
        String salida = "";
        for (Sabores particularidad : listaSabores) {
            salida = salida + "Id de Sabor: " + particularidad.getIdSabor() + "\nNombre del Sabor: " + particularidad.getNombreSabor() + "\n";
        }
        return salida;
    }

    public void mostrar() {
        hoja.setText(listar());
        JOptionPane.showMessageDialog(null, hoja);
    }

    public boolean buscar(int idSabor) {
        boolean existe = false;
        this.iteracion = 0;
        for (Sabores particularidad : listaSabores) {
            if (particularidad.getIdSabor() == idSabor) {
                existe = true;
                this.ubicacion = iteracion;
            }
            this.iteracion = this.iteracion + 1;
        }
        System.out.println(existe);

        return existe;
    }

    public String obtenerNombreSabor(int idSabor) {
        for (Sabores sabor : listaSabores) {
            if (sabor.getIdSabor() == idSabor) {
                return sabor.getNombreSabor();
            }
        }
        return "Sabor no encontrado";
    }

}
