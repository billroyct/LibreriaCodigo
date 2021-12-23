
package Prototype;

    public class Main {
    
        public static void main(String[] args){
        Jugador objGP = new Jugador();

        Heroe a1 = objGP.getHeroe("");
        System.out.println("==============================");

        System.out.println("El Heroe se llama [" + a1.getNombre() + "]");
        System.out.println("Su arma es [" + a1.getArma() + "]");
        System.out.println("==============================");

         Heroe a2 = objGP.getClon("HeroeBeta");
        // Mostrar los datos  (ambos tienen datos similares)
        System.out.println("Clon del Heroe:");
        System.out.println("Su nombre es [" + a2.getNombre() + "]");
        System.out.println("Su arma es [" + a2.getArma() + "]");
        System.out.println("==============================");
        // Modificamos el Guerrero clonado
        a2.setNombre("Beta");
        a2.setArma("Espada");
        // Mostrar los datos de ambos Guerreros (ambos tienen diferentes datos)
        System.out.println("Tras modificar el clon, ahora se llama [" +a2.getNombre() + "]");
        System.out.println("Su arma es [" + a2.getArma() + "]\n");
        System.out.println("El nombre delHeroe original es [" + a1.getNombre() + "]");
        System.out.println("Su arma es [" + a1.getArma() + "]");
        System.out.println("==============================");
        // Modificamos el Guerrero original
        a1.setNombre("Warrior-1");
        a1.setArma("MAZA");
        // Mostrar los datos de ambos Guerreros tras la modificación (ambos tienen diferentes datos)
        System.out.println("Tras modificar el original, ahora es [" + a1.getNombre() + "]");
        System.out.println("Su arma es [" + a1.getArma() + "]\n");
        System.out.println("El nombre del clon es [" + a2.getNombre() + "]");
        System.out.println("Su arma es [" + a2.getArma() + "]");
    }
}