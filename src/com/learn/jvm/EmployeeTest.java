package com.learn.jvm;

public class EmployeeTest {
	
	/*public static void change(Employee employee){
		//employee=new Employee();
		employee.age=222;
	}*/
	
	public static void change(Employee employee){
		//employee=new Employee();
		employee.setName("456");
	}

	public static void main(String[] args) {
		
		/*Employee employee=new Employee();
		employee.age=111;
		System.out.println(employee.age);
		change(employee);
		System.out.println(employee.age);*/
		//String s="123";
		Employee employee=new Employee();
		employee.setName("123");;
		System.out.println(employee.getName());
		change(employee);
		System.out.println(employee.getName());

	}

}
