import java.util.*;
class Day6{
	public static void main(String[] args) {
		System.out.println("---------------------------------------------------\n");
/*	������ʵ����Ψһ��ʵ�� (һ�нԶ���);
	�ࣺ  �����������Ի�����Ϊ��һ������(����);
		�Զ������3�����裺
			1.�Զ����ࡣ
				class car{	//��
					//	����Ĺ�������ʹ�� ��Ա���� ����;
					String name;	// 
					String color;
					int wheel;
				
					//	����Ĺ�����Ϊʹ�� ���� ����;
					public run (){	//	����
						System.out.println("����������");
					}
				}
			2.��(����)���ﴴ������
				new ����();		//	new car();	

			3.��������Ķ��󡢷��������ԡ�
				car myCar = new car();	//	����car�����
				myCar.name = "����";		//	����
				myCar.color = "��ɫ";		//	����
				myCar.wheel = 4;			//	����
				
				myCar.run ();				//	���ú���
*/	

/*	�Զ�����
		Car myCar = new Car();
		myCar.name = "Z11";
		//System.out.println(myCar.name);
		myCar.color = "��ɫ";
		//System.out.println(myCar.color);
		myCar.brand = "����";
		//System.out.println(myCar.brand);
		myCar.wheel = 4;
		//System.out.println(myCar.wheel);
		System.out.println("�ҵĳ���һ��"+myCar.color+"��"+myCar.brand+myCar.name+",����"+myCar.wheel+"�����ӣ�");
		
		myCar.run ();
		*/

/*	�ֲ������ͳ�Ա����
		����λ�ã�	1.�ֲ������ڷ�����
					2.��Ա�����ڷ����⣬����
		���÷�Χ:	1.�ֲ������ڶ������ķ�������Ч������ֻ��Ϊ�����ṩһ������
					2.��Ա�����ڶ�������������Ч��������Ϊ���ṩһ�����ԡ�
		�������ڣ�	1.�ֲ������ڶ������������򣨷������ڵķ��������������ڵķ����ж�������λ�ã�����һ��forѭ���е�int i = 0,ִ����forѭ����i����ʧ��ִ��������ʧ�ˡ�
					2.��Ա�������Ŵ������Ķ�������ڣ�ֻ�б��������ջ����߲���ʧ��
		�Ƿ��г�ֵ��1.�ֲ����������ʱ�����û�г�ֵ����Ҫʹ�ñ��踳��ֵ��
					2.��Ա�������ø���ֵ�������Լ�Ĭ�ϵĳ�ֵ����ͬ���͵ĳ�ֵ��ͬ	int(0) long(0) float(0.0f) double(0) char(' ') boolean(false) String����������������(null)��
*/
/*	�ֲ������ͳ�Ա������ϰ	
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

/*	��������
		��ʽ��new ����();
			  new ����().����;

		ע�⣺1.����һ�㲻����������������ֵ����Ϊ������Զ�޷���ȡ������
			  2.��������������Զ��������ͬһ������
		�ô���1.����������Լ򻯳���ֻ��Ҫʹ�ö���һ��ʱ�������������󣩡�
			  2.�������������Ϊʵ����ʹ�á�
*/
/*	����������ϰ	
		//new Car().name = "����";	//	��Զ�޷����ʵ��� ����
		//System.out.println(Car().name);	//	û�������﷨ ����
		System.out.println(new Car() == new Car());		//	���������� == �űȽ�ʱ�ǱȽϵ��ڴ��ַ(����true����false)
		new Car().run();	//						1.��д�������Ծ�����ͷ��ڴ�ռ䣬�������ջ��ᾡ�����ߣ����õȵ�������ִ����Ż��գ�
	
		CarFactory carRepair = new CarFactory();
		carRepair.carRepairing(new Car());		//	2.����ʵ��
*/

/*	��װ	
		����	1.��private����Ҫ��װ�ı����������ԡ�
				2.�ṩһ�������ķ�������(set)���߻�ȡ(get)��˽�еĳ�Ա���ԡ�

		public		Ȩ�����η�(���Ʊ����Ŀɼ���Χ) ���εı������߷��������඼���Է���		������
		private		Ȩ�����η�(���Ʊ����Ŀɼ���Χ) ���εı������߷���ֻ���ڱ����н��з���	˽�е�

		 //	��վ��Ա
		Member jack = new Member();
		jack.name = "�ܿ�";
		jack.setSex("��");
		jack.age = 23;
		jack.salary = 15000;

		System.out.println("��Ա��"+jack.name+"\n�Ա�"+jack.getSex()+"\n���䣺"+jack.age+"\n��н��"+jack.salary);
*/		

/* 
����2��ʹ��JAVA������һ���������࣬�������߱�������1,������2������� �������������ԣ����߱�����Ĺ�����Ϊ��
		Ҫ�󣺲���ֱ�ӶԲ�����1/2 �������Щ���Խ���ֱ�ӵĸ�ֵ��Ҫ��װ������

		//	���ü�����
		Calculator cal = new Calculator();

		//����4+3����ʾ
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
����1��ʹ��JAVA����һ�������޳����������
			  �����߱��Ĺ������ԣ������������֡���ɫ��
				  �߱�������Ϊ��  �ȼ�������Ƿ�����4�����������4������ôҪ�͵��޳�������
								  �޳�������֮�󣬳���������Ҫ����4����Ȼ�󳵾ͼ�����������

			  �޳������߱��������ԣ����֡���ַ���绰��
					  �߱�������Ϊ���޳���
		//	�����Ӱ�
		Car myCar = new Car();
		myCar.name = "BMW";
		myCar.color = "��ɫ";
		myCar.wheel = 1;
		myCar.run ();
		
		//	������
		Car myCar = new Car();
		myCar.name = "�µ�";
		myCar.color = "��ɫ";
		myCar.wheel = 4;
		myCar.run();

		CarFactory carRepair = new CarFactory();
		carRepair.name = "�Ҹ�����";
		carRepair.address = "����·188��";
		carRepair.phone = "16888888888";
		carRepair.carRepairing(myCar);
		myCar.run();
		*/


		System.out.println("---------------------------------------------------\n");
	}

/*		++++++++++++++++++		�����Ǻ�����	+++++++++++++++++++++++++++++++++++*/


}

