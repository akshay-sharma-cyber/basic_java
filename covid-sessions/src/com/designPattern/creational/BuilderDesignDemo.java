//Builder design patter : we use this when we have a lot to parameter to pass
//Instead of using constructor we create another class and use setters and its obj

package com.designPattern.creational;


class Artist{
	private String name;
	private int age;
	private String skill;
	private int yearsOfExp;
	private String company;
	private double salary;
	Artist (String name,int age,String skill,int yearExp,String company,double salary){
		
		this.name=name;
		this.age=age;
		this.skill=skill;
		this.yearsOfExp=yearExp;
		this.company=company;
		this.salary=salary;
		
	}
	@Override
	public String toString() {
		return "Artist [name=" + name + ", age=" + age + ", skill=" + skill + ", yearsOfExp=" + yearsOfExp
				+ ", company=" + company + ", salary=" + salary + "]";
	}
	
}
public class BuilderDesignDemo {
	
 public static void main(String[] args) {
	 	//Artist aa=new Artist("Akshay",22,"guitar",2,"wipro",22.34);
	 	//System.out.println(aa);
	 Artist bd=new BuilderHelperClass().setName("akshay").getArtist();
	 System.out.println(bd);
	 
 }
}
