package practica.jugo;

import java.util.ArrayList;
import java.util.List;

public class SaboresPorJugos {
  
     private List<Object> listaSPJ = new ArrayList<>();

     public void agregar(int idJugo, int idSabor){
         listaSPJ.add("Id de Jugo"+idJugo);
         listaSPJ.add("Sabores asociados:");
        listaSPJ.add("Id de Sabor"+idSabor); 
     }
     
}
