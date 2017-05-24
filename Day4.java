import java.util.Scanner;

class Day4 
{
	public static void main(String[] args)
	{
		//System.out.println("------------------------------------------\n");
		/*	流程控制语句练习	2016-7-21	*/	


/*------------------------------------------------------------------------------------------------
		/*	break continue 关键字练习	

			break  可用于 switch 和循环语句内，用于中断当前循环
				注意：1.多重循环时要注意break在属于哪个循环
					  2.也可以用  break 标号; 的形式 跳转去结束其它循环 就相当于 C 语言里的goto 
			
			continue 只能用于循环语句中，作用是跳过当前循环中的一次循环 
				注意：1.continue 不能写在循环体内的第一句 因为这样写循环体内的其它语句都不会执行，属于废话语句，系统会报错.
		
			switch (2){
			case 1:System.out.print("1 ");break;
			case 2:System.out.print("2 ");break;
			case 3:System.out.print("3 ");break;
			
			}

			for (int i = 1; i <= 9; ++i){
				for (int j = 1; j <= i; ++j){
					System.out.print(j + "*" + i + "=" + i*j + "\t");
					break;						//停止当前的for循环，退到外层的for循环  会输出9次
				}
				System.out.println("");
			}
		
			
			outer:for (int i = 0; i < 2; ++i){
				innner:for (int j = 0; j < 3; ++j){
					System.out.println("你好吗?");
					break outer;			//利用标号 会跳出去结束外面的循环(里面的循环也会结束)，只会输出1次;
				}
			}
		
			
			outer:for (int i = 0; i < 2; ++i){
				innner:for (int j = 0; j < 3; ++j) {
					//continue;					//错误的，不能放在循环体的第一句
					//System.out.println("你好吗?");
					//continue;					//可以这样写d在循环体末尾但是无意义

					if (i == 0){
						continue;			// 当 i = 0 时跳过本次循环 会输出 3次( j = 3 )
					}
					System.out.println("你好吗?" + i + j);
				}
			}
		
		
			outer:for (int i = 0; i < 2; ++i) {
				innner:for (int j = 0; j < 3; ++j) {
					if (i == 0){
						continue outer;			// 当 i = 0 时跳过外层循环 会输出 3次( j = 3 )
					}
					System.out.println("你好吗?" + i + j);
				}
			}


			
			outer:for (int i = 0; i < 2; ++i){
				innner:for (int j = 0; j < 3; ++j){
					System.out.println("你好吗?" + i + j);
					continue outer;			// 利用标号会 跳到外层循环 会输出 2次( i = 2 )
				}
			}
	*/



/*---------------------------------------------------------------------------------------------------------------*/

	/*	for() 循环
			格式：for (初始化语句A; 判断表达式D; 循环后执行的语句C){
					循环体语句B;
				  }
			for循环执行语句流程：A->	 D->B->C->	 D->B->C	->D->B->C......
			
		注意：    1.初始化语句A 只执行1次.
			  2.判断表达式D 不成立时退出循环，执行for语句后的代码.
			  3.for关键字之后的小括号后加分号则循环体语句为空语句.
			  4.这样写为死循环	for( ; ; ){循环体语句;}.



		需求1：用for循环写1个5行5列的 *型 矩阵	 
		System.out.println("用for循环写1个5行5列的 *型 矩阵\r\n");
			for (int i = 0; i < 5; ++i ){
				for (int j = 0; j<5; ++j){
					System.out.print("* ");
				}
				System.out.print("\n");
			}

	}
*/	

/*-------------------------------------------------------------------------------------------------------------------------------*/
	/*	while/do while 循环  
	 
			格式：
			while (循环的条件表达式){ //当表达式为 true 则执行循环体里的语句，表达式为 false 则跳出循环
				循环体;
			}	
			
			do{
				循环体;
			}while(循环的条件表达式)	//先执行一次循环体，再判断循环的条件表达式，
									     当表达式为 true 则执行循环体里的语句，表达式为 false 则跳出循环

		注意：    1.do-while会先执行一次循环体语句.
			  2.表达式一般用 变量 ，因为用常量容易造成死循环.
			  3.大括号可以省略，省略后 while 控制其后的第1条语句，但是不建议这么做 .
			  4.不要在表达式后写分号.
			  5.不能写成这样 while(false){}		这样循环体里的语句不会执行，属于废话语句，系统会报错！
	*/	

/*	           需求3：计算1-100之间，7的倍数的总和.	
		// 7 14 21 28 35 42 49 56 63 70 77 84 91 98
				
			 int num = 1;	
			 int sum = 0;			//sum用于存放7的倍数的总和
			 while (num <= 100) {
				 if((num % 7) == 0) {	//num取模于7为0,则num为7的倍数
					sum += num;
				 }
				 num++;
			 }
			 System.out.println("计算1-100之间，7的倍数的总和: " + sum);	
*/

/*	需求4：实现猜数字游戏，如果没有猜对则可以继续猜，直到猜对了就停止。	
			产生1个随机数的步骤
			1.创建随机数对象
			2.调用随机数对象的 nextInt 方法生成随机数存入 变量 中
			3.导入包

	
			//创建随机数对象
			Random random = new Random();
			int num = random.nextInt(101);			//	传入 101 到random.nextInt 中就会生成0-100之间的随机数
			System.out.println("系统已为你摇好骰子：");
			//System.out.println(num);
			
			//int gui = 1;	
			int flag = 1;
			
			//创建扫描器对象
			Scanner scanner = new Scanner(System.in);

			while (flag<=10){
				System.out.println("\n-----------------------------\n请输入你要猜的数字：");
				int letter = scanner.nextInt();

				if (letter == num){
					flag = 11;
					System.out.println("\n恭喜你！猜对了，奖励充气娃娃1个！\n");

				}else if (letter > num){
					System.out.println("\n很遗憾！猜大了，在猜1次！");
					System.out.println("你已经猜了" + flag + "次了，还剩" + (10-flag) + "次机会");
					flag += 1;
					if (flag>=10){
						System.out.println("你的机会已用完，系统自动退出！\n");
					}

				}else {
					System.out.println("\n很遗憾！猜小了，在猜1次！");
					System.out.println("你已经猜了" + flag + "次了，还剩" + (10-flag) + "次机会");
					flag += 1;
					if (flag>=10){
						System.out.println("\n你的机会已用完，系统自动退出！\n");
					}
				}
			}




/*----------------------------------------------------------------------------------------------------------------*/
/*		switch 选择判断语句
			格式：
			switch (变量){
				case 1:
					语句1；
					break;
				case 2:
					语句2；
					break;
				case 3:
					语句3；
					break;
				……
				default:
					语句;
					break
			}

	注意：    1.变量处只能是 byte char short int string(java 7.0) 这5种数据类型.
		  2.switch进入对应的 case 并执行完语句后会一直向下执行代码，直到遇到 break 或者 switch的大括号 才会停止.
		  3.case 后面只能接常量，不能接变量.
		  4.无论case 和 default 选项的顺序如何，总是先执行case ，没有对应的case 才去执行 default 语句.
		  5.switch 语句和 if-(else if)-else类似.

		*/
		
		
		
/*	需求1：将数字1-7转换成对应的中文星期显示  例如：1-星期一	2-星期二	
			int num = 6;	
			switch (num){
			case 1:
				System.out.println(num+"-星期一");
				break;
			case 2:
				System.out.println(num+"-星期二");
				break;
			case 3:
				System.out.println(num+"-星期三");
				break;
			case 4:
				System.out.println(num+"-星期四");
				break;
			case 5:
				System.out.println(num+"-星期五");
				break;
			case 6:
				System.out.println(num+"-星期六");
				break;
			case 7:
				System.out.println(num+"-星期七");
				break;
			default:
				System.out.println("请输入正确的数字(1-7)！");
				break;
			}
*/			
			
			
/*	需求2：输入任意1个月份，将显示出对应的季节  比如   12 - 现在是"冬季"		
		Scanner scanner = new Scanner(System.in); //创建扫描对象
		System.out.println("请输入月份:");
		int month = scanner.nextInt();	//调用 扫描器的nextInt方法扫描终端控制台，扫描结果存入变量 month 中
		
		//用switch判断，将月份与季节对应起来并输出
		switch (month){
		case 2:case 3:case 4:
			System.out.println(month + "月" + " 现在是春季");
			break;
		case 5:case 6:case 7:
			System.out.println(month + "月" + " 现在是夏季");
			break;
		case 8:case 9:case 10:
			System.out.println(month + "月" + " 现在是秋季");
			break;
		case 11:case 12:case 1:
			System.out.println(month + "月" + " 现在是冬季");
			break;		
		default:
			System.out.println("请输入正确的月份(1-12)!");
		}
	
*/









/*-------------------------------------------------------------------------------------------------------------------------------------*/
	/*if 判断语句
			格式1：  适用需要1种判断的情况
				if (判断表达式A){
					上面的表达式A成立，则执行这里的语句;
				}
			
			格式2：  适用需要2种判断的情况
				if (判断表达式B){
					上面的表达式B成立，则执行这里的语句;
				}else{
					上面的表达式B不成立，则执行这里的语句;
				}

			格式3：  适用需要多种判断的情况
				if (判断表达式1){
					上面的表达式1成立，则执行这里的语句;

				}else if(判断表达式2){
					上面的表达式2成立，则执行这里的语句;
				
				}else if(判断表达式3){
					上面的表达式3成立，则执行这里的语句;

				}else{
					上面的表达式都不成立，则执行这里的语句;
				}
			
		注意：    1.不要在表达式后面加分号
			  2.if后面只有一条语句时可以省略大括号，但是不建议这么做，因为结构不清晰

	*/
			
/*	需求1：招有2年及2年以上工作经验的人
		
	int workAge = 2;

	if (workAge>=2){
		System.out.println("你符合我们的招聘条件，请明天过来面试！");
	}
*/		
/*	需求2：判断成绩是否及格		注：60分及60分以上都是及格

	int score = 59;		//分数

	if (score >= 60){
		System.out.println(score + "分" + " 恭喜你，及格了！");
	}else{
		System.out.println(score + "分" + " 不及格，别灰心，下次加油！");
	}
*/
		
/*	需求3：输入一个分数判断成绩是否及格,并评出ABCDE等级.   注：100分制，60分及60分以上都是及格,及格后每10分一个等级,E级为不及格.
	JAVA 接收键盘输入的写法：1.导入import java.util.Scanner包
						1.创建扫描对象
						2.调用对象里的 nextInt方法

		Scanner scanner = new Scanner(System.in);	//创建扫描对象，用于接收控制台输入
		System.out.println("\n请输入你的分数：");		//提示用户输入分数
		int score = scanner.nextInt();				//调用扫描器的nextInt()方法接收用户输入的分数
		
		//用多个 if()-else if() 判断输入的分数属于哪个等级
		if (score>100 || score<0){
			System.out.println("你输入的分数不正确，请重新输入！");
		}else if (score >= 90){
			System.out.println(" 恭喜你，你得了A级！");
		}else if (score >= 80){
			System.out.println(" 恭喜你，你得了B级！");
		}else if (score >= 70){
			System.out.println(" 恭喜你，你得了C级！");
		}else if (score >= 60){
			System.out.println(" 恭喜你，你得了D级！");
		}else{
			System.out.println(" 你得了E级,不及格，别灰心，下次加油！");
		}
*/





/*----------------------------------------------------------------------------------------------------------------------------*/
		/*	函数 
				格式： 修饰符 返回值类型 函数名(形式参数){
							函数体
					   }

				特点：1.函数需要调用才能执行,主函数(main)由JVM调用,不需要手动调用。
					  2.返回值类型可以是 void (空)。
					  3.函数命名规范同变量名。
					  4.如果一个函数在运行的时候 ，存在的数据是要调用者确定的，就应该定义形式参数 了。
				
				如何定义一个函数：
					1.先要确定返回值类型。
					2.是否存在未知的参数(是否要形参)

			//	add (3,3);			//	调用 函数 计算3加3,只在屏幕上显示结果
		
	需求1：定义1个函数比较2个int类型数的大小，把大的数返回给调用处
*/	
			int num = 0;
			num = getMax (135,4646);	//	135, 4646 这两个是实际参数
			System.out.println ("大的数是:" + num);
}	
/*
	//需求2：定义1个函数 判断分数等级 ，并把等级返回给调用者
		char score = ' ';
		score = level (15);
		System.out.println ("分数等级是:" + score);
	

	//需求3：定义1个函数 定义一个乘法表，并打印在屏幕上
		
		mul (9, 9);			//9*9乘法表
		System.out.println("------------------------------------");
		mul (3, 3);			//3*3乘法表


		int sum = add (1, 4, 3, 4);
		System.out.println("相加的结果是：" + sum);

	}
*/	
	/*	2个数相加 只在屏幕上显示结果

	public static void add (int a, int b){
			int sum1 = a + b;
			System.out.println("结果是:" + sum1);
	}
	*/
	
/*	需求1：比较2个int类型数的大小，把大的数返回给调用处。*/

