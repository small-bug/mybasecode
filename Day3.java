class Day3 
{
	public static void main(String[] args) 
	{
		/*	�����������ϰ	*/
/*-------------------------------------------------		*/		
	/*	��������� + - * / % ++ --	*/
		int one = 3;
		int two = 10;
		int three = 0;
	
		three = two/one;			//	int/int = int
		double four = 10.0/3;		//	double/int double
		int five = two%one;
		double six= two%one;

		int i = 0, b = 0, c = 0;
		//b = ++i;	// b = 1	�����㣬��ʹ��(��ֵ)
		c = i++;	// c = 0,	��ʹ��(��ֵ)��������
		/*
			b = i++����Ĺ���
			1.JVM�Զ�����1����ʱ����temp, ʹ�� temp = i;
			2.���� i++ ,i = 1;
			3.return temp ( ����temp��ֵ����c )
		*/
		
		System.out.println(three);
		System.out.println(four);
		System.out.println(five);
		System.out.println(six);
		System.out.println(b+c);

		/*	ȡģ������������ȡ���ڱ�����	*/
		System.out.println("10ȡģ3 = "+10%3);
		System.out.println("10ȡģ-3 = "+(10%-3));
		System.out.println("-10ȡģ3 = "+(-10%3));
		System.out.println("-10ȡģ-3 = "+(-10%-3));
/*-------------------------------------------------		*/
		/*	�Ƚ����� == != > < >= <=	*/
		//	�Ƚ����㷵�ص���boooleanֵ
		System.out.println(10 == 10);	//true
		System.out.println(10 != 10);	//false
		System.out.println(10 > 10);	//false
		System.out.println(10 < 10);	//false
		System.out.println(10 >= 10);	//true
		System.out.println(10 <= 10);	//true
/*-------------------------------------------------		*/
		/*		�߼������	& | ^(���) �� &&(��·��/˫��) ||(��·��/˫��)	*/
		//		�߼����㷵�ص���boooleanֵ
		System.out.println(10<3 & 45>5);	//false	������
		System.out.println(10<3 | 45>5);	//true	������
		System.out.println(10<3 ^ 45>5);	//true	�������
		System.out.println(10<3 && 45>5);	//false	��·�� ��ߵı��ʽ��ȷ������Ļ����Ͳ����������ұߵı��ʽ
		System.out.println(10<3 || 45>5);	//true	��·�� ��ߵı��ʽ��ȷ������Ļ����Ͳ����������ұߵı��ʽ
		System.out.println(!(10<3));		//true	������
/*-------------------------------------------------		*/
		
		/*		λ�����	& | ^(���) ~(ȡ��)			*/
		//		λ��������ߵĲ������ǽ���2����λ����
		System.out.println(6&3);	//��� 2		��λ��
		System.out.println(6|3);	//��� 7		��λ��
		System.out.println(6^3);	//��� 5		��λ���
		System.out.println(6^3^3);	//��� 6		��λ��� (һ���������������ͬ1����2�Σ�����ԭ����ֵ����Ӧ�����ļ�����)
									//				Ҳ��������򽻻�2������������
									//				����2��������
		System.out.println(~6);		//��� -7		��λȡ��
/*-------------------------------------------------		*/		
		/*	������������ȼ�	*/
		System.out.println(3*7+5/5-5%6);	//���17	

/*-------------------------------------------------		*/
		//	��Ԫ�����		
		//	��ʽ�����ʽ?ֵ1:ֵ2		
		System.out.println(10>3?"�ǵģ�10����3":"���ǵģ�10��С��3");
		//ע�⣺��Ԫ������뷵��1��ֵ


		
		
		/*	��������ת����ϰ	*/
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
