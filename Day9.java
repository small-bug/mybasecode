class Day9{
	public static void main (String[] args){
		System.out.println("---------------------------------------------------\n");
/*++++++++++++++++�����Ǹ�����+++++++++++++++++++++++*/
/*	final�ؼ���
		1.final���λ������ͱ���ʱ���ñ������ܱ��޸ġ�
		2.final�����������ͱ���ʱ���ñ���������ָ����������
		3.final���η���(����)���÷�����������д��
		4.final������ʱ�����಻�ܱ��̳С�
		5.һ�����Գ�Ա����(��������) �� public static final ���� ����: public static final double PI = 3.141562954.
*/	

/*	������->�ؼ��� abstract
		1.���������һ������ʱ��������ȷʵ������ĳ����Ϊ��������ΪĿǰ������ʱ�����ǿ��Գ�ȡ������Ϊ������
				����ȥʵ�ָ�����Ϊ(����û�к�����)�����ֳ�ȡ��Ϊ��������Ϊ���ǳ�Ϊ�������Ϊ����Ҫʹ�ó����ࡣ
		2.���һ������û�з����壬����Ҫ�� abstract ���� ʹ���Ϊ���󷽷����Ų��ᱨ��
		3.���һ�����г����˳��󷽷������������� abstract ���Σ�ʹ���Ϊ�����ࡣ
		4.���һ���ǳ�����̳��˳����࣬�����Ҫ�ѳ���������г��󷽷�ʵ�֡�
		5.�������п��Դ��� ���󷽷��ͷǳ��󷽷���Ҳ���Բ����ڳ��󷽷�ֻ���ڷǳ��󷽷���
		6.�������ǲ��ܴ�������ģ���Ϊ������������ķ��� ��һ���õ����󷽷���(���󷽷���û�з������)��
		7.�������Ǵ��ڹ��캯���ģ������������ó��������������޸ĸ��������á�
	abstract���ܺ��������δ����
		1.private ��Ϊ˽�л��󷽷����ɼ��������û��ʵ��
		2.static  ��Ϊ��̬���� ������ ����.������ �ķ�ʽ���ã�û�����壬������಻�ܴ��������ͻ��
		3.final	  ��Ϊ���ջ��󷽷��������в�����д��Ҳ��û��ʵ�֡�		
*/

/*	�ӿ�	java�ǵ��̳еģ�һ����ֻ������һ��ֱ�Ӹ��࣬�����кܶ��Ӹ��ࡣ
		1.��ʽ�� interface �ӿ���{	�ӿ��� }
		2.���ýӿڸ�ʽ��class ���� implements �ӿ���{ ���� }��
		3.�ӿ�Ҳ���࣬һ��������ࡣ(������)
		4.�ӿ��ڵĳ�Աȫ�ǳ������ڶ����ʱ������ʼ����ϵͳ���Զ����public static final ���δʡ�
		5.�ӿ��ڵķ���ȫ�ǳ��󷽷���û�з�����ģ�ϵͳ���Զ���� abstract ���Σ����нӿ�Ҳ�ǳ����ࡣ
		6.���ýӿڵ�����Ҫ�ѽӿ��ڵĳ��󷽷�ȫ��ʵ�֡�
		7.�ӿ���û�й��췽���ģ���Ϊ��Ա�ǳ���������Ҫ��ʼ����
		8.�ӿ�Ҳ���ܴ�������
		9.�ӿڵ����ã�
			1.���ڳ���Ľ��������ѧ����
			2.�ýӿ�Լ���淶��
			3.��չ���ܡ�
*/

/*	����ӿڵĹ�ϵ��ʵ�ֹ�ϵ
		1.�ǳ�����ʵ�ֽӿڣ�����ѽӿ���ķ���ȫ��ʵ�֡�
		2.������ʵ�ֽӿ�����Բ�ʵ�ֽӿ���ķ�������Ϊ�ӿ�Ҳ�ǳ����ࡣ
		3.һ�������ͬʱʵ�ֶ���ӿڣ��ӿ����ö��ŷָ���
		4.һ����ʱʵ�ֶ���ӿ�ʱ������ӿ�������������ʱ��ֻ��Ҫʵ��һ�����ɡ�
	�ӿ���ӿڵĹ�ϵ���̳й�ϵ
		1.һ���ӿڿ���ͬʱ�̳ж���ӿڣ��ӿ����ö��ŷָ���
		2.���м̳й�ϵ�Ľӿ��У�һ����ʵ���ӽӿ�ʱ����Ѹ��ӿ��еķ���Ҳȫ��ʵ�֡�
*/	
	
/*	��̬	
		1.���һ��������ж�����̬��
				רҵ˵����������������ͱ���ָ������Ķ��󣬸��ӿڵ��������ͱ���ָ���ӽӿ�(�ӿ�ʵ����)�Ķ��� ��
		2.��̬һ�����ڼ̳л���ʵ�ֹ�ϵ�½��еġ�
		3.��̬����£��Ӹ������ͬ����Աʱ������ͬ���Ǿ�̬�ķ����Ƿ��������⣬����������ʵĶ��Ǹ���ĳ�Ա��
		4.��̬����²��ܷ����������еĳ�Ա(Ҳ���������и���û�еĳ�Ա);(������ǿ��ת�������������еĳ�Ա)
		5.��̬�����ã�
			1.�����β�����ʱ���Դ��ݸ�����������ݡ�
			2.��������ֵ����ʱ���Է��ظ�����������ݡ�
			3.����˴������չ�ԣ����˴��롣
	������С֪ʶ��
		1.���뿴������һ������
			Ҳ�����ڱ���ʱ������ߵ��������ͱ�����������������ûָ���ĳ�Ա��û�оͱ���


*/


/*++++++++++++++++������������+++++++++++++++++++++++*/
/*	����1��	final�ؼ�����ϰ
		final Final f = new Final();
		f.myMessage();
		//f.age = 23;		//���� Day9.java:25: ����: �޷�Ϊ���ձ���age����ֵ	�������ܱ��޸�
		//f.name = "����";	//���� Day9.java:26: ����: �޷�Ϊ���ձ���name����ֵ	�������ܱ��޸�
		//f = new Final();  //���� Day9.java:27: ����: �޷�Ϊ���ձ���f����ֵ	����������ָ����������
*/

/*	����2��	��������ϰ	
		Dog d = new Dog("����");
		d.move();
		Fish f = new Fish("����");
		f.move();
		//Animal a = new Animal("Ұ��");	//���� ����: Animal�ǳ����; �޷�ʵ����		�������ǲ��ܴ��������
*/

/*	����3��	����ͼ�Σ�Բ�Σ����������࣬��������ͼ�ζ���߱�����������ܳ�����Ϊ��	
		Circle c = new Circle("Բ", 4.0);
		c.area();
		c.perimeter();
		Squareness s = new Squareness("����", 4.0, 5.0);
		s.area();
		s.perimeter();
*/

/*	����4��	�ӿڵ���ϰ 
		//new Interface ();	//���� ����: Interface�ǳ����; �޷�ʵ����	�ӿ�Ҳ���ܴ�������
		WritePencil w = new WritePencil();
		w.write();
		w.eraser();
		//��չת�ʵ�����
		w.knife();
		w.color();
		Text.text();
*/

/*	����5: ��̬����ϰ дһ���������Խ����������͵�ͼ�ζ��󣬲��Ҵ�ӡ�����ǵ�������ܳ���
		String jack = "�ܿ� ��";
		Penson pensonGender = new Man();
		//pensonGender.man();		//�������ܷ����������еĳ�Ա
		pensonGender.man();
		pensonGender.man1();

		Circle c = new Circle(7.3);
		Rect r = new Rect(5.1, 787.4);
		myShape(c);
		myShape(r);
	
	    //дһ���������Է����������͵�ͼ�ζ��󣬲��Ҵ�ӡ�����ǵ�������ܳ���
		MyShape m = back(0);	// m = new Circle(54.4) ���� m = new Rect(45.5, 496.5)
		m.area();
		m.perimeter();
*/
		System.out.println("---------------------------------------------------\n");
	}




/*++++++++++++++++�����Ǻ�����+++++++++++++++++++++++*/
/*	����5: ��̬����ϰ дһ���������Խ����������͵�ͼ�ζ��󣬲��Ҵ�ӡ�����ǵ�������ܳ���
		public static void myShape(MyShape s){	//MyShape s = new Circle(7.3)������������ͱ���ָ������Ķ���
			s.area();			//���
			s.perimeter();		//�ܳ�
		}
		дһ���������Է����������͵�ͼ�ζ��󣬲��Ҵ�ӡ�����ǵ�������ܳ���
		public static MyShape back(int i){
			if (i == 0){
				return new Circle(54.4);
			}else{
				return new Rect(45.5, 496.5);
			}
		}
*/

}




