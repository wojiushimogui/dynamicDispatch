public class DynamicDispatch{
	static abstract class Human{
		protected abstract void sayHello();
	}
	static class Man extends Human{
		protected  void sayHello(){
			System.out.println("hello,man");
		}
		
	}
	static class Woman extends Human{
		protected void sayHello(){
			System.out.println("hello,woman");
		}
	}
	public static void main(String [] args){
		Human man=new Man();
		Human woman1=new Woman();
		Woman woman2=new Woman();
		man.sayHello();
		woman1.sayHello();
		woman2.sayHello();
		
	}
}