
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package nodos;

/**
 *
 * @author juan jose
 */
public class nodoFactura {
    private String id;
    private String cliente;
    private String totalGravado;
    private String totalExcepto;
    private String subTotal;
    private String fecha;
    private String total;
    private String listaProductos;
    private String activo;
    private nodoFactura siguienteFactura;

    /**
     * @return the id
     */
    public String getId() {
        return id;
    }

    /**
     * @param id the id to set
     */
    public void setId(String id) {
        this.id = id;
    }

    /**
     * @return the cliente
     */
    public String getCliente() {
        return cliente;
    }

    /**
     * @param cliente the cliente to set
     */
    public void setCliente(String cliente) {
        this.cliente = cliente;
    }

    /**
     * @return the totalGravado
     */
    public String getTotalGravado() {
        return totalGravado;
    }

    /**
     * @param totalGravado the totalGravado to set
     */
    public void setTotalGravado(String totalGravado) {
        this.totalGravado = totalGravado;
    }

    /**
     * @return the totalExcepto
     */
    public String getTotalExcepto() {
        return totalExcepto;
    }

    /**
     * @param totalExcepto the totalExcepto to set
     */
    public void setTotalExcepto(String totalExcepto) {
        this.totalExcepto = totalExcepto;
    }

    /**
     * @return the subTotal
     */
    public String getSubTotal() {
        return subTotal;
    }

    /**
     * @param subTotal the subTotal to set
     */
    public void setSubTotal(String subTotal) {
        this.subTotal = subTotal;
    }

    /**
     * @return the fecha
     */
    public String getFecha() {
        return fecha;
    }

    /**
     * @param fecha the fecha to set
     */
    public void setFecha(String fecha) {
        this.fecha = fecha;
    }

    /**
     * @return the total
     */
    public String getTotal() {
        return total;
    }

    /**
     * @param total the total to set
     */
    public void setTotal(String total) {
        this.total = total;
    }

    /**
     * @return the listaProductos
     */
    public String getListaProductos() {
        return listaProductos;
    }

    /**
     * @param listaProductos the listaProductos to set
     */
    public void setListaProductos(String listaProductos) {
        this.listaProductos = listaProductos;
    }

    /**
     * @return the activo
     */
    public String getActivo() {
        return activo;
    }

    /**
     * @param activo the activo to set
     */
    public void setActivo(String activo) {
        this.activo = activo;
    }

    /**
     * @return the siguienteFactura
     */
    public nodoFactura getSiguienteFactura() {
        return siguienteFactura;
    }

    /**
     * @param siguienteFactura the siguienteFactura to set
     */
    public void setSiguienteFactura(nodoFactura siguienteFactura) {
        this.siguienteFactura = siguienteFactura;
    }
}
