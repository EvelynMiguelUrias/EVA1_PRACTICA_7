/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package eva1_practica_7;

/**
 *
 * @author Evelyn
 */
/*
CREAR UN ARREGLO CON 50 ELEMENTOS 
LLENARLO CON VALORES ALEATORIOS ENTRE 1 Y 100
IMPRIMIR EL VALOR MAS PEQUEÑO Y MAS GRANDE DEL ARREGLO Y SU POSICION
*/
public class EVA1_PRACTICA_7 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //CREAMOS EL ARREGLO
        int aiArreglo[] = new int[50];
        //LO LLENAMOS CON VALORES ALEATORIOS Y LO IMPRIMIMOS
        for (int i = 0; i < aiArreglo.length; i++) {
            aiArreglo[i] = (int)(Math.random()*100);
            System.out.println("Arreglo: [" + i +"] " + aiArreglo[i]);
        }
        //INICIALIZAMOS DOS VARIABLES UNA PARA EL NUMERO MAYOR Y OTRA PARA LA POSICION EN EL ARREGLO
        int numeroMayor;
        int pos1 =0;
                numeroMayor = aiArreglo[0];
                //RECORREMOS ARREGLO Y BUSCAMOS EL NUMERO MAYOR
            for (int j = 0; j < aiArreglo.length; j++) {
                
                if(aiArreglo[j]>numeroMayor){
                numeroMayor = aiArreglo[j];
                pos1 = j;
                    
            }
        
        }
            //IMPRIMIMOS EL NUMERO MAYOR Y SU POSICION
            System.out.println("El numero mayor en el arreglo es: " + numeroMayor + " y la posocion es: [" + pos1 + "]");
        //INICIALIZAMOS DOS VARIABLES UNA PARA EL NUMERO MENOR Y OTRA PARA LA POSICION EN EL ARREGLO
        int  min= aiArreglo.length  ;
        int pos =0;
        //RECORREMOS ARREGLO Y BUSCAMOS EL NUMERO MENOR
        for (int i = 0; i < aiArreglo.length; i++) {
            if (min >aiArreglo[i]) {
                min = aiArreglo[i];
                pos=i;
            }
        }
        //IMPRIMIMOS EL NUMERO MAYOR Y SU POSICION
        System.out.println("El numero menor en el arreglo es: " + min + " y la posocion es: [" + pos +"]");
        // TODO code application logic here
    }
}
    

