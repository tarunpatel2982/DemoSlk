package com.slk.task6;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.io.UnsupportedEncodingException;
import java.io.Writer;
import java.nio.file.Path;

public class WriteUTF_8_EncodedData {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		File fileDir = new File("/home/SLKTECHLABS/tarun.patel/git/DemoSlk/utf8.txt");
		Path path = fileDir.toPath();
		System.out.println(path);
        Writer out;
		try {
			out = new BufferedWriter(new OutputStreamWriter(new FileOutputStream(fileDir), "UTF8"));
			
			out.append("tarunpatel2982.com").append("\r\n");
	        out.append("UTF-8 Demo").append("\r\n");
	        out.append("क्षेत्रफल = लंबाई * चौड़ाई").append("\r\n");
	        out.flush();
	        out.close();
		} catch (UnsupportedEncodingException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
        

	}

}
