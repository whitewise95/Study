package step8_03.atm_v3.copy;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class FileManager {

	private FileManager() {}
	private static FileManager instance = new FileManager();
	public static FileManager getInstance() {
		return instance;
	}
	
	String fileName = "atmData.txt";
	UserManager userManager = UserManager.getInstance();
	
	
	boolean loadData() {
		
		
	}
	
	
	void saveData() {
			
		
	}

	
}
