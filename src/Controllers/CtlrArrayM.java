/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Controllers;

import Modelo.Sorter;





/**
 *
 * @author YESID FERNANDEZ
 */
public class CtlrArrayM {
    public CtlrArrayM(int [] a)
    {
        /*
        SE REALIZA ESTE PROCEDIMIENTO PARA GARANTIZAR QUE EL ORDEN DE MAGNITUD 
        SE CONSERVE Y POR MANTENIBILDIAD DEL MISMO
        */
        this.sorter = new Sorter(a);
        /*
        SE REALIZA EL ORDENAMIENTO
        */
        this.sorter.sort();
    }
    public int[] getArray() {
        return array;
    }

    public void setArray(int[] array) {
        this.array = array;
    }
    /*
    METODO QUE RETORNA EL NUMERO MENOR DEL ARRAY
    */
    public int getNumeroMenor()
    {
      return this.sorter.array[0];
    }
    /*
    METODO QUE RETORNA EL NUMERO MAYOR DEL ARRAY
    */
    public int getNumeroMayor()
    {
        return this.sorter.array[this.sorter.array.length-1];
    }
    /*
    METODO QUE RETORNA LA MEDIA ARITMETICA 
    */
    public int getMediaAritmetica()
    {
        int suma = 0;
        for(int i = 0; i < this.sorter.array.length-1 ; i++)
        {
            suma += this.sorter.array[i];
        }
        return suma;
    }
    /*
    METODO QUE RETORNA EL ULTIMO NUMERO PRIMO 
    */
    public int getNumeroPrimo()
    {
        int numeroPrimo = -1;
        
        for(int i = this.sorter.array.length-1; i >=0 ; i--)
        {
            if(this.auxGetNp(this.sorter.array[i])!=-1)
            {
                numeroPrimo = this.sorter.array[i];
                break;
            }
        }
        return numeroPrimo;
    }
    private int auxGetNp(int a)
    {
        int[] np = {2, 3, 5, 7, 11, 13, 17, 19, 23, 29, 31, 37, 41, 43, 47, 53, 59, 61, 67, 71, 73, 79, 83, 89, 97};
        for(int i = 0; i < np.length-1; i++)
        {
            if(a == np[i])
            {
                return a;
            }
        }
        return -1;
    }
    /*
    VARIBLES INTERNAS
    */
    private int[] array;
    private Sorter sorter;
}
