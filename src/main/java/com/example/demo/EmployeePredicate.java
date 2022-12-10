package com.example.demo;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;

 class Employee {
	 private Integer id;
	   private Integer age;
	   private String gender;
	   private String firstName;
	   private String lastName;
	
	public Employee(int a , int b, String c , String d,String e){
		 id=a;
		 age =b;
		 gender=c;
		 firstName=d;
		 lastName=e;	 
		 
	 }


   @Override
	public String toString() {
		return "Employee [id=" + id + ", age=" + age + ", gender=" + gender + ", firstName=" + firstName + ", lastName="
				+ lastName + "]";
	}



public Integer getId() {
		return id;
	}

	public Integer getAge() {
		return age;
	}

	public String getGender() {
		return gender;
	}

	public String getFirstName() {
		return firstName;
	}

	public String getLastName() {
		return lastName;
	}


   
   //Getters and setters are hidden for brevity
}

 
public class EmployeePredicate

 {
	 public static void main(String ar[]) {
			Employee e1 = new Employee(1,23,"M","Rick","Beethovan");
		    Employee e2 = new Employee(2,13,"F","Martina","Hengis");
		    Employee e3 = new Employee(3,43,"M","Ricky","Martin");
	        Employee e4 = new Employee(4,26,"M","Jon","Lowman");
	        Employee e5 = new Employee(5,19,"F","Cristine","Maria");
		    
		    
	        List<Employee> employees = new ArrayList<Employee>();
	        employees.addAll(Arrays.asList(new Employee[]{e1, e2,e3,e4,e5}));
	        
	        System.out.println( filterEmployees(employees, isAdultMale()) );
	        
	        System.out.println( filterEmployees(employees, isAgeMoreThan(15)) );
	    
	 
	 }

 
	
    public static Predicate<Employee> isAdultMale() {
        return p -> p.getAge() > 21 && p.getGender().equalsIgnoreCase("M");
    }
 

 
    public static Predicate<Employee> isAgeMoreThan(Integer age) {
        return p -> p.getAge() > age;
    }
 
    public static List<Employee> filterEmployees (List<Employee> employees,
                                                Predicate<Employee> predicate)
    {
        return employees.stream()
                    .filter( predicate )
                    .collect(Collectors.<Employee>toList());
    }
}
	 