class Day10 {
	public static void main(String[] args) {
		System.out.println("---------------------------------------------------\n");
/*++++++++++++++++�����Ǹ�����+++++++++++++++++++++++*/

/*	ǿ��ת��
		С��������---->����������	�Զ�ת��
		����������---->С��������	ǿ��ת��
			��ʽ��
				1.�����������ͣ�С�������� ���� = ��С�������ͣ������ݱ���	��int a = (int)(double)
				2.�����������ͣ�С�������� ���� = ��С�������ͣ������ݱ���	��Mouse a = (Mouse)(Animal)
*/

/*	�ڲ���	��������>д��һ�����ڲ�����		�ڲ����class�ļ������ⲿ��$�ڲ���.class ���������ĺô��ǣ�������������ڲ��������ĸ��ⲿ�ࡣ
		1.��Ա�ڲ���
			1.д��һ�����еĳ�Ա����λ��
			2.�ڲ���ķ��ʷ�ʽ��
				1.���ⲿ��
				�ṩһ�����������ڲ���Ķ�����з��ʡ�
				2.��������ֱ�Ӵ����ڲ���Ķ��󣬸�ʽ���ⲿ��.�ڲ��� ���� = new �ⲿ��().new �ڲ���()	���磺outer.inner a = new outer().new inner();
			3.���ⲿ�����ͬ����Աʱ�����ʵ����ڲ���ĳ�Ա�������� �ⲿ����.this.��Ա ָ�������ⲿ��ĳ�Ա��
			4.�ڲ���Ҫ���о�̬��Ա�����ڲ���ҲҪ�� static ���Ρ�
				ע�⣺����ڲ����Ǿ�̬�࣬���������ഴ���ڲ���Ķ����ʽΪ���ⲿ��.�ڲ��� ���� = new �ⲿ��.�ڲ���() ���磺outer.inner a = new outer.inner();
			5.˽�л����ڲ��಻����������ֱ�Ӵ����ڲ���Ķ���ֻ���� ��ʽ1 ���ʡ�
			6.�ڲ���ĺô�:���ⲿ�����кܶ�����ʱ���������ڲ��������з��ʡ��ڲ������ֱ�ӷ����ⲿ������г�Ա��
			
		2.�ֲ��ڲ���
			1.д���ⲿ���һ�������ڡ�
			2.ֻ�ܷ��������ڵķ����� final ���εı�������ΪJVM�Ḵ�� final ���εı����������ã���������������ڷ���ִ����Ϻ��ڡ�
			3.ֻ���������ڵķ����ڴ���������ʡ�����ִ����ϣ��������Ķ�����ʧ��

		3.�����ڲ���
			1.û���������ڲ��࣬�ͽ������ڲ��ࡣ
			2.Ҫ�м̳л���ʵ�ֹ�ϵ�����á�
			3.��ĸ�ʽ�͵�������ķ��� �� new ������/�ӿ��� (){����}.������()��
			4.�����ڲ�������������еķ����������ö�̬����������� �����еķ������ڲ������ ʱ�������������ڲ��࣬Ҫ�������ڲ��ࡣ
			5.ֻҪһ�����ǳ���Ļ���һ���ӿڣ���ô�������еķ���������ʹ�������ڲ�����ʵ�֣���õ���������ڶ��̵߳�ʵ���ϣ���ΪҪʵ�ֶ��̱߳���̳�Thread����Ǽ̳�Runnable�ӿ�
			6.����д����һ����ֻ��һ�ε�ʱ������������ڲ��ࡣ
			7.�����ڲ��಻���й��췽��,��Ϊû��������
			8.�����ڲ��಻�ܶ����κξ�̬��Ա����̬������
			9.�����ڲ��಻����public,protected,private,static��
			10.ֻ�ܴ��������ڲ����һ��ʵ����
			11.һ�������ڲ���һ������new�ĺ��棬��������ʵ��һ���ӿڻ�ʵ��һ���ࡣ
			12.�������ڲ���Ϊ�ֲ��ڲ��࣬���Ծֲ��ڲ�����������ƶ�������Ч��

/*	�쳣��ϵ	
		1.---|Throwable			Throwable ���� Java ���������д�����쳣�ĳ��ࡣ
					toString			���ش� throwable �ļ�������� ��������+��ϸ��Ϣ�ַ�����
					getMessage			���ش� throwable ����ϸ��Ϣ�ַ�����
					printStackTrace		���� throwable ����׷���������׼��������
		2.------|Error			������	������ķ�����һ���� Error��β
									
		3.------|Exception		�쳣��	�쳣��ķ�����һ���� Exception��β
					1.�����쳣
						1.��ʽ��try{ �������쳣�Ĵ��� }catch(������쳣����){ ���쳣�Ĵ��� }
						2.�쳣���������Ĵ��벻ִ�У�ֱ����ת��catch����ִ�д�����롣
						3.try-catch���Ĵ�������ִ�С�
						4.һ��try������ܷ��������ͬ���͵��쳣��
						5.try�����Ը����catch���Դ���ͬ���쳣����,�쳣������С��������д��

					2.�׳��쳣	throw ��throws �ؼ���
						1.��ʽ throw new Exception();
						2.�����ڷ����������׳��� ��ʽ ��������(�β�) throws Exception { ������ }��
						3.���������һ�� �����׳��쳣�ķ��� ����ô�����߱�����쳣���д���Ҳ���Լ����׳���
						4.���һ�������׳���һ���쳣������ô throw ����Ĵ���Ͳ�����ִ���ˣ�һ����������throw�ؼ���Ҳ������ֹͣ����
						5.��һ�������ֻ���׳�һ���쳣���͡�
						6.����������Ҫ���ڵ����׳������ͣ��׳��󲶻������Ҫ���ڵ����׳������͡�
						7.throw �� throws ������
							1.throw ���ڷ����ڲ��׳��쳣����throws���ڷ��������׳����͵ġ�
							2.throw ����ֻ�ܸ�һ���쳣����throws ����ͬʱ���������쳣���͡�


*/

/*++++++++++++++++������������+++++++++++++++++++++++*/

/*	����1��ǿ��ת����ϰ ����һ���������Խ����������͵Ķ�������ڷ����ڲ�Ҫ���ý��յ��Ķ�������еķ���
		Dog d = new Dog("����");
		special(d);
		Fish f = new Fish("����");
		special(f);
*/

/*	����2: ��Ա�ڲ�����ϰ	
		//�÷�ʽһ����
		Outer o = new Outer();
		Outer.Inner i = o.getInner();
		i.show();

		//�÷�ʽ������
		//Outer.Inner a = new Outer("С��").new Inner("Сǿ");	//���ڲ����Ǿ�̬��ʱ�����������ַ�ʽ��������
		Outer.Inner b = new Outer.Inner("С��");	//��̬��ʱ�������ַ�ʽ��������
		//a.innerShow();
		b.innerShow();
		//Outer.a.outerShow();
		Outer outer = new Outer("С��");
		outer.outerShow();
*/

/*	����3: �ֲ��ڲ�����ϰ	
		//���ʾֲ��ڲ���
		Outer o = new Outer();
		o.text();
*/

/*	����4: �����ڲ�����ϰ	
		new Person(){
			//static int a;		���� �ڲ��಻�ܶ����κξ�̬��Ա����̬������
			public void run(){
				System.out.println(name+"��");
			}
		}.run();
*/	
/*	����5: �쳣��ϰ	
		Throwable t = new Throwable("����һ��������Ϣ����");	//Throwable(String message) �����ָ����ϸ��Ϣ���� throwable��
		System.out.println("toString: " + t.toString());		//�����java.lang.Throwable ����һ��������Ϣ����
		System.out.println("getMessage: " + t.getMessage());	//���������һ��������Ϣ����
		t.printStackTrace();	//���������һ��������Ϣ����	at Day10.main(Day10.java:96)	//�쳣��96�з���
		//�����쳣
		int[] arr = null;
		div(4, 0, arr);
		//�׳��쳣
		int[] arr = null;
		try{
			div(4, 0, arr);
		}catch(Exception e){
			System.out.println("�׳��쳣�ɹ���");
		}
*/

		System.out.println("---------------------------------------------------\n");	
	}

/*++++++++++++++++�����Ǻ�����+++++++++++++++++++++++*/

/*	����1��ǿ��ת����ϰ ����һ���������Խ����������͵Ķ�������ڷ����ڲ�Ҫ���ý��յ��Ķ�������еķ���
		public static void special(Animal animal){
			if(animal instanceof Dog){
				Dog dog = (Dog)animal;		//ǿ������ת��
				dog.eat();
			}else if(animal instanceof Fish){
				Fish fish = (Fish)animal;	//ǿ������ת��
				fish.swim();				//������������г�Ա
			}
		}
*/

/*	�����쳣 try catch ��
		public static void div(int a, int b, int[] arr){
			int c = 0;
			try{
				c = a/b;
				System.out.println(arr[1]);
		
			}catch(ArithmeticException e){
				System.out.println("���﷢���� ��0 ����");
			}catch(NullPointerException n){
				System.out.println("���﷢�� ��ָ�� �쳣");
			}catch(Exception z){						//�ڵ����ͷ������
				System.out.println("����� ���쳣 ");
			}
		}
*/

/*	�׳��쳣 throw throws	
		public static void div(int a, int b, int[] arr) throws Exception {
			//int c = 0;
			//c = a/b;
			throw new NullPointerException();
			//System.out.println(arr[1]);
		}
*/


}