	public static int getMax (int a, int b) {
		if (a>b){
			return a;
		}else {
			return b;
		}

	/*
			//需求2：定义1个函数 判断分数等级 ，并把等级返回给调用者
	public static char level (int a){
		char levels = ' ';
		if (a>100 || a<0){
			System.out.println("你的分数异常！");
		}else if (a >= 90){
			levels = 'A';
		}else if (a >= 80){
			levels = 'B';
		}else if (a >= 70){
			levels = 'C';
		}else if (a >= 60){
			levels = 'D';
		}else{
			levels = 'E';
		}
		return levels;
		
	}
	
	*/

/*
			//需求3：定义1个函数 定义一个乘法表，并打印在屏幕上(无返回值)						
	public static void mul (int a, int b){
		for (int i = 0; i<=a; ++i){
			for (int j = 0; j<=b; ++j){
				System.out.print(j + "*" + i + "=" + i*j + "\t");
			}
			System.out.println();
		}

	}																			
*/
	}
		
	//	函数的重载 
	public static int add (int a, int b){
		int sum = 0;
		sum = a + b;
		return sum;
	}
	
	public static int add (int a, int b, int c){
		int sum = 0;
		sum = a + b + c;
		return sum;
	}

	public static int add (int a, int b, int c,int d){
		int sum = 0;
		sum = a + b + c + d;
		return sum;
	}

	public static int add (int a, int b, int c, int d, int e){
		int sum = 0;
		sum = a + b + c + d + e;
		return sum;
	}

}