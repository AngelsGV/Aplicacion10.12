package Aplicacion10_12;
import java.io.*; //Declaració  de flujos de entrada de texto

public class Metodos {
    //public static void mostrarDatos(){
    //String texto = ""; //Usem una cadena buida de moment
    //BufferedReader in = null;

   //try {
     //  in = new BufferedReader(new FileReader("texto.txt"));
       //String linea = in.readLine();
       //while (linea != null) { //mentre no arribe al final del archiu
         //  texto = texto + linea + '\n'; //out.newLine(); // canvi de línea en el archiu
          // linea = in.readLine();
       //}
   //}catch(Exception ex){
     //       System.out.println(ex.getMessage());
   //} finally{
     //  if (in != null){
       //    try {
         //      in.close();//Buidem el búfer i se escriu el archiu
          // }catch (Exception ex){
            //   System.out.println(ex);
           //}
       //}
    //}}
      // System.out.println(texto);
//Este fue el primer metodo que cree, me pensaba que también podría pedir los datos e introducirlos aquí. Pero no.
    //He de usar un BufferWeiter porque en este caso no solo queremos leer el archivo, sino que queremos escribir en él
public static void guardarDatos(String nombre, int edad){
    //Hubo un momento que pensé en poner un String para que me devolviera un resultado que luego pudiera sacar por pantalla.
    //Pero al ser un método es mejor usar un void para que después de cumplir su mision, que es escribir los datos nuevos
    //No tiene que devolver nada.
        BufferedWriter out = null;
        try{
            out = new BufferedWriter(new FileWriter("datos.txt"));
            out.write(nombre + "," + edad); //escribimos en una unica sentencia
            out.newLine();//cambio de linea del archivo
            System.out.println("Datos guardados correctamente.");//Si llega hasta el final nos mostrará este mensaje
            System.out.println("Nombre: " + nombre + " ,Edad: " +  edad);
        } catch (IOException ex) {
            System.out.println(ex.getMessage());

        }finally {
            if (out != null){
                 try{
                  out.close();//hacemos que se vacíe el búfer y se escriba en el archivo
                }catch (IOException ex){
                    System.out.println(ex);
                }
            }
        }
}
}
//Problemas
// En consola no me guarda como toca -->
//Datos guardados correctamente.
//texto.txt (El sistema no puede encontrar el archivo especificado) -->el metodo mostrarDatos no es necesario en este caso.
//Solo nos pide introducir los datos y que si el archivo está que lo copie en otra línea
//Lo que hace mi programa es sobreescribir los datos y no deja los anteriores.
