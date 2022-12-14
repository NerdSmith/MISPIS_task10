import java.util.Date;

public class Project {

	public String name;
	public Date start;
	public Date end;

	public void setName(String name) {
		this.name = name;
	}

	public void setStart(Date start) {
		this.start = start;
	}

	public void setEnd(Date end) {
		this.end = end;
	}

	public String getName() {
		return name;
	}

	public Date getStart() {
		return start;
	}

	public Date getEnd() {
		return end;
	}

	public void getResult() {}

	public void addToProjectParticipant() {}

	public void begin() {}

	public void finish() {}

}