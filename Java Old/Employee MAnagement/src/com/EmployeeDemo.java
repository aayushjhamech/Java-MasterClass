package com;

public class EmployeeDemo {

	public static void main(String[] args) 
	{
		String[] employees= new String[5];
		employees[0]= "EMP12-Arun M-Male-35";
		employees[1]= "EMP5812-IDJid-Male-85";
		employees[2]= "EMP185-pjewq-Female-57";
		employees[3]= "EMP512-DJIdjd-Male-75";
		employees[4]= "EMP1251-Mxwmdw-Female-25";
		
		Employee[] emp= EmployeeDemo.getEmployeeDetails(employees);
		for(Employee a:emp)
		{
			System.out.println(a.getEmpId()+" "+a.getEmpName()+" "+a.getGender()+" "+a.getAge());
		}
		
		Employee e= new Employee(null, "Haresh Muhra","Male", 22);
		String resEmp= EmployeeDemo.generateEmployee(employees, e);
				System.out.println(resEmp);
		

	}

	private static String generateEmployee(String[] employees, Employee e) 
	{
		String res = null;
		int length= e.getEmpName().length();
		int newAge= length+e.getAge();
		if(e!= null)
		{
			res= "EMP"+newAge;
			e.setEmpId(res);
			
		}
		return res;
	}

	private static Employee[] getEmployeeDetails(String[] employees) 
	{
		Employee[] emp= new Employee[employees.length];
		if(emp != null)
		{
			for(int i=0; i<employees.length; i++)
			{
				String split[] = employees[i].split("-");
				Employee e= new Employee(split[0], split[1], split[2], Integer.parseInt(split[3]));
				emp[i]= e;
			}
		}
		return emp;
	}

}
