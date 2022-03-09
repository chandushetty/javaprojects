package P1;

import java.io.FileWriter;
import java.io.IOException;

public class append {
	public static void main(String[] args){
		String data = "\n this data is appended";
		
		try {
			FileWriter output = new FileWriter("chandu1.txt", true);
			output.write(data);
			System.out.println("data is appended sucessfully");
			output.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
