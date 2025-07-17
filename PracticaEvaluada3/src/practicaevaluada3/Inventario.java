/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package practicaevaluada3;

import practicaevaluada3.Producto;

/**
 *
 * @author Genesis
 */

public class Inventario {
    private String nombreSuper;
    private String codigoSuper;
    private String nombreEmpleado;
    private String cedulaEmpleado;
    private Producto productos[];
    private int contador;

    //Constructor vacío
    public Inventario(String super_Chino, String string, String lucia_Zúñiga, String string1) {
    }
    
    //Constructores del inventario
    public Inventario(String nombreSuper, String codigoSuper, String nombreEmpleado, String cedulaEmpleado, Producto[] productos, int contador) {
        this.nombreSuper = nombreSuper;
        this.codigoSuper = codigoSuper;
        this.nombreEmpleado = nombreEmpleado;
        this.cedulaEmpleado = cedulaEmpleado;
        this.productos = productos;
        this.contador = contador;
    }
    
     //Para visualiar los productos
    public void mostrarInventario() {
        System.out.println("Supermercado: " + nombreSuper);
        System.out.println("Código: " + codigoSuper);
        System.out.println("Empleado: " + nombreEmpleado);
        System.out.println("Cédula: " + cedulaEmpleado);
        System.out.println("\n--- Productos Registrados ---");

        for (int i = 0; i < productos.length; i++) {
            productos[i].mostrarDatos();
        }
    }

    // Calcular y mostrar ganancia total recibida
    public void mostrarGananciaTotal() {
        double total = 0;
        for (int i = 0; i < contador; i++) {
            total += productos[i].getGanancia();
        }
        System.out.println("Ganancia Total Esperada: " + total);
    } 

