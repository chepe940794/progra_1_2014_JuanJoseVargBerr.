/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practicalista1;

/**
 *
 * @author Estudiante
 */
public class ejercicio1 {

    private NodoDeLista raiz = new NodoDeLista();
    private NodoDeLista raiz2 = new NodoDeLista();
    private int cant = 0;
    private NodoDeLista ordenado = new NodoDeLista();

    public ejercicio1() {

    }

    public void Insertar(int dato) {
        NodoDeLista nuevo;
        nuevo = new NodoDeLista();

        nuevo.setDato(dato);
        if (raiz == null) {
            nuevo.setSiguiente(null);
            raiz = nuevo;
        } else {
            nuevo.setSiguiente(raiz);
            raiz = nuevo;
        }

    }

    public void Insertar2(int dato) {
        NodoDeLista nuevo;
        nuevo = new NodoDeLista();

        nuevo.setDato(dato);
        if (raiz2 == null) {
            nuevo.setSiguiente(null);
            raiz2 = nuevo;
        } else {
            nuevo.setSiguiente(raiz2);
            raiz2 = nuevo;
        }

    }

    public int Cantidad() {
        int cont = 0;
        NodoDeLista conta = raiz;
        while (conta != null) {
            conta = conta.getSiguiente();
            cont++;
        }
        return cont++;
    }

    public int Cantidad2() {
        int cont2 = 0;
        NodoDeLista conta2 = raiz2;
        while (conta2 != null) {
            conta2 = conta2.getSiguiente();
            cont2++;
        }
        return cont2++;
    }

    public void arreglo() {

        NodoDeLista recorrido = raiz;
        int arreglo[] = new int[Cantidad()];
        int cont = 0;
        while (recorrido != null) {
            arreglo[cont] = recorrido.getDato();
            cont++;
            recorrido = recorrido.getSiguiente();
        }
        arreglo = ordenamientoburbuja(arreglo);
        raiz = null;
        for (int i = 0; i < arreglo.length; i++) {
            Insertar(arreglo[i]);
        }

    }

    public int[] ordenamientoburbuja(int[] arreglo) {
        int indice = 0;
        int indice2 = 0;
        int aux = 0;

        for (indice = 0; indice < arreglo.length; indice++) {
            for (indice2 = 0; indice2 < arreglo.length - indice - 1; indice2++) {
                if (arreglo[indice2 + 1] > arreglo[indice2]) {
                    aux = arreglo[indice2 + 1];
                    arreglo[indice2 + 1] = arreglo[indice2];
                    arreglo[indice2] = aux;
                }
            }
        }
        return arreglo;
    }

    public void Imprimir() {
        NodoDeLista recorrido = raiz;
        System.out.println("listado de todos los elementos de la lista");
        while (recorrido != null) {

            System.out.println(recorrido.getDato());
            recorrido = recorrido.getSiguiente();

        }
        System.out.println();
        NodoDeLista recorrido2 = raiz2;
        while (recorrido2 != null) {

            System.out.println(recorrido2.getDato());
            recorrido2 = recorrido2.getSiguiente();

        }
        System.out.println();
    }

    public void ParImpar1(int dato) {
        if (dato % 2 == 0) {
            System.out.println("Par");

            NodoDeLista nuevo = new NodoDeLista();
            nuevo.setDato(dato);

            if (raiz == null) {
                nuevo.setSiguiente(null);

                raiz = nuevo;

            } else {
                nuevo.setSiguiente(raiz);
                raiz = nuevo;
            }
        }
        else{
            System.out.println("Impar");

            NodoDeLista nuevo = new NodoDeLista();
            nuevo.setDato(dato);

            if (raiz == null) {
                nuevo.setSiguiente(null);

                raiz = nuevo;

            } else {
                nuevo.setSiguiente(raiz);
                raiz = nuevo;
            }
        }
    }
    public void ParImpar2(int dato) {
        if (dato % 2 == 0) {
            System.out.println("Par");

            NodoDeLista nuevo = new NodoDeLista();
            nuevo.setDato(dato);

            if (raiz2 == null) {
                nuevo.setSiguiente(null);

                raiz2 = nuevo;

            } else {
                nuevo.setSiguiente(raiz2);
                raiz2 = nuevo;
            }
        }
        else{
            System.out.println("Impar");

            NodoDeLista nuevo = new NodoDeLista();
            nuevo.setDato(dato);

            if (raiz2 == null) {
                nuevo.setSiguiente(null);

                raiz2 = nuevo;

            } else {
                nuevo.setSiguiente(raiz2);
                raiz2 = nuevo;
            }
        }
    }
    
    public void impParImpar1(){        
        NodoDeLista recorrido = raiz;
        
        System.out.println();
    }
     public void impParImpar2(){        
        NodoDeLista recorrido = raiz2;
        
        System.out.println();
    }

    public double SumatoriadeCuadrados() {

        double sumatoria = 0;
        double cuadrado = 0;
        NodoDeLista reco = raiz;

        while (reco != null) {
            cuadrado = (reco.getDato() * reco.getDato());
            reco = reco.getSiguiente();
            sumatoria += cuadrado;
        }
        return sumatoria;
    }

}
