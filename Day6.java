import java.util.*;
class Day6{
	public static void main(String[] args) {
		System.out.println("---------------------------------------------------\n");
/*	对象：真实存在唯一的实物 (一切皆对象);
	类：  具有相似属性或者行为的一类事物(对象);
		自定义类的3个步骤：
			1.自定义类。
				class car{	//类
					//	事物的公共属性使用 成员变量 描述;
					String name;	// 
					String color;
					int wheel;
				
					//	事物的公共行为使用 函数 描述;
					public run (){	//	函数
						System.out.println("车跑起来了");
					}
				}
			2.在(其它)类里创建对象。
				new 类名();		//	new car();	

			3.调用类里的对象、方法、属性。
				car myCar = new car();	//	创建car类对象
				myCar.name = "宝马";		//	调用
				myCar.color = "红色";		//	调用
				myCar.wheel = 4;			//	调用
				
				myCar.run ();				//	调用函数
*/	

/*	自定义类
		Car myCar = new Car();
		myCar.name = "Z11";
		//System.out.println(myCar.name);
		myCar.color = "红色";
		//System.out.println(myCar.color);
		myCar.brand = "宝马";
		//System.out.println(myCar.brand);
		myCar.wheel = 4;
		//System.out.println(myCar.wheel);
		System.out.println("我的车是一辆"+myCar.color+"的"+myCar.brand+myCar.name+",它有"+myCar.wheel+"个轮子！");
		
		myCar.run ();
		*/

/*	局部变量和成员变量
		定义位置：	1.局部变量在方法内
					2.成员变量在方法外，类内
		作用范围:	1.局部变量在定义它的方法内有效，作用只是为方法提供一个变量
					2.成员变量在定义它的类内有效，作用是为类提供一种属性。
		生命周期：	1.局部变量在定义它的作用域（非它所在的方法，而是它所在的方法中定义它的位置，比如一个for循环中的int i = 0,执行完for循环，i就消失）执行完后就消失了。
					2.成员变量随着创建它的对象而存在，只有被垃圾回收机收走才消失。
		是否有初值：1.局部变量定义的时候可以没有初值，但要使用必需赋初值。
					2.成员变量不用赋初值，它有自己默认的初值（不同类型的初值不同	int(0) long(0) float(0.0f) double(0) char(' ') boolean(false) String或者引用数据类型(null)）
*/
/*	局部变量和成员变量练习	
		System.out.println("hello1");
		for (int i = 0; i < 5; ++i){
			System.out.println("hello2" + i);
		}
		Car myCar = new Car();
		System.out.println(myCar.name);
		System.out.println(myCar.color);
		System.out.println(myCar.brand);
		System.out.println(myCar.wheel);
*/

/*	匿名对象
		格式：new 类名();
			  new 类名().属性;

		注意：1.我们一般不给匿名对象赋予属性值，因为我们永远无法获取到它。
			  2.两个匿名对象永远不可能是同一个对象。
		好处：1.匿名对象可以简化程序（只需要使用对象一次时可以用匿名对象）。
			  2.匿名对象可以作为实参来使用。
*/
/*	匿名对象练习	
		//new Car().name = "宝马";	//	永远无法访问到该 宝马
		//System.out.println(Car().name);	//	没有这种语法 报错！
		System.out.println(new Car() == new Car());		//	引用类型用 == 号比较时是比较的内存地址(返回true或者false)
		new Car().run();	//						1.简化写法，可以尽快的释放内存空间，垃圾回收机会尽快收走（不用等到主方法执行完才回收）
	
		CarFactory carRepair = new CarFactory();
		carRepair.carRepairing(new Car());		//	2.用作实参
*/

/*	封装	
		步骤	1.用private修饰要封装的变量或者属性。
				2.提供一个公共的方法设置(set)或者获取(get)该私有的成员属性。

		public		权限修饰符(控制变量的可见范围) 修饰的变量或者方法所有类都可以访问		公共的
		private		权限修饰符(控制变量的可见范围) 修饰的变量或者方法只能在本类中进行访问	私有的

		 //	网站会员
		Member jack = new Member();
		jack.name = "杰克";
		jack.setSex("是");
		jack.age = 23;
		jack.salary = 15000;

		System.out.println("会员："+jack.name+"\n性别："+jack.getSex()+"\n年龄："+jack.age+"\n月薪："+jack.salary);
*/		

/* 
需求2：使用JAVA类描述一个计算器类，计算器具备操作数1,操作数2，运算符 三个公共的属性，还具备计算的功能行为。
		要求：不能直接对操作数1/2 运算符这些属性进行直接的赋值，要封装起来。

		//	调用计算器
		Calculator cal = new Calculator();

		//计算4+3并显示
		cal.setOperand(4, 3, '+');
		cal.calc();
		cal.setOperand(4, 3, '-');
		cal.calc();
		cal.setOperand(4, 3, '*');
		cal.calc();
		cal.setOperand(4, 3, '/');
		cal.calc();
*/

/*
需求1：使用JAVA描述一个车与修车厂两个事物：
			  车：具备的公共属性：轮子数、名字、颜色，
				  具备公共行为：  先检测轮子是否少于4个，如果少于4个，那么要送到修车厂修理。
								  修车厂修理之后，车的轮子数要补齐4个，然后车就继续跑起来。

			  修车厂：具备公共属性：名字、地址、电话。
					  具备公共行为：修车。
		//	修轮子版
		Car myCar = new Car();
		myCar.name = "BMW";
		myCar.color = "红色";
		myCar.wheel = 1;
		myCar.run ();
		
		//	修理厂版
		Car myCar = new Car();
		myCar.name = "奥迪";
		myCar.color = "黑色";
		myCar.wheel = 4;
		myCar.run();

		CarFactory carRepair = new CarFactory();
		carRepair.name = "幸福修理厂";
		carRepair.address = "建国路188号";
		carRepair.phone = "16888888888";
		carRepair.carRepairing(myCar);
		myCar.run();
		*/


		System.out.println("---------------------------------------------------\n");
	}

/*		++++++++++++++++++		以下是函数区	+++++++++++++++++++++++++++++++++++*/


}