/*++++++++++++++++������ �� ��+++++++++++++++++++++++*/
/*	����1-> final ��ϰ
final class Final{
	//����
	final int age = 12;
	final String name = "����";

	//���췽��
	public Final(){}

	public final void myMessage(){
		System.out.println("�ҵ����֣�"+name);
		System.out.println("�ҵ����䣺"+age);
	}
}
class FinalSon extends Final{	//����  ����: �޷�������Final���м̳�	���಻�ܱ��̳�
	//����
	int age = 11;
	String name = "����";

	//���췽��
	public FinalSon(){}

	public void myMessage(){		//���� ����: FinalSon�е�myMessage()�޷�����Final�е�myMessage() ������������д
		System.out.println("�ҵ����֣�"+name);
		System.out.println("�ҵ����䣺"+age);
		System.out.println("�ҵ����䣺"+age);
	}
	
}
*/

/*	����2-> ������ ��ϰ	
abstract class Animal{				//�����г��󷽷�����ҲҪ��������
	//����
	String name;

	//���캯��
	public Animal(String name){
		this.name = name;
	}

	//������Ϊ
	public abstract void move();		//ÿ�ֶ����ƶ���Ϊ�����壬��������
}
class Dog extends Animal{

	public Dog(String name){
		super(name);	//�̳и�������
	}
	
	public void move(){		//һ���ǳ�����̳��˳����࣬�����Ҫ�ѳ���������г��󷽷�ʵ�֡�
		System.out.println(name+" �����ŷɿ���������ˣ�");
	}
}
class Fish extends Animal{

	public Fish(String name){
		super(name);
	}

	public void move(){		//һ���ǳ�����̳��˳����࣬�����Ҫ�ѳ���������г��󷽷�ʵ�֡�
		System.out.println(name+" ˦��β�������ˣ�");
	}
}
*/

