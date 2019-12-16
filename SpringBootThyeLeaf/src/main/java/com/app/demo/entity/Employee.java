package com.app.demo.entity;
import java.util.Date;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.PrePersist;
import javax.persistence.PreUpdate;
import javax.persistence.Table;

@Entity
@Table(name="emp_thyme")
public class Employee {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)	
	@Column(name="emp_id")
	private int empId;
	@Column(name="emp_name")
	private String empName;
	@Column(name="emp_sal")
	private double empSal;
	@Column(name="designation")
	private String designation;
	@Column(name="dept")
	private String empDept;
	@Column(name="email_id")
	private String empMail;
	@Column(name="mobile")
	private long mobile;
	@Column(name="created_at")
	private Date created;
	@Column(name="updated_at")
	private Date updated;
	
	public Employee() {
		super();
	}

	public Employee(int empId, String empName, double empSal, String designation, String empDept, String empMail,
			long mobile, Date created, Date updated) {
		this.empId = empId;
		this.empName = empName;
		this.empSal = empSal;
		this.designation = designation;
		this.empDept = empDept;
		this.empMail = empMail;
		this.mobile = mobile;
		this.created = created;
		this.updated = updated;
	}

	public Employee(String empName, double empSal, String designation, String empDept, String empMail, long mobile,
			Date created, Date updated) {
		this.empName = empName;
		this.empSal = empSal;
		this.designation = designation;
		this.empDept = empDept;
		this.empMail = empMail;
		this.mobile = mobile;
		this.created = created;
		this.updated = updated;
	}

	public int getEmpId() {
		return empId;
	}

	public void setEmpId(int empId) {
		this.empId = empId;
	}

	public String getEmpName() {
		return empName;
	}

	public void setEmpName(String empName) {
		this.empName = empName;
	}

	public double getEmpSal() {
		return empSal;
	}

	public void setEmpSal(double empSal) {
		this.empSal = empSal;
	}

	public String getDesignation() {
		return designation;
	}

	public void setDesignation(String designation) {
		this.designation = designation;
	}

	public String getEmpDept() {
		return empDept;
	}

	public void setEmpDept(String empDept) {
		this.empDept = empDept;
	}

	public String getEmpMail() {
		return empMail;
	}

	public void setEmpMail(String empMail) {
		this.empMail = empMail;
	}

	public long getMobile() {
		return mobile;
	}

	public void setMobile(long mobile) {
		this.mobile = mobile;
	}

	public Date getCreated() {
		return created;
	}

	public void setCreated(Date created) {
		this.created = created;
	}

	public Date getUpdated() {
		return updated;
	}

	public void setUpdated(Date updated) {
		this.updated = updated;
	}
	
	@PrePersist
	  protected void onCreate() {
	    created = new Date();
	  }

	  @PreUpdate
	  protected void onUpdate() {
	    updated = new Date();
	  }

	@Override
	public String toString() {
		return "Employee [empId=" + empId + ", empName=" + empName + ", empSal=" + empSal + ", designation="
				+ designation + ", empDept=" + empDept + ", empMail=" + empMail + ", mobile=" + mobile + ", created="
				+ created + ", updated=" + updated + "]";
	}
}
