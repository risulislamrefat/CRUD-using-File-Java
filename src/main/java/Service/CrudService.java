package Service;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

import DAO.FileCRUD;
import Model.Student;

public class CrudService implements FileCRUD {
	public static final String filepath="C://Users/risul.islam/Desktop/test/fileCrud.txt";

	public void write(Student serObj) {
		// TODO Auto-generated method stub
		   try {
			   
			   
//			   File file=new File(filepath);
//		        FileWriter fw=new FileWriter(file.getAbsoluteFile());
//		        BufferedWriter bw=new BufferedWriter(fw);
//		        bw.write(serObj.toString());
//		        bw.close();
			   
	            FileOutputStream fileOut = new FileOutputStream(filepath);
	            ObjectOutputStream objectOut = new ObjectOutputStream(fileOut);
	            objectOut.writeObject(serObj);
	            
	            objectOut.close();
	            System.out.println("The Object  was succesfully written to a file");
	 
	        } catch (Exception ex) {
	            ex.printStackTrace();
	        }
		
	}
	
	public Object read(String filepath) {
		// TODO Auto-generated method stub
		 try {
			 
	            FileInputStream fileIn = new FileInputStream(filepath);
	            ObjectInputStream objectIn = new ObjectInputStream(fileIn);
	 
	            Object obj = objectIn.readObject();
	 
	            System.out.println("The Object has been read from the file");
	            objectIn.close();
	            return obj;
	 
	        } catch (Exception ex) {
	            ex.printStackTrace();
	            return null;
	        }
		
	}


	public void remove() {
		// TODO Auto-generated method stub
		
	}

	public void update() {
		// TODO Auto-generated method stub
		
	}




}
