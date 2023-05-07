package problema_4;
class Cliente{
    private String nombre;
    private String apellido;
    private String cedula;
    public Cliente(){}
    public Cliente(String nombre,String apellido,String cedula){
        this.nombre = nombre;
        this.apellido = apellido;
        this.cedula = cedula;
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
    public String getCedula() {
        return cedula;
    }
    public void setCedula(String cedula) {
        this.cedula = cedula;
    }
    @Override
    public String toString(){
        return "CLIENTE"+"\nNombre:"+nombre+"\nApellido:"+apellido+"\nCedula de Identidad:"+cedula;
    }
}
class Banco{
    private String nombreBanco;
    private int sucursales;
    public Banco(){}
    public Banco(String nombreBanco, int sucursales){
        this.nombreBanco = nombreBanco;
        this.sucursales = sucursales;
    }
    public String getNombreBanco() {
        return nombreBanco;
    }
    public void setNombreBanco(String nombreBanco) {
        this.nombreBanco = nombreBanco;
    }
    public int getSucursales() {
        return sucursales;
    }
    public void setSucursales(int sucursales) {
        this.sucursales = sucursales;
    }
    @Override
    public String toString(){
        return "BANCO"+"\nNombre del Banco:"+nombreBanco+"\nSucursales Nacionales en el Ecuador:"+sucursales;
    }
}
class Cheque{
    private String nombreCliente;
    private String nombreBanco;
    private double valorCheque;
    private double comision;
    private Cliente cliente;
    private Banco banco; 
    public Cheque(){}
    public Cheque(String nombreCliente, String nombreBanco, double valorCheque){
        this.nombreCliente = nombreCliente;
        this.nombreBanco = nombreBanco;
        this.valorCheque = valorCheque;       
    }

    public String getNombreCliente() {
        return nombreCliente;
    }

    public void setNombreCliente(String nombreCliente) {
        this.nombreCliente = nombreCliente;
    }

    public String getNombreBanco() {
        return nombreBanco;
    }

    public void setNombreBanco(String nombreBanco) {
        this.nombreBanco = nombreBanco;
    }

    public double getValorCheque() {
        return valorCheque;
    }

    public void setValorCheque(double valorCheque) {
        this.valorCheque = valorCheque;
    }

    public double getComision() {
        return comision;
    }

    public void setComision(double comision) {
        this.comision = comision;
    }
    public void calcularComision(){
        this.comision = this.valorCheque * 0.00003;
    }
    @Override
    public String toString(){
        return String.format("BANCO FINANCIERO EN CHEQUES:"
                +"\nNombre del Cliente:%s"
                +"\nNombre del Banco:%s"
                +"\nValor del Cheque:%.2f"
                +"\nComision:%.2f"
                +"\n"+banco
                +"\n"+cliente
                ,getNombreCliente()
                ,getNombreBanco()
                ,getValorCheque()
                ,getComision());
    }
}
public class Problema_4 {
    public static void main(String[] args) {
        Cheque cheque1 = new Cheque("Josue","PRODUBANCO",1000);
        Banco banco1 = new Banco("PRODUBANCO",101);
        Cliente cliente1 = new Cliente("Josue","Quinche","1104639909");
        cheque1.calcularComision();
        System.out.println("\n");
        System.out.println(cheque1);
        System.out.println("\n");
        System.out.println(banco1);
        System.out.println("\n");
        System.out.println(cliente1);
    }
    
}
