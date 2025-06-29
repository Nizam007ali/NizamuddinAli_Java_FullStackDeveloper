package com.web.main.entity;

import jakarta.persistence.*;

@Entity
public class Student {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	private String name;
	private String email;
	private String password;
	@ManyToOne
    @JoinColumn(name = "class_name", referencedColumnName = "className")
    private Classes studentClass;
	private int sub1, sub2, sub3, sub4, sub5;
	private int total;
	private double percentage;
	private String grade;
	
	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
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

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public int getSub1() {
		return sub1;
	}

	public void setSub1(int sub1) {
		this.sub1 = sub1;
	}

	public int getSub2() {
		return sub2;
	}

	public void setSub2(int sub2) {
		this.sub2 = sub2;
	}

	public int getSub3() {
		return sub3;
	}

	public void setSub3(int sub3) {
		this.sub3 = sub3;
	}

	public int getSub4() {
		return sub4;
	}

	public void setSub4(int sub4) {
		this.sub4 = sub4;
	}

	public int getSub5() {
		return sub5;
	}

	public void setSub5(int sub5) {
		this.sub5 = sub5;
	}

	public int getTotal() {
		return total;
	}

	public void setTotal(int total) {
		this.total = total;
	}

	public double getPercentage() {
		return percentage;
	}

	public void setPercentage(double percentage) {

		this.percentage = percentage;
	}

	public String getGrade() {
		return grade;
	}

	public void setGrade(String grade) {
		this.grade = grade;
	}

	public void calculateTotal() {
		this.total = this.sub1 + this.sub2 + this.sub3 + this.sub4 + this.sub5;
	}

	public void calculatePercentage() {
		this.percentage = (double) this.total / 5;
	}

	public void calculateGrade() {
		boolean b[] = {false, false, false, false, false};
		if(this.sub1 < 33) {
			b[0] = true;
		}
		if(this.sub2 < 33) {
			b[1] = true;
		}
		if(this.sub3 < 33) {
			b[2] = true;
		}
		if(this.sub4 < 33) {
			b[3] = true;
		}
		if(this.sub5 < 33) {
			b[4] = true;
		}
		int cnt=0;
		for (int i = 0; i < 5; i++) {
			if (b[i]) {
				cnt++;
			}
		}
		if (cnt == 0) {
			if (this.percentage >= 90) {
				this.grade = "A+";
			} else if (this.percentage >= 80) {
				this.grade = "A";
			} else if (this.percentage >= 70) {
				this.grade = "B+";
			} else if (this.percentage >= 60) {
				this.grade = "B";
			} else if (this.percentage >= 50) {
				this.grade = "C";
			} else if (this.percentage >= 33) {
				this.grade = "D";
			} else {
				this.grade = "F";
			}
		} else if (cnt == 1) {
			if (b[0]) {
				this.grade = "S in Subject 1";
			} else if (b[1]) {
				this.grade = "S in Subject 2";
			} else if (b[2]) {
				this.grade = "S in Subject 3";
			} else if (b[3]) {
				this.grade = "S in Subject 4";
			} else if (b[4]) {
				this.grade = "S in Subject 5";
			}
		} else if (cnt == 2) {
			this.grade = "S in Two Subjects";
		} else if (cnt >= 3) {
			this.grade = "F";
		}else {
			this.grade = "F";
		}
	}

	public Classes getStudentClass() {
		return studentClass;
	}

	public void setStudentClass(Classes studentClass) {
		this.studentClass = studentClass;
	}

}
