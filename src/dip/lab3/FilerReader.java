/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dip.lab3;

import java.io.BufferedReader;
import java.io.File;
import java.io.IOException;

/**
 *
 * @author alancerio18
 */
public class FilerReader implements MessageReader {
    private boolean lineReadFlag = false;
	
	/**
	 * Read a line of input from a file at the root of the classpath
	 * 
	 * @see Reader#readln()
	 */
	public String readln() {
		// Do this if locating data file in project 
//		File data = new File("build" + File.separator + "classes" 
//                        + File.separator + "data.txt");
            
                // Do this if locating data file outside of project (preferred)
                // File is located at the root of the root drive (likely "E" in class)
		File data = new File(File.separator + "data.txt");

		BufferedReader in = null;
		String line = null;
			  
		try {
			if ( data.exists() ){
				// make sure we differentiate between java.io.FileReader
				// class and this custom FileReader class
				in = new BufferedReader( new java.io.FileReader(data) );
				line = in.readLine();
				in.close();
			} else {
				System.out.println("File not found - data.txt");
				line = null;
			}
		} catch (IOException ioe) {
			try {
				if( in != null ) in.close();
			} catch(IOException ioe2) {
				System.out.println( ioe2.getMessage() );
			}
			System.out.println( ioe.getMessage() );
			System.exit(1);  // 1 = signals program end with error
		}
			  
		// ugly hack so we can end the program after reading a line
		if( lineReadFlag ) {
			return null;
		} else {
			lineReadFlag = true;
			return line;
		}
	}

        public void method2() {
            System.out.println("not a polymorphic method");
        }
}
