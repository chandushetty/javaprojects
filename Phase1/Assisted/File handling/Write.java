package P1;

import java.io.FileWriter;
import java.io.IOException;

public class Write {

	public static void main(String[] args) {
		String data = "143, chandu, vijayawada, andhra ,india";
		
		try {
			FileWriter output = new FileWriter("chandu1.txt");
			output.write(data);
			System.out.println("data is written successfully");
			output.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			System.out.println("data is not written successfully");
		}
		

	}

}
