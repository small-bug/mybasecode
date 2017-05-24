class Day9{
	public static void main (String[] args){
		System.out.println("---------------------------------------------------\n");
/*++++++++++++++++下面是概念区+++++++++++++++++++++++*/
/*	final关键字
		1.final修饰基础类型变量时，该变量不能被修改。
		2.final修饰引用类型变量时，该变量不能再指向其他对象。
		3.final修饰方法(函数)，该方法不能再重写。
		4.final修饰类时，该类不能被继承。
		5.一般属性成员变量(基础类型) 用 public static final 修饰 比如: public static final double PI = 3.141562954.
*/	

/*	抽象类->关键字 abstract
		1.概念：在描述一类事物时，该事物确实存在着某种行为，但该行为目前不具体时，我们可以抽取该种行为的声明
				但不去实现该种行为(就是没有函数体)，这种抽取行为声明的行为我们称为抽象的行为，需要使用抽象类。
		2.如果一个方法没有方法体，则需要用 abstract 修饰 使其成为抽象方法，才不会报错。
		3.如果一个类中出现了抽象方法，则该类必须用 abstract 修饰，使其成为抽象类。
		4.如果一个非抽象类继承了抽象类，则必须要把抽象类的所有抽象方法实现。
		5.抽象类中可以存在 抽象方法和非抽象方法，也可以不存在抽象方法只存在非抽象方法。
		6.抽象类是不能创建对象的，因为对象会调用类里的方法 万一调用到抽象方法呢(抽象方法是没有方法体的)。
		7.抽象类是存在构造函数的，它被用来给该抽象类的子类对象修改父类属性用。
	abstract不能和以下修饰词组合
		1.private 因为私有化后方法不可见，子类就没法实现
		2.static  因为静态化后 可以用 类名.方法名 的方式调用，没有意义，与抽象类不能创建对象冲突。
		3.final	  因为最终化后方法在子类中不能重写，也就没法实现。		
*/

/*	接口	java是单继承的，一个类只允许有一个直接父类，可以有很多间接父类。
		1.格式： interface 接口名{	接口体 }
		2.调用接口格式：class 类名 implements 接口名{ 类体 }。
		3.接口也是类，一种特殊的类。(抽象类)
		4.接口内的成员全是常量，在定义的时候必须初始化，系统会自动添加public static final 修饰词。
		5.接口内的方法全是抽象方法，没有方法体的，系统会自动添加 abstract 修饰，所有接口也是抽象类。
		6.调用接口的类需要把接口内的抽象方法全部实现。
		7.接口是没有构造方法的，因为成员是常量，不需要初始化。
		8.接口也不能创建对象。
		9.接口的作用：
			1.用于程序的解耦（后续会学）。
			2.用接口约束规范。
			3.拓展功能。
*/

/*	类与接口的关系：实现关系
		1.非抽象类实现接口，必须把接口里的方法全部实现。
		2.抽象类实现接口则可以不实现接口里的方法，因为接口也是抽象类。
		3.一个类可以同时实现多个接口，接口名用逗号分隔。
		4.一个类时实现多个接口时，多个接口里有重名方法时，只需要实现一个即可。
	接口与接口的关系：继承关系
		1.一个接口可以同时继承多个接口，接口名用逗号分隔。
		2.在有继承关系的接口中，一个类实现子接口时必须把父接口中的方法也全部实现。
*/	
	
/*	多态	
		1.概念：一个对象具有多种形态。
				专业说法：父类的引用类型变量指向子类的对象，父接口的引用类型变量指向子接口(接口实现类)的对象 。
		2.多态一定是在继承或者实现关系下进行的。
		3.多态情况下，子父类存在同名成员时，除了同名非静态的方法是访问子类外，其它情况访问的都是父类的成员。
		4.多态情况下不能访问子类特有的成员(也就是子类有父类没有的成员);(可以用强制转换访问子类特有的成员)
		5.多态的作用：
			1.用作形参类型时可以传递更多的类型数据。
			2.用作返回值类型时可以返回更多的类型数据。
			3.提高了代码的拓展性，简化了代码。
	编译器小知识：
		1.编译看左，运行一定看左
			也就是在编译时会检查左边的引用类型变量所属的类里面有没指定的成员，没有就报错。


*/


/*++++++++++++++++下面是需求区+++++++++++++++++++++++*/
/*	需求1：	final关键字练习
		final Final f = new Final();
		f.myMessage();
		//f.age = 23;		//报错 Day9.java:25: 错误: 无法为最终变量age分配值	变量不能被修改
		//f.name = "李四";	//报错 Day9.java:26: 错误: 无法为最终变量name分配值	变量不能被修改
		//f = new Final();  //报错 Day9.java:27: 错误: 无法为最终变量f分配值	变量不能再指向其他对象。
*/

/*	需求2：	抽象类练习	
		Dog d = new Dog("旺财");
		d.move();
		Fish f = new Fish("鲤鱼");
		f.move();
		//Animal a = new Animal("野兽");	//报错 错误: Animal是抽象的; 无法实例化		抽象类是不能创建对象的
*/

/*	需求3：	描述图形，圆形，矩形三个类，不管哪种图形都会具备计算面积与周长的行为。	
		Circle c = new Circle("圆", 4.0);
		c.area();
		c.perimeter();
		Squareness s = new Squareness("方形", 4.0, 5.0);
		s.area();
		s.perimeter();
*/

/*	需求4：	接口的练习 
		//new Interface ();	//报错 错误: Interface是抽象的; 无法实例化	接口也不能创建对象。
		WritePencil w = new WritePencil();
		w.write();
		w.eraser();
		//拓展转笔刀功能
		w.knife();
		w.color();
		Text.text();
*/

/*	需求5: 多态的练习 写一个方法可以接收任意类型的图形对象，并且打印出它们的面积的周长。
		String jack = "杰克 男";
		Penson pensonGender = new Man();
		//pensonGender.man();		//报错，不能访问子类特有的成员
		pensonGender.man();
		pensonGender.man1();

		Circle c = new Circle(7.3);
		Rect r = new Rect(5.1, 787.4);
		myShape(c);
		myShape(r);
	
	    //写一个方法可以返回任意类型的图形对象，并且打印出它们的面积的周长。
		MyShape m = back(0);	// m = new Circle(54.4) 或者 m = new Rect(45.5, 496.5)
		m.area();
		m.perimeter();
*/
		System.out.println("---------------------------------------------------\n");
	}




/*++++++++++++++++下面是函数区+++++++++++++++++++++++*/
/*	需求5: 多态的练习 写一个方法可以接收任意类型的图形对象，并且打印出它们的面积的周长。
		public static void myShape(MyShape s){	//MyShape s = new Circle(7.3)父类的引用类型变量指向子类的对象
			s.area();			//面积
			s.perimeter();		//周长
		}
		写一个方法可以返回任意类型的图形对象，并且打印出它们的面积的周长。
		public static MyShape back(int i){
			if (i == 0){
				return new Circle(54.4);
			}else{
				return new Rect(45.5, 496.5);
			}
		}
*/

}




