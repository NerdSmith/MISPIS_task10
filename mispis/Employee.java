public abstract class Employee {
	public int ssNo;
	public String name;
	public String email;
	public int counter;

	public int getSsNo() {
		return ssNo;
	}

	public void setSsNo(int ssNo) {
		this.ssNo = ssNo;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public int getCounter() {
		return counter;
	}

	public void setCounter(int counter) {
		this.counter = counter;
	}

	public void getJob() {}

	public void getStarted() {}

	public void finishTheJob() {}

	public void getPaid() {}
}