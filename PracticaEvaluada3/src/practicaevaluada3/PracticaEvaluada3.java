/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package practicaevaluada3;

/**
 *
 * @author Genesis
 */
public class PracticaEvaluada3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Inventarios con datos fijos del super y del empleado
        Inventario inventario = new Inventario("Super Chino", "1234", "Lucia Zúñiga", "504660412");

        // Datos simulados de productos (podrías cambiar o ampliar)
        String codigos[] = {"Fide10", "Fide11", "Fide12", "Fide13"};
        String nombres[] = {"Arroz", "Coca", "Toallas", "Cloro"};
        String tipos[] = {"Alimentos", "Bebidas", "Higiene", "Limpieza"};
        int cantidades[] = {3, 5, 2, 8};
        double preciosBase[] = {4000, 5000, 200, 12000};

        // Productos automáticamente
        for (int i = 0; i < codigos.length; i++) {
            Producto p = new Producto(codigos[i], nombres[i], tipos[i], cantidades[i], preciosBase[i]);
            inventario.agregarProducto();

        }
    }
}

