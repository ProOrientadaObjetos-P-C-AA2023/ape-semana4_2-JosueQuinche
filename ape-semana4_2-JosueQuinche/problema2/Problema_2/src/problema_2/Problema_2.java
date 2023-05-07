package problema_2;
class Profesores{
    private String nombre;
    private String apellido;
    private double sueldoBasico;
    private double sueldoTotal;
    private String cedula;
    private Provincia provincia;
    public Profesores(){}
    public Profesores(String nombre,String apellido,double sueldoBasico,String cedula ){
        this.nombre = nombre;
        this.apellido = apellido;
        this.sueldoBasico =sueldoBasico;
        this.cedula = cedula;
    }
    public Provincia getProvincia() {
        return provincia;
    }
    public void setProvincia(Provincia provincia) {
        this.provincia = provincia;
    }
    public String getNombre() {
        return nombre;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public String getApellido() {
        return apellido;
    }
    public void setApellido(String apellido) {
        this.apellido = apellido;
    }
    public double getSueldoBasico() {
        return sueldoBasico;
    }
    public void setSueldoBasico(double sueldoBasico) {
        this.sueldoBasico = sueldoBasico;
    }
    public double getSueldoTotal() {
        return sueldoTotal;
    }
    public void setSueldoTotal(double sueldoTotal) {
        this.sueldoTotal = sueldoTotal;
    }
    public String getCedula() {
        return cedula;
    }
    public void setCedula(String cedula) {
        this.cedula = cedula;
    }
    public void calcularSueldoTotal(){
        this.sueldoTotal = (this.getSueldoBasico()+this.getSueldoBasico()*1.2);
    }
    @Override
    public String toString(){
        return String.format("PROFESORES DE INSTITUCION:\n"
                            +"Nombre:%s"
                            +"\nApellido:%s"
                            +"\nSueldoBasico:%.2f"
                            +"\nSueldoTotal:%.2f"
                            +"\nCedula:%s"
                            +"\n"+provincia    
                            ,getNombre()
                            ,getApellido()
                            ,getSueldoBasico()
                            ,getSueldoTotal()
                            ,getCedula());
}
}
class Provincia{
    private String nombrePrv;
    private int numHabitantes;
    public Provincia(){}
    public Provincia (String nombrePrv, int numHabitantes){
        this.nombrePrv = nombrePrv;
        this.numHabitantes = numHabitantes;
    }
    public String getNombrePrv() {
        return nombrePrv;
    }
    public void setNombrePrv(String nombrePrv) {
        this.nombrePrv = nombrePrv;
    }
    public int getNumHabitantes() {
        return numHabitantes;
    }
    public void setNumHabitantes(int numHabitantes) {
        this.numHabitantes = numHabitantes;
    }
    @Override
    public String toString(){
        return "PROVINCIA"+"\nnombre de la Provincia="+nombrePrv+"\n"+"numero de Habitantes="+numHabitantes;
    }    
}
public class Problema_2 {
    public static void main(String[] args) {
        Provincia provincia1 = new Provincia("Loja",214855);
        Provincia provincia2 = new Provincia("Quito",2827106);
        Profesores profesores1 = new Profesores("Josue","Quinche",950.60,"1104639909");
        Profesores profesores2 = new Profesores("Luis","Rodriguez",850.50,"1011236569");
        profesores1.calcularSueldoTotal();
        profesores2.calcularSueldoTotal();        
        System.out.println(provincia1);
        System.out.print(provincia2+"\n");
        System.out.println(profesores1);
        System.out.println(profesores2);
    }    
}
