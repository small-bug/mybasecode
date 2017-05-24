class Day10 {
	public static void main(String[] args) {
		System.out.println("---------------------------------------------------\n");
/*++++++++++++++++下面是概念区+++++++++++++++++++++++*/

/*	强制转换
		小数据类型---->大数据类型	自动转换
		大数据类型---->小数据类型	强制转换
			格式：
				1.基本数据类型：小数据类型 变量 = （小数据类型）大数据变量	：int a = (int)(double)
				2.引用数据类型：小数据类型 变量 = （小数据类型）大数据变量	：Mouse a = (Mouse)(Animal)
*/

/*	内部类	————>写在一个类内部的类		内部类的class文件名：外部类$内部类.class 这样命名的好处是：可以区分这个内部类属于哪个外部类。
		1.成员内部类
			1.写在一个类中的成员变量位置
			2.内部类的访问方式：
				1.在外部类
				提供一个方法创建内部类的对象进行访问。
				2.在其它类直接创建内部类的对象，格式：外部类.内部类 变量 = new 外部类().new 内部类()	例如：outer.inner a = new outer().new inner();
			3.与外部类存在同名成员时，访问的是内部类的成员，可以用 外部类名.this.成员 指定访问外部类的成员。
			4.内部类要是有静态成员，则内部类也要用 static 修饰。
				注意：如果内部类是静态类，则在其它类创建内部类的对象格式为：外部类.内部类 变量 = new 外部类.内部类() 例如：outer.inner a = new outer.inner();
			5.私有化的内部类不能在其它类直接创建内部类的对象，只能用 方式1 访问。
			6.内部类的好处:在外部类中有很多属性时，可以用内部类来进行访问。内部类可以直接访问外部类的所有成员。
			
		2.局部内部类
			1.写在外部类的一个方法内。
			2.只能访问它所在的方法的 final 修饰的变量。因为JVM会复制 final 修饰的变量给对象用，对象的生命周期在方法执行完毕后还在。
			3.只能在它所在的方法内创建对象访问。方法执行完毕，所创建的对象不消失。

		3.匿名内部类
			1.没有类名的内部类，就叫匿名内部类。
			2.要有继承或者实现关系才能用。
			3.类的格式和调用类里的方法 ： new 父类名/接口名 (){类体}.方法名()。
			4.匿名内部类里可以有特有的方法，但是用多态定义变量接收 有特有的方法的内部类对象 时，不能用匿名内部类，要用其它内部类。
			5.只要一个类是抽象的或是一个接口，那么其子类中的方法都可以使用匿名内部类来实现，最常用的情况就是在多线程的实现上，因为要实现多线程必须继承Thread类或是继承Runnable接口
			6.简化书写，在一个类只用一次的时候可以用匿名内部类。
			7.匿名内部类不能有构造方法,因为没有类名。
			8.匿名内部类不能定义任何静态成员、静态方法。
			9.匿名内部类不能是public,protected,private,static。
			10.只能创建匿名内部类的一个实例。
			11.一个匿名内部类一定是在new的后面，用其隐含实现一个接口或实现一个类。
			12.因匿名内部类为局部内部类，所以局部内部类的所有限制都对其生效。

/*	异常体系	
		1.---|Throwable			Throwable 类是 Java 语言中所有错误或异常的超类。
					toString			返回此 throwable 的简短描述。 完整类名+详细消息字符串。
					getMessage			返回此 throwable 的详细消息字符串。
					printStackTrace		将此 throwable 及其追踪输出至标准错误流。
		2.------|Error			错误类	错误类的方法名一般以 Error结尾
									
		3.------|Exception		异常类	异常类的方法名一般以 Exception结尾
					1.捕获异常
						1.格式：try{ 可能有异常的代码 }catch(捕获的异常类型){ 对异常的处理 }
						2.异常发生后其后的代码不执行，直接跳转到catch块中执行处理代码。
						3.try-catch块后的代码正常执行。
						4.一个try块里可能发生多个不同类型的异常。
						5.try块后可以跟多个catch块以处理不同的异常类型,异常类型由小到大往后写。

					2.抛出异常	throw 和throws 关键字
						1.格式 throw new Exception();
						2.必须在方法上声明抛出， 格式 ：方法名(形参) throws Exception { 方法体 }。
						3.如果调用了一个 声明抛出异常的方法 ，那么调用者必须对异常进行处理，也可以继续抛出。
						4.如果一个方法抛出了一个异常对象，那么 throw 语句后的代码就不会再执行了（一个方法遇到throw关键字也会马上停止）。
						5.在一种情况下只能抛出一种异常类型。
						6.声明的类型要大于等于抛出的类型，抛出后捕获的类型要大于等于抛出的类型。
						7.throw 和 throws 的区别
							1.throw 用于方法内部抛出异常对象，throws用于方法声明抛出类型的。
							2.throw 后面只能跟一个异常对象，throws 可以同时声明多种异常类型。


*/

/*++++++++++++++++下面是需求区+++++++++++++++++++++++*/

/*	需求1：强制转换练习 定义一个方法可以接收任意类型的动物对象，在方法内部要调用接收到的动物的特有的方法
		Dog d = new Dog("旺财");
		special(d);
		Fish f = new Fish("鲤鱼");
		special(f);
*/

/*	需求2: 成员内部类练习	
		//用方式一访问
		Outer o = new Outer();
		Outer.Inner i = o.getInner();
		i.show();

		//用方式二访问
		//Outer.Inner a = new Outer("小明").new Inner("小强");	//当内部类是静态类时，不能用这种方式创建对象
		Outer.Inner b = new Outer.Inner("小刚");	//静态类时，用这种方式创建对象
		//a.innerShow();
		b.innerShow();
		//Outer.a.outerShow();
		Outer outer = new Outer("小红");
		outer.outerShow();
*/

/*	需求3: 局部内部类练习	
		//访问局部内部类
		Outer o = new Outer();
		o.text();
*/

/*	需求4: 匿名内部类练习	
		new Person(){
			//static int a;		错误 内部类不能定义任何静态成员、静态方法。
			public void run(){
				System.out.println(name+"跑");
			}
		}.run();
*/	
/*	需求5: 异常练习	
		Throwable t = new Throwable("这是一个错误信息……");	//Throwable(String message) 构造带指定详细消息的新 throwable。
		System.out.println("toString: " + t.toString());		//结果：java.lang.Throwable 这是一个错误信息……
		System.out.println("getMessage: " + t.getMessage());	//结果：这是一个错误信息……
		t.printStackTrace();	//结果：这是一个错误信息……	at Day10.main(Day10.java:96)	//异常在96行发生
		//捕获异常
		int[] arr = null;
		div(4, 0, arr);
		//抛出异常
		int[] arr = null;
		try{
			div(4, 0, arr);
		}catch(Exception e){
			System.out.println("抛出异常成功！");
		}
*/

		System.out.println("---------------------------------------------------\n");	
	}

/*++++++++++++++++下面是函数区+++++++++++++++++++++++*/

/*	需求1：强制转换练习 定义一个方法可以接收任意类型的动物对象，在方法内部要调用接收到的动物的特有的方法
		public static void special(Animal animal){
			if(animal instanceof Dog){
				Dog dog = (Dog)animal;		//强制类型转换
				dog.eat();
			}else if(animal instanceof Fish){
				Fish fish = (Fish)animal;	//强制类型转换
				fish.swim();				//访问子类的特有成员
			}
		}
*/

/*	捕获异常 try catch 块
		public static void div(int a, int b, int[] arr){
			int c = 0;
			try{
				c = a/b;
				System.out.println(arr[1]);
		
			}catch(ArithmeticException e){
				System.out.println("这里发生了 除0 错误");
			}catch(NullPointerException n){
				System.out.println("这里发生 空指针 异常");
			}catch(Exception z){						//在的类型放在最后
				System.out.println("这里的 总异常 ");
			}
		}
*/

/*	抛出异常 throw throws	
		public static void div(int a, int b, int[] arr) throws Exception {
			//int c = 0;
			//c = a/b;
			throw new NullPointerException();
			//System.out.println(arr[1]);
		}
*/


}

