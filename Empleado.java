package paquete;

public class Empleado
{
    // Variables nativas miembro
    private String nombre;
    private String servicio_departamento;
    private String posicion;
    private double salario;
    
    /**
     * Constructores para la clase
     */
    public Empleado()
    {
        this.nombre = "";
        servicio_departamento = "";
        this.posicion = "";
        this.salario = 0;
    }
    
    public Empleado(String nombre, String serv_dept, String posicion, Double salario)
    {
        this.nombre = nombre;
        servicio_departamento = serv_dept;
        this.posicion = posicion;
        this.salario = salario;
    }

    /**
     * Funciones Miembro
     */    
    //asignando variables
    public void setNombre(String nombre)
    {
        this.nombre = nombre;
    }    
    
    public void setServicioDepartamento(String serv_dept)
    {
        this.servicio_departamento = serv_dept;
    }     
    
    public void setPosicion(String posicion)
    {
        this.posicion = posicion;
    }         
    
    public void setSalario(Double salario)
    {
        this.salario = salario;
    } 
    
    //Metdos de lectura
    public String getNombre()
    {
        return this.nombre;
    }    
    
    public String getServicioDepartamento()
    {
        return this.servicio_departamento;
    }     
    
    public String getPosicion()
    {
        return this.posicion;
    }         
    
    public Double getSalario()
    {
        return this.salario;
    }     
    
    public String toString()
    {
        String mensaje = "Nombre empleado: " + this.nombre + "\n"+
                    "Servicio/Departamento: " +this.servicio_departamento +
                     "\n"+"Posicion: " +this.posicion +"\n"+
                     "Salario: " + this.salario+"\n";
        
        return mensaje;        
    }    
}
