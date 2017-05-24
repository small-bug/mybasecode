class Day3 
{
	public static void main(String[] args) 
	{
		/*	各种运算符练习	*/
/*-------------------------------------------------		*/		
	/*	算术运算符 + - * / % ++ --	*/
		int one = 3;
		int two = 10;
		int three = 0;
	
		three = two/one;			//	int/int = int
		double four = 10.0/3;		//	double/int double
		int five = two%one;
		double six= two%one;

		int i = 0, b = 0, c = 0;
		//b = ++i;	// b = 1	先运算，后使用(赋值)
		c = i++;	// c = 0,	先使用(赋值)，后运算
		/*
			b = i++运算的过程
			1.JVM自动定义1个临时变量temp, 使得 temp = i;
			2.运算 i++ ,i = 1;
			3.return temp ( 返回temp的值赋给c )
		*/
		
		System.out.println(three);
		System.out.println(four);
		System.out.println(five);
		System.out.println(six);
		System.out.println(b+c);

		/*	取模运算结果的正负取决于被除数	*/
		System.out.println("10取模3 = "+10%3);
		System.out.println("10取模-3 = "+(10%-3));
		System.out.println("-10取模3 = "+(-10%3));
		System.out.println("-10取模-3 = "+(-10%-3));
/*-------------------------------------------------		*/
		/*	比较运算 == != > < >= <=	*/
		//	比较运算返回的是booolean值
		System.out.println(10 == 10);	//true
		System.out.println(10 != 10);	//false
		System.out.println(10 > 10);	//false
		System.out.println(10 < 10);	//false
		System.out.println(10 >= 10);	//true
		System.out.println(10 <= 10);	//true
/*-------------------------------------------------		*/
		/*		逻辑运算符	& | ^(异或) ！ &&(短路与/双与) ||(短路或/双或)	*/
		//		逻辑运算返回的是booolean值
		System.out.println(10<3 & 45>5);	//false	与运算
		System.out.println(10<3 | 45>5);	//true	或运算
		System.out.println(10<3 ^ 45>5);	//true	异或运算
		System.out.println(10<3 && 45>5);	//false	短路与 左边的表达式能确定结果的话，就不会再运算右边的表达式
		System.out.println(10<3 || 45>5);	//true	短路或 左边的表达式能确定结果的话，就不会再运算右边的表达式
		System.out.println(!(10<3));		//true	非运算
/*-------------------------------------------------		*/
		
		/*		位运算符	& | ^(异或) ~(取反)			*/
		//		位运算符两边的操作数是进行2进制位操作
		System.out.println(6&3);	//结果 2		按位与
		System.out.println(6|3);	//结果 7		按位或
		System.out.println(6^3);	//结果 5		按位异或
		System.out.println(6^3^3);	//结果 6		按位异或 (一个操作数连续异或同1个数2次，则还是原来的值，可应用于文件加密)
									//				也可以用异或交换2个变量的内容
									//				交换2个变量的
		System.out.println(~6);		//结果 -7		按位取反
/*-------------------------------------------------		*/		
		/*	各运算符的优先级	*/
		System.out.println(3*7+5/5-5%6);	//结果17	

/*-------------------------------------------------		*/
		//	三元运算符		
		//	格式：表达式?值1:值2		
		System.out.println(10>3?"是的，10大于3":"不是的，10不小于3");
		//注意：三元运算必须返回1个值


		
		
		/*	数据类型转换练习	*/
		/*
		byte b = 123;
		short s = b;
		int i = s;
		long l = i;
		
		byte b1 = 2;
		byte b11 = 3;
		b1 = (byte)(b1 + b11);

		short b2 = 33;
		short b22 = 44;
		b2 = (short)(b2 + b22);

		//char b3 = 'a';
		char b33 = 'a' + 1;
		int b44 = 1 + 'a';

		System.out.println(l);
		System.out.println(b1);
		System.out.println(b2);
		System.out.println(b33);
		System.out.println(b44);
		*/
	}
}
