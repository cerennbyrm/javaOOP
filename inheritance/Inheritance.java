
package inheritance;

public class Inheritance {

   
    public static void main(String[] args) {
       Customer customer=new  Customer();
       Employee employee=new Employee();
      
       
       CustomerManager customerManager=new CustomerManager();
       customerManager.add();
       EmployeeManager employeeManager=new EmployeeManager();
       employeeManager.bestEmployee();
    }
    
}
