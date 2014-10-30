/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo;

/**
 *
 * @author YESID FERNANDEZ
 */
public class Sorter {

  // El algoritmo de ordenamiento.  Este algoritmo no es relevante.
    // Lo unico importante es que el codigo no referencia en ningun instante
    // el arreglo mismo.  Siempre trabaja con los indices.  Para intercambiar
    // elementos en el arreglo, se invoca el metodo swap, pasando como argumentos
    // los indices que deben ser intercambiados.  Analogamente, para comparar
    // los elementos, se invoca el metodo compare.
    public void sort() {
        quicksort(0, size() - 1);
    }

    void quicksort(int i, int j) {
        if (i >= j) {
            return;
        }
        int k = partition(i, j);
        quicksort(i, k - 1);
        quicksort(k + 1, j);
    }

    int partition(int i, int j) {
        int k = i;
        i++;
        for (;;) {
            while (i < j && compare(i, k) <= 0) {
                i++;
            }
            while (i < j && compare(j, k) >= 0) {
                j--;
            }
            if (i == j) {
                break;
            }
            swap(i, j);
        }
        if (compare(k, i) < 0) {
            i--;
        }
        swap(k, i);
        return i;
    }

  // Las componentes modulares del algoritmo
    // La declaracion del arreglo
    public int[] array;

    // El constructor
    public Sorter(int[] array) {
        this.array = array;
    }

  // Defina aquí el método swap
    // argumentos: dos índices de elementos en el arreglo array
    // acción: los intercambia
    // resultado: nada
    public void swap(int i, int j) {
        int x = array[i];
        array[i] = array[j];
        array[j] = x;
    }

  // Defina aquí el método compare
    // argumentos: dos índices de elementos en el arreglo array
    // acción: los compara
    // resultado: -1 si el primero es menor que el segundo, 0 si son iguales
    //   y 1 si es mayor
    public int compare(int i, int j) {
        if (array[i] < array[j]) {
            return -1;
        } else if (array[i] == array[j]) {
            return 0;
        } else {
            return 1;
        }
    }

  // Defina aquí el método size
    // argumentos: ninguno
    // acción: ninguna
    // resultado: retorna el número de elementos del arreglo
    public int size() {
        return array.length;
    }

    // Imprime el arreglo (dado)
    public void print() {
        for (int i = 0; i < size(); i++) {
            System.out.print(array[i] + " ");
        }
        System.out.println();
    }
}
