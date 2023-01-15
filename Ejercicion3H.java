/*
2. Crear una superclase llamada Electrodoméstico con los siguientes atributos:
precio, color, consumo energético (letras entre A y F) y peso.
Los constructores que se deben implementar son los siguientes:
• Un constructor vacío.
• Un constructor con todos los atributos pasados por parámetro.
Los métodos a implementar son:
• Métodos getters y setters de todos los atributos.
• Método comprobarConsumoEnergetico(char letra): comprueba que la letra
es correcta, sino es correcta usara la letra F por defecto. Este método se debe
invocar al crear el objeto y no será visible.

10
• Método comprobarColor(String color): comprueba que el color es correcto, y
si no lo es, usa el color blanco por defecto. Los colores disponibles para los
electrodomésticos son blanco, negro, rojo, azul y gris. No importa si el nombre
está en mayúsculas o en minúsculas. Este método se invocará al crear el
objeto y no será visible.
• Metodo crearElectrodomestico(): le pide la información al usuario y llena el
electrodoméstico, también llama los métodos para comprobar el color y el
consumo. Al precio se le da un valor base de $1000.
• Método precioFinal(): según el consumo energético y su tamaño, aumentará
el valor del precio. Esta es la lista de precios:

A continuación se debe crear una subclase llamada Lavadora, con el atributo
carga, además de los atributos heredados.
Los constructores que se implementarán serán:
• Un constructor vacío.
• Un constructor con la carga y el resto de atributos heredados. Recuerda que
debes llamar al constructor de la clase padre.
Los métodos que se implementara serán:
• Método get y set del atributo carga.
• Método crearLavadora (): este método llama a crearElectrodomestico() de la
clase padre, lo utilizamos para llenar los atributos heredados del padre y
después llenamos el atributo propio de la lavadora.
• Método precioFinal(): este método será heredado y se le sumará la siguiente
funcionalidad. Si tiene una carga mayor de 30 kg, aumentará el precio en $500,
si la carga es menor o igual, no se incrementará el precio. Este método debe
llamar al método padre y añadir el código necesario. Recuerda que las
condiciones que hemos visto en la clase Electrodoméstico también deben
afectar al precio.
LETRA PRECIO
A $1000
B $800
C $600
D $500
E $300
F $100

PESO PRECIO
Entre 1 y 19 kg $100
Entre 20 y 49 kg $500
Entre 50 y 79 kg $800
Mayor que 80 kg $1000

11
Se debe crear también una subclase llamada Televisor con los siguientes
atributos: resolución (en pulgadas) y sintonizador TDT (booleano), además de los
atributos heredados.
Los constructores que se implementarán serán:
• Un constructor vacío.
• Un constructor con la resolución, sintonizador TDT y el resto de atributos
heredados. Recuerda que debes llamar al constructor de la clase padre.
Los métodos que se implementara serán:
• Método get y set de los atributos resolución y sintonizador TDT.
• Método crearTelevisor(): este método llama a crearElectrodomestico() de la
clase padre, lo utilizamos para llenar los atributos heredados del padre y
después llenamos los atributos del televisor.
• Método precioFinal(): este método será heredado y se le sumará la siguiente
funcionalidad. Si el televisor tiene una resolución mayor de 40 pulgadas, se
incrementará el precio un 30% y si tiene un sintonizador TDT incorporado,
aumentará $500. Recuerda que las condiciones que hemos visto en la clase
Electrodomestico también deben afectar al precio.
Finalmente, en el main debemos realizar lo siguiente:
Vamos a crear una Lavadora y un Televisor y llamar a los métodos necesarios
para mostrar el precio final de los dos electrodomésticos.
 */
package ejercicion3herencia;


import java.util.ArrayList;
import java.util.Scanner;


public class Ejercicion3H {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
       
