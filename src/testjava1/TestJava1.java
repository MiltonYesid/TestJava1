/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package testjava1;

import Controllers.CtlrArrayM;

/**
 *
 * @author YESID FERNANDEZ
 */
public class TestJava1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        /*
         CODIGO PARA LA EJECUCIÓN
         -Array de prueba
         -mostrar los resultados
         */
        int[] array = {1, 4, 6, 2, 3, 5, 1, 8, 9, 10, 40, 53, 2, 45, 76, 78, 45, 89};
        /*
         Invocamos el controlador
         */
        CtlrArrayM controllerArray = new CtlrArrayM(array);
        System.out.println("El análisis del array es el siguiente");
        System.out.println("*************************************");
        System.out.println("El número menor es: " + controllerArray.getNumeroMenor());
        System.out.println("El número mayor es: " + controllerArray.getNumeroMayor());
        System.out.println("La media aritmetica es: " + controllerArray.getMediaAritmetica());
        System.out.println("El ultimo número primo es(si existe)" + controllerArray.getNumeroPrimo());
        System.out.println("***************************************");
    }

}