/*++++++++++++++++下面是 类 区+++++++++++++++++++++++*/
/*	需求1-> final 练习
final class Final{
	//属性
	final int age = 12;
	final String name = "张三";

	//构造方法
	public Final(){}

	public final void myMessage(){
		System.out.println("我的名字："+name);
		System.out.println("我的年龄："+age);
	}
}
class FinalSon extends Final{	//报错  错误: 无法从最终Final进行继承	该类不能被继承
	//属性
	int age = 11;
	String name = "李四";

	//构造方法
	public FinalSon(){}

	public void myMessage(){		//报错 错误: FinalSon中的myMessage()无法覆盖Final中的myMessage() 方法不能再重写
		System.out.println("我的名字："+name);
		System.out.println("我的年龄："+age);
		System.out.println("我的年龄："+age);
	}
	
}
*/

/*	需求2-> 抽象类 练习	
abstract class Animal{				//类内有抽象方法，类也要抽象起来
	//属性
	String name;

	//构造函数
	public Animal(String name){
		this.name = name;
	}

	//公共行为
	public abstract void move();		//每种动物移动行为不具体，抽象起来
}
class Dog extends Animal{

	public Dog(String name){
		super(name);	//继承父类属性
	}
	
	public void move(){		//一个非抽象类继承了抽象类，则必须要把抽象类的所有抽象方法实现。
		System.out.println(name+" 四条脚飞快的跑起来了！");
	}
}
class Fish extends Animal{

	public Fish(String name){
		super(name);
	}

	public void move(){		//一个非抽象类继承了抽象类，则必须要把抽象类的所有抽象方法实现。
		System.out.println(name+" 甩着尾巴游走了！");
	}
}
*/

