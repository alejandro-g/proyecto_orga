package proyectoed2;

import java.io.File;
import java.io.Serializable;

public class Registro implements Serializable {

    private String name;
    private String birthdate;
    private int id;
    private float salary;
    private char asterisco;
    private int referencia;
    private Indice index;

    public Registro(String name, String birthdate, int id, float salary, char asterisco, int referencia) {
        this.asterisco = asterisco;
        this.referencia = referencia;
        this.id = id;
        this.name = name;
        this.birthdate = birthdate;
        this.salary = salary;
    }

    public Registro() {

    }

    public char getAsterisco() {
        return asterisco;
    }

    public void setAsterisco(char asterisco) {
        this.asterisco = asterisco;
    }

    public int getReferencia() {
        return referencia;
    }

    public void setReferencia(int referencia) {
        this.referencia = referencia;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getBirthdate() {
        return birthdate;
    }

    public void setBirthdate(String birthdate) {
        this.birthdate = birthdate;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public float getSalary() {
        return salary;
    }

    public void setSalary(float salary) {
        this.salary = salary;
    }
    
    public int sizeOfRecord(){
        int size = 68;//tamaño que tendra cada registro
        return size;
    }

    public Indice getIndex() {
        return index;
    }

    public void setIndex(Indice index) {
        this.index = index;
    }
    
    

    @Override
    public String toString() {
        return "Registro{" + "name=" + name + ", birthdate=" + birthdate + ", id=" + id + ", salary=" + salary + '}';
    }

}
