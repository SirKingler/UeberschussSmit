package ueberschussrechner;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;

public class CSVErsteller 
{
   public void csversteller()
   {
       String pathrel = System.getProperty("user.dir");
       try 
       {
           
           PrintWriter pw = new PrintWriter (new File (pathrel+"\\Speicher.csv"));
           StringBuilder sb = new StringBuilder();
           
           sb.append("Datum");
           sb.append(";");
           sb.append("Buchungsnummer");
           sb.append(";");
           sb.append("Eingang");
           sb.append(";");
           sb.append("Ausgang");
           sb.append(";");
           sb.append("Kommentar");
           sb.append("\r\n");
           
           pw.write(sb.toString());
           pw.close();
           
                   
       } catch (FileNotFoundException e)
       {
       
       }
           
          
    }
   
}