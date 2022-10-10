package alvaro;

import java.util.Scanner;

/**
 *
 * @author alvaro
 */
public class ParteA {

    public static void main(String[] args) {
        //VARIABLE EN LA QUE SE GUARDARÁN LOS DATOS QUE SE METERÁN POR CONSOLA
        Scanner teclado = new Scanner(System.in);

        //VARIABLES
        final double PRECIOREPA = 32.6;
        int reparaciLune;
        int reparaciMarte;
        int reparaciMier;
        int reparaciJuev;
        int reparaciVier;

        float totalLune;
        float totalMarte;
        float totalMier;
        float totalJuev;
        float totalVier;

        float totalRepaSemana;

        //PEDIR REPARACIONES QUE SE HACEN AL DIA
        System.out.println("Indica cuantas reparaciones se han realizado el LUNES");
        reparaciLune = teclado.nextInt();

        System.out.println("Indica cuantas reparaciones se han realizado el MARTES");
        reparaciMarte = teclado.nextInt();

        System.out.println("Indica cuantas reparaciones se han realizado el MIERCOLES");
        reparaciMier = teclado.nextInt();

        System.out.println("Indica cuantas reparaciones se han realizado el JUEVES");
        reparaciJuev = teclado.nextInt();

        System.out.println("Indica cuantas reparaciones se han realizado el VIERNES");
        reparaciVier = teclado.nextInt();

        //CALCULOS DE CUANTO SE HA GANADO CADA DIA
        totalLune = (float) (reparaciLune * PRECIOREPA);
        totalMarte = (float) (reparaciMarte * PRECIOREPA);
        totalMier = (float) (reparaciMier * PRECIOREPA);
        totalJuev = (float) (reparaciJuev * PRECIOREPA);
        totalVier = (float) (reparaciVier * PRECIOREPA);

        //CALCULOS DE CUANTO SE HA GANADO EN TODA LA SEMANA
        totalRepaSemana = totalLune + totalMarte + totalMier + totalJuev + totalVier;

        //MOSTRAR RESULTADOS POR PANTALLA
        System.out.println("******************************");
        System.out.println("GANANCIAS DE LA SEMANA \n");
        System.out.printf("LUNES: %.3f \n", totalLune);
        System.out.printf("MARTES: %.3f \n", totalMarte);
        System.out.printf("MIERCOLES: %.3f \n", totalMier);
        System.out.printf("JUEVES: %.3f \n", totalJuev);
        System.out.printf("VIERNES: %.3f \n", totalVier);

        System.out.printf("\nTOTAL SEMANA: %.3f \n", totalRepaSemana);
        System.out.println("******************************");

    }
}
