package com.slk.task8.FileCompression;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.zip.GZIPInputStream;
import java.util.zip.GZIPOutputStream;

public class SerializedObjectCompress {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		SerializedObjectCompress sreializedObjectCompress = new SerializedObjectCompress();
		sreializedObjectCompress.serializerAddress("Nishal  Street", "Indian");
		
		Address address = sreializedObjectCompress.serializedObjectDeCompress();
		
		System.out.println("Decompress Object data : " + address.country );
		System.out.println("Decompress Object data : " + address.street );
	}
	
	
	public Address serializedObjectDeCompress()
	{
		
		Address address	;
		
		try {
			
			FileInputStream fileInputStream = new FileInputStream("serializesObject.gz");
			GZIPInputStream gzipInputStream = new GZIPInputStream(fileInputStream);
			ObjectInputStream objectInputStream = new ObjectInputStream(gzipInputStream);
			
			address = (Address) objectInputStream.readObject();
			objectInputStream.close();
			
		} catch (Exception e) {
			
		e.printStackTrace();
		return null;
		}
		return address;
		
	}
	
	public void serializerAddress (String street ,String country)
	{
		Address address = new Address(street ,country);


		try {
			
			
			FileOutputStream fileOutputStream = new FileOutputStream("serializesObject.gz");
			
			GZIPOutputStream gz = new GZIPOutputStream(fileOutputStream);
			ObjectOutputStream  objectOutputStream = new ObjectOutputStream(gz);
			

			objectOutputStream.writeObject(address);
			
			objectOutputStream.close();
		
			
			System.out.println("Object Write  ..........................");
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
	}

}
