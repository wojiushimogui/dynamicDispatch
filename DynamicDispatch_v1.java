public class DynamicDispatch{
	
	public static void main(String [] args){
		Human man=new Man();
		Human woman1=new Woman();
		Woman woman2=new Woman();
		man.sayHello();
		woman1.sayHello();
		woman2.sayHello();
		
	}
}
//只能将这三个类放在DynamicDispatch类的外面，才能去掉三个类的static，否则要加上static来修饰类
 abstract class Human{
		protected abstract void sayHello();
	}
	class Man extends Human{
		protected  void sayHello(){
			System.out.println("hello,man");
		}
		
	}
	 class Woman extends Human{
		protected void sayHello(){
			System.out.println("hello,woman");
		}
	}