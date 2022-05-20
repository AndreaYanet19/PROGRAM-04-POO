/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package proyectopoo;

/**
 *
 * @author andys
 */
public class ProyectoPoo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        cuenta cuenta1 = new cuenta("Andrea", "Dominguez", 10, 1000.0);
        ///object2
        
        cuenta cuenta02 = new cuenta();
        cuenta02.setApellido("Dominguez");
        cuenta02.setNombre("Andrea");
        cuenta02.setEdad(23);
        cuenta02.setCantidad(4000);

        System.out.println(cuenta02.getApellido()+cuenta02.getNombre()+cuenta02.getEdad());
    }
    
}
