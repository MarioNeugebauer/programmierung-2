package demo010;

import java.io.File;

public class FileTests {

	public static void main(String[] args) {
		
		// Verzeichnis lesen
		File auszulesendesVerzeichnis = new File("c:/daten/temp/carola");
		
		printAllJavaFiles(auszulesendesVerzeichnis, 1);

	}
	
	public static void printAllJavaFiles(File directory, int verzeichnistiefe) {
	    if (directory.isDirectory()) {
	    	printFile(directory, verzeichnistiefe);
	        File[] subDirectories = directory.listFiles();

	        for (File file : subDirectories) {
	            printAllJavaFiles(file, verzeichnistiefe+1);
	        }
	    }else {
	        printFile(directory, verzeichnistiefe);
	    }
	}
	
	public static void printFile(File directory, int depth) {
		if(directory.isDirectory()) {
			for(int i=0; i<depth; i++) { System.out.print("- "); }
			
		} else {
			for(int i=0; i<depth; i++) { System.out.print("   "); }		}
		System.out.println(directory.getName());
	}
	
	public static boolean listDirRecursively(File dir, int dirDepth){
		for(int i=0; i<=dirDepth; i++) {
			System.out.print("-");
		}
		System.out.println(dir.getName());
	    File[] files = dir.listFiles();
	    if(files != null){
	        for(File file : files){
	            if(file.isDirectory()){
	                listDirRecursively(file, dirDepth+1);
	            } else {
	                file.delete();
	            }
	        }
	    }
	    return dir.delete();
	}

}
