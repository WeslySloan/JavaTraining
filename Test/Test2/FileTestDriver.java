package fileTest;

import java.io.File;
import java.io.IOException;

public class FileTestDriver {
	
	public static void main(String[] args) {
		File file = new File("c:/test/test");
		try {
			file.createNewfile();	
		} 
		catch (IOException e) {
			e.printStackTrace();
	}
}