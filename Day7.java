import java.util.*;		//	导包
class Day7{
	public static void main(String[] args){
		System.out.println("---------------------------------------------------\n");
/*++++++++++++++++下面是概念区+++++++++++++++++++++++*/
/*	构造方法
		1.无返回值。
		2.方法名要和类名一致。
		3.可以有参或者无参。
		4.一般用于初始化属性。
		5.在创建对象的时候会运行一次，不能手动调用。
		6.如果没写构造方法，编译时会由编译器自动生成一个无参的构造方法。
		7.如果写了构造方法，编译时就不会由编译器生成一个无参的构造方法。
		8.可以重载。
		9.创建对象时会将(声明属性和构造代码块)的代码包含进来并放在最前面执行。
		10.用于对应对象的初始化。
*/

/*	代码块
		构造代码块
			1.格式-->	{代码}
			2.写在成员变量位置。
			3.和属性代码有顺序关系（按顺序执行）。
			4.创建对象时会被构造函数包含进去并放在构造函数的前面执行。
			5.可将重复代码放在构造代码块中，减少代码重复。
			6.用于统一初始化对象的属性。
		局部代码块
			1.格式-->	{代码}
			2.可以缩短局部变量的生命周期，优化内存。
		静态代码块		
*/

/*	this关键字	
		0.this关键字代表了所属函数的调用者对象。(意思是哪个对象调用它，它的地址就和那个对象一样)
		1.当成员变量和方法内的局部变量重名时，JAVA采用就近原则，而this用于访问成员变量。	this.id(成员变量) = id(局部变量);
		2.从一个构造方法调用另一个构造方法(this必须放在构造方法的第一句，且两个构造方法不能互相调用)。	this(形参);
		3.如果在方法中访问一个成员变量(方法中没有同名变量)，则JAVA编译器会自动在前面加上this。
		4.this关键字不能用于静态方法中。
*/

/*	static关键字	
		1.是修饰说明符，用于修饰成员变量或者方法
		2.用static修饰的变量会存储在 数据共享区 中，改一次所有对象中的值都改变。
		3.访问方式：1. 对象.变量	2.类名.变量
		4.非静态变量只能用 对象.变量 的方式访问，不能用 类名.变量的方式访问。
		5.不要为了使用 类名.变量 的方式访问方便而随意用static修饰成员变量，只在真正需要共享数据时在用。
*/

/*++++++++++++++++下面是需求区+++++++++++++++++++++++*/
/*	构造方法练习 小学生类	
		XiaoXueSheng one = new XiaoXueSheng("晓亮", "男", 18);
		one.study();
*/

/*	需求1：描述一个员工类，员工具备属性：ID/name/age；
						   具备公共行为：工作。
			要求：一旦创建一个员工对象的时候，那么该对象就要有对应的属性值。   
		//Employee xiaoli = new Employee(0026, "小明", 22);	//这里的0026前面加了0 是八进制 等于十进制的22
		Employee xiaoli = new Employee(1038, "小明", 22);
		xiaoli.work();
*/

/*	需求2：使用JAVA定义一个人类，人具备 id、name、age 三个属性，还具备一个比较年龄的方法。
		   要求：必须写上构造函数，构造函数也必须要使用上this关键字。
		
		Human person1 = new Human(1234, "小明", 18);
		Human person2 = new Human(7890, "小亮", 18);
		person1.chooseAge(person2);
*/

/*	需求3：统计一个类被使用了多少次创建对象，该类对外显示被创建的次数	
		Count x1 = new Count();
		Count x2 = new Count();
		Count x3 = new Count();
		Count x4 = new Count();
		Count x5 = new Count();
		Count x6 = new Count();
		Count x7 = new Count();
		x7.howTimes();		
		System.out.println(Count.count);	// 在类外用 类名.变量 的方式访问
*/


		System.out.println("---------------------------------------------------\n");
	}
/*++++++++++++++++下面是函数区+++++++++++++++++++++++*/


}
/*++++++++++++++++下面是 类 区+++++++++++++++++++++++*/
/*	统计用本类创建了多少次对象	
class Count{
	//	属性
	static int count = 0;	// 计数器 (共享用static修饰)
	
	//	构造代码块
	{	++count;	}

	// 构造方法			 如果有构造方法重载，++count放在这里不合适，放在构造代码块里合适
	public Count(){
		++count;
	}

	// 方法
	public void howTimes(){
		System.out.println("创建对象的次数: "+count);
	}
}
*/

/*	人类	
class Human{
	//	公共属性
	int id;
	String name;
	int age;

	//	构造函数
	public Human(int id, String name, int age){
		this.id = id;
		this.name = name;
		this.age = age;
	}

	//	公共行为
		// 比较谁的年龄大
	public void chooseAge(Human person){
		if (this.age > person.age){
			System.out.println("年龄大的是"+this.name);
		}else if(this.age < person.age){
			System.out.println("年龄大的是"+person.name);
		}else {
			System.out.println("同龄！");
		}
	}
}
*/

/*	员工类	
class Employee{
	//	公共属性
	int id;
	String name;
	int age;
	
	//	构造函数，初始化公共属性
	public Employee(int a, String b, int c){
		id = a;
		name = b;
		age = c;
	}

	//	公共行为
	public void work(){
		System.out.println("编号为"+id+"的"+name+",他"+age+"岁，他正在认真的工作……");
	}

}
*/

/*	小学生类	
class XiaoXueSheng{
	String name;
	String sex;
	int age;

	//	构造方法	
	public XiaoXueSheng(String a, String b, int c){
		name = a;
		sex = b;
		age = c;
		System.out.println("构造方法执行完毕！");
	}
	//	学习方法
	public void study(){
		System.out.println(age+"岁的"+name+"("+sex+")"+"开开心心的去上学了！");
	}
}
*/