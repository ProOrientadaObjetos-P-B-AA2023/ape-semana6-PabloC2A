package paquete2;

public class Medico {
    //Atributos
    private String nombreDoctor;
    private String especialidadDoctor;
    private double sueldoMensualDoctor;
    //Constructores
    public Medico() {
    }

    public Medico(String nombreDoctor, String especialidadDoctor, double sueldoMensualDoctor) {
        this.nombreDoctor = nombreDoctor;
        this.especialidadDoctor = especialidadDoctor;
        this.sueldoMensualDoctor = sueldoMensualDoctor;
    }
    //Metodos SET y GET
    public void setNombreDoctor(String nombreDoctor) {
        this.nombreDoctor = nombreDoctor;
    }

    public void setEspecialidadDoctor(String especialidadDoctor) {
        this.especialidadDoctor = especialidadDoctor;
    }

    public void setSueldoMensualDoctor(double sueldoMensualDoctor) {
        this.sueldoMensualDoctor = sueldoMensualDoctor;
    }

    public String getNombreDoctor() {
        return nombreDoctor;
    }

    public String getEspecialidadDoctor() {
        return especialidadDoctor;
    }

    public double getSueldoMensualDoctor() {
        return sueldoMensualDoctor;
    }

    @Override
    public String toString() {
        return String.format("- %s - %.2f - %s \n",getNombreDoctor(),getSueldoMensualDoctor(),getEspecialidadDoctor());
    }
}
