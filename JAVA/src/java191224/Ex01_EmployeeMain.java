package java191224;

public class Ex01_EmployeeMain {

	public static void main(String[] args) {
		
		Ex01_Employee em = new Ex01_Employee("박소연", 300);
		Ex01_Manager ma = new Ex01_Manager("원선영", 350, 200);
		Ex01_Executive ex = new Ex01_Executive("박누리", 370, 200, 100);
		
		System.out.println(em.toString());
		System.out.println(ma.toString());
		System.out.println(ex.toString());
		
	}

}
