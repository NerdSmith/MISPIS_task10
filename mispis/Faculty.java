public class Faculty {
	public Employee dean;
	public String name;

	public Faculty(Employee dean, String name) {
		this.dean = dean;
		this.name = name;
	}

	public void setDean(Employee dean) {
		this.dean = dean;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Employee getDean() {
		return dean;
	}

	public String getName() {
		return name;
	}

	public void holdConference() {}

	public void hireLecturer() {}

	public void hireEmployee() {}

	public void dismissLecturer() {}

	public void dismissEmployee() {}

	public void makeInquiry() {}

}