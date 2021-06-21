package com.designPattern.creational;

public class BuilderHelperClass {

	private String name;
	private int age;
	private String skill;
	private int yearsOfExp;
	private String company;
	private double salary;
	public BuilderHelperClass setName(String name) {
		this.name = name;
		return this;
	}
	public BuilderHelperClass setAge(int age) {
		this.age = age;
		return this;
	}
	public BuilderHelperClass setSkill(String skill) {
		this.skill = skill;
		return this;
	}
	public BuilderHelperClass setYearsOfExp(int yearsOfExp) {
		this.yearsOfExp = yearsOfExp;
		return this;
	}
	public BuilderHelperClass setCompany(String company) {
		this.company = company;
		return this;
	}
	public BuilderHelperClass setSalary(double salary) {
		this.salary = salary;
		return this;
	}
	public Artist getArtist() {
 		return new Artist(name,age,skill,yearsOfExp,company,salary);
	}
}
