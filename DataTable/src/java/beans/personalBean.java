package beans;
import clases.Persona;
import java.util.ArrayList;
import java.util.List;

import javax.faces.bean.RequestScoped;

@RequestScoped

public class personalBean {
    private Persona persona = new Persona();
    private List<Persona> listaPersona = new ArrayList();

    public List<Persona> getListaPersona() {
        return listaPersona;
    }

    public void setListaPersona(List<Persona> listaPersona) {
        this.listaPersona = listaPersona;
    }

    public Persona getPersona() {
        return persona;
    }

    public void setPersona(Persona persona) {
        this.persona = persona;
    }


    public personalBean() {
    }
    
    
    public void agregarPersona(){
        this.listaPersona.add(this.persona);
    }
}
