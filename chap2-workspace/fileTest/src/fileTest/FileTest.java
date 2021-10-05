package fileTest;

import java.io.File;
import java.io.IOException;

public class FileTest {
	
	public void start() {
		File file = new File("d:/test/test");
		try {
			file.createNewFile();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}


