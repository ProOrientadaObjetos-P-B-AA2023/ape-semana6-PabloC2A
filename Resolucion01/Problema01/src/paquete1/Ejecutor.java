package paquete1;

import paquete2.*;
import java.util.Scanner;
public class Ejecutor {
    public static void main(String[] args) {
        //Variables usadas
        Scanner entrada = new Scanner(System.in);
        Hospital hospital1 = new Hospital();
        Ciudad ciudad1 = new Ciudad();
        Medico[] conjuntoMedicos;
        Enfermero[] conjuntoEnfermeros;

        /*Inicio del Programa*/
        //Pedir el nombre, direccion, ciudad, provincia y especialidades del Hospital
        System.out.println("----------- RECOLECCION DE INFORMACION DEL HOSPITAL -----------");
        System.out.print("-Ingrese el nombre del hospital: ");
        hospital1.setNombreHospital(entrada.nextLine());
        System.out.print("-Ingrese la direccion del hospital: ");
        hospital1.setDireccionHospital(entrada.nextLine());
        System.out.print("-Ingrese la ciudad dónde se encuentra el hospital: ");
        ciudad1.setNombreCiudad(entrada.nextLine());
        System.out.print("-Ingrese la provincia dónde se encuentra el hospital: ");
        ciudad1.setProvinciaCiudad(entrada.nextLine());
        System.out.print("-Digite el numero de especialidades totales del hospital: ");
        hospital1.setNumeroEspecialidades(entrada.nextInt());
        entrada.nextLine();
        hospital1.setCiudad(ciudad1);
        System.out.println();
        //Pedir el numero de medicos y enfermeros que dispone el hospital
        //Creacion del conjunto(arreglo) de medicos y enfermeros(as)
        System.out.println("----------- RECOLECCION DATOS DEl PERSONAL -----------");
        System.out.print("-Ingrese el numero total de medicos: ");
        conjuntoMedicos = new Medico[entrada.nextInt()];
        entrada.nextLine();
        System.out.print("-Ingrese el numero total de enfermeros(as): ");
        conjuntoEnfermeros = new Enfermero[entrada.nextInt()];
        entrada.nextLine();
        System.out.println();
        //Entrada de datos de medicos y creacion de objetos (Medico)
        for (int i=0;i< conjuntoMedicos.length;i++){
            conjuntoMedicos[i] = new Medico();
            System.out.printf("--- DATOS DOCTOR %s ---\n",(i+1));
            System.out.print("-Nombre: ");
            conjuntoMedicos[i].setNombreDoctor(entrada.nextLine());
            System.out.print("-Especialidad: ");
            conjuntoMedicos[i].setEspecialidadDoctor(entrada.nextLine());
            System.out.print("-Sueldo mensual: ");
            conjuntoMedicos[i].setSueldoMensualDoctor(entrada.nextDouble());
            entrada.nextLine();
            System.out.println();
        }
        hospital1.setMedico(conjuntoMedicos);
        //Entrada de datos enfermeros(as) y creacion de objetos (Enfermero)
        for (int i=0;i< conjuntoMedicos.length;i++){
            conjuntoEnfermeros[i] = new Enfermero();
            System.out.printf("--- DATOS ENFERMERO %s ---\n",(i+1));
            System.out.print("-Nombre: ");
            conjuntoEnfermeros[i].setNombreEnfermero(entrada.nextLine());
            System.out.print("-Tipo (nombramiento-contrato): ");
            conjuntoEnfermeros[i].setTipoEnfermero(entrada.nextLine());
            System.out.print("-Sueldo mensual: ");
            conjuntoEnfermeros[i].setSueldoMensualEnfermero(entrada.nextDouble());
            entrada.nextLine();
            System.out.println();
        }
        hospital1.setEnfemero(conjuntoEnfermeros);
        //Calcular sueldos a pagar por mes
        hospital1.calcularTotalSueldosMensuales();
        //Imprimir objeto Hospital
        System.out.println(hospital1);
    }
}
