class Day2 {
	public static void main(String[] args) {
		/*	练习8钟基本数据类型	*/

		//第一种	byte    型  8个字节
		byte age = 120;
		//第二种	short   型  16个字节
		short myMoney = 3500;
		//第三种	int	    型  32个字节
		int bossMoney = 15000000;
		//第四种	long    型  64个字节	*末尾要加L标记
		long allMoney = 100000000000L;
					//9223372036854775808
		//第五种	float   型  32个字节	*末尾要加f标记
		float pi = 3.14f;
		//第六种	double  型  64个字节
		double pi1 = 3.141592654;
		/*
			第七种	boolean 型  1个字节或者4个字节
			申明基本数据类型变量时为4个字节 比如：boolean result = true;
			申明数组类型变量时，数组中的每个元素为1个字节 
		*/
		boolean result = true;
		//第八种	char	型  2个字节
		char letter = 'a';

		System.out.println(age);
		System.out.println(myMoney);
		System.out.println(bossMoney);
		System.out.println(allMoney);
		System.out.println(pi);
		System.out.println(pi1);
		System.out.println(result);
		System.out.println(letter);
		System.out.println("Done!");
	}
}
