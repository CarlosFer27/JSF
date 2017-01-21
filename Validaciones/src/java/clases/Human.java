package clases;

public class Human {
    
    private String name;
    private String lastName;
    private String sex;
    private int age;

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
    
    public Human(){
        
    }
    
    public String getName(){
        return name;
    }
    
    public void setName(String name){
        this.name=name;
    }
    
    public String getLastName(){
        return lastName;
    }
    
    public void setLastName(String lastName){
        this.lastName=lastName;
    }
    
    public String getSex(){
        return sex;
    }
    
    public void setSex(String sex){
        this.sex=sex;
    }
    
}