/*		++++++++++++++++++		以下是 类 区	+++++++++++++++++++++++++++++++++++*/
/*	计算器类	
class Calculator{
	double operandOne;
	double operandTwo;
	char operate;
	
	//	设置操作数
	public void setOperand(int a, int b, char str){
		operandOne = a;
		operandTwo = b;
		if (str == '+' || str == '-' || str == '*' || str == '/'){
			operate = str;
		}else {
			System.out.println("本计算器暂时只支持 + - *  / 这四则运算，请重新输入符号！");
		}
	}
	
	//	计算功能方法
	public void calc(){
		switch (operate){
		case '+':System.out.println(operandOne + "加" + operandTwo + "的结果是：" + (operandOne + operandTwo));break;
		case '-':System.out.println(operandOne + "减" + operandTwo + "的结果是：" + (operandOne - operandTwo));break;
		case '*':System.out.println(operandOne + "乘" + operandTwo + "的结果是：" + (operandOne * operandTwo));break;
		case '/':System.out.println(operandOne + "除" + operandTwo + "的结果是：" + (operandOne / operandTwo));break;
		
		}
	}
}
*/

/*	网站会员类	
class Member{
	String name;
	private String sex;		//	只能在本类中访问
	int age;
	int salary;
	
	//	设置性别
	public void setSex(String s){
		//	if (s == "男" || s == "女")	//	错误 ，这是比较的是内存地址 
		if (s.equals("男") || s.equals("女")){
			sex = s;
		}else {
			System.out.println("你输入了错误的性别，系统将为你更改为默认值（男）");
			sex = "男";
		}
	}

	//	获取性别
	public String getSex(){
		return sex;
	}

	public void chat(){
		System.out.println("两个人聊天！");
	}
}
*/

/*	自定义car类
class Car{
	//	公共属性
	String name;	//	名字(型号)
	String color;	//	颜色
	String brand;	//	品牌
	int wheel;		//	轮子数

	//	公共行为(函数)
	public void run (){
		System.out.println("看，车跑起来了！");
	}
}
*/

/*	需求1->	（    修轮子版    ）使用JAVA描述一个车与修车厂两个事物(类)：	
//	车类
class Car{		//	类名首字母大写，后面单词首字母也大写
	//	公共属性(名字,颜色,轮子数)
	String name;
	String color;
	int wheel;
	
	//	公共行为(车跑起来了)
	public void run(){
		//	检测车轮是否够4个
		CarFactory repairingCar = new CarFactory ();
			System.out.println("你的"+name+"只有"+wheel+"个轮子");
		while (wheel != 4){
			System.out.println("车轮子不够，去修一下吧！");
			wheel = repairingCar.carRepairing (wheel);
			System.out.println("现在你的"+name+"有"+wheel+"个轮子");
		}
		System.out.println("车飞快的跑起来了");
	}
}

class CarFactory{
	//	公共属性(名字,地址,电话)
	String name;
	String address;
	int	   phone;
	
	//	公共行为(修轮子)
	public int carRepairing (int wheel){
		//	修好轮子
		System.out.println("正在修理中……");
		wheel = 4;
		System.out.println("现在你的车"+"有"+wheel+"个轮子，修好了！");
		return wheel;
	}
}
*/
/*	需求1->	（		修车厂版	）使用JAVA描述一个车与修车厂两个事物(类)：	
//	车类
class Car{		//	类名首字母大写，后面单词首字母也大写
	//	公共属性(名字,颜色,轮子数)
	String name;
	String color;
	int wheel;
	
	//	公共行为(车跑起来了)
	public void run(){
		//	检测车轮是否够4个
		System.out.println("你的"+name+"有"+wheel+"个轮子");
		if (wheel != 4){
			System.out.println("车轮子不够，去修一下吧！");
		}else {
			System.out.println("车飞快的跑起来了");
		}
	}
}

class CarFactory{
	//	公共属性(名字,地址,电话)
	String name;
	String address;
	String phone;
	
	//	公共行为(修轮子)
	public Car carRepairing (Car myCar){
		//	修好轮子
		if (myCar.wheel != 4){
			myCar.wheel = 4;
			System.out.println("你的车修好了，请缴维修费后开走！");
		}else {
			System.out.println("你的车是好的，请缴停车费后开走！");
		}
		return myCar;
	}
}
*/
