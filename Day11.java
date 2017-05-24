import java.io.*;
class Day11 extends ProgramRuntime{
	public static void main(String[] args){
		System.out.println("---------------------------------------------------\n");
/*++++++++++++++++下面是概念区+++++++++++++++++++++++*/
/*	自定义异常类
		1.只要写一个类继承Exception类，那他就是异常类。最后super一下Exception类的(String Message)构造方法。
*/

/*	Exception
		1.运行时异常	RuntimeException 以及它的的所有子类，都是运行时异常类
			1.可以不用声明抛出异常类型，也可以不用处理异常。
				原因：因为运行时异常是可以通过程序员良好的编程习惯避免的，所以不做强制要求。

		2.编译时异常（非运行时异常，受检异常）	除了RuntimeException类以外的异常类。
			1.必须要声明抛出异常类型，必须要处理异常。
*/

/*	finally 块	不能单独使用，包括 try,catch都不能单独使用。
		1.格式 ：try{可能发生异常代码}catch(捕获异常类型 变量){对捕获的异常进行处理}finally{代码}。
		2.只要有try块，finally的代码就会执行，不管try块里的代码是否发生异常或者try块里的代码没有执行完。
		3.要是try块或者catch块里有使JVM退出的代码执行到，则finally块里的代码不执行。
		4.finally里一般写 资源释放的代码 这样就算try块发生异常，也能正常释放之前占用的资源。
		5.finally和try-catch配合使用的3种格式：
			1.try{可能发生异常代码}catch(捕获异常类型 变量){对捕获的异常进行处理}		
			2.try{可能发生异常代码}catch(捕获异常类型 变量){对捕获的异常进行处理}finally{ 这里一般写 资源释放的代码  }。	//这个比较适用于要释放资源情况
			3.try{可能发生异常代码}finally{代码}。	//这种用的很少。
*/

/*	包	相当于windows里面的文件夹，是用来存放 class类文件的
		1.好处：1.可以避免同名类被覆盖。
				2.便于版本升级。
		2.格式：package 包名;	//包名全部小写字母
		3.只能有一个包名，且只能放在第一句。
		4.有包名的class 文件名为 包名.类名。也可以 包名.包名.类名 则为2个文件夹。
		5.编译方法 javac -d . 类名.java。那个点代表当前目录。
	
	导包
		1.导包语句的作用：简化书写。误区：把一个类导入到内存中。
		2.格式1：import 包名.类名;	//推荐使用这种格式，
		3.格式2；import 包名.*;	//*为通赔符，表示当前包名下的全部类。包名不能用通配符。		这个结构不清晰，不能很好的判断类属于哪个包。
		4.import 包名.* 是不会作用于包名下的子包的。
*/

/*	权限修饰符	true=能访问	false=不能访问
						public	protected	default	private
		在同一个类中	true	  true		  true	  true	  
		在同一个包中	true	  true		  true	  false
		子父类(不同包)	true	  true		  false	  false
		在不同包中		true	  false		  false	  false
*/

/*	打jar包
		1.命令格式：jar cvf jar包名.jar 要打包的包名/类.class
		2.打jar包的作用：
			1.快速运行一个项目。
			2.以jar包的形式给他人提供工具类。使用时要设置classpath路径。
		3.打完jar包后要在 META-INF里的清单文件上 指定入口类，格式：Main-Class: 包名.类名
		4.双击jar运行只对有图形化界面的程序有效。
*/

/*	模版设计模式		用于处理一种事情，其中一些是固定不变的，有一些是变化的，比如：简历
		1.先写出这类事务的一种情况。
		2.抽取其中会变的部分，将其写成抽象的，使用者就是实现这个抽象的部分。
		3.用final 将模版修饰起来，以防他人修改。
*/

/*++++++++++++++++下面是需求区+++++++++++++++++++++++*/
/*	需求1：自定义异常类练习	 	
		String ip = "192.168.1.1";
		ip = null;
		try{
			check(ip);
		}catch(Exception e){
			e.printStackTrace();
			System.out.println("你的网络异常！IP地址为空！");
		}
*/

/*	需求2：自定义异常类练习 模拟去吃木桶饭，如果钱少于10块，那么就抛出一个没有带够钱人异常对象
							如果带够了就能吃上木桶饭。
		
		double money = 9.9;
		try{
			eat(money);
		}catch(NoMoney n){
			n.printStackTrace();
			System.out.println("去找朋友借点钱！");
		}
*/

/*	需求3：finally 块练习	
		
		try{
			int a = 4;
			int b = 0;
			int c = 0;
			
			c = a/b;
			System.exit(0);		//结束JVM System类就静态的，用 类名.方法名 调用。
			
		}catch (ArithmeticException e){
			e.printStackTrace();
			System.out.println("这里发生了除0异常！");
		}finally{
			System.out.println("这里是finally代码块……");
		}
*/


/*	需求4：包 导包的练习	*/

/*	需求5：模版设计模式练习			写一个模版程序用来计算其它的程序的运行时间(程序结束时间-程序开始时间)
		1.先写出这类事务的一种情况。
		2.抽取其中会变的部分，将其写成抽象的，使用者就是实现这个抽象的部分。
		3.用final 将模版修饰起来，以防他人修改。
*/		
		Day11 d = new Day11();
		d.programRuntime();
	
		System.out.println("---------------------------------------------------\n");	
	}

/*++++++++++++++++下面是函数区+++++++++++++++++++++++*/
/*	需求1-->自定义异常类练习	
		public static void check(String ip) throws Exception{
			if (ip == null){
				throw new NoIpException("你的Ip地址为空！");
			}
			System.out.println("你的网络正常！");
		}
*/

/*	需求2：自定义异常类练习 模拟去吃木桶饭，如果钱少于10块，那么就抛出一个没有带够钱人异常对象
							如果带够了就能吃上木桶饭。

		public static void eat(double money) throws NoMoney{
			if (money < 10.0){
				throw new NoMoney("钱不够啦！");
			}else{
				System.out.println("钱够的，老板来一份木桶饭！");
			}
		}
*/

/*	需求5：模版设计模式练习	*/
		public void code(){
			for (int i = 0; i < 999; i++){
				System.out.println("i = " + i);
			}
		}
}

/*++++++++++++++++下面是 类 区+++++++++++++++++++++++*/
/*	需求1-->自定义异常类练习	
class NoIpException extends Exception{
	public NoIpException(String message){
		super(message);
	}
}
*/

/*	需求2：自定义异常类练习 模拟去吃木桶饭，如果钱少于10块，那么就抛出一个没有带够钱人异常对象
							如果带够了就能吃上木桶饭。

//自定义 钱不够的异常类
class NoMoney extends Exception{
	public NoMoney(String message){
		super(message);
	}
}
*/

/*	需求5：模版设计模式练习			写一个模版程序用来计算其它的程序的运行时间(程序结束时间-程序开始时间)	*/
abstract class ProgramRuntime{
		public void programRuntime(){
			long startTime = System.currentTimeMillis();		//程序开始的时间

			code();

			long endTime = System.currentTimeMillis();		//程序结束的时间
			System.out.println("程序运行所用时间："+(endTime-startTime));
		}
		
		public abstract void code();
}		