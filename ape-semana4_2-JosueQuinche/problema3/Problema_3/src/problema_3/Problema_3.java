package problema_3;
class Automotor{
    private String cedulaDnio;
    private String marcaAuto;
    private int  anioFca;
    private double valorAuto;
    private double valorMat;
    private Fabricante fabricante;
    public Automotor(){}
    public Automotor(String cedulaDnio, String marcaAuto, int anioFca, double valorAuto){
        this.cedulaDnio = cedulaDnio;
        this.marcaAuto = marcaAuto;
        this.anioFca = anioFca;
        this.valorAuto = valorAuto;
    }
    public String getCedulaDnio() {
        return cedulaDnio;
    }
    public void setCedulaDnio(String cedulaDnio) {
        this.cedulaDnio = cedulaDnio;
    }
    public String getMarcaAuto() {
        return marcaAuto;
    }
    public void setMarcaAuto(String marcaAuto) {
        this.marcaAuto = marcaAuto;
    }
    public int getAnioFca() {
        return anioFca;
    }
    public void setAnioFca(int anioFca) {
        this.anioFca = anioFca;
    }
    public double getValorAuto() {
        return valorAuto;
    }
    public void setValorAuto(double valorAuto) {
        this.valorAuto = valorAuto;
    }
    public double getValorMat() {
        return valorMat;
    }
    public void setValorMat(double valorMat) {
        this.valorMat = valorMat;
    }
    public void calcularValorMatricula(){
        int antiguedad = 2023-this.anioFca;
        double porcentaje = 0.00002;
        this.valorMat = this.valorAuto * porcentaje * antiguedad;
    }
    @Override
    public String toString(){
        return String.format("CARACTERISTICAS DEL AUTOMOTOR:"
                +"\nCedula del duenio: %s"
                +"\nMarca del Vehiculo: %s"
                +"\nAnio de fabricacion: %d"
                +"\nValor del vehiculo $: %.2f"
                +"\nValor de la Matricula $: %.2f"
                +"\n"+fabricante
                ,getCedulaDnio()
                ,getMarcaAuto()
                ,getAnioFca()
                ,getValorAuto()
                ,getValorMat());
    }
            
}
class Fabricante{
    private String nombreFcant;
    private String ciudadOrg;
    public Fabricante(){}
    public Fabricante(String nombreFcant, String ciudadOrg){
        this.nombreFcant = nombreFcant;
        this.ciudadOrg = ciudadOrg;
    }
    public String getNombreFcant() {
        return nombreFcant;
    }
    public void setNombreFcant(String nombreFcant) {
        this.nombreFcant = nombreFcant;
    }
    public String getCiudadOrg() {
        return ciudadOrg;
    }
    public void setCiudadOrg(String ciudadOrg) {
        this.ciudadOrg = ciudadOrg;
    }
    @Override
    public String toString(){
        return "FABRICANTE"+"\nNombre del Fabricante:"+nombreFcant+"\nCiudad de Origen"+ciudadOrg;
    }
}
public class Problema_3 {
    public static void main(String[] args) {
        Automotor automotor1 = new Automotor("1234567890","Hyundai",2019,27500.0);
        Fabricante fabricante1 = new Fabricante("Yangjae-Dong","Seocho-Gu en Seúl");
        automotor1.calcularValorMatricula();
        System.out.println(fabricante1);
        System.out.println(automotor1);
    }
    
}
