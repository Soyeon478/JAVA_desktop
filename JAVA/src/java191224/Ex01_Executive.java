package java191224;

public class Ex01_Executive extends Ex01_Manager {
	
	int bonus;
	
	Ex01_Executive(String name, int salary, int allowance, int bonus){
		super(name, salary, allowance);
		this.bonus = bonus;
	}
	
	@Override
	double raiseSalary() {
		return salary * 1.3;
	}

	@Override
	public String toString() {
		return "Executive [이름=" + name + ", 급여=" + salary + ", 수당=" + allowance + ", 보너스=" + bonus + 
				", 급여 인상(30%)=" + raiseSalary() + "]";
	}
	
}
