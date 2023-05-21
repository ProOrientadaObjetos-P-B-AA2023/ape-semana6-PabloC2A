package paquete2;


import java.util.Arrays;

public class Hospital {
    //Atributos
    private String nombreHospital;
    private Ciudad ciudad;
    private String direccionHospital;
    private int numeroEspecialidades;
    private Medico[] medico;
    private Enfermero[] enfemero;
    private double totalSueldosMensuales;
    //Constructores
    public Hospital() {
    }

    public Hospital(String nombreHospital, Ciudad ciudad, String direccionHospital, int numeroEspecialidades, Medico[] medico, Enfermero[] enfemero) {
        this.nombreHospital = nombreHospital;
        this.ciudad = ciudad;
        this.direccionHospital = direccionHospital;
        this.numeroEspecialidades = numeroEspecialidades;
        this.medico = medico;
        this.enfemero = enfemero;
    }

    //Metodos SET y GET
    public void setNombreHospital(String nombreHospital) {
        this.nombreHospital = nombreHospital;
    }

    public void setCiudad(Ciudad ciudad) {
        this.ciudad = ciudad;
    }

    public void setDireccionHospital(String direccionHospital) {
        this.direccionHospital = direccionHospital;
    }

    public void setNumeroEspecialidades(int numeroEspecialidades) {
        this.numeroEspecialidades = numeroEspecialidades;
    }

    public void setMedico(Medico[] medico) {
        this.medico = medico;
    }

    public void setEnfemero(Enfermero[] enfemero) {
        this.enfemero = enfemero;
    }

    public void calcularTotalSueldosMensuales() {
        //Suma de los sueldos del conjunto de médicos y enfermeros(as)
        for (Medico i:medico) {
            this.totalSueldosMensuales += i.getSueldoMensualDoctor();
        }
        for (Enfermero i:enfemero) {
            this.totalSueldosMensuales += i.getSueldoMensualEnfermero();
        }
    }

    public String getNombreHospital() {
        return nombreHospital;
    }

    public Ciudad getCiudad() {
        return ciudad;
    }

    public String getDireccionHospital() {
        return direccionHospital;
    }

    public int getNumeroEspecialidades() {
        return numeroEspecialidades;
    }

    public Medico[] getMedico() {
        return medico;
    }

    public Enfermero[] getEnfemero() {
        return enfemero;
    }

    public double getTotalSueldosMensuales() {
        return totalSueldosMensuales;
    }

    @Override
    public String toString() {
        return String.format("""
                --------------------- DATOS HOSPITAL ---------------------
                Nombre: %s
                Direccion: %s
                Ciudad: %s
                Provincia: %s
                Número de especialidades: %d
                Listado Medicos
                %s
                Listado Enfermeros(as)
                %s
                
                Total de sueldos a pagar por mes: %.2f
                """,getNombreHospital(),getDireccionHospital(),ciudad.getNombreCiudad(),
                ciudad.getProvinciaCiudad(),getNumeroEspecialidades(),Arrays.toString(medico),
                Arrays.toString(enfemero),getTotalSueldosMensuales());
    }
}