        Electrodoméstico Lavadora1 = new Electrodoméstico(500, "blanco", 'A' , 25);
        ArrayList<Electrodoméstico>Lavadora11 = new ArrayList<>();
        Lavadora l1 = new Lavadora(500, "blanco", 'A' , 25, 15);
        ArrayList<Lavadora>Lavadorass = new ArrayList<>();
        System.out.println("_Lavadora n1: ");
        Lavadorass.add(l1);
        Lavadora11.add(Lavadora1);
      
        System.out.println(Lavadorass+""+Lavadora11.toString());
        System.out.println("Precio final: "+l1.precioFinal());
     
        System.out.println("  ");
        System.out.println("****************************");
        System.out.println("  ");
        
        
        Lavadora l2 = new Lavadora(800, "azul", 'F', 40, 36);
        Electrodoméstico Lavadora2 = new Electrodoméstico(800, "azul", 'F', 40);
        ArrayList<Electrodoméstico>Lavadoras2 = new ArrayList<>();
     ArrayList<Lavadora>Lavadorass2 = new ArrayList<>();
        System.out.println("_Lavadora n2: ");
        Lavadoras2.add(Lavadora2);
        Lavadorass2.add(l2);
        
        System.out.println(Lavadorass2+""+Lavadoras2);
        System.out.println("Precio final: "+l2.precioFinal());
        
        
        System.out.println(" ");
        System.out.println("*************************");
        System.out.println(" ");

        
        Electrodoméstico TV1 = new Electrodoméstico(1200, "negro", 'B', 30);
        ArrayList<Electrodoméstico>televisor1 = new ArrayList<>();
        System.out.println("Televisor n1: ");
        Televisor Tele1 = new Televisor(55, false, 1200, "negro", 'B', 30);
        ArrayList<Televisor>TV = new ArrayList<>();
         
        televisor1.add(TV1);
        TV.add(Tele1);
        
     
        System.out.println(TV+""+televisor1);
   System.out.println("Precio final: "+Tele1.precioFinal());
       
        
         System.out.println(" ");
        System.out.println("*************************");
        System.out.println(" ");
        
        
          Electrodoméstico TV2 = new Electrodoméstico(1000, "gris", 'A', 29.5);
        ArrayList<Electrodoméstico>televisor2 = new ArrayList<>();
        System.out.println("Televisor n2: ");
         Televisor Tele2 = new Televisor(32, true, 1000, "gris", 'A', 29.5);
          ArrayList<Televisor>tele2 = new ArrayList<>();
        
          televisor2.add(TV2);
          tele2.add(Tele2);
        
        System.out.println(tele2+""+televisor2);
        System.out.println("Precio final: "+Tele2.precioFinal());
        
        
             double sumadeElectro = Tele1.getPrecio()+Tele2.precioFinal()+l2.precioFinal()+l1.precioFinal();
         
       
            
