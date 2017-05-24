class Day8{
	public static void main(String[] args) {
		System.out.println("---------------------------------------------------\n");
/*++++++++++++++++�����Ǹ�����+++++++++++++++++++++++*/
/*	static�ؼ���
		Static���γ�Ա����
			1.������˵�������������γ�Ա�������߷���
			2.��static���εı�����洢�� ���ݹ����� �У���һ�����ж����е�ֵ���ı䡣
			3.���ʷ�ʽ��1. ����.����	2.����.����
			4.�Ǿ�̬����ֻ���� ����.���� �ķ�ʽ���ʣ������� ����.�����ķ�ʽ���ʡ�
			5.��ҪΪ��ʹ�� ����.���� �ķ�ʽ���ʷ����������static���γ�Ա������ֻ��������Ҫ��������ʱ���á�
		Static���η���
			1.static���εķ������� ��̬��Ա������
			2.���ʷ�ʽ��1.����.��̬��Ա������	2.����.��̬��Ա�������� �Ƽ�(�����ȴ������󣬿���ʡ�ڴ�)
			3.�Ǿ�̬�������Ե��þ�̬������ʹ�þ�̬������
			4.��̬��������(ֱ��)ʹ�÷Ǿ�̬�����ͱ��������Լ�ӷ��ʣ�ͨ������������ʣ���
			5.��̬�����ﲻ����this��super�ؼ��֡�
			6.һ������û��ֱ�ӷ��ʵ��Ǿ�̬��Ա��ʱ��Ϳ���ʹ��static�����ˣ�һ�����ڹ������͵ķ���
		�ص�:��̬�ĳ�Ա(�����ͷ���)�����������ڶ���ģ����Ǿ�̬��Ա�Ƕ��󴴽��Ŵ��ڵģ����Ծ�̬��Ա����Ҳ�����ڷǾ�̬��Ա���ݡ�

/*	�̳� super�ؼ��� ������д instanceof�ؼ���
	�̳�
		1.��ʽ��class ����1(����) extends ����2(����) {}��
		2.�����˽�л����Բ��ܼ̳С�
		3.����Ĺ��췽�����ܼ̳С�
		4.�����������ʱ����Ĺ��췽��Ҳ��ִ�С�
		5.��ҪΪ�˼��ٴ����ʹ�ü̳У�Ҫ�������м̳й�ϵ������ʹ�á�
	super�ؼ���
		1.�ڼ̳���ʹ�á�
		2.����͸����д���ͬ����Ա����ʱ����������Ĭ���Ƿ�������ĳ�Ա�����ģ���ͨ�� super.������ �ķ�ʽ���ʸ����еĳ�Ա������
		3.�����������ʱJVMĬ�ϵ��ø�����޲ι��췽��������������Ĺ��췽��ͨ�� super(�β�) �ķ�ʽָ�����ʸ����е�(�в�)���췽������super���ֻ�ܷ������๹�췽���еĵ�һ�䡣
			����Ĺ����������Լ���ʼ������һ���������ǰ�档
		5.������������ͨ�� super.������(); �ķ�ʽָ�����ʸ����е���Ϊ������
		6.super �� this ����ͬʱ��һ�����췽���е��ù��췽������Ϊ���Ƕ���Ҫ�ڵ�һ����䣬���ͻ��
		7.super��this�Ͳ�ͬ�㣺
			1.super������Ǹ���ռ�����á�
			2.this����������������ĵ����߶���
			3.superҪ���м̳й�ϵ�����в���ʹ�ã�this����Ҫ��
			4.super�ǵ��ø���Ĺ��췽������������֮��Ĳ�������this�ǵ��ñ���Ĺ��췽����һ����Ĳ�����
	������д
		0.��̬�������ܱ���д��
		1.����ķ�����д��ʽ: ���������βα���һ����
		2.���������㲻�����������ʱ�Ϳ�����д������
		3.�����Ȩ�����η�ֻ�ܴ��ڵ��ڸ���ġ�
		4.����ķ���ֵ����ֻ��С�ڵ��ڸ���ġ�
		5.������쳣�׳�ֻ��С�ڵ��ڸ���ġ�
		6.������д�ͷ������صĲ�ͬ��
			1.������д�ķ��������βα���һ��������������ֻ�跽����һ�����ɡ�
			2.������д����ֵ��Ȩ��Ҫ�󣬶����������뷵��ֵ�޹ء�
	instanceof�ؼ���
		1.��ʽ������ instanceof ����	����boolean����ֵ��
		2.���ã������ж�һ�������Ƿ�����һ���ࡣ
		3.�������еĶ����������м̳л���ʵ�ֹ�ϵ�����򱨴�
		4.
*/
		


/*++++++++++++++++������������+++++++++++++++++++++++*/
/*	����1��Static���η�����ϰ	
		Student s = new Student("С��");
		s.study();
		s.sleep();			// �ö�����þ�̬����
		Student.sleep();	// ���������þ�̬����	�Ƽ�(�����ȴ������󣬿���ʡ�ڴ�)
*/

/*	����2����дһ�����鹤����		
		int[] arr = {1,3,45,3,2,13,423,32,43,423,434,32};
		MyArrays myArr = new MyArrays();
		System.out.println(myArr.toString(arr));	// �ȱ���һ������
		myArr.sort(arr);							// ����
		System.out.println(myArr.toString(arr));	// �ڱ���һ������
*/	

/*	����3��дһ����Ա���һ������� 
		Player p1 = new Player("A��", 1);
		Player p2 = new Player("B��", 2);
		Player p3 = new Player("C��", 3);
		Team t = new Team("���", p1, p2, p3);
		t.startGame();
		System.out.println("��Ա1��"+t.p1.name);
		System.out.println("��Ա2��"+t.p2.name);
		System.out.println("��Ա3��"+t.p3.name);
		t.startGame().run();
*/

/*	����4���̳���ϰ	
		Student s = new Student("С��");
		//s.name = "С��";
		System.out.println(s.name);
		s.active();
*/

/*	����5������һ����ͨѧ�� ������ѧ�� ��ҵ��ѧ��
					��ͬ�㣺���е�ѧ���������֣�����ѧϰ��
					��ͬ�㣺��ͨ���ѧ��ѧϰ ����Ӣ��
							�������ѧ��ѧϰ javase
							��ҵ���ѧ��ѧϰ javaee+android

		Student s = new Student("С��");
		s.study();
		BaseStudent  b = new BaseStudent("С��");
		b.study();
		WorkStudent w = new WorkStudent("С��");
		w.study();

		//instanceof ���÷�
		System.out.println("b�����ǲ�������Student��: "+(b instanceof Student));
		System.out.println("b�����ǲ�������BaseStudent��: "+(b instanceof BaseStudent));
		System.out.println("s�����ǲ�������BaseStudent��: "+(s instanceof BaseStudent));
*/


		System.out.println("---------------------------------------------------\n");
	}
/*++++++++++++++++�����Ǻ�����+++++++++++++++++++++++*/

}
/*++++++++++++++++������ �� ��+++++++++++++++++++++++*/
/*	����1-> ѧ����	
class Student{
	//	����
	String name;
	static String conutry = "�й�";

	//	��������
	{}

	//	���췽��
	public Student(String name){
		this.name = name;
	}
	
	//	ѧϰ�������Ǿ�̬������
	public void study(){
		System.out.println(name+"ѧϰ����");		// �Ǿ�̬���� ���Է��� �Ǿ�̬��Ա����
		System.out.println(conutry+"ѧϰ����");	//   �Ǿ�̬���� ���Է��� ��̬��Ա����
		System.out.println(this+"ѧϰ����");		//	   �Ǿ�̬���� ����ʹ�� this
	}
	//	˯����������̬������
	public static void sleep(){
		//System.out.println(name+"˯������");	//��̬���� ��ֹ���� �Ǿ�̬��Ա����
		System.out.println(conutry+"˯������");	//  ��̬���� ���Է��� ��̬��Ա����
		//System.out.println(this+"˯������");	//	  ��̬���� ��ֹʹ�� this
	} 
}
*/

