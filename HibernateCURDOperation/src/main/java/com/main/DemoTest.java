package com.main;
import java.util.List;
import java.util.*;
import com.bean.Employee;
import com.service.Employeeservice;
public class DemoTest {
	public static void main(String args[]) {
	
	Employee emp1 = new Employee();
	emp1.setId(5);
    emp1.setName("ssk");
    emp1.setSalary(18000);
    
    Employeeservice es = new Employeeservice();
    String result = es.storeEmployee(emp1);
    System.out.println(result);
}
}