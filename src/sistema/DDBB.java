package sistema;

import java.io.FileWriter;
import java.io.IOException;
import java.util.List;

public class DDBB {

	public void writeToCsvFile(List<String[]> thingsToWrite, String separator, String fileName){
	    try (FileWriter writer = new FileWriter("sistema.csv")){
	        for (String[] strings : thingsToWrite) {
	            for (int i = 0; i < strings.length; i++) {
	                writer.append(strings[i]);
	                if(i < (strings.length-1))
	                    writer.append(separator);
	            }
	            writer.append(System.lineSeparator());
	        }
	        writer.flush();
	    } catch (IOException e) {
	        e.printStackTrace();
	    }
	}
}
