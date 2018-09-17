package Encapstest;//package name

class EncapsulationDemo { //base class
	private int ssn;                 //declaration
	private String empName;
	private int empAge;
	public int getEMPSSN() {            //method
		return ssn;
	}
public String getEmpName()
{
	return empName;
}
public int getEmpAge()    //getmethod
{
	return empAge;
}
public void setEmpAge(int newValue)
{
	empAge=newValue;
}
public void setEmpName(String newValue)
{
	empName=newValue;
}
public void setEmpSSN(int newValue)
{
	ssn=newValue;
}
}
	public class Encapstest { //main class
		// TODO Auto-generated constructor stub
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
EncapsulationDemo obj=new EncapsulationDemo(); //object creation
obj.setEmpName("Maheswari"); //setmethod
obj.setEmpAge(21);
obj.setEmpSSN(123456);
System.out.println("Employee Name: "+obj.getEmpName()); 
System.out.println("Employee SSN: "+obj.getEMPSSN());
System.out.println("Employee Age: "+obj.getEmpAge());
}
}
