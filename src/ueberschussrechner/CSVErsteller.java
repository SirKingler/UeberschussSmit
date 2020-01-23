package ueberschussrechner;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;

public class CSVErsteller 
{
   public void csversteller()
   {
       try 
       {
           
           PrintWriter pw = new PrintWriter (new File ("C:\\Users\\Linus\\Desktop\\JavaProjekte-LinusKlemd\\test.csv"));
           StringBuilder sb = new StringBuilder();
           
           sb.append("Datum");
           sb.append("\r");
           sb.append("Buchungsnummer");
           sb.append("\r");
           sb.append("Eingang");
           sb.append("\r");
           sb.append("Ausgang");
           sb.append("\r");
           sb.append("Kommentar");
           sb.append("\r\n");
           
           pw.write(sb.toString());
           pw.close();
           
                   
       } catch (FileNotFoundException e){
           
       }
   }
}
