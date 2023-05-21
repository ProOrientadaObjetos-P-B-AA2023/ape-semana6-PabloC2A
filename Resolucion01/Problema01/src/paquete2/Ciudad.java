package paquete2;

public class Ciudad {
    //Atributos
    private String nombreCiudad;
    private String provinciaCiudad;
    //Constructores
    public Ciudad() {
    }

    public Ciudad(String nombreCiudad, String provinciaCiudad) {
        this.nombreCiudad = nombreCiudad;
        this.provinciaCiudad = provinciaCiudad;
    }
    //Metodos SET Y GET
    public void setNombreCiudad(String nombreCiudad) {
        this.nombreCiudad = nombreCiudad;
    }

    public void setProvinciaCiudad(String provinciaCiudad) {
        this.provinciaCiudad = provinciaCiudad;
    }

    public String getNombreCiudad() {
        return nombreCiudad;
    }

    public String getProvinciaCiudad() {
        return provinciaCiudad;
    }
}
