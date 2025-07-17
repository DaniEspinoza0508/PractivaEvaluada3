/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package practicaevaluada3;

/**
 *
 * @author Genesis
 */
public class Producto {
    // Atributos del producto
    private String codigoProducto;
    private String nombreProducto;
    private String tipoProducto;
    private int cantidadProducto;
    private double precioBase;
    private double precioBruto;
    private double ganancia;    

    
    // constructor vacío
    public Producto(String codigo, String nombre, String tipo, int cantidade, double par) {
    }

    //Constructores llenos del producto 
    public Producto(String codigoProducto, String nombreProducto, String tipoProducto, int cantidad, double precioBase, double precioBruto, double ganancia) {
        this.codigoProducto = codigoProducto;
        this.nombreProducto = nombreProducto;
        this.tipoProducto = tipoProducto;
        this.cantidadProducto = cantidad;
        this.precioBase = precioBase;
        this.precioBruto = precioBruto;
        this.ganancia = ganancia;
    }
    
    //Calcular el precio bruto del producto dependiendo del tipo de producto 
    private void calcularPrecioBrutoProducto() {
        if (tipoProducto.equalsIgnoreCase("Alimentos")) {
            precioBruto = precioBase * 0.20 + precioBase;
        } else if (tipoProducto.equalsIgnoreCase("Bebidas")) {
            precioBruto = precioBase * 0.30 + precioBase;
        } else if (tipoProducto.equalsIgnoreCase("Higiene")) {
            precioBruto = precioBase * 0.25 + precioBase + 500;
        } else if (tipoProducto.equalsIgnoreCase("Limpieza")) {
            precioBruto = precioBase * 0.19 + precioBase * 0.04 + 1000 + precioBase;
        } else {
            precioBruto= precioBase;
        }
    }
    
    //Ganancia esperada del producto
    private void calcularGanancia() {
        ganancia = (precioBruto - precioBase) * cantidadProducto;
    }


    //setters y getters del producto
    public String getCodigoProducto() {
        return codigoProducto;
    }

    public void setCodigoProducto(String codigoProducto) {
        this.codigoProducto = codigoProducto;
    }

    public String getNombreProducto() {
        return nombreProducto;
    }

    public void setNombreProducto(String nombreProducto) {
        this.nombreProducto = nombreProducto;
    }

    public String getTipoProducto() {
        return tipoProducto;
    }

    public void setTipoProducto(String tipoProducto) {
        this.tipoProducto = tipoProducto;
    }

    public int getCantidadProducto() {
        return cantidadProducto;
    }

    public void setCantidadProducto(int cantidadProducto) {
        this.cantidadProducto = cantidadProducto;
    }

    public double getPrecioBase() {
        return precioBase;
    }

    public void setPrecioBase(double precioBase) {
        this.precioBase = precioBase;
    }

    public double getPrecioBruto() {
        return precioBruto;
    }

    public void setPrecioBruto(double precioBruto) {
        this.precioBruto = precioBruto;
    }

    public double getGanancia() {
        return ganancia;
    }

    public void setGanancia(double ganancia) {
        this.ganancia = ganancia;
    }

    //to string del producto
    @Override
    public String toString() {
        return "Producto{" + "codigoProducto=" + codigoProducto + ", nombreProducto=" + nombreProducto + ", tipoProducto=" + tipoProducto + ", cantidadProducto=" + cantidadProducto + ", precioBase=" + precioBase + ", precioBruto=" + precioBruto + ", ganancia=" + ganancia + '}';
    } 
    
    
}





