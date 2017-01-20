package beans;
import clases.Persona;
import java.util.List;
import java.util.ArrayList;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;

@ManagedBean
@RequestScoped

public class ListaCorrectaBean {
    //Variables del Bean
    private Persona perso = new Persona();
    private static List<Persona> listaEstatica= new ArrayList();
    
    //Constructor por default
    public ListaCorrectaBean() {
    }
    
    //Set y get de la lista creada
    public void setListaEstatica(List<Persona> listaEstatica){
        this.listaEstatica=listaEstatica;
    }
    
    public List<Persona> getListaEstatica(){
        return listaEstatica;
    }
    
    //set y get de la variable persona
    public void setPerso (Persona perso){
        this.perso=perso;
    }
    
    public Persona getPerso(){
        return perso;
    }
    
    //Metodo para agregar persona
    public void agregaPerso(){
        this.listaEstatica.add(this.perso);
    }
    
    //Metodo para eliminar persona
    
    public void borraPerso(Persona perso){
        this.listaEstatica.remove(perso);
    }
    
}
