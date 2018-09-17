package MySingleton;

public class MySingleton {
	private static MySingleton myobj;
	private MySingleton() {
		
	}
	public static MySingleton getInstance() {
		if(myobj==null)
		{
			myobj=new MySingleton();
		}
		
		return myobj;
	}
	public void getSomeThing()
	{
		System.out.println("I am here.....");
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MySingleton st=MySingleton.getInstance();
		st.getSomeThing();

	}

}
