package P1;

import java.io.File;
import java.io.IOException;

public class Create {

	public static void main(String[] args) {
		File myfile = new File("chandu1.txt");
		
		try {
			if (myfile.createNewFile()){
				System.out.println("File is created sucessfully");
			}
			else{
				System.out.println("File is not created");
			}
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
