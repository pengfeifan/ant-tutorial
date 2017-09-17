package com.github.ant.tools.extend;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import org.apache.tools.ant.BuildException;
import org.apache.tools.ant.Task;

public class FileSorter extends Task{

	private File srcFile;
	private File destFile;
	@Override
	public void execute() throws BuildException {
		try {
			BufferedReader fromFile = new BufferedReader(new FileReader(srcFile));
			BufferedWriter toFile = new BufferedWriter(new FileWriter(destFile));
			
			List<String> list = new ArrayList<String>();
			
			String line = fromFile.readLine();
			while(line!=null){
				list.add(line);
				line = fromFile.readLine();
			}
			Collections.sort(list);
			
			for(String str:list){
				toFile.write(str);
				toFile.newLine();
			}
			
			fromFile.close();
			toFile.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	public File getSrcFile() {
		return srcFile;
	}
	public void setSrcFile(File srcFile) {
		this.srcFile = srcFile;
	}
	public File getDestFile() {
		return destFile;
	}
	public void setDestFile(File destFile) {
		this.destFile = destFile;
	}
	
	
}
