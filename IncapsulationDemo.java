//in this we can only access our data(variables and string etc) threw methods only to ensure safety of the data
//we can also maintain a log file to go threw values changed

class IncapDemo{
	private int address_no;
	private String company_name;

	public int getAddress_no() {
		return this.address_no;
	}
	public void setAddress_no(int address_no) {
		this.address_no = address_no;
	}
	public String getCompany_name() {
		return this.company_name;
	}
	public void setCompany_name(String company_name) {
		this.company_name = company_name;
	}
	
	public void show() {
		System.out.print("hii");
	}
	
}

public class IncapsulationDemo {
	public static void main(String []args) {
		IncapDemo obj=new IncapDemo();
		obj.setAddress_no(100);
		obj.setCompany_name("Akshay");

		System.out.println(obj.getAddress_no());
		System.out.println(obj.getCompany_name());
		
	}
}
