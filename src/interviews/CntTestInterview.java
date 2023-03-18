package interviews;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class CntTestInterview {
	public static void main(String[] args) {
		findPrime();
		getDataBasedOnName();

	}

	private static void getDataBasedOnName() {
		record Employee(int id, String name, String phoneNumber) {
			public String toString() {
				return "id: " + id + ", phone number: " + phoneNumber;
			}
		}
		Employee e1 = new Employee(1, "swamy", "4444");
		Employee e2 = new Employee(2, "arun", "8888888");
		Employee e3 = new Employee(3, "rahul", "3444");
		Employee e4 = new Employee(4, "kumar", "5444");
		Employee e5 = new Employee(5, "raju", "4744");
		Employee e6 = new Employee(6, "aruna", "4844");
		Employee e7 = new Employee(7, "raja", "4434");
		Employee e8 = new Employee(8, "yesuda", "1444");
		Employee e9 = new Employee(8, "yesuda", "1444");
		Employee e10 = new Employee(8, "yesuda", "1444");

		List<Employee> empList = Arrays.asList(e1, e2, e3, e4, e5, e6, e7, e8, e9, e10);

		// Java 8 feature streans
		Optional data = empList.stream().filter(e -> e.name.equals("arun")).findFirst();

		if (data.isPresent()) {
			System.out.println(data.get().toString());
		}

	}

	private static void findPrime() {
		int n = 2;
		int m = 0;
		int bool = 0;

		m = n / 2;

		if (n == 0 || n == 1) {

			System.out.println("given number "+ n +" Not a prime");
		} else {

			for (int i = 2; i <= m; i++) {
				if (n % i == 0) {
					System.out.println("given number "+ n +" Not a prime");
					bool = 1;
					break;
				}
			}
			if (bool == 0) {
				System.out.println("given number "+ n +" is a prime");
			}
		}

	}
}

/*
 * Create 10 employee objets, each employee object has following attributes: Id
 * Name Phone number Add all these employee objects to the list and search the
 * list based on ‘Name’ attribute and print the id, phone number. Input : Enter
 * Name : ‘arun’ Output Id: 100, Phone number : 8888888
 */
//// Java 17 feature record
// record Employee (int id, String name, String phoneNumber){
//
// }
//
// Employee e1 = new Employee (1,"swamy", 4444);
// Employee e2 = new Employee (2,"arun", 8888888);
// Employee e3 = new Employee (3,"rahul", 3444);
// Employee e4 = new Employee (4,"kumar", 5444);
// Employee e5 = new Employee (5,"raju", 4744);
// Employee e6 = new Employee (6,"aruna", 4844);
// Employee e7 = new Employee (7,"raja", 4434);
// Employee e8 = new Employee (8,"yesuda", 1444);
// Employee e9 = new Employee (8,"yesuda", 1444);
// Employee e10 = new Employee (8,"yesuda", 1444);
//
// List<Employee> empList = Arrays.asList(e1,e2,e3,e4,e5,e6,e7,e8,e9,e10);
//
//// Java 8 feature streans
// Optional data = empList.stream().filter(e-> e.name.equals(arun)).findFirst();
//
// if(data.IfPresnt){
//	    data.get();
// }
// -----------------------------------
// Without streanms
//
// for(Employee emp:empList){
//	    if(emp.name.equals("arun")){
//	        sysout(emp.id+ emp.name+ emp.phoneNumber)
//	        break;
//	    }
// }
//
//
//
//
//
// _________________________________
//
// Write a program to create a list of 5 employee objects with the following
// attributes:
// Id
// Name
// Phone Number
//	          	Out of 5 employee objects create 2 duplicate objects. Print the employee object without duplicate.
//	          	Output should be as follows:
// Employee - 1 , Name : xxxx, Phone : xxxxxx
// Employee - 2 , Name : xxxx, Phone : xxxxxx
// Employee - 3 , Name : xxxx, Phone : xxxxxx
// Employee - 4 , Name : xxxx, Phone : xxxxxx
//
//// Java 17 feature record
// record Employee (int id, String name, String phoneNumber){
//
// public equals(Employee emp){
//		if(this.id== emp.id && this.name.equals(emp.name) && this.phoneNumber.equals(emp.phoneNumber)){
//			return true;
//		}
//		return false;
// }
//
// }
//
// Employee e1 = new Employee (1,"arun", 8888888);
// Employee e2 = new Employee (1,"arun", 8888888);
// Employee e3 = new Employee (3,"rahul", 3444);
// Employee e4 = new Employee (4,"kumar", 5444);
// Employee e5 = new Employee (5,"raju", 4744);
//
// List<Employee> empList = Arrays.asList(e1,e2,e3,e4,e5);
//
// empList.stream().filter(e-> getOccurance(empList,
// e)>1).collect(Collectors.toList());
//
// static getOccurance(List<Emploee> empList, Employee employee ){
// return empList.stream.filter(emp-> emp.equals(employee)).count();
// }
// ______________________________
//
/*
 * Create a spring boot project in the editor and create API endpoint to save
 * employee objects with the following attributes into the database. Id, Name,
 * Phone
 */

/*
 * Model class //lombok dependency to be added
 * 
 * @Data
 * 
 * @Table(employeedetails)
 * 
 * @Entity public class Employee{
 * 
 * @Id
 * 
 * @Generated int id; String name; String phoneNumber; }
 */

/*
 * EmployeeController
 * 
 * @RestController
 * 
 * @Autowired EmployeeServce empService;
 * 
 * @postMapping(/save-employee) public Employee saveEmployee(@RequestBody
 * Employee employee){ empService.saveEmployee(employee); }
 */

/*
 * interface EmployeeService{ Employee saveEmployee(Employee employee); }
 */

/*
 * @service class EmployeeServiceImpl implements Employeeservice{
 * 
 * @Autowired EmployeeDao employeeDao; public Employee saveEmployee(Employee
 * employee){ return employeeDao.save(employee); } }
 */

/*
 * @Transactional interface EmployeeDao extends JPARepository<Employee,Integer>{
 * }
 */