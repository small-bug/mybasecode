class Day8{
	public static void main(String[] args) {
		System.out.println("---------------------------------------------------\n");
/*++++++++++++++++下面是概念区+++++++++++++++++++++++*/
/*	static关键字
		Static修饰成员变量
			1.是修饰说明符，用于修饰成员变量或者方法
			2.用static修饰的变量会存储在 数据共享区 中，改一次所有对象中的值都改变。
			3.访问方式：1. 对象.变量	2.类名.变量
			4.非静态变量只能用 对象.变量 的方式访问，不能用 类名.变量的方式访问。
			5.不要为了使用 类名.变量 的方式访问方便而随意用static修饰成员变量，只在真正需要共享数据时在用。
		Static修饰方法
			1.static修饰的方法叫做 静态成员方法。
			2.访问方式：1.对象.静态成员方法名	2.类名.静态成员方法名。 推荐(不用先创建对象，可以省内存)
			3.非静态方法可以调用静态方法和使用静态变量。
			4.静态方法不能(直接)使用非静态方法和变量，可以间接访问（通过创建对象访问）。
			5.静态方法里不能用this和super关键字。
			6.一个方法没有直接访问到非静态成员的时候就可以使用static修饰了，一般用于工具类型的方法
		重点:静态的成员(变量和方法)数据是优先于对象的，而非静态成员是对象创建才存在的，所以静态成员数据也优先于非静态成员数据。

/*	继承 super关键字 方法重写 instanceof关键字
	继承
		1.格式：class 类名1(子类) extends 类名2(父类) {}。
		2.父类的私有化属性不能继承。
		3.父类的构造方法不能继承。
		4.创建子类对象时父类的构造方法也会执行。
		5.不要为了减少代码而使用继承，要在正在有继承关系的类中使用。
	super关键字
		1.在继承中使用。
		2.子类和父类中存在同名成员变量时，在子类中默认是访问子类的成员变量的，可通过 super.变量名 的方式访问父类中的成员变量。
		3.创建子类对象时JVM默认调用父类的无参构造方法，可以在子类的构造方法通过 super(形参) 的方式指定访问父类中的(有参)构造方法，但super语句只能放在子类构造方法中的第一句。
			父类的构造器调用以及初始化过程一定在子类的前面。
		5.可以在子类中通过 super.方法名(); 的方式指定访问父类中的行为方法。
		6.super 和 this 不能同时在一个构造方法中调用构造方法，因为它们都需要在第一个语句，会冲突。
		7.super和this和不同点：
			1.super代表的是父类空间的引用。
			2.this代表的是所属函数的调用者对象。
			3.super要在有继承关系的类中才能使用，this则不需要。
			4.super是调用父类的构造方法，是两个类之间的操作，而this是调用本类的构造方法是一个类的操作。
	方法重写
		0.静态方法不能被重写。
		1.子类的方法重写格式: 方法名和形参必须一样。
		2.当父类满足不了子类的需求时就可以重写方法。
		3.子类的权限修饰符只能大于等于父类的。
		4.子类的返回值类型只能小于等于父类的。
		5.子类的异常抛出只能小于等于父类的。
		6.方法重写和方法重载的不同：
			1.方法重写的方法名和形参必须一样，而方法重载只需方法名一样即可。
			2.方法重写返回值有权限要求，而方法重载与返回值无关。
	instanceof关键字
		1.格式：对象 instanceof 类名	返回boolean类型值。
		2.作用：用来判断一个对象是否属于一个类。
		3.参与其中的对象和类必须有继承或者实现关系，否则报错。
		4.
*/
		


/*++++++++++++++++下面是需求区+++++++++++++++++++++++*/
/*	需求1：Static修饰方法练习	
		Student s = new Student("小明");
		s.study();
		s.sleep();			// 用对象调用静态方法
		Student.sleep();	// 用类名调用静态方法	推荐(不用先创建对象，可以省内存)
*/

/*	需求2：编写一个数组工具类		
		int[] arr = {1,3,45,3,2,13,423,32,43,423,434,32};
		MyArrays myArr = new MyArrays();
		System.out.println(myArr.toString(arr));	// 先遍历一次数组
		myArr.sort(arr);							// 排序
		System.out.println(myArr.toString(arr));	// 在遍历一次数组
*/	

/*	需求3：写一个球员类和一个球队类 
		Player p1 = new Player("A罗", 1);
		Player p2 = new Player("B罗", 2);
		Player p3 = new Player("C罗", 3);
		Team t = new Team("恒大", p1, p2, p3);
		t.startGame();
		System.out.println("球员1："+t.p1.name);
		System.out.println("球员2："+t.p2.name);
		System.out.println("球员3："+t.p3.name);
		t.startGame().run();
*/

/*	需求4：继承练习	
		Student s = new Student("小明");
		//s.name = "小明";
		System.out.println(s.name);
		s.active();
*/

/*	需求5：描述一下普通学生 基础班学生 就业班学生
					相同点：所有的学生都有名字，都会学习。
					不同点：普通班的学生学习 语数英。
							基础班的学生学习 javase
							就业班的学生学习 javaee+android

		Student s = new Student("小明");
		s.study();
		BaseStudent  b = new BaseStudent("小红");
		b.study();
		WorkStudent w = new WorkStudent("小丽");
		w.study();

		//instanceof 的用法
		System.out.println("b对象是不是属于Student类: "+(b instanceof Student));
		System.out.println("b对象是不是属于BaseStudent类: "+(b instanceof BaseStudent));
		System.out.println("s对象是不是属于BaseStudent类: "+(s instanceof BaseStudent));
*/


		System.out.println("---------------------------------------------------\n");
	}
/*++++++++++++++++下面是函数区+++++++++++++++++++++++*/

}
/*++++++++++++++++下面是 类 区+++++++++++++++++++++++*/
/*	需求1-> 学生类	
class Student{
	//	属性
	String name;
	static String conutry = "中国";

	//	构造代码块
	{}

	//	构造方法
	public Student(String name){
		this.name = name;
	}
	
	//	学习方法（非静态方法）
	public void study(){
		System.out.println(name+"学习……");		// 非静态方法 可以访问 非静态成员变量
		System.out.println(conutry+"学习……");	//   非静态方法 可以访问 静态成员变量
		System.out.println(this+"学习……");		//	   非静态方法 可以使用 this
	}
	//	睡觉方法（静态方法）
	public static void sleep(){
		//System.out.println(name+"睡觉……");	//静态方法 禁止访问 非静态成员变量
		System.out.println(conutry+"睡觉……");	//  静态方法 可以访问 静态成员变量
		//System.out.println(this+"睡觉……");	//	  静态方法 禁止使用 this
	} 
}
*/