           System.out.println("  "); 
         System.out.println(" La Suma Total de los Electrodomesticos es: "+ sumadeElectro);
             
        
        
        
//Electrodoméstico [] listaElectrodomésticos = new Electrodoméstico[3];
        
        
//        int op;
//        
//        
//        for (int i = 0; i < listaElectrodomésticos.length; ) {
//            
//            System.out.println("Seleccione la opcion: ");
//            
//            System.out.println("2. Agregar Agregar Lavadora: ");
//            System.out.println("3. Agregar TV: ");
//            System.out.println(" Digite la opcion: ");
//            
//            
//            op = entrada.nextInt();
//            if (op == 1 || op== 2 || op==3) {
//                
//                switch (op) {
//                    case 1:
//                        double precioelectronomestico;
//                        String colorelectronoString;
//                        char consumoeelectronomestico;
//                        double pesoelectronomestico;
//                        
//                           System.out.println("Ingrese el consumo energetico: ");
//                        consumoeelectronomestico = entrada.next().charAt(0);
//                        
//                        
//                        System.out.println(" Ingrese el color: ");
//                        colorelectronoString= entrada.next();
//                        
//                        
//                        System.out.println(" Ingese el precio base: ");
//                    precioelectronomestico = entrada.nextDouble();
//                    
//                        System.out.println(" Ingrese el  peso: ");
//                        pesoelectronomestico = entrada.nextDouble();
//                        
//                        listaElectrodomésticos[i] = new Electrodoméstico(pesoelectronomestico, colorelectronoString, consumoeelectronomestico, pesoelectronomestico);
//                        i++;
//                        System.out.println("Electronomestico Agregado. ");
//                        break;
//                    case 2:
//                         
//                    int cargaL;
//                        double precioLavadora;
//                        String colorLavadora;
//                        char consumoeLavadora;
//                        double pesoLavadora;
//                        
//                           System.out.println("Ingrese el consumo energetico: ");
//                        consumoeLavadora = entrada.next().charAt(0);
//                        
//                        
//                        System.out.println(" Ingrese el color: ");
//                        colorLavadora = entrada.next();
//                        
//                        
//                        System.out.println(" Ingese el precio base: ");
//                    precioLavadora = entrada.nextDouble();
//                    
//                        System.out.println(" Ingrese el  peso: ");
//                        pesoLavadora = entrada.nextDouble();
//                        
//                        System.out.println("Digite la carga Lavadora: ");
//                        
//                        cargaL = entrada.nextInt();
//                        
//                        listaElectrodomésticos[i] = new Lavadora(precioLavadora, colorLavadora, consumoeLavadora, pesoLavadora, cargaL);
//                        i++;
//                        System.out.println("Lavadora Agregada. ");
//                        break;
//                    case 3:
//                        int resolucion;
//                        boolean sintonizadorTDT;
//                          
//                        double precioTV;
//                        String colorTV;
//                        char consumoeTV;
//                        double pesoTV;
//                        
//                           System.out.println("Ingrese el consumo energetico: ");
//                        consumoeTV = entrada.next().charAt(0);
//                        
//                        
//                        System.out.println(" Ingrese el color: ");
//                        colorTV = entrada.next();
//                        
//                        
//                        System.out.println(" Ingese el precio base: ");
//                    precioTV = entrada.nextDouble();
//                    
//                        System.out.println(" Ingrese el  peso: ");
//                        pesoTV = entrada.nextDouble();
//                        
//                        System.out.println("Ingrese la resolucion: ");
//                        resolucion = entrada.nextInt();
//                        
//                        System.out.println(" Ingrese la sintonizador TDT:(true or false) ");
//                        sintonizadorTDT = entrada.nextBoolean();
//                        
//                        listaElectrodomésticos[i] = new Televisor(resolucion, sintonizadorTDT, precioTV, colorTV, consumoeTV, pesoTV);
//                        i++;
//                        System.out.println("TV agregada. ");
//                        break;
//                    default:
//                        System.out.println("Opcion Incorrecta. ");
//                        break;
//                
//                
//            }
//            
//             
//        }
//        }  
//       double  sumadeElectro = 0;
//     double sumaTV =0;
//     double sumaLavadora=0;
//            for (int j = 0; j < listaElectrodomésticos.length; j++) {
//                if (listaElectrodomésticos[j] instanceof Electrodoméstico) {
//                    
//                    sumadeElectro += listaElectrodomésticos[j].precioFinal();
//                }
//                    if (listaElectrodomésticos[j] instanceof Lavadora) {
//                        
//                        sumaLavadora += listaElectrodomésticos[j].precioFinal();
//                        
//                    
//                }
//                    
//                    if (listaElectrodomésticos[j] instanceof Televisor) {
//                        
//                        sumaTV += listaElectrodomésticos[j].precioFinal();
//                    
//                }
//                    
//                    
//                }
//              System.out.println(" La suma del precio de los Electronomestico: "+ sumadeElectro);
//             System.out.println(" La suma del precio de los Lavadora: "+ sumaLavadora);
//              System.out.println(" La suma del precio de los TV: "+ sumaTV);
        
      
        
    }
    

    }