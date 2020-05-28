//John Smith
package census2000;

import java.util.*;
import java.io.*;

public class Array {

	LastNames lastNames;
	String lineIn;
	LastNames[]	names = new LastNames[151671];
	
	public void create()  throws FileNotFoundException {
		int i =0;
		@SuppressWarnings("resource")
		Scanner inFile = new Scanner(new File("LastNames2000Census.txt"));
		
		while(inFile.hasNext()) {
			names[i] = new LastNames();
			//read in the next line and delimit on comma
			lineIn = inFile.nextLine();			
			String[] nextString = lineIn.split(",");
			
			names[i].setName( nextString[0]);
			names[i].setRank(nextString[1]);
			names[i].setOccurs(nextString[2]);
			names[i].setPerHundred(nextString[3]);
			names[i].setPerThousand(nextString[4]);
			i++;
		}	
	}
	
	public LastNames[] getArray(){
		return names;
	}
}