/*++++++++++++++++下面是 类 区+++++++++++++++++++++++*/

/*	需求1-> 强制转换练习 定义一个方法可以接收任意类型的动物对象，在方法内部要调用接收到的动物的特有的方法
abstract class Animal{
	String name;
	public Animal(String name){
		this.name = name;
	}
}
class Dog extends Animal{
	public Dog(String name){
		super(name);
	}

	public void eat(){
		System.out.println(name+"在吃骨头……");
	}
}
class Fish extends Animal{
	public Fish(String name){
		super(name);
	}
	
	public void swim(){
		System.out.println(name+"在水里游……");
	}
}
*/

/*	需求2-> 内部类练习	
class Outer{
	String name;
	
	public Outer(String name){
		this.name = name;
	}
	//内部类
	static class Inner{
		static String name;
		
		public Inner(String name){
			this.name = name;
		}
		public void innerShow(){
			System.out.println(name+"我是内部类……");		//同名用 外部类名.this.成员 访问外部成员
			System.out.println(name+"我是内部类……");		//同名直接访问内部成员
			//outerShow();
		}
	}
	
	//访问方式一：提供一个方法提供内部类对象
	public Inner getInner(){
		Inner i = new Inner("小强");
		return i;
	}
	public void outerShow(){
			System.out.println(name+"我是外部类……");
	}

}
*/

/*	需求3-> 局部内部类练习	
class Outer{
	String name = "我是外部类的   成员变量   名字";

	public void text(){
		//final String name = "我的外部类的    方法   的名字";	//要在局部内部类中访问这里的方法的成员变量 需要用final 修饰成最终变量。

		//局部内部类
		class Inner{
			//String name = "我是局部   内部类    的名字";	

			public void show(){
				System.out.println("我的局部内部类……" + name);
			}
		}
		//访问局部内部类
		Inner i = new Inner();
		i.show();
	}
}
*/

/*	需求4-> 匿名内部类练习	
abstract class Person{
	String name = "人类";

	public abstract void run();
}
*/

