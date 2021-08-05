package com.redbeeacademy.algoritmostest.Lista;
/*
Realizar los siguientes métodos:
1) Guarde un numero en una lista
2) Intercambie el elemento de la posicion 2 por la posicion 4.
3) Un metodo recibe una lista de numeros y un numero, la funcion debe agregar el numero al inicio de la lista
4) Calcular el promedio de los elementos de una lista
5) Eliminar la posicion donde se encuentre el valor maximo de la lista
6) Dadas dos listas, crear una nueva con los elementos que se repitan en ambas
 */

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Lista {

    public static List<Integer> guardarEnLista(Integer numero){
        List<Integer> lista = new ArrayList<>();

        if(numero == null) lista.add(0);

        lista.add(numero);

        return lista;
    }

    public static List<Integer> intercambiar(List<Integer> lista){
        //TODO corregir
        if(lista.get(2) != null && lista.get(4) != null){
            Collections.swap(lista, 2, 4);
        }

        return lista;
    }

    public static List<Integer> agregarElementoAlInicio(List<Integer> lista, Integer numero){
        if(numero != null)
        lista.add(0, numero);
        return lista;
    }

    public static Double promedioLista(List<Integer> lista){
        return (double) (lista.stream().mapToInt(i -> i).sum()/ lista.size());
    }

    public static List<Integer> eliminarMaximo(List<Integer> lista){
        lista.remove(Collections.max(lista));

        return lista;
    }

    public static List<Integer> repetidos(List<Integer> a, List<Integer> b){
        List<Integer> c = new ArrayList<>();

       a.stream().filter( e -> b.contains(e)).forEach( e -> c.add(e));

        return c;
    }

}