/*	����2����дһ�����鹤����	
class MyArrays{
	//	toString ����
	public String toString(int[] arr){
		String result = "";
		for (int index = 0; index < arr.length; ++index){
			if (index == 0){
				result += "["+arr[index]+",";
 			}else if (index == (arr.length-1)){
				result += arr[index]+"]";
			}else {
				result += arr[index]+",";
			}
		}
		return result;
	}

	//	sort ����(ѡ������)
	public void sort(int[] arr){
		for (int i = 0; i < arr.length-1; ++i){
			for (int j = i+1; j < arr.length; ++j){
				if (arr[i] < arr[j]){
					int temp = 0;
					temp = arr[i];
					arr[i] = arr[j];
					arr[j] = temp;
				}
			}
		}
	}
}
*/

/*	����3��дһ����Ա���һ������� 
//��Ա��
class Player{
	//����
	String name;
	int num;

	//���췽������ʼ�����ԣ�
	public Player(String name, int num){
		this.name = name;
		this.num = num;
	}

	//��������
	public void run (){
		System.out.println(name+"����");
	}
}
//�����
class Team{
	//����
	String name;
	Player p1;
	Player p2;
	Player p3;
	
	//���췽������ʼ�����ԣ�
	public Team(String name, Player p1, Player p2, Player p3){
		this.name = name;
		this.p1 = p1;
		this.p2 = p2;
		this.p3 = p3;
	}

	//��������
	public void startGame(){
		System.out.println(name+"������");
	}
}
*/

/*	����4���̳���ϰ	
//����
class Person{
	//����
	String name;
	private int age;
	
	//���췽��
	public Person(){
		System.out.println("�����е� �޲� �����������ˡ���");
	}
	public Person(String name){
		this.name = name;
		System.out.println("�����е� �в� �����������ˡ���");
	}

	//������Ϊ
	public void eat(){
		System.out.println(name+"�ڳԡ���");
	}
}

//ѧ���ࣨ���ࣩ
class Student extends Person{
	int num;	//ѧ��

	//���췽��
	public Student(String name){
		super(name);
	}

	//������Ϊ
	public void active (){
		super.eat();
	}
	public void eat(){
		System.out.println(name+"�ڳԡ���");
	}

}
*/

/*	����5������һ����ͨѧ�� ������ѧ�� ��ҵ��ѧ��	
//��ͨ��ѧ��
class Student{
	//����
	String name;

	//���췽��
	public Student(String name){
		this.name = name;
	}

	//������Ϊ
	public void study(){
		System.out.println(name + "ѧϰ ����Ӣ");
	}
}
//������ѧ��
class BaseStudent extends Student{
	//����

	//���췽��(��super���ø��๹�췽��)
	public BaseStudent(String name){
		super(name);
	}
	
	//������Ϊ
	public void study(){
		System.out.println(name + "ѧϰ javase");
	}
}
//��ҵ��ѧ��
class WorkStudent extends Student{
	//����

	//���췽��(��super���ø��๹�췽��)
	public WorkStudent(String name){
		super(name);
	}

	//������Ϊ
	public void study(){
		System.out.println(name + "ѧϰ javaee+android");
	}
}
*/