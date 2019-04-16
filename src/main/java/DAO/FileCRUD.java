package DAO;

import Model.Student;

public interface FileCRUD {
	
	public void write(Student st);
	public Object read(String filepath);
	public void remove();
	public void update();
		
	

}
