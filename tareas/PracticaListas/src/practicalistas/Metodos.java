/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practicalistas;

/**
 *
 * @author juan jose
 */
public class Metodos {

    private NodoDeLista raiz = new NodoDeLista();
    private NodoDeLista raiz2 = new NodoDeLista();
    private int cant = 0;
    private NodoDeLista ordenado = new NodoDeLista();

    public Metodos() {

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

   public void arreglo() {

        NodoDeLista recorrido = raiz;
        int arreglo[] = new int[Cantidad()];
        int cont = 0;
        while (recorrido != null) {
            arreglo[cont] = recorrido.getDato();
            cont++;
            recorrido = recorrido.getSiguiente();
        }
        arreglo = OrdenamientoB(arreglo);
        raiz = null;
        for (int i = 0; i < arreglo.length; i++) {
            Insertar(arreglo[i]);
        }

    }

    public int[] OrdenamientoB(int[] arreglo) {

        int indice = 0, indice2 = 0, auxiliar = 0;

        for (indice = 0; indice < arreglo.length - 1; indice++) {
            for (indice2 = 0; indice2 < (((arreglo.length) - indice) - 1); indice2++) {
                if (arreglo[indice2 + 1] < arreglo[indice2]) {
                    auxiliar = arreglo[indice2 + 1];
                    arreglo[indice2 + 1] = arreglo[indice2];
                    arreglo[indice2] = auxiliar;

                }

            }

        }
        return arreglo;
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
