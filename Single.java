/*	���ģʽ(23��)
		1.�������ģʽ
		2.ģ�����ģʽ
		3.װ�������ģʽ
		4.�۲������ģʽ
		5.�������ģʽ

*/

//	�������ģʽ��ϰ
class Single{
	public static void main (String[] args){
		System.out.println("---------------------------------------------------\n");

/*�����������ģʽ
		//����SingleMode���ͱ���s1����������SingleMode.getInstance()�������ص�SingleMode���Ͷ���s.
		SingleMode1 s1 = SingleMode1.getInstance();	//�� ����.������ ����ʽ���ʾ�̬����
		SingleMode1 s2 = SingleMode1.getInstance();	//�� ����.������ ����ʽ���ʾ�̬
		System.out.println("�ǲ���ͬһ������"+(s1 == s2));
		System.out.println(s1);
		System.out.println(s2);
*/

/*�����������ģʽ		
		//����SingleMode���ͱ���s1����������SingleMode.getInstance()�������ص�SingleMode���Ͷ���s.
		SingleMode2 s1 = SingleMode2.getInstance();	//�� ����.������ ����ʽ���ʾ�̬����
		SingleMode2 s2 = SingleMode2.getInstance();	//�� ����.������ ����ʽ���ʾ�̬
		System.out.println("�ǲ���ͬһ������"+(s1 == s2));
		System.out.println(s1);
		//System.out.println(s2);
*/
	}
}

/*�����������ģʽ
class SingleMode1{
	//���������������ͱ�����ָ�������
	private static SingleMode s = new SingleMode();	//����private��װ����,Ҫ��֤����ֻ����һ���������static����

	//˽�л����췽��
	private SingleMode(){}

	//�����ṩ������̬�ķ������ʱ������
	public static SingleMode getInstance(){
		return s;
	}
}
*/

/*�����������ģʽ	
class SingleMode2{
	//���������������ͱ��� ��ָ�������
	private static SingleMode2 s;

	//˽�л����췽��
	private SingleMode2(){}

	//�����ṩ������̬�ķ������ʱ�������ж��Ƿ��Ѿ��ж���
	public static SingleMode2 getInstance (){
		if (s == null){	//�������Ϳ�ֵΪnull
			s = new SingleMode2();
		}
		return s;
	}
}
*/