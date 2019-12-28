package java191224;

public class Ex01_Manager extends Ex01_Employee {
	
	int allowance;
	
	Ex01_Manager(String name, int salary, int allowance){
		super(name, salary);
		this.allowance = allowance;
	}
	
	@Override
	double raiseSalary() {
		return salary * 1.2;
	}

	@Override
	public String toString() {
		return "Manager [이름=" + name + ", 급여=" + salary + ", 수당=" + allowance + ", 급여 인상(20%)=" + raiseSalary()
				+ "]";
	}
	
}
