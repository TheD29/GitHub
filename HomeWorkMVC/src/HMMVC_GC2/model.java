package HMMVC_GC2;

public class model {
	private int month1;
	private int year;
	private int birthday;

	model(int y, int m, int b) {
		month1 = m;
		year = y;
		birthday = b;
	}

	public void setBirthday(int birthday) {
		this.birthday = birthday;
	}

	public void setMonth1(int month1) {
		this.month1 = month1;
	}

	public void setYear(int year) {
		this.year = year;
	}

	public int getBirthday() {
		return birthday;
	}

	public int getMonth1() {
		return month1;
	}

	public int getYear() {
		return year;
	}
}