/*	需求2：编写一个数组工具类	
class MyArrays{
	//	toString 功能
	public String toString(int[] arr){
		String result = "";
		for (int index = 0; index < arr.length; ++index){
			if (index == 0){
				result += "["+arr[index]+",";
 			}else if (index == (arr.length-1)){
				result += arr[index]+"]";
			}else {
				result += arr[index]+",";
			}
		}
		return result;
	}

	//	sort 功能(选择排序)
	public void sort(int[] arr){
		for (int i = 0; i < arr.length-1; ++i){
			for (int j = i+1; j < arr.length; ++j){
				if (arr[i] < arr[j]){
					int temp = 0;
					temp = arr[i];
					arr[i] = arr[j];
					arr[j] = temp;
				}
			}
		}
	}
}
*/

/*	需求3：写一个球员类和一个球队类 
//球员类
class Player{
	//属性
	String name;
	int num;

	//构造方法（初始化属性）
	public Player(String name, int num){
		this.name = name;
		this.num = num;
	}

	//公共方法
	public void run (){
		System.out.println(name+"开跑");
	}
}
//球队类
class Team{
	//属性
	String name;
	Player p1;
	Player p2;
	Player p3;
	
	//构造方法（初始化属性）
	public Team(String name, Player p1, Player p2, Player p3){
		this.name = name;
		this.p1 = p1;
		this.p2 = p2;
		this.p3 = p3;
	}

	//公共方法
	public void startGame(){
		System.out.println(name+"开赛了");
	}
}
*/

/*	需求4：继承练习	
//人类
class Person{
	//属性
	String name;
	private int age;
	
	//构造方法
	public Person(){
		System.out.println("父类中的 无参 方法被调用了……");
	}
	public Person(String name){
		this.name = name;
		System.out.println("父类中的 有参 方法被调用了……");
	}

	//公共行为
	public void eat(){
		System.out.println(name+"在吃……");
	}
}

//学生类（子类）
class Student extends Person{
	int num;	//学号

	//构造方法
	public Student(String name){
		super(name);
	}

	//公共行为
	public void active (){
		super.eat();
	}
	public void eat(){
		System.out.println(name+"在吃……");
	}

}
*/

/*	需求5：描述一下普通学生 基础班学生 就业班学生	
//普通班学生
class Student{
	//属性
	String name;

	//构造方法
	public Student(String name){
		this.name = name;
	}

	//公共行为
	public void study(){
		System.out.println(name + "学习 语数英");
	}
}
//基础班学生
class BaseStudent extends Student{
	//属性

	//构造方法(用super调用父类构造方法)
	public BaseStudent(String name){
		super(name);
	}
	
	//公共行为
	public void study(){
		System.out.println(name + "学习 javase");
	}
}
//就业班学生
class WorkStudent extends Student{
	//属性

	//构造方法(用super调用父类构造方法)
	public WorkStudent(String name){
		super(name);
	}

	//公共行为
	public void study(){
		System.out.println(name + "学习 javaee+android");
	}
}
*/