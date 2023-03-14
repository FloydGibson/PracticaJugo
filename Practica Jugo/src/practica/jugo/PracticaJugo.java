package practica.jugo;

import javax.swing.JOptionPane;

public class PracticaJugo {

    public static void main(String[] args) {

        String nombreJugo = null, nombreSabor = null;
        int idJugo = 0, idSabor = 0, busqueda;
        int menuOpciones;
        int opcionJugos;
        int opcionSabores;
        int opcionSaboresPorJugo;
        int idSaborVerdadera = 0;
        int idJugoVerdadera = 0;
        double porcentajes = 0;
        AlmacenamientoJugos datosJugos = new AlmacenamientoJugos();
        AlmacenamientoSabores datosSabores = new AlmacenamientoSabores();
        AlmacenamientoSPJ datosSPJ = new AlmacenamientoSPJ();

        menuOpciones = Integer.parseInt(JOptionPane.showInputDialog("Ingrese la opcion que desea elegir \n"
                + "1. Jugos \n"
                + "2. Sabores \n"
                + "3. Sabores por Jugos \n"
                + "\n Cualquier otro numero para cerrar el programa."));

        while (menuOpciones >= 1 && menuOpciones <= 3) {

            switch (menuOpciones) {
                case 1://Jugos

                    opcionJugos = Integer.parseInt(JOptionPane.showInputDialog("Ingrese la opcion que desea elegir \n"
                            + "1. Ingresar Jugos \n"
                            + "2. Mostrar Jugos \n"
                            + "3. Modificar Jugos \n"
                            + "\n Cualquier otro numero para salir"));

                    while (opcionJugos >= 1 && opcionJugos <= 3) {
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

                    while (opcionSabores >= 1 && opcionSabores <= 3) {
                        switch (opcionSabores) {

                            case 1:
                                idSabor += 1;
                                nombreSabor = JOptionPane.showInputDialog("Id de Sabor :" + idSabor + "\nIngrese el nombre del Sabor");
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
                    while (opcionSaboresPorJugo >= 1 && opcionSaboresPorJugo <= 3) {
                        switch (opcionSaboresPorJugo) {

                            case 1:
                                nombreJugo = null;
                                nombreSabor = null;
                                datosJugos.mostrar();
                                int buscarIdJugo = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el id del jugo al que se le agregaran sabores"));
                                if (datosJugos.buscar(buscarIdJugo) == true) {
                                    nombreJugo = datosJugos.obtenerNombreJugo(buscarIdJugo);
                                    idJugoVerdadera = buscarIdJugo;
                                    int cuantosSabores = Integer.parseInt(JOptionPane.showInputDialog("Cuantos sabores desea agregar a su jugo?"));
                                    if (cuantosSabores >= 1 || cuantosSabores > idSabor) {
                                        int cantidad = 0; 
                                        double porcentaje = 0;
                                        do {
                                            cantidad++;
                                            datosSabores.mostrar();
                                            int buscarIdSabor = Integer.parseInt(JOptionPane.showInputDialog("Sabor # " + cantidad + "\nIngrese el id del sabor a agregar"));
                                            if (datosSabores.buscar(buscarIdSabor) == true) {
                                                nombreSabor = datosSabores.obtenerNombreSabor(buscarIdSabor);
                                                idSaborVerdadera = buscarIdSabor;
                                                porcentajes = Double.parseDouble(JOptionPane.showInputDialog("Ingrese la cantidad de sabor que le agregara al jugo"));
                                                porcentaje = porcentaje + porcentajes;
                                            } else {
                                                JOptionPane.showMessageDialog(null, "El sabor agregado no existe vuelva a intentarlo");
                                                cantidad = cantidad - 1;
                                            }
                                        } while (cantidad != cuantosSabores);
                                        double proporcion = porcentaje;
                                        if (proporcion > 100) {
                                            JOptionPane.showMessageDialog(null, "La cantidad de sabores agregados al jugo excede el 100%");
                                        } else {
                                            if (datosJugos.buscar(idJugo) == true) {
                                                if (datosSabores.buscar(idSabor) == true) {
                                                    datosSPJ.agregadoCompleto(idJugoVerdadera, nombreJugo, idSaborVerdadera, nombreSabor, porcentajes);
                                                    datosSPJ.mostrarListaCompleta();
                                                }
                                            }
                                        }
                                    } else {
                                        JOptionPane.showMessageDialog(null, "Cantidad ingresada no valida");

                                    }
                                } else {
                                    JOptionPane.showMessageDialog(null, "El id del jugo ingresado no existe");
                                }

                                break;

                            case 2:
                                datosSPJ.mostrarListaCompleta();
                                break;
                            case 3:
                                nombreJugo = null;
                                nombreSabor = null;
                                buscarIdJugo = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el id de Jugo a modificar"));
                                if (datosSPJ.busquedaJugosC(buscarIdJugo) == true) {
                                    if (datosJugos.buscar(buscarIdJugo) == true) {
                                        nombreJugo = datosJugos.obtenerNombreJugo(buscarIdJugo);
                                        idJugoVerdadera = buscarIdJugo;
                                    }
                                    int cuantosSabores = Integer.parseInt(JOptionPane.showInputDialog("Cuantos sabores desea agregar a su jugo?"));
                                    if (cuantosSabores >= 1 || cuantosSabores > idSabor) {
                                        int cantidad = 0; 
                                        double porcentaje = 0;
                                        do {
                                            cantidad++;
                                            datosSabores.mostrar();
                                            int buscarIdSabor = Integer.parseInt(JOptionPane.showInputDialog("Sabor # " + cantidad + "\nIngrese el id del sabor a agregar"));
                                            if (datosSabores.buscar(buscarIdSabor) == true) {
                                                if (datosSabores.buscar(buscarIdSabor) == true) {
                                                    nombreSabor = datosSabores.obtenerNombreSabor(buscarIdSabor);
                                                    idSaborVerdadera = buscarIdSabor;
                                                }
                                                porcentajes = Double.parseDouble(JOptionPane.showInputDialog("Ingrese la cantidad de sabor que le agregara al jugo"));
                                                porcentaje = porcentaje + porcentajes;
                                            } else {
                                                JOptionPane.showMessageDialog(null, "El sabor agregado no existe vuelva a intentarlo");
                                                cantidad = cantidad - 1;
                                            }
                                        } while (cantidad != cuantosSabores);
                                        double proporcion = porcentaje;
                                        if (proporcion > 100) {
                                            JOptionPane.showMessageDialog(null, "La cantidad de sabores agregados al jugo excede el 100%");
                                        } else {
                                            if (datosJugos.buscar(idJugo) == true) {
                                                if (datosSabores.buscar(idSabor) == true) {

                                                    datosSPJ.modificarCompleto(idJugoVerdadera, nombreJugo, idSaborVerdadera, nombreSabor, porcentajes);
                                                }
                                            }
                                        }
                                    } else {
                                        JOptionPane.showMessageDialog(null, "Cantidad ingresada no valida");

                                    }
                                } else {
                                    JOptionPane.showMessageDialog(null, "El id del jugo ingresado no existe");
                                }

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

            menuOpciones = Integer.parseInt(JOptionPane.showInputDialog("Ingrese la opcion que desea elegir \n"
                    + "1. Jugos \n"
                    + "2. Sabores \n"
                    + "3. Sabores por Jugos \n"
                    + "\n Cualquier otro numero para cerrar el programa."));
        }

    }

}
