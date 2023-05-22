package solucionesparcialpoo1b;

import java.util.Arrays;
import java.util.Scanner;

class Estudiante{
    private String nombreEst;
    private int edadEst;
    private Materia materia[];
    private String estado;
    public Estudiante(String nombreEst, int edadEst, Materia materia[]) {
        this.nombreEst = nombreEst;
        this.edadEst = edadEst;
        this.materia = materia;
    }
    
    public Materia[] getMateria() {
        return materia;
    }

    public String getNombreEst() {
        return nombreEst;
    }

    public int getEdadEst() {
        return edadEst;
    }
    @Override
    public String toString() {
            String msj = String.format("""
                                       DATOS DE CALIFICACIONES ESTUDIANTE
                                       -Nombre: %s 
                                       -Edad: %d 
                                       %s
                                       """
                    ,this.getNombreEst()
                    ,this.getEdadEst()
                    ,Arrays.toString(this.getMateria()));

        return msj;
                           
                //"Estudiante{" + "nombreEst=" + nombreEst + ", edadEst=" + edadEst + ", materia=" + materia + ", estado=" + estado + '}';
    }
}
class Materia{
    private double notaACD;
    private double notaAPE;
    private double notaAA;
    private double recuperacion;
    private double notaTotal;    
    private String estado;
    private String nombreMateria;
    public Materia(String nombreMateria, double notaACD, double notaAPE, double notaAA) {
        this.notaACD = notaACD;
        this.notaAPE = notaAPE;
        this.notaAA = notaAA;
        this.nombreMateria = nombreMateria;
    }
    public String calcularEstado(){
        this.estado = this.notaTotal >=7 ? "APROBADO": "REPROBADO";
        return this.estado;
    }
    public void calcularRecuperacion(){
        this.notaTotal = (this.recuperacion*0.35) + (this.notaTotal * 0.65);
    }
    public void carcularNotaTotal(){
        this.notaTotal = (this.notaACD*0.35) + (this.notaAPE*0.35) + (this.notaAA*0.3);
    }
    public double getNotaTotal() {
        return notaTotal;
    }
    public double getRecuperacion() {
        return recuperacion;
    }
    public void setNotaTotal(double notaTotal) {
        this.notaTotal = notaTotal;
    }
    public void setRecuperacion(double recuperacion) {
        this.recuperacion = recuperacion;
    }
    public String getEstado() {
        return estado;
    }

    public double getNotaACD() {
        return notaACD;
    }

    public double getNotaAPE() {
        return notaAPE;
    }

    public double getNotaAA() {
        return notaAA;
    }

    public String getNombreMateria() {
        return nombreMateria;
    }

    @Override
    public String toString() {
        String msj;
        if( recuperacion == 0)
        {
            msj = String.format("""
                                       
                                       NOTAS -- DE -- %S
                                       -NotaACD: %.2f
                                       -NotaAPE: %.2f 
                                       -NotaAA: %.2f
                                       -NotaTotal: %.2f
                                       -Estado: %s
                                       """
                    ,this.getNombreMateria()
                    ,this.getNotaACD()
                    ,this.getNotaAPE()
                    ,this.getNotaAA()
                    ,this.getNotaTotal()
                    ,this.getEstado());
        }else{
            msj = String.format("""
                                       
                                       NOTAS -- DE -- %S
                                       -NotaACD: %.2f
                                       -NotaAPE: %.2f 
                                       -NotaAA: %.2f
                                       -NotaTotal: %.2f
                                       -Nota Recuperacion: %.2f
                                       -Estado: %s
                                       """
                    ,this.getNombreMateria()
                    ,this.getNotaACD()
                    ,this.getNotaAPE()
                    ,this.getNotaAA()
                    ,this.getNotaTotal()
                    ,this.getRecuperacion()
                    ,this.getEstado());
        }
        return msj;
        //return "Materia{" + "notaACD=" + notaACD + ", notaAPE=" + notaAPE + ", notaAA=" + notaAA + ", recuperacion=" + recuperacion + ", notaTotal=" + notaTotal + ", estado=" + estado + '}';
    }

}
public class SolucionesParcialPOO1B {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        String nombreEst; 
        int edadEst;
        String nombreMat;
        double notaACD;
        double notaAPE;
        double notaAA;
        double notaRec;
        int cont = 0;
        System.out.println("""
                           CALIFICACIONES ESTUDIANTE
                           ------Ingrese las siguientes datos del Estudiante------
                           Nombre Completo:""");
        nombreEst = teclado.nextLine();
        System.out.println("Edad: ");
        edadEst = teclado.nextInt();
        
        System.out.println("CUANTAS MATERIAS DESEAS: ");
        int numMaterias = teclado.nextInt();
        Materia materias[] = new Materia[numMaterias];
        
        for (int i = 0; i < numMaterias; i++) {
            do{
                System.out.println("\nMATERIA " + (i+1));
                System.out.println("""
                                   CALIFICACIONES ESTUDIANTE
                                   ------Ingrese los siguientes datos------
                                   //Las notas deben ir sobre 10 
                                   Nombre de la materia // Nota1 // Nota2 // Nota3 """);
                materias[i] = new Materia(nombreMat = teclado.next(), notaACD = teclado.nextDouble()
                        ,notaAPE = teclado.nextDouble()
                        ,notaAA = teclado.nextDouble());
                if (notaACD < 0 || notaACD > 10 ||notaAPE < 0 || notaAPE > 10 || notaAA < 0 || notaAA > 10  ){
                    System.out.println("\n ALERTAA   ====  HA INGRESADO MAL LA NOTA PORFAVOR CORRIJA\n");
                }
            }while(notaACD < 0 || notaACD > 10 ||notaAPE < 0 || notaAPE > 10 || notaAA < 0 || notaAA > 10 );
        }
        for(Materia materiaAux : materias){
            materiaAux.carcularNotaTotal();
            materiaAux.calcularEstado();
            cont++;
            //double notaRecuperacion = materiaAux.getEstado().equals("REPROBADO") ? 1 : 0;
            //materiaAux.setRecuperacion(materiaAux.getEstado().equals("REPROBADO") ? notaRec : 0);
            if (materiaAux.getEstado().equals("REPROBADO")){
                System.out.println("En la Materia " + cont + " ha reprobado "
                + "\nPorfavor Ingrese la nota de Recuperacion: ");
                notaRec = teclado.nextDouble();
                materiaAux.setRecuperacion(notaRec);
                materiaAux.calcularRecuperacion();
                materiaAux.calcularEstado();
            }
        }
        Estudiante estudiante1 = new Estudiante(nombreEst, edadEst, materias);
        System.out.print(estudiante1);
    }
}