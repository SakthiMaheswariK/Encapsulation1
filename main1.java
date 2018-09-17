package main1;

 class Parent {        //subclass
	 static void m1()
	 {
		 System.out.println("From parent static m1()");
		 
	 }
void m2(){
	System.out.println("from parent non static m2()");
	
}
 }
class Child extends Parent{
	static void m1()
	{
		 System.out.println("From child static m1()");

	}
	public void m2()                                       //@override
	{
		System.out.println("From child non static m2()");

	}
}//derived class

	class  main1 {
		// TODO Auto-generated constructor stub
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Parent obj1=new Child();
obj1.m1();
obj1.m2();
	}
	}
	
	



