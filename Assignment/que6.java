import java.util.*;
import java.util.stream.Collectors;

class Employee
{
int empYear;
String empName,empAdd;

public void setter(String name,int year,String add)
{
empYear=year;
empAdd=add;
empName=name;
}
public String toString()
{
	System.out.println("\n");
	
return (empName+" "+empYear+" "+empAdd);
}

public static void main(String arg[])
{

Employee emp1 = new Employee();
emp1.setter("Abhishek",2017,"Mumbai");

Employee emp2 = new Employee();
emp2.setter("Akhil",2016,"Bangalore");

Employee emp3 = new Employee();
emp3.setter("Rishi",2018,"Punjab");


List<Employee> ls = Arrays.asList(emp1,emp2,emp3);

for(Employee m:ls)
{
	System.out.println(m);
}

}

}