package P1;

import java.io.File;

public class delete {
	public static void main(String[] args){
		File myfile = new File("chandu.txt");
		
		if(myfile.delete()){
			System.out.println("file is deleted: "+myfile.getName()+" successfully");
		}
		else
			System.out.println("File is not deleted sucessfully");
	}
}
