package practica.jugo;

import javax.swing.JOptionPane;

public class PracticaJugo {

    public static void main(String[] args) {

        String nombreJugo = null, nombreSabor = null;
        int idJugo = 0, idSabor = 0, busqueda, iteracion;
        int menuOpciones, cuantosSabores;
        int opcionJugos, opcion, cuantosSaboresC = 0, busqueda2, busqueda3 = 0;
        int opcionSabores;
        int opcionSaboresPorJugo;
        int opcionModificar;
        int idSaborVerdadera = 0;
        int idJugoVerdadera = 0;
        double porcentajes = 0, cantidadSabor, proporcion = 0, porcentaje, proporcion2 = 0;
        AlmacenamientoJugos datosJugos = new AlmacenamientoJugos();
        AlmacenamientoSabores datosSabores = new AlmacenamientoSabores();
        AlmacenamientoSPJ datosSPJ = new AlmacenamientoSPJ();
        String saboresAutomaticos[] = {"Piña", "Sandia", "Pera", "Papaya", "Fresa", "Limon", "Naranja", "Mango", "Manzana", "Mandarina"};
        SaboresPorJugos jugosC = new SaboresPorJugos();
        for (int contador = 0; contador < 10; contador++) {
            idSabor += 1;
            nombreSabor = saboresAutomaticos[contador];
            datosSabores.agregar(idSabor, nombreSabor);
        }

        menuOpciones = Integer.parseInt(JOptionPane.showInputDialog("Ingrese la opcion que desea elegir \n"
                + "1. Jugos \n"
                + "2. Sabores \n"
                + "3.Lista de Sabores por Jugos \n"
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

                            case 1://ingresar jugos
                               idJugo += 1;
                                nombreJugo = JOptionPane.showInputDialog("Id de Jugo :" + idJugo + "\nIngrese el nombre del jugo");
                                datosJugos.agregar(idJugo, nombreJugo);
                                datosJugos.mostrar();

                                nombreJugo = null;
                                nombreSabor = null;

                                int buscarIdJugo = idJugo;
                                if (datosJugos.buscar(buscarIdJugo) == true) {
                                    nombreJugo = datosJugos.obtenerNombreJugo(buscarIdJugo);
                                    idJugoVerdadera = buscarIdJugo;
                                    cuantosSabores = Integer.parseInt(JOptionPane.showInputDialog("Cuantos sabores desea agregar a su jugo?"));
                                    if (cuantosSabores >= 1 || cuantosSabores > idSabor) {
                                        cuantosSaboresC = cuantosSabores;
                                        int cantidad = 0;
                                        proporcion = 0;
                                        do {
                                            porcentaje = 0;// reseto de variable
                                            cantidad++;
                                            datosSabores.mostrar();
                                            int buscarIdSabor = Integer.parseInt(JOptionPane.showInputDialog("Sabor # " + cantidad + "\nIngrese el id del sabor a agregar"));
                                            if (datosSabores.buscar(buscarIdSabor) == true) {
                                                nombreSabor = datosSabores.obtenerNombreSabor(buscarIdSabor);
                                                idSaborVerdadera = buscarIdSabor;
                                                //pendiente
                                                cantidadSabor = Double.parseDouble(JOptionPane.showInputDialog("Ingrese la cantidad de sabor que le agregara al jugo\n1.  10%\n2.  20%\n3.  25%\n4.  30%\n5.  40%\n6.   50%\n7.  65%\n8.  75%\n9.  80%\n10.  90%\n11.  100%"));
                                                if (cantidadSabor == 1) {//10%
                                                    porcentaje = porcentaje + 10;
                                                } else if (cantidadSabor == 2) {//20%
                                                    porcentaje = porcentaje + 20;
                                                } else if (cantidadSabor == 3) {//25%
                                                    porcentaje = porcentaje + 25;
                                                } else if (cantidadSabor == 4) {//30%
                                                    porcentaje = porcentaje + 30;
                                                } else if (cantidadSabor == 5) {//40%
                                                    porcentaje = porcentaje + 40;

                                                } else if (cantidadSabor == 6) {//50%
                                                    porcentaje = porcentaje + 50;

                                                } else if (cantidadSabor == 7) {//65%
                                                    porcentaje = porcentaje + 65;

                                                } else if (cantidadSabor == 8) {//75%
                                                    porcentaje = porcentaje + 75;

                                                } else if (cantidadSabor == 9) {//80%
                                                    porcentaje = porcentaje + 80;

                                                } else if (cantidadSabor == 10) {//90%
                                                    porcentaje = porcentaje + 90;

                                                } else if (cantidadSabor == 11) {//100%
                                                    porcentaje = porcentaje + 100;

                                                } else {
                                                    JOptionPane.showMessageDialog(null, "Opcion no valida");
                                                }
                                                proporcion2 = 0;//reseteo
                                                proporcion2 = proporcion2 + porcentaje;
                                                proporcion = proporcion + porcentaje;
                                                if (proporcion > 100) {
                                                    JOptionPane.showMessageDialog(null, "La cantidad de sabores agregados al jugo excede el 100%");
                                                } else {
                                                    porcentajes = proporcion2;
                                                    if (datosJugos.buscar(idJugo) == true) {
                                                        if (datosSabores.buscar(idSabor) == true) {
                                                            datosSPJ.agregadoCompleto(idJugoVerdadera, nombreJugo, idSaborVerdadera, nombreSabor, porcentajes,cuantosSaboresC);
                                                            datosSPJ.mostrarListaCompleta();
                                                        }
                                                    }
                                                }
                                            } else {
                                                JOptionPane.showMessageDialog(null, "El sabor agregado no existe vuelva a intentarlo");
                                                cantidad = cantidad - 1;
                                            }
                                        } while (cantidad != cuantosSabores);
                                        if (proporcion != 100) {
                                            if (datosSPJ.busquedaJugosC(idJugo) == true) {
                                                JOptionPane.showMessageDialog(null, "La porporcion del jugo no cumple con el 100% por lo tanto no se guardaran los datos ingresados");
                                                datosSPJ.eliminarDatos();
                                                if (datosJugos.buscar(idJugo) == true) {
                                                    datosJugos.eliminarJugo();
                                                    idJugo--;
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
                      
                            case 2://ver listado
                                if (datosJugos.buscar(idJugo) == true) {
                                   int opcionListaJugos = Integer.parseInt(JOptionPane.showInputDialog("1.Ver lista de los IdJugos\n2.Ver los IdJugos con sus respectivos sabores\nOtro numero para salir"));
                                    if (opcionListaJugos == 1) {
                                        datosJugos.mostrar();
                                    } else if (opcionListaJugos == 2) {
                                        datosSPJ.mostrarListaCompleta();
                                    }
                                } else {
                                    JOptionPane.showMessageDialog(null, "Jugos inexistentes");
                                }
                                break;
                            case 3://modificar
                                     opcionModificar = Integer.parseInt(JOptionPane.showInputDialog( "\n1.Cambiar los sabores que componen el jugo"
                                            + "\n2.Cambiar el nombre del jugo junto a sus respectivo sabores"
                                            + "\nCualquier otro numero para salir."));
                                     
                               while (opcionModificar == 1 && opcionModificar==2) {//cambiar nombre
                               switch (opcionModificar){
                
                                   case 1:
                                       buscarIdJugo=0;
                                        buscarIdJugo = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el id de Jugo a modificar"));
                                if (datosSPJ.busquedaJugosC(buscarIdJugo) == true) {
                                    if (datosJugos.buscar(buscarIdJugo) == true) {
                                        idJugoVerdadera = buscarIdJugo;
                                        nombreJugo = datosJugos.obtenerNombreJugo(idJugoVerdadera);
                                    }
                                      if (datosSPJ.busquedaJugosC(buscarIdJugo) == true) {
                                            cuantosSaboresC = datosSPJ.obtenerCuantosSabores(buscarIdJugo);
                                        }
                                        iteracion = 0;
                                         do {
                                            iteracion++;
                                            datosSPJ.eliminarDatos();
                                        } while (cuantosSaboresC != iteracion);
                                         datosJugos.eliminarJugo();
                                        datosSPJ.mostrarListaCompleta();
                               cuantosSabores = Integer.parseInt(JOptionPane.showInputDialog("Cuantos sabores desea agregar a su jugo?"));
                                    if (cuantosSabores >= 1 || cuantosSabores > idSabor) {
                                        cuantosSaboresC = cuantosSabores;
                                        int cantidad = 0;
                                        proporcion = 0;
                                        do {
                                            porcentaje = 0;// reseto de variable
                                            cantidad++;
                                            datosSabores.mostrar();
                                            int buscarIdSabor = Integer.parseInt(JOptionPane.showInputDialog("Sabor # " + cantidad + "\nIngrese el id del sabor a agregar"));
                                            if (datosSabores.buscar(buscarIdSabor) == true) {
                                                nombreSabor = datosSabores.obtenerNombreSabor(buscarIdSabor);
                                                idSaborVerdadera = buscarIdSabor;
                                                //pendiente
                                                cantidadSabor = Double.parseDouble(JOptionPane.showInputDialog("Ingrese la cantidad de sabor que le agregara al jugo\n1.  10%\n2.  20%\n3.  25%\n4.  30%\n5.  40%\n6.   50%\n7.  65%\n8.  75%\n9.  80%\n10.  90%\n11.  100%"));
                                                if (cantidadSabor == 1) {//10%
                                                    porcentaje = porcentaje + 10;
                                                } else if (cantidadSabor == 2) {//20%
                                                    porcentaje = porcentaje + 20;
                                                } else if (cantidadSabor == 3) {//25%
                                                    porcentaje = porcentaje + 25;
                                                } else if (cantidadSabor == 4) {//30%
                                                    porcentaje = porcentaje + 30;
                                                } else if (cantidadSabor == 5) {//40%
                                                    porcentaje = porcentaje + 40;

                                                } else if (cantidadSabor == 6) {//50%
                                                    porcentaje = porcentaje + 50;

                                                } else if (cantidadSabor == 7) {//65%
                                                    porcentaje = porcentaje + 65;

                                                } else if (cantidadSabor == 8) {//75%
                                                    porcentaje = porcentaje + 75;

                                                } else if (cantidadSabor == 9) {//80%
                                                    porcentaje = porcentaje + 80;

                                                } else if (cantidadSabor == 10) {//90%
                                                    porcentaje = porcentaje + 90;

                                                } else if (cantidadSabor == 11) {//100%
                                                    porcentaje = porcentaje + 100;

                                                } else {
                                                    JOptionPane.showMessageDialog(null, "Opcion no valida");
                                                }
                                                proporcion2 = 0;//reseteo
                                                proporcion2 = proporcion2 + porcentaje;
                                                proporcion = proporcion + porcentaje;
                                                if (proporcion > 100) {
                                                    JOptionPane.showMessageDialog(null, "La cantidad de sabores agregados al jugo excede el 100%");
                                                } else {
                                                    porcentajes = proporcion2;
                                                    if (datosJugos.buscar(idJugo) == true) {
                                                        if (datosSabores.buscar(idSabor) == true) {
                                                            datosSPJ.agregadoCompleto(idJugoVerdadera, nombreJugo, idSaborVerdadera, nombreSabor, porcentajes,cuantosSaboresC);
                                                            datosSPJ.mostrarListaCompleta();
                                                        }
                                                    }
                                                }
                                            } else {
                                                JOptionPane.showMessageDialog(null, "El sabor agregado no existe vuelva a intentarlo");
                                                cantidad = cantidad - 1;
                                            }
                                        } while (cantidad != cuantosSabores);
                                        if (proporcion != 100) {
                                            if (datosSPJ.busquedaJugosC(idJugo) == true) {
                                                JOptionPane.showMessageDialog(null, "La porporcion del jugo no cumple con el 100% por lo tanto no se guardaran los datos ingresados");
                                                datosSPJ.eliminarDatos();
                                                if (datosJugos.buscar(idJugo) == true) {
                                                    datosJugos.eliminarJugo();
                                                   
                                                }
                                            }
                                        }

                                    } else {
                                        JOptionPane.showMessageDialog(null, "Cantidad ingresada no valida");

                                    }
                                }
           
                                       break;
                                       
                                   case 2:
                                          buscarIdJugo=0;
                                         buscarIdJugo = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el id de Jugo a modificar"));
                                if (datosSPJ.busquedaJugosC(buscarIdJugo) == true) {
                                    if (datosJugos.buscar(buscarIdJugo) == true) {
                                        idJugoVerdadera = buscarIdJugo;
                                        nombreJugo = JOptionPane.showInputDialog("Id de Jugo :" + idJugoVerdadera + "\nIngrese el nuevo nombre del jugo");
                                        datosJugos.modificar(idJugoVerdadera, nombreJugo);
                                       
                                        JOptionPane.showMessageDialog(null, "Datos modificados con éxito");
                                    } else {
                                        JOptionPane.showMessageDialog(null, "El id #" + buscarIdJugo + " no se encontró");
                                    }
                                    }
                                
                                  buscarIdJugo=0;
                                        buscarIdJugo = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el id de Jugo a modificar"));
                                if (datosSPJ.busquedaJugosC(buscarIdJugo) == true) {
                                    if (datosJugos.buscar(buscarIdJugo) == true) {
                                        idJugoVerdadera = buscarIdJugo;
                                        nombreJugo = datosJugos.obtenerNombreJugo(idJugoVerdadera);
                                    }
                                      if (datosSPJ.busquedaJugosC(buscarIdJugo) == true) {
                                            cuantosSaboresC = datosSPJ.obtenerCuantosSabores(buscarIdJugo);
                                        }
                                        iteracion = 0;
                                         do {
                                            iteracion++;
                                            datosSPJ.eliminarDatos();
                                        } while (cuantosSaboresC != iteracion);
                                         datosJugos.eliminarJugo();
                                        datosSPJ.mostrarListaCompleta();
                               cuantosSabores = Integer.parseInt(JOptionPane.showInputDialog("Cuantos sabores desea agregar a su jugo?"));
                                    if (cuantosSabores >= 1 || cuantosSabores > idSabor) {
                                        cuantosSaboresC = cuantosSabores;
                                        int cantidad = 0;
                                        proporcion = 0;
                                        do {
                                            porcentaje = 0;// reseto de variable
                                            cantidad++;
                                            datosSabores.mostrar();
                                            int buscarIdSabor = Integer.parseInt(JOptionPane.showInputDialog("Sabor # " + cantidad + "\nIngrese el id del sabor a agregar"));
                                            if (datosSabores.buscar(buscarIdSabor) == true) {
                                                nombreSabor = datosSabores.obtenerNombreSabor(buscarIdSabor);
                                                idSaborVerdadera = buscarIdSabor;
                                                //pendiente
                                                cantidadSabor = Double.parseDouble(JOptionPane.showInputDialog("Ingrese la cantidad de sabor que le agregara al jugo\n1.  10%\n2.  20%\n3.  25%\n4.  30%\n5.  40%\n6.   50%\n7.  65%\n8.  75%\n9.  80%\n10.  90%\n11.  100%"));
                                                if (cantidadSabor == 1) {//10%
                                                    porcentaje = porcentaje + 10;
                                                } else if (cantidadSabor == 2) {//20%
                                                    porcentaje = porcentaje + 20;
                                                } else if (cantidadSabor == 3) {//25%
                                                    porcentaje = porcentaje + 25;
                                                } else if (cantidadSabor == 4) {//30%
                                                    porcentaje = porcentaje + 30;
                                                } else if (cantidadSabor == 5) {//40%
                                                    porcentaje = porcentaje + 40;

                                                } else if (cantidadSabor == 6) {//50%
                                                    porcentaje = porcentaje + 50;

                                                } else if (cantidadSabor == 7) {//65%
                                                    porcentaje = porcentaje + 65;

                                                } else if (cantidadSabor == 8) {//75%
                                                    porcentaje = porcentaje + 75;

                                                } else if (cantidadSabor == 9) {//80%
                                                    porcentaje = porcentaje + 80;

                                                } else if (cantidadSabor == 10) {//90%
                                                    porcentaje = porcentaje + 90;

                                                } else if (cantidadSabor == 11) {//100%
                                                    porcentaje = porcentaje + 100;

                                                } else {
                                                    JOptionPane.showMessageDialog(null, "Opcion no valida");
                                                }
                                                proporcion2 = 0;//reseteo
                                                proporcion2 = proporcion2 + porcentaje;
                                                proporcion = proporcion + porcentaje;
                                                if (proporcion > 100) {
                                                    JOptionPane.showMessageDialog(null, "La cantidad de sabores agregados al jugo excede el 100%");
                                                } else {
                                                    porcentajes = proporcion2;
                                                    if (datosJugos.buscar(idJugo) == true) {
                                                        if (datosSabores.buscar(idSabor) == true) {
                                                            datosSPJ.agregadoCompleto(idJugoVerdadera, nombreJugo, idSaborVerdadera, nombreSabor, porcentajes,cuantosSaboresC);
                                                            datosSPJ.mostrarListaCompleta();
                                                        }
                                                    }
                                                }
                                            } else {
                                                JOptionPane.showMessageDialog(null, "El sabor agregado no existe vuelva a intentarlo");
                                                cantidad = cantidad - 1;
                                            }
                                        } while (cantidad != cuantosSabores);
                                        if (proporcion != 100) {
                                            if (datosSPJ.busquedaJugosC(idJugo) == true) {
                                                JOptionPane.showMessageDialog(null, "La porporcion del jugo no cumple con el 100% por lo tanto no se guardaran los datos ingresados");
                                                datosSPJ.eliminarDatos();
                                                if (datosJugos.buscar(idJugo) == true) {
                                                    datosJugos.eliminarJugo();
                                                   
                                                }
                                            }
                                        }

                                    } else {
                                        JOptionPane.showMessageDialog(null, "Cantidad ingresada no valida");

                                    }
                                }
           
                                
                                       break;
                                        
                               }      
  
                                break;
                        }
                               opcionModificar = Integer.parseInt(JOptionPane.showInputDialog( "\n1.Cambiar los sabores que componen el jugo"
                                            + "\n2.Cambiar el nombre del jugo junto a sus respectivo sabores"
                                            + "\nCualquier otro numero para salir."));
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

                case 3://sabores por jugo
                    if (datosJugos.buscar(idJugo) == true) {
                    datosSPJ.mostrarListaCompleta();
            } else {
                         JOptionPane.showMessageDialog(null, "Esta lista todavia no ha sido creada...1");  
                       }
            }

            menuOpciones = Integer.parseInt(JOptionPane.showInputDialog("Ingrese la opcion que desea elegir \n"
                    + "1. Jugos \n"
                    + "2. Sabores \n"
                    + "3. Lista de Sabores por Jugos \n"
                    + "\n Cualquier otro numero para cerrar el programa."));
        }

    }

}
