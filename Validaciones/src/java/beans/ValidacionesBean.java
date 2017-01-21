package beans;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;
import clases.Human;
import java.util.List;
import java.util.ArrayList;
import javax.faces.application.FacesMessage;
import javax.faces.component.UIComponent;
import javax.faces.component.UIInput;
import javax.faces.context.FacesContext;

@ManagedBean
@RequestScoped

public class ValidacionesBean {
    //Atributos del Bean
    private Human humano = new Human();
    private static List<Human> listHuman = new ArrayList();
    
    //getters y setters
    public Human getHumano(){
        return humano;
    }
    
    public void setHumano(Human humano){
        this.humano=humano;
    }
    
    public List<Human> getlistHuman(){
        return listHuman;
    }
    
    public void setListHuman(List<Human> listHuman){
        this.listHuman=listHuman;
    }

    //Constructor
    public ValidacionesBean() {
    }
    
    //Metodo para agregar humano a la lista
    public void agregaHuman(){
        this.listHuman.add(this.humano);
    }
    
    //Metodo para eliminar Persona
    public void eliminaHuman(Human humano){
        this.listHuman.remove(humano);
    }
    
    public void validateSex(FacesContext context, UIComponent toValidate, Object value){
        context = FacesContext.getCurrentInstance(); 
        String texto = (String)value;
        
        if(!texto.equalsIgnoreCase("M")&&!texto.equalsIgnoreCase("F")){
            ((UIInput)toValidate).setValid(false);
            context.addMessage(toValidate.getClientId(context), new FacesMessage("Sexo no valido"));
        }
    }
    
}
