package practica.jugo;

import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.JTextArea;

public class AlmacenamientoSPJ {
    //codigo
    int ubicacion,iteracion;
    private List<SaboresPorJugos>listaCompleta=new ArrayList<>();
    JTextArea hoja=new JTextArea();
    public void agregadoCompleto(int idJugo,String nombreJugo,int idSabor,String sabores,double cantidadSabor){
        SaboresPorJugos saborJugo=new SaboresPorJugos();
        saborJugo.setIdJugo(idJugo);
        saborJugo.setNombreJugo(nombreJugo);
        saborJugo.setIdSabor(idSabor);
        saborJugo.setSabores(sabores);
        listaCompleta.add(saborJugo);
    }
    
    public String listarCompleta(){
        String salida="";
        for(SaboresPorJugos particularidad:listaCompleta){
            salida=salida+"IdJugo: "+particularidad.getIdJugo()+"\nJugo: "+particularidad.getNombreJugo()+"\nIdSabor: "+particularidad.getIdSabor()+"\nSabores: "+particularidad.getSabores()+"\n";
        }
        return salida;
    }
    
    public void mostrarListaCompleta(){
        hoja.setText(listarCompleta());
        JOptionPane.showMessageDialog(null,hoja);
    }
    
    public boolean busquedaJugosC(String nombreJugo){
        boolean existe=false;
        this.iteracion=0;
        for(SaboresPorJugos particularidad:listaCompleta){
            if(particularidad.getNombreJugo().equals(nombreJugo)){
                existe=true;
                this.ubicacion=this.iteracion;
            }
            this.iteracion++;
        }
        return existe;
    }
    
    public boolean busquedaSaboresC(String sabores){
        boolean existe=false;
        this.iteracion=0;
        for(SaboresPorJugos particularidad:listaCompleta){
            if(particularidad.getSabores().equals(sabores)){
                existe=true;
                this.ubicacion=this.iteracion;
            }
            this.iteracion++;
        }
        return existe;
    }
    
   
    
    
    
    
}
