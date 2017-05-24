/*	设计模式(23种)
		1.单例设计模式
		2.模板设计模式
		3.装饰者设计模式
		4.观察者设计模式
		5.工厂设计模式

*/

//	单例设计模式练习
class Single{
	public static void main (String[] args){
		System.out.println("---------------------------------------------------\n");

/*饿汉单例设计模式
		//声明SingleMode类型变量s1并用来接收SingleMode.getInstance()方法返回的SingleMode类型对象s.
		SingleMode1 s1 = SingleMode1.getInstance();	//用 类名.方法名 的形式访问静态方法
		SingleMode1 s2 = SingleMode1.getInstance();	//用 类名.方法名 的形式访问静态
		System.out.println("是不是同一个对象："+(s1 == s2));
		System.out.println(s1);
		System.out.println(s2);
*/

/*懒汉单例设计模式		
		//声明SingleMode类型变量s1并用来接收SingleMode.getInstance()方法返回的SingleMode类型对象s.
		SingleMode2 s1 = SingleMode2.getInstance();	//用 类名.方法名 的形式访问静态方法
		SingleMode2 s2 = SingleMode2.getInstance();	//用 类名.方法名 的形式访问静态
		System.out.println("是不是同一个对象："+(s1 == s2));
		System.out.println(s1);
		//System.out.println(s2);
*/
	}
}

/*饿汉单例设计模式
class SingleMode1{
	//声明本类引用类型变量并指向本类对象
	private static SingleMode s = new SingleMode();	//得用private封装起来,要保证本类只创建一个对象得用static修饰

	//私有化构造方法
	private SingleMode(){}

	//对外提供公共静态的方法访问本类对象
	public static SingleMode getInstance(){
		return s;
	}
}
*/

/*懒汉单例设计模式	
class SingleMode2{
	//声明本类引用类型变量 不指向本类对象
	private static SingleMode2 s;

	//私有化构造方法
	private SingleMode2(){}

	//对外提供公共静态的方法访问本类对象（判断是否已经有对象）
	public static SingleMode2 getInstance (){
		if (s == null){	//引用类型空值为null
			s = new SingleMode2();
		}
		return s;
	}
}
*/