package Aplicacion10_12; //Ens inspirem en Resuelta 10.7-8
import java.io.*; //Declaració  de flujos de entrada de texto

public class GuardarDatos {
    public static void texto(){
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
}
}
