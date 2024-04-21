package Aplicacion10_12;
import java.io.*; //Declaració  de flujos de entrada de texto

public class Metodos {
    public static void mostrarDatos(){
    String texto = ""; //Usem una cadena buida de moment
    BufferedReader in = null;

   try {
       in = new BufferedReader(new FileReader("texto.txt"));
       String linea = in.readLine();
       while (linea != null) { //mentre no arribe al final del archiu
           texto = texto + linea + '\n'; //out.newLine(); // canvi de línea en el archiu
           linea = in.readLine();
       }
   }catch(IOException ex){
            System.out.println(ex.getMessage());
   } finally{
       if (in != null){
           try {
               in.close();//Buidem el búfer i se escriu el archiu
           }catch (IOException ex){
               System.out.println(ex);
           }
       }
    }
       System.out.println(texto);
}//Este fue el primer metodo que cree, me pensaba que también podría pedir los datos e introducirlos aquí. Pero no.
public static void guardarDatos(String nombre, String edad){
        try{File archivo = new File("datos.txt");
            BufferedWriter writer = new BufferedWriter(new FileWriter(archivo, true));
            writer.write(nombre + "," + edad);
            writer.newLine();
            writer.close();
            System.out.println("Datos guardados correctamente.");
        } catch (IOException ex) {
            System.out.println("Error al guardar los datos: " + ex.getMessage());

        }
}
}
