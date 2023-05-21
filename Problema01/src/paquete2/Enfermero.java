package paquete2;


public class Enfermero {
    //Atributos
    private String nombreEnfermero;
    private String tipoEnfermero;
    private double sueldoMensualEnfermero;
    //Constructores
    public Enfermero() {
    }

    public Enfermero(String nombreEnfermero, String tipoEnfermero, double sueldoMensualEnfermero) {
        this.nombreEnfermero = nombreEnfermero;
        this.tipoEnfermero = tipoEnfermero;
        this.sueldoMensualEnfermero = sueldoMensualEnfermero;
    }
    //Metodos SET y GET
    public void setNombreEnfermero(String nombreEnfermero) {
        this.nombreEnfermero = nombreEnfermero;
    }

    public void setTipoEnfermero(String tipoEnfermero) {
        this.tipoEnfermero = tipoEnfermero;
    }

    public void setSueldoMensualEnfermero(double sueldoMensualEnfermero) {
        this.sueldoMensualEnfermero = sueldoMensualEnfermero;
    }

    public String getNombreEnfermero() {
        return nombreEnfermero;
    }

    public String getTipoEnfermero() {
        return tipoEnfermero;
    }

    public double getSueldoMensualEnfermero() {
        return sueldoMensualEnfermero;
    }

    @Override
    public String toString() {
        return String.format("- %s - %.2f - %s \n",getNombreEnfermero(),getSueldoMensualEnfermero(),getTipoEnfermero());
    }
}