/*	����3-> ����ͼ�Σ�Բ�Σ����������࣬��������ͼ�ζ���߱�����������ܳ�����Ϊ��	
//ͼ����
abstract class Drawing{
	//����
	String name;

	//���췽�� (����)
	public Drawing(String name){
		this.name = name;
	}

	//�������
	public abstract void area();	//��������
	//�����ܳ�
	public abstract void perimeter();	//��������
}
//Բ��
class Circle extends Drawing{
	//����
	public static final double PI = 3.141592654;
	double r;

	//���췽��
	public Circle(String name, double r){
		super(name);
		this.r = r;
	}

	//�������
	public void area(){
		System.out.println(name+"������ǣ�"+(r*r*PI));	
	}
	//�����ܳ�
	public void perimeter(){
		System.out.println(name+"���ܳ��ǣ�"+(2*PI*r));
	}
}
//������
class Squareness extends Drawing{
	//����
	double width;
	double height;

	//���췽��
	public Squareness(String name, double width, double height){
		super(name);
		this.width = width;
		this.height = height;
	}

	//�������
	public void area(){
		System.out.println(name+"������ǣ�"+(width*height));
	}
	//�����ܳ�
	public void perimeter(){
		System.out.println(name+"���ܳ��ǣ�"+(2*(width+height)));
	}
}
*/

/*	����4��	�ӿڵ���ϰ 
//����һ���ӿ���
interface Interface0{
	//��Ƥ��
	public void eraser();
}
interface Interface1{
	//��չת�ʵ�����
	public void knife();
}
interface Interface2 extends Interface1,Interface0{	//�ӿ�2�̳нӿ�1�ͽӿ�0 ͬʱ�̳ж���ӿ�
	public void color();	//��ɫ����
}
//��ͨǦ����
class Pencil{
	public void write(){
		System.out.println("Ǧ��ɳɳɳ��д����");
	}
}
//��д�ܲ���Ǧ����
class WritePencil extends Pencil implements Interface2,Interface0{	//һ����ͬʱʵ�ֶ���ӿ�    һ����ʱʵ�ֶ���ӿ�ʱ������ӿ�������������ʱ��ֻ��Ҫʵ��һ�����ɡ�
	public void eraser(){
		System.out.println("��Ƥ��৵Ĳ�����");
	}
	//��չת�ʵ�����
	public void knife(){
		System.out.println("ת�ʵ������͵�ת����");
	}
	public void color(){
		System.out.println("������ɫд�֡���");
	}
}
//������
abstract class Text implements Interface2{
	public static void text(){
		System.out.println("���ǳ�����ķ����������ԣ��Ҳ�ʵ�ֽӿ���ķ��������ڳ������У����ܴ���������ã�����������ֱ�ӵ��õġ���");
	}
}
*/

/*	����5-> ��̬����ϰ	
class Penson{
	public void penson(){
		System.out.println("�����ˡ���");
	}
	public void man(){
		System.out.println("���Ǹ����е��еġ���");
	}
	public static void man1(){
		System.out.println("���Ǹ������еľ�̬���еġ���");	//��̬����£��Ӹ������ͬ����Աʱ������ͬ���Ǿ�̬�ķ����Ƿ��������⣬����������ʵĶ��Ǹ���ĳ�Ա��
	}
}
class Man extends Penson{
	public void man(){
		System.out.println("���������еķǾ�̬���еġ���");	//��̬����£��Ӹ������ͬ����Աʱ������ͬ���Ǿ�̬�ķ����Ƿ��������⣬����������ʵĶ��Ǹ���ĳ�Ա��
	}
	public static void man1(){
		System.out.println("���������еľ�̬���еġ���");
	}
}
class Woman extends Penson{
	public void woman(){
		System.out.println("����Ů�ġ���");
	}
}
*/
/*	����5-> ��̬��Ӧ����ϰ	
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
		System.out.println("Բ������ǣ�"+r*r*PI);
	}
	public void perimeter(){
		System.out.println("Բ���ܳ��ǣ�"+2*r*PI);
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
		System.out.println("���ε�����ǣ�" + width*height);
	}
	public void perimeter(){
		System.out.println("���ε��ܳ��ǣ�" + 2*(width+height));
	}
	
}
*/