package practica.jugo;

import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.JTextArea;

public class SaboresPorJugos {

    private int idJugo, idSabor;
    private List<SaboresPorJugos> saboresPorJugo  = new ArrayList<>();
    private int iteracion;
    private int ubicacion;
    private int porcentaje;
    JTextArea hoja = new JTextArea();

    public int getPorcentaje() {
        return porcentaje;
    }

    public void setPorcentaje(int porcentaje) {
        this.porcentaje = porcentaje;
    }

    public SaboresPorJugos(int idJugo, int idSabor) {
        this.idJugo = idJugo;
        this.idSabor = idSabor;
    }

    public int getIdJugo() {
        return idJugo;
    }

    public int getIdSabor() {
        return idSabor;
    }

    public void agregarSabor(SaboresPorJugos idSabor) {
        saboresPorJugo.add(idSabor);
    }

    public void modificarSabor(int indice, int idJugo, SaboresPorJugos idSabor) {
    saboresPorJugo.set(indice, idSabor);
}


public String listarSabores() {
    boolean primerSabor=true;
    String salida = "";
    for (SaboresPorJugos particularidad : saboresPorJugo) {
        salida += "Id de Jugo: " + particularidad.getIdJugo() + "\n";
        if (particularidad.getIdSabor() != 0) {
            if (primerSabor) {
                salida += "Id de Sabor: " + particularidad.getIdSabor() + ", ";
                primerSabor = false;
            } else {
                salida += ", Id de Sabor: " + particularidad.getIdSabor() + ", ";
            }
            salida += "Porcentaje del sabor: " + particularidad.getPorcentaje() + "%\n";
        }
    }
    return salida;
}


    public void mostrarSabor(int indice) {
        hoja.setText(listarSabores());
        JOptionPane.showMessageDialog(null, hoja);
    }

        public boolean buscarSabor(int idSabor) {
            boolean existe = false;
            this.iteracion = 0;
            this.ubicacion = -1;
            for (SaboresPorJugos particularidad : saboresPorJugo) {
                if (particularidad.getIdSabor() == idSabor) {
                    existe = true;
                    this.ubicacion = iteracion;
                }
                this.iteracion = this.iteracion + 1;
            }
            System.out.println(existe);

            return existe;
        }

    public boolean validarPorcentaje() {
        int totalPorcentaje = 0;
        for (SaboresPorJugos sabor : saboresPorJugo) {
            totalPorcentaje += sabor.getPorcentaje();
        }
        return totalPorcentaje == 100;
    }
}
