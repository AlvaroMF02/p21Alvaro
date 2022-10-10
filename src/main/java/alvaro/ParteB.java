package alvaro;

import javax.swing.JOptionPane;

/**
 *
 * @author alvaro
 */
public class ParteB {
    public static void main(String[] args) {

        //VARIABLES
        double costeRepLune;
        double costeRepMarte;
        double costeRepMier;
        double costeRepJuev;
        double costeRepVier;
        
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
        boolean totalDineroSemana=false;
        String resultado;

        //PEDIR AL USUARIO QUE INDIQUE CUANTO COSTARÁ LA REPARACION CADA DIA
        costeRepLune = Double.parseDouble(JOptionPane.showInputDialog
        ("Indica cuanto cuesta la reparación el LUNES"));
        
        costeRepMarte = Double.parseDouble(JOptionPane.showInputDialog
        ("Indica cuanto cuesta la reparación el MARTES"));
        
        costeRepMier = Double.parseDouble(JOptionPane.showInputDialog
        ("Indica cuanto cuesta la reparación el MIERCOLES"));
        
        costeRepJuev = Double.parseDouble(JOptionPane.showInputDialog
        ("Indica cuanto cuesta la reparación el JUEVES"));
        
        costeRepVier = Double.parseDouble(JOptionPane.showInputDialog
        ("Indica cuanto cuesta la reparación el VIERNES"));
        
 
        //PREGUNTAR POR LAS REPARACIONES HECHAS CADA DIA
        reparaciLune = Integer.parseInt(JOptionPane.showInputDialog
        ("¿Cuántas reparaciones se han hecho el LUNES?"));
        
        reparaciMarte = Integer.parseInt(JOptionPane.showInputDialog
        ("¿Cuántas reparaciones se han hecho el MARTES?"));
        
        reparaciMier = Integer.parseInt(JOptionPane.showInputDialog
        ("¿Cuántas reparaciones se han hecho el MIERCOLES?"));
        
        reparaciJuev = Integer.parseInt(JOptionPane.showInputDialog
        ("¿Cuántas reparaciones se han hecho el JUEVES?"));
        
        reparaciVier = Integer.parseInt(JOptionPane.showInputDialog
        ("¿Cuántas reparaciones se han hecho el VIERNES?"));
        

        //CALCULOS DE CUANTO SE HA GANADO CADA DIA
        totalLune = (float) (reparaciLune * costeRepLune);
        totalMarte = (float) (reparaciMarte * costeRepMarte);
        totalMier = (float) (reparaciMier * costeRepMier);
        totalJuev = (float) (reparaciJuev * costeRepJuev);
        totalVier = (float) (reparaciVier * costeRepVier);

        //CALCULOS DE CUANTO SE HA GANADO EN TODA LA SEMANA
        totalRepaSemana = totalLune + totalMarte + totalMier + totalJuev + totalVier;

        //EVALUAR SI SE HA COBRADO MAS DE 1000€
        totalDineroSemana= (totalRepaSemana>1000);
        
        
        
        //CREAR LA FORMA EN LA QUE SE VERÁ EL RESULTADO
        resultado = """
                    ********************************
                        GANANCIAS SEMANALES
                    
                    LUNES: %.1f
                    MARTES: %.1f
                    MIERCOLES: %.1f
                    JUEVES: %.1f
                    VIERNES: %.1f
                    
                    TOTAL SEMANA: %.1f
                    
                    ¿SE HAN SUPERADO 1000€? %b
                    ********************************
                    """.formatted(totalLune,totalMarte,totalMier,
                            totalJuev,totalVier,totalRepaSemana,
                            totalDineroSemana);
        
        
        //MOSTRAR POR JOPTION EL RESULTADO
        JOptionPane.showMessageDialog(null, resultado);
        
    }
}
