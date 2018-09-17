package Sample;
class Displayoverloading                       
{                                 
public void disp(char c)  //@overloading
{
	System.out.println(c);
	
}
	public void disp(char c,int num)
	{
		System.out.println(c+""+num);
	}
}
	class Sample {
		// TODO Auto-generated constructor stub
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Displayoverloading obj=new Displayoverloading();  //object creation
obj.disp('a');
obj.disp('a',10);
	}

	}


