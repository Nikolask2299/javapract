
package mainpackage;
 
import java.io.*;

public class Build_File {
     public static void FileOpenRead(Build_Data BigData) throws IOException {
        BufferedReader  csvRead = new BufferedReader(new FileReader("src/main/java/Data/DataBaseFile.csv"));
        String row;
        while((row = csvRead.readLine())!= null){
            String[]data = row.split(",");
            Users user  = new Users();
            user.NewUsers(Integer.parseInt(data[0]), data[1], data[2], data[3], data[4], Integer.parseInt(data[5]), data[6], data[7], data[8], Boolean.parseBoolean(data[9]) , data[10], data[11]);
            BigData.PutData(user);
          }
        csvRead.close(); 
      }
      public static void FileOpenWrite(Build_Data BigData) throws IOException {
        FileWriter csvWriter = new FileWriter("src/main/java/Data/DataBaseFile.csv"); 
        for (Users user: BigData.DataList)  {
          csvWriter.append(user.toString());
        }
        BigData.ClearData();
        BigData.SetPrimIndex(-1);
        csvWriter.flush(); 
        csvWriter.close();
      }
         
} 
