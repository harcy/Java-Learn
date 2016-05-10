package com.source.leetcode;

public class Admin implements Cloneable {
	
	private Student stu;
	private Integer avgScore;
	
	public Admin(Student stu,Integer avgScore){
		this.stu=stu;
		this.avgScore=avgScore;
	}
	
	public Student getStu() {
		return stu;
	}
	public void setStu(Student stu) {
		this.stu = stu;
	}
	public Integer getAvgScore() {
		return avgScore;
	}
	public void setAvgScore(Integer avgScore) {
		this.avgScore = avgScore;
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((stu == null) ? 0 : stu.hashCode());
		return result;
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Admin other = (Admin) obj;
		if (stu == null) {
			if (other.stu != null)
				return false;
		} else if (!stu.equals(other.stu))
			return false;
		return true;
	}
	
	
	
	@Override
	protected Object clone() throws CloneNotSupportedException {
		return super.clone();
	}
	public static void main(String[] args) throws CloneNotSupportedException {
		
		Admin admin1=new Admin(new Student("lisi", "456"),85);
		Admin admin2=admin1;
		Admin admin3=(Admin)admin1.clone();
		/*System.out.println(admin1==admin2);
		System.out.println(admin1.equals(admin2));
		System.out.println(admin3==admin1);
		System.out.println(admin3.equals(admin1));*/
		admin3.stu=(Student)admin1.stu.clone();
		System.out.println(admin3.stu==admin1.stu);
		System.out.println(admin3.stu.equals(admin1.stu));
	}
	

}
