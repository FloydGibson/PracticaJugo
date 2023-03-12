package practica.jugo;

import javax.swing.JOptionPane;
import javax.swing.JTextArea;

public class PracticaJugo {

    public static void main(String[] args) {

        JTextArea hoja = new JTextArea();
        String salida;
        String nombreJugo, nombreSabor;
        int idJugo = 0, idSabor=0, busqueda;
        int menuOpciones =0;
        int opcionJugos=0;
        int opcionSabores=0;
        int opcionSaboresPorJugo=0;
        AlmacenamientoJugos datosJugos = new AlmacenamientoJugos();
        AlmacenamientoSabores datosSabores = new AlmacenamientoSabores();

        menuOpciones = Integer.parseInt(JOptionPane.showInputDialog("Ingrese la opcion que desea elegir \n"
                + "1. Jugos \n"
                + "2. Sabores \n"
                + "3. Sabores por Jugos \n"
                + "\n Cualquier otro numero para cerrar el programa."));
        while (menuOpciones == 1 || menuOpciones == 2 || menuOpciones == 3) {
            switch (menuOpciones) {
                case 1://Jugos

                    opcionJugos = Integer.parseInt(JOptionPane.showInputDialog("Ingrese la opcion que desea elegir \n"
                            + "1. Ingresar Jugos \n"
                            + "2. Mostrar Jugos \n"
                            + "3. Modificar Jugos \n"
                            + "\n Cualquier otro numero para salir"));

                    while (opcionJugos == 1 || opcionJugos == 2 || opcionJugos == 3) {
                        switch (opcionJugos) {

                            case 1:
                                idJugo += 1;
                                nombreJugo = JOptionPane.showInputDialog("Id de Jugo :" + idJugo + "\nIngrese el nombre del jugo");
                                datosJugos.agregar(idJugo, nombreJugo);
                                datosJugos.mostrar();
                                break;
                            case 2:
                                datosJugos.mostrar();
                                break;
                            case 3:
                                busqueda = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el id de Jugo"));
                                if (datosJugos.buscar(busqueda) == true) {
                                    nombreJugo = JOptionPane.showInputDialog("Id de Jugo :" + idJugo + "\nIngrese el nombre del jugo");
                                    datosJugos.modificar(busqueda, nombreJugo);
                                } else {
                                    JOptionPane.showMessageDialog(null, "El id #" + busqueda + " no se encontró");
                                }

                                break;

                        }
                        opcionJugos = Integer.parseInt(JOptionPane.showInputDialog("Ingrese la opcion que desea elegir \n"
                                + "1. Ingresar Jugos \n"
                                + "2. Mostrar Jugos \n"
                                + "3. Modificar Jugos \n"
                                + "\n Cualquier otro numero para salir"));
                    }
                    break;
                    
                    
                    
                case 2:// Sabores
                     opcionSabores = Integer.parseInt(JOptionPane.showInputDialog("Ingrese la opcion que desea elegir \n"
                            + "1. Ingresar Sabores \n"
                            + "2. Mostrar Sabores \n"
                            + "3. Modificar Sabores \n"
                            + "\n Cualquier otro numero para salir"));

                    while (opcionSabores == 1 || opcionSabores == 2 || opcionSabores == 3) {
                        switch (opcionSabores) {

                            case 1:
                                idSabor += 1;
                                nombreSabor = JOptionPane.showInputDialog("Id de Jugo :" + idSabor + "\nIngrese el nombre del jugo");
                                datosSabores.agregar(idSabor, nombreSabor);
                                datosSabores.mostrar();
                                break;
                            case 2:
                                datosSabores.mostrar();
                                break;
                            case 3:
                                busqueda = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el id de Sabor"));
                                if (datosSabores.buscar(busqueda) == true) {
                                    nombreSabor = JOptionPane.showInputDialog("Id de Sabor :" + idSabor + "\nIngrese el nombre del Sabor");
                                    datosSabores.modificar(busqueda, nombreSabor);
                                } else {
                                    JOptionPane.showMessageDialog(null, "El id #" + busqueda + " no se encontró");
                                }

                                break;

                        }
                        opcionSabores = Integer.parseInt(JOptionPane.showInputDialog("Ingrese la opcion que desea elegir \n"
                            + "1. Ingresar Sabores \n"
                            + "2. Mostrar Sabores \n"
                            + "3. Modificar Sabores \n"
                            + "\n Cualquier otro numero para salir"));
                    }
                    break;
                    
                    
                case 3:
                opcionSaboresPorJugo = Integer.parseInt(JOptionPane.showInputDialog("Ingrese la opcion que desea elegir \n"
                        + "1. Ingresar Sabores por Jugo \n"
                        + "2. Mostrar Sabores por Jugo disponibles \n"
                        + "3. Modificar Sabores por Jugo disponibles\n"
                        + "\n Cualquier otro numero para salir"));
                 while ( opcionSaboresPorJugo == 1 ||  opcionSaboresPorJugo == 2 ||  opcionSaboresPorJugo == 3) {
                        switch ( opcionSaboresPorJugo) {
                            
                            case 1:
                                break;
                            case 2:
                                    break;
                            case 3:
                                break;
                        }
                        
                          opcionSaboresPorJugo = Integer.parseInt(JOptionPane.showInputDialog("Ingrese la opcion que desea elegir \n"
                        + "1. Ingresar Sabores por Jugo \n"
                        + "2. Mostrar Sabores por Jugo disponibles \n"
                        + "3. Modificar Sabores por Jugo disponibles\n"
                        + "\n Cualquier otro numero para salir"));      
                        }
                    break;

            }
                 
                 
            }
menuOpciones = Integer.parseInt(JOptionPane.showInputDialog("Ingrese la opcion que desea elegir \n"
                + "1. Jugos \n"
                + "2. Sabores \n"
                + "3. Sabores por Jugos \n"
                + "\n Cualquier otro numero para cerrar el programa."));
        }

    }


