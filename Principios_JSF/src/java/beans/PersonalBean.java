package beans;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;

@ManagedBean
@RequestScoped
public class PersonalBean {
    
    //Constructor
    public PersonalBean() {
    }
    
    //Atributos
    private String name;
    private String mensaje;

    // getters y Setters
    
    public void setName(String name){
        this.name=name;
    }
    
    public String getName(){
        return name;
    }
    
    public void setMensaje(String mensaje){
        this.mensaje=mensaje;
    }
    
    public String getMesaje(){
        return mensaje;
    }

    public void saludar(){
        this.mensaje="Hola "+this.name;
    }
}
