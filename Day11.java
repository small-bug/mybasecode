import java.io.*;
class Day11 extends ProgramRuntime{
	public static void main(String[] args){
		System.out.println("---------------------------------------------------\n");
/*++++++++++++++++�����Ǹ�����+++++++++++++++++++++++*/
/*	�Զ����쳣��
		1.ֻҪдһ����̳�Exception�࣬���������쳣�ࡣ���superһ��Exception���(String Message)���췽����
*/

/*	Exception
		1.����ʱ�쳣	RuntimeException �Լ����ĵ��������࣬��������ʱ�쳣��
			1.���Բ��������׳��쳣���ͣ�Ҳ���Բ��ô����쳣��
				ԭ����Ϊ����ʱ�쳣�ǿ���ͨ������Ա���õı��ϰ�߱���ģ����Բ���ǿ��Ҫ��

		2.����ʱ�쳣��������ʱ�쳣���ܼ��쳣��	����RuntimeException��������쳣�ࡣ
			1.����Ҫ�����׳��쳣���ͣ�����Ҫ�����쳣��
*/

/*	finally ��	���ܵ���ʹ�ã����� try,catch�����ܵ���ʹ�á�
		1.��ʽ ��try{���ܷ����쳣����}catch(�����쳣���� ����){�Բ�����쳣���д���}finally{����}��
		2.ֻҪ��try�飬finally�Ĵ���ͻ�ִ�У�����try����Ĵ����Ƿ����쳣����try����Ĵ���û��ִ���ꡣ
		3.Ҫ��try�����catch������ʹJVM�˳��Ĵ���ִ�е�����finally����Ĵ��벻ִ�С�
		4.finally��һ��д ��Դ�ͷŵĴ��� ��������try�鷢���쳣��Ҳ�������ͷ�֮ǰռ�õ���Դ��
		5.finally��try-catch���ʹ�õ�3�ָ�ʽ��
			1.try{���ܷ����쳣����}catch(�����쳣���� ����){�Բ�����쳣���д���}		
			2.try{���ܷ����쳣����}catch(�����쳣���� ����){�Բ�����쳣���д���}finally{ ����һ��д ��Դ�ͷŵĴ���  }��	//����Ƚ�������Ҫ�ͷ���Դ���
			3.try{���ܷ����쳣����}finally{����}��	//�����õĺ��١�
*/

/*	��	�൱��windows������ļ��У���������� class���ļ���
		1.�ô���1.���Ա���ͬ���౻���ǡ�
				2.���ڰ汾������
		2.��ʽ��package ����;	//����ȫ��Сд��ĸ
		3.ֻ����һ����������ֻ�ܷ��ڵ�һ�䡣
		4.�а�����class �ļ���Ϊ ����.������Ҳ���� ����.����.���� ��Ϊ2���ļ��С�
		5.���뷽�� javac -d . ����.java���Ǹ������ǰĿ¼��
	
	����
		1.�����������ã�����д����������һ���ർ�뵽�ڴ��С�
		2.��ʽ1��import ����.����;	//�Ƽ�ʹ�����ָ�ʽ��
		3.��ʽ2��import ����.*;	//*Ϊͨ�������ʾ��ǰ�����µ�ȫ���ࡣ����������ͨ�����		����ṹ�����������ܺܺõ��ж��������ĸ�����
		4.import ����.* �ǲ��������ڰ����µ��Ӱ��ġ�
*/

/*	Ȩ�����η�	true=�ܷ���	false=���ܷ���
						public	protected	default	private
		��ͬһ������	true	  true		  true	  true	  
		��ͬһ������	true	  true		  true	  false
		�Ӹ���(��ͬ��)	true	  true		  false	  false
		�ڲ�ͬ����		true	  false		  false	  false
*/

/*	��jar��
		1.�����ʽ��jar cvf jar����.jar Ҫ����İ���/��.class
		2.��jar�������ã�
			1.��������һ����Ŀ��
			2.��jar������ʽ�������ṩ�����ࡣʹ��ʱҪ����classpath·����
		3.����jar����Ҫ�� META-INF����嵥�ļ��� ָ������࣬��ʽ��Main-Class: ����.����
		4.˫��jar����ֻ����ͼ�λ�����ĳ�����Ч��
*/

/*	ģ�����ģʽ		���ڴ���һ�����飬����һЩ�ǹ̶�����ģ���һЩ�Ǳ仯�ģ����磺����
		1.��д�����������һ�������
		2.��ȡ���л��Ĳ��֣�����д�ɳ���ģ�ʹ���߾���ʵ���������Ĳ��֡�
		3.��final ��ģ�������������Է������޸ġ�
*/

/*++++++++++++++++������������+++++++++++++++++++++++*/
/*	����1���Զ����쳣����ϰ	 	
		String ip = "192.168.1.1";
		ip = null;
		try{
			check(ip);
		}catch(Exception e){
			e.printStackTrace();
			System.out.println("��������쳣��IP��ַΪ�գ�");
		}
*/

/*	����2���Զ����쳣����ϰ ģ��ȥ��ľͰ�������Ǯ����10�飬��ô���׳�һ��û�д���Ǯ���쳣����
							��������˾��ܳ���ľͰ����
		
		double money = 9.9;
		try{
			eat(money);
		}catch(NoMoney n){
			n.printStackTrace();
			System.out.println("ȥ�����ѽ��Ǯ��");
		}
*/

/*	����3��finally ����ϰ	
		
		try{
			int a = 4;
			int b = 0;
			int c = 0;
			
			c = a/b;
			System.exit(0);		//����JVM System��;�̬�ģ��� ����.������ ���á�
			
		}catch (ArithmeticException e){
			e.printStackTrace();
			System.out.println("���﷢���˳�0�쳣��");
		}finally{
			System.out.println("������finally����顭��");
		}
*/


/*	����4���� ��������ϰ	*/

/*	����5��ģ�����ģʽ��ϰ			дһ��ģ������������������ĳ��������ʱ��(�������ʱ��-����ʼʱ��)
		1.��д�����������һ�������
		2.��ȡ���л��Ĳ��֣�����д�ɳ���ģ�ʹ���߾���ʵ���������Ĳ��֡�
		3.��final ��ģ�������������Է������޸ġ�
*/		
		Day11 d = new Day11();
		d.programRuntime();
	
		System.out.println("---------------------------------------------------\n");	
	}

/*++++++++++++++++�����Ǻ�����+++++++++++++++++++++++*/
/*	����1-->�Զ����쳣����ϰ	
		public static void check(String ip) throws Exception{
			if (ip == null){
				throw new NoIpException("���Ip��ַΪ�գ�");
			}
			System.out.println("�������������");
		}
*/

/*	����2���Զ����쳣����ϰ ģ��ȥ��ľͰ�������Ǯ����10�飬��ô���׳�һ��û�д���Ǯ���쳣����
							��������˾��ܳ���ľͰ����

		public static void eat(double money) throws NoMoney{
			if (money < 10.0){
				throw new NoMoney("Ǯ��������");
			}else{
				System.out.println("Ǯ���ģ��ϰ���һ��ľͰ����");
			}
		}
*/

/*	����5��ģ�����ģʽ��ϰ	*/
		public void code(){
			for (int i = 0; i < 999; i++){
				System.out.println("i = " + i);
			}
		}
}

/*++++++++++++++++������ �� ��+++++++++++++++++++++++*/
/*	����1-->�Զ����쳣����ϰ	
class NoIpException extends Exception{
	public NoIpException(String message){
		super(message);
	}
}
*/

/*	����2���Զ����쳣����ϰ ģ��ȥ��ľͰ�������Ǯ����10�飬��ô���׳�һ��û�д���Ǯ���쳣����
							��������˾��ܳ���ľͰ����

//�Զ��� Ǯ�������쳣��
class NoMoney extends Exception{
	public NoMoney(String message){
		super(message);
	}
}
*/

/*	����5��ģ�����ģʽ��ϰ			дһ��ģ������������������ĳ��������ʱ��(�������ʱ��-����ʼʱ��)	*/
abstract class ProgramRuntime{
		public void programRuntime(){
			long startTime = System.currentTimeMillis();		//����ʼ��ʱ��

			code();

			long endTime = System.currentTimeMillis();		//���������ʱ��
			System.out.println("������������ʱ�䣺"+(endTime-startTime));
		}
		
		public abstract void code();
}		