/*++++++++++++++++������ �� ��+++++++++++++++++++++++*/

/*	����1-> ǿ��ת����ϰ ����һ���������Խ����������͵Ķ�������ڷ����ڲ�Ҫ���ý��յ��Ķ�������еķ���
abstract class Animal{
	String name;
	public Animal(String name){
		this.name = name;
	}
}
class Dog extends Animal{
	public Dog(String name){
		super(name);
	}

	public void eat(){
		System.out.println(name+"�ڳԹ�ͷ����");
	}
}
class Fish extends Animal{
	public Fish(String name){
		super(name);
	}
	
	public void swim(){
		System.out.println(name+"��ˮ���Ρ���");
	}
}
*/

/*	����2-> �ڲ�����ϰ	
class Outer{
	String name;
	
	public Outer(String name){
		this.name = name;
	}
	//�ڲ���
	static class Inner{
		static String name;
		
		public Inner(String name){
			this.name = name;
		}
		public void innerShow(){
			System.out.println(name+"�����ڲ��࡭��");		//ͬ���� �ⲿ����.this.��Ա �����ⲿ��Ա
			System.out.println(name+"�����ڲ��࡭��");		//ͬ��ֱ�ӷ����ڲ���Ա
			//outerShow();
		}
	}
	
	//���ʷ�ʽһ���ṩһ�������ṩ�ڲ������
	public Inner getInner(){
		Inner i = new Inner("Сǿ");
		return i;
	}
	public void outerShow(){
			System.out.println(name+"�����ⲿ�࡭��");
	}

}
*/

/*	����3-> �ֲ��ڲ�����ϰ	
class Outer{
	String name = "�����ⲿ���   ��Ա����   ����";

	public void text(){
		//final String name = "�ҵ��ⲿ���    ����   ������";	//Ҫ�ھֲ��ڲ����з�������ķ����ĳ�Ա���� ��Ҫ��final ���γ����ձ�����

		//�ֲ��ڲ���
		class Inner{
			//String name = "���Ǿֲ�   �ڲ���    ������";	

			public void show(){
				System.out.println("�ҵľֲ��ڲ��࡭��" + name);
			}
		}
		//���ʾֲ��ڲ���
		Inner i = new Inner();
		i.show();
	}
}
*/

/*	����4-> �����ڲ�����ϰ	
abstract class Person{
	String name = "����";

	public abstract void run();
}
*/