/*		++++++++++++++++++		������ �� ��	+++++++++++++++++++++++++++++++++++*/
/*	��������	
class Calculator{
	double operandOne;
	double operandTwo;
	char operate;
	
	//	���ò�����
	public void setOperand(int a, int b, char str){
		operandOne = a;
		operandTwo = b;
		if (str == '+' || str == '-' || str == '*' || str == '/'){
			operate = str;
		}else {
			System.out.println("����������ʱֻ֧�� + - *  / ���������㣬������������ţ�");
		}
	}
	
	//	���㹦�ܷ���
	public void calc(){
		switch (operate){
		case '+':System.out.println(operandOne + "��" + operandTwo + "�Ľ���ǣ�" + (operandOne + operandTwo));break;
		case '-':System.out.println(operandOne + "��" + operandTwo + "�Ľ���ǣ�" + (operandOne - operandTwo));break;
		case '*':System.out.println(operandOne + "��" + operandTwo + "�Ľ���ǣ�" + (operandOne * operandTwo));break;
		case '/':System.out.println(operandOne + "��" + operandTwo + "�Ľ���ǣ�" + (operandOne / operandTwo));break;
		
		}
	}
}
*/

/*	��վ��Ա��	
class Member{
	String name;
	private String sex;		//	ֻ���ڱ����з���
	int age;
	int salary;
	
	//	�����Ա�
	public void setSex(String s){
		//	if (s == "��" || s == "Ů")	//	���� �����ǱȽϵ����ڴ��ַ 
		if (s.equals("��") || s.equals("Ů")){
			sex = s;
		}else {
			System.out.println("�������˴�����Ա�ϵͳ��Ϊ�����ΪĬ��ֵ���У�");
			sex = "��";
		}
	}

	//	��ȡ�Ա�
	public String getSex(){
		return sex;
	}

	public void chat(){
		System.out.println("���������죡");
	}
}
*/

/*	�Զ���car��
class Car{
	//	��������
	String name;	//	����(�ͺ�)
	String color;	//	��ɫ
	String brand;	//	Ʒ��
	int wheel;		//	������

	//	������Ϊ(����)
	public void run (){
		System.out.println("�������������ˣ�");
	}
}
*/

/*	����1->	��    �����Ӱ�    ��ʹ��JAVA����һ�������޳�����������(��)��	
//	����
class Car{		//	��������ĸ��д�����浥������ĸҲ��д
	//	��������(����,��ɫ,������)
	String name;
	String color;
	int wheel;
	
	//	������Ϊ(����������)
	public void run(){
		//	��⳵���Ƿ�4��
		CarFactory repairingCar = new CarFactory ();
			System.out.println("���"+name+"ֻ��"+wheel+"������");
		while (wheel != 4){
			System.out.println("�����Ӳ�����ȥ��һ�°ɣ�");
			wheel = repairingCar.carRepairing (wheel);
			System.out.println("�������"+name+"��"+wheel+"������");
		}
		System.out.println("���ɿ����������");
	}
}

class CarFactory{
	//	��������(����,��ַ,�绰)
	String name;
	String address;
	int	   phone;
	
	//	������Ϊ(������)
	public int carRepairing (int wheel){
		//	�޺�����
		System.out.println("���������С���");
		wheel = 4;
		System.out.println("������ĳ�"+"��"+wheel+"�����ӣ��޺��ˣ�");
		return wheel;
	}
}
*/
/*	����1->	��		�޳�����	��ʹ��JAVA����һ�������޳�����������(��)��	
//	����
class Car{		//	��������ĸ��д�����浥������ĸҲ��д
	//	��������(����,��ɫ,������)
	String name;
	String color;
	int wheel;
	
	//	������Ϊ(����������)
	public void run(){
		//	��⳵���Ƿ�4��
		System.out.println("���"+name+"��"+wheel+"������");
		if (wheel != 4){
			System.out.println("�����Ӳ�����ȥ��һ�°ɣ�");
		}else {
			System.out.println("���ɿ����������");
		}
	}
}

class CarFactory{
	//	��������(����,��ַ,�绰)
	String name;
	String address;
	String phone;
	
	//	������Ϊ(������)
	public Car carRepairing (Car myCar){
		//	�޺�����
		if (myCar.wheel != 4){
			myCar.wheel = 4;
			System.out.println("��ĳ��޺��ˣ����ά�޷Ѻ��ߣ�");
		}else {
			System.out.println("��ĳ��Ǻõģ����ͣ���Ѻ��ߣ�");
		}
		return myCar;
	}
}
*/
