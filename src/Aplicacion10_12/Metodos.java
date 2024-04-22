package Aplicacion10_12;
import java.io.*; //Declaració  de flujos de entrada de texto

public class Metodos {
public static void guardarDatos(String nombre, int edad){
    //Hubo un momento que pensé en poner un String para que me devolviera un resultado que luego pudiera sacar por pantalla.
    //Pero al ser un método es mejor usar un void para que después de cumplir su mision, que es escribir los datos nuevos
    //No tiene que devolver nada.
        BufferedWriter out = null;
        try{
            out = new BufferedWriter(new FileWriter("datos.txt",true));
            //append true para que se guarde sin sobreescribirse en los datos anteriores.
            out.write(nombre + "," + edad); //escribimos en una unica sentencia
            out.newLine();//cambio de linea del archivo
            System.out.println("Datos guardados correctamente.");//Si llega hasta el final nos mostrará este mensaje
            //He mirado en el archivo datos.txt y no se sobreescribe!
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

//Lo que hace mi programa es sobreescribir los datos y no deja los anteriores. --> Solución appennd true en el conductor