/*	需求3-> 描述图形，圆形，矩形三个类，不管哪种图形都会具备计算面积与周长的行为。	
//图形类
abstract class Drawing{
	//属性
	String name;

	//构造方法 (重载)
	public Drawing(String name){
		this.name = name;
	}

	//计算面积
	public abstract void area();	//抽象起来
	//计算周长
	public abstract void perimeter();	//抽象起来
}
//圆类
class Circle extends Drawing{
	//属性
	public static final double PI = 3.141592654;
	double r;

	//构造方法
	public Circle(String name, double r){
		super(name);
		this.r = r;
	}

	//计算面积
	public void area(){
		System.out.println(name+"的面积是："+(r*r*PI));	
	}
	//计算周长
	public void perimeter(){
		System.out.println(name+"的周长是："+(2*PI*r));
	}
}
//方形类
class Squareness extends Drawing{
	//属性
	double width;
	double height;

	//构造方法
	public Squareness(String name, double width, double height){
		super(name);
		this.width = width;
		this.height = height;
	}

	//计算面积
	public void area(){
		System.out.println(name+"的面积是："+(width*height));
	}
	//计算周长
	public void perimeter(){
		System.out.println(name+"的周长是："+(2*(width+height)));
	}
}
*/

/*	需求4：	接口的练习 
//定义一个接口类
interface Interface0{
	//橡皮擦
	public void eraser();
}
interface Interface1{
	//拓展转笔刀功能
	public void knife();
}
interface Interface2 extends Interface1,Interface0{	//接口2继承接口1和接口0 同时继承多个接口
	public void color();	//换色功能
}
//普通铅笔类
class Pencil{
	public void write(){
		System.out.println("铅笔沙沙沙的写……");
	}
}
//能写能擦的铅笔类
class WritePencil extends Pencil implements Interface2,Interface0{	//一个类同时实现多个接口    一个类时实现多个接口时，多个接口里有重名方法时，只需要实现一个即可。
	public void eraser(){
		System.out.println("橡皮唰唰唰的擦……");
	}
	//拓展转笔刀功能
	public void knife(){
		System.out.println("转笔刀嗤嗤嗤的转……");
	}
	public void color(){
		System.out.println("换个颜色写字……");
	}
}
//抽象类
abstract class Text implements Interface2{
	public static void text(){
		System.out.println("我是抽象类的方法，我任性，我不实现接口里的方法，我在抽象类中，不能创建对象调用，我是用类名直接调用的……");
	}
}
*/

/*	需求5-> 多态的练习	
class Penson{
	public void penson(){
		System.out.println("我是人……");
	}
	public void man(){
		System.out.println("我是父类中的男的……");
	}
	public static void man1(){
		System.out.println("我是父类类中的静态的男的……");	//多态情况下，子父类存在同名成员时，除了同名非静态的方法是访问子类外，其它情况访问的都是父类的成员。
	}
}
class Man extends Penson{
	public void man(){
		System.out.println("我是子类中的非静态的男的……");	//多态情况下，子父类存在同名成员时，除了同名非静态的方法是访问子类外，其它情况访问的都是父类的成员。
	}
	public static void man1(){
		System.out.println("我是子类中的静态的男的……");
	}
}
class Woman extends Penson{
	public void woman(){
		System.out.println("我是女的……");
	}
}
*/
/*	需求5-> 多态的应用练习	
abstract class MyShape{
	public abstract void area();
	public abstract void perimeter();
}
class Circle extends MyShape{
	public static final double PI = 3.14;
	private double r;

	public Circle(double r){
		this.r = r;
	}

	public void area(){
		System.out.println("圆的面积是："+r*r*PI);
	}
	public void perimeter(){
		System.out.println("圆的周长是："+2*r*PI);
	}
}
class Rect extends MyShape{
	private double width;
	private double height;

	public Rect(double width, double height){
		this.width = width;
		this.height = height;
	}

	public void area(){
		System.out.println("方形的面积是：" + width*height);
	}
	public void perimeter(){
		System.out.println("方形的周长是：" + 2*(width+height));
	}
	
}
*/