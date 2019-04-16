package Controller;

import Model.Student;
import Service.CrudService;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Student student1 = new Student("1", "Refat", "CSE");
		CrudService crudService = new CrudService();
		crudService.write(student1);
		Student st = (Student) crudService.read(CrudService.filepath);
		System.out.println(st);

	}

}
