package Beans;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;
import java.util.List;
import java.util.ArrayList;
import Clases.Vehiculo;

@ManagedBean
@RequestScoped

public class ValidatorBean {
    private Vehiculo carro = new Vehiculo();
    private static List<Vehiculo> listCarro = new ArrayList();
    
    public ValidatorBean(){
        
    }
    
    public Vehiculo getCarro(){
        return carro;
    }
    
    public void setCarro(Vehiculo carro){
        this.carro=carro;
    }
    
    public List<Vehiculo> getListCarro(){
        return listCarro;
    }
    
    public void setListCarro(List<Vehiculo> listCarro){
        this.listCarro=listCarro;
    }
    
    public void agregaCarro(){
        this.listCarro.add(carro);
    }
    
    public void eliminaCarro(Vehiculo carro){
        this.listCarro.remove(carro);
    }
 
    
}
