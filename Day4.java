import java.util.Scanner;

class Day4 
{
	public static void main(String[] args)
	{
		//System.out.println("------------------------------------------\n");
		/*	���̿��������ϰ	2016-7-21	*/	


/*------------------------------------------------------------------------------------------------
		/*	break continue �ؼ�����ϰ	

			break  ������ switch ��ѭ������ڣ������жϵ�ǰѭ��
				ע�⣺1.����ѭ��ʱҪע��break�������ĸ�ѭ��
					  2.Ҳ������  break ���; ����ʽ ��תȥ��������ѭ�� ���൱�� C �������goto 
			
			continue ֻ������ѭ������У�������������ǰѭ���е�һ��ѭ�� 
				ע�⣺1.continue ����д��ѭ�����ڵĵ�һ�� ��Ϊ����дѭ�����ڵ�������䶼����ִ�У����ڷϻ���䣬ϵͳ�ᱨ��.
		
			switch (2){
			case 1:System.out.print("1 ");break;
			case 2:System.out.print("2 ");break;
			case 3:System.out.print("3 ");break;
			
			}

			for (int i = 1; i <= 9; ++i){
				for (int j = 1; j <= i; ++j){
					System.out.print(j + "*" + i + "=" + i*j + "\t");
					break;						//ֹͣ��ǰ��forѭ�����˵�����forѭ��  �����9��
				}
				System.out.println("");
			}
		
			
			outer:for (int i = 0; i < 2; ++i){
				innner:for (int j = 0; j < 3; ++j){
					System.out.println("�����?");
					break outer;			//���ñ�� ������ȥ���������ѭ��(�����ѭ��Ҳ�����)��ֻ�����1��;
				}
			}
		
			
			outer:for (int i = 0; i < 2; ++i){
				innner:for (int j = 0; j < 3; ++j) {
					//continue;					//����ģ����ܷ���ѭ����ĵ�һ��
					//System.out.println("�����?");
					//continue;					//��������дd��ѭ����ĩβ����������

					if (i == 0){
						continue;			// �� i = 0 ʱ��������ѭ�� ����� 3��( j = 3 )
					}
					System.out.println("�����?" + i + j);
				}
			}
		
		
			outer:for (int i = 0; i < 2; ++i) {
				innner:for (int j = 0; j < 3; ++j) {
					if (i == 0){
						continue outer;			// �� i = 0 ʱ�������ѭ�� ����� 3��( j = 3 )
					}
					System.out.println("�����?" + i + j);
				}
			}


			
			outer:for (int i = 0; i < 2; ++i){
				innner:for (int j = 0; j < 3; ++j){
					System.out.println("�����?" + i + j);
					continue outer;			// ���ñ�Ż� �������ѭ�� ����� 2��( i = 2 )
				}
			}
	*/



/*---------------------------------------------------------------------------------------------------------------*/

	/*	for() ѭ��
			��ʽ��for (��ʼ�����A; �жϱ��ʽD; ѭ����ִ�е����C){
					ѭ�������B;
				  }
			forѭ��ִ��������̣�A->	 D->B->C->	 D->B->C	->D->B->C......
			
		ע�⣺    1.��ʼ�����A ִֻ��1��.
			  2.�жϱ��ʽD ������ʱ�˳�ѭ����ִ��for����Ĵ���.
			  3.for�ؼ���֮���С���ź�ӷֺ���ѭ�������Ϊ�����.
			  4.����дΪ��ѭ��	for( ; ; ){ѭ�������;}.



		����1����forѭ��д1��5��5�е� *�� ����	 
		System.out.println("��forѭ��д1��5��5�е� *�� ����\r\n");
			for (int i = 0; i < 5; ++i ){
				for (int j = 0; j<5; ++j){
					System.out.print("* ");
				}
				System.out.print("\n");
			}

	}
*/	

/*-------------------------------------------------------------------------------------------------------------------------------*/
	/*	while/do while ѭ��  
	 
			��ʽ��
			while (ѭ�����������ʽ){ //�����ʽΪ true ��ִ��ѭ���������䣬���ʽΪ false ������ѭ��
				ѭ����;
			}	
			
			do{
				ѭ����;
			}while(ѭ�����������ʽ)	//��ִ��һ��ѭ���壬���ж�ѭ�����������ʽ��
									     �����ʽΪ true ��ִ��ѭ���������䣬���ʽΪ false ������ѭ��

		ע�⣺    1.do-while����ִ��һ��ѭ�������.
			  2.���ʽһ���� ���� ����Ϊ�ó������������ѭ��.
			  3.�����ſ���ʡ�ԣ�ʡ�Ժ� while �������ĵ�1����䣬���ǲ�������ô�� .
			  4.��Ҫ�ڱ��ʽ��д�ֺ�.
			  5.����д������ while(false){}		����ѭ���������䲻��ִ�У����ڷϻ���䣬ϵͳ�ᱨ��
	*/	

/*	           ����3������1-100֮�䣬7�ı������ܺ�.	
		// 7 14 21 28 35 42 49 56 63 70 77 84 91 98
				
			 int num = 1;	
			 int sum = 0;			//sum���ڴ��7�ı������ܺ�
			 while (num <= 100) {
				 if((num % 7) == 0) {	//numȡģ��7Ϊ0,��numΪ7�ı���
					sum += num;
				 }
				 num++;
			 }
			 System.out.println("����1-100֮�䣬7�ı������ܺ�: " + sum);	
*/

/*	����4��ʵ�ֲ�������Ϸ�����û�в¶�����Լ����£�ֱ���¶��˾�ֹͣ��	
			����1��������Ĳ���
			1.�������������
			2.�������������� nextInt ����������������� ���� ��
			3.�����

	
			//�������������
			Random random = new Random();
			int num = random.nextInt(101);			//	���� 101 ��random.nextInt �оͻ�����0-100֮��������
			System.out.println("ϵͳ��Ϊ��ҡ�����ӣ�");
			//System.out.println(num);
			
			//int gui = 1;	
			int flag = 1;
			
			//����ɨ��������
			Scanner scanner = new Scanner(System.in);

			while (flag<=10){
				System.out.println("\n-----------------------------\n��������Ҫ�µ����֣�");
				int letter = scanner.nextInt();

				if (letter == num){
					flag = 11;
					System.out.println("\n��ϲ�㣡�¶��ˣ�������������1����\n");

				}else if (letter > num){
					System.out.println("\n���ź����´��ˣ��ڲ�1�Σ�");
					System.out.println("���Ѿ�����" + flag + "���ˣ���ʣ" + (10-flag) + "�λ���");
					flag += 1;
					if (flag>=10){
						System.out.println("��Ļ��������꣬ϵͳ�Զ��˳���\n");
					}

				}else {
					System.out.println("\n���ź�����С�ˣ��ڲ�1�Σ�");
					System.out.println("���Ѿ�����" + flag + "���ˣ���ʣ" + (10-flag) + "�λ���");
					flag += 1;
					if (flag>=10){
						System.out.println("\n��Ļ��������꣬ϵͳ�Զ��˳���\n");
					}
				}
			}




/*----------------------------------------------------------------------------------------------------------------*/
/*		switch ѡ���ж����
			��ʽ��
			switch (����){
				case 1:
					���1��
					break;
				case 2:
					���2��
					break;
				case 3:
					���3��
					break;
				����
				default:
					���;
					break
			}

	ע�⣺    1.������ֻ���� byte char short int string(java 7.0) ��5����������.
		  2.switch�����Ӧ�� case ��ִ���������һֱ����ִ�д��룬ֱ������ break ���� switch�Ĵ����� �Ż�ֹͣ.
		  3.case ����ֻ�ܽӳ��������ܽӱ���.
		  4.����case �� default ѡ���˳����Σ�������ִ��case ��û�ж�Ӧ��case ��ȥִ�� default ���.
		  5.switch ���� if-(else if)-else����.

		*/
		
		
		
/*	����1��������1-7ת���ɶ�Ӧ������������ʾ  ���磺1-����һ	2-���ڶ�	
			int num = 6;	
			switch (num){
			case 1:
				System.out.println(num+"-����һ");
				break;
			case 2:
				System.out.println(num+"-���ڶ�");
				break;
			case 3:
				System.out.println(num+"-������");
				break;
			case 4:
				System.out.println(num+"-������");
				break;
			case 5:
				System.out.println(num+"-������");
				break;
			case 6:
				System.out.println(num+"-������");
				break;
			case 7:
				System.out.println(num+"-������");
				break;
			default:
				System.out.println("��������ȷ������(1-7)��");
				break;
			}
*/			
			
			
/*	����2����������1���·ݣ�����ʾ����Ӧ�ļ���  ����   12 - ������"����"		
		Scanner scanner = new Scanner(System.in); //����ɨ�����
		System.out.println("�������·�:");
		int month = scanner.nextInt();	//���� ɨ������nextInt����ɨ���ն˿���̨��ɨ����������� month ��
		
		//��switch�жϣ����·��뼾�ڶ�Ӧ���������
		switch (month){
		case 2:case 3:case 4:
			System.out.println(month + "��" + " �����Ǵ���");
			break;
		case 5:case 6:case 7:
			System.out.println(month + "��" + " �������ļ�");
			break;
		case 8:case 9:case 10:
			System.out.println(month + "��" + " �������＾");
			break;
		case 11:case 12:case 1:
			System.out.println(month + "��" + " �����Ƕ���");
			break;		
		default:
			System.out.println("��������ȷ���·�(1-12)!");
		}
	
*/









/*-------------------------------------------------------------------------------------------------------------------------------------*/
	/*if �ж����
			��ʽ1��  ������Ҫ1���жϵ����
				if (�жϱ��ʽA){
					����ı��ʽA��������ִ����������;
				}
			
			��ʽ2��  ������Ҫ2���жϵ����
				if (�жϱ��ʽB){
					����ı��ʽB��������ִ����������;
				}else{
					����ı��ʽB����������ִ����������;
				}

			��ʽ3��  ������Ҫ�����жϵ����
				if (�жϱ��ʽ1){
					����ı��ʽ1��������ִ����������;

				}else if(�жϱ��ʽ2){
					����ı��ʽ2��������ִ����������;
				
				}else if(�жϱ��ʽ3){
					����ı��ʽ3��������ִ����������;

				}else{
					����ı��ʽ������������ִ����������;
				}
			
		ע�⣺    1.��Ҫ�ڱ��ʽ����ӷֺ�
			  2.if����ֻ��һ�����ʱ����ʡ�Դ����ţ����ǲ�������ô������Ϊ�ṹ������

	*/
			
/*	����1������2�꼰2�����Ϲ����������
		
	int workAge = 2;

	if (workAge>=2){
		System.out.println("��������ǵ���Ƹ������������������ԣ�");
	}
*/		
/*	����2���жϳɼ��Ƿ񼰸�		ע��60�ּ�60�����϶��Ǽ���

	int score = 59;		//����

	if (score >= 60){
		System.out.println(score + "��" + " ��ϲ�㣬�����ˣ�");
	}else{
		System.out.println(score + "��" + " �����񣬱���ģ��´μ��ͣ�");
	}
*/
		
/*	����3������һ�������жϳɼ��Ƿ񼰸�,������ABCDE�ȼ�.   ע��100���ƣ�60�ּ�60�����϶��Ǽ���,�����ÿ10��һ���ȼ�,E��Ϊ������.
	JAVA ���ռ��������д����1.����import java.util.Scanner��
						1.����ɨ�����
						2.���ö������ nextInt����

		Scanner scanner = new Scanner(System.in);	//����ɨ��������ڽ��տ���̨����
		System.out.println("\n��������ķ�����");		//��ʾ�û��������
		int score = scanner.nextInt();				//����ɨ������nextInt()���������û�����ķ���
		
		//�ö�� if()-else if() �ж�����ķ��������ĸ��ȼ�
		if (score>100 || score<0){
			System.out.println("������ķ�������ȷ�����������룡");
		}else if (score >= 90){
			System.out.println(" ��ϲ�㣬�����A����");
		}else if (score >= 80){
			System.out.println(" ��ϲ�㣬�����B����");
		}else if (score >= 70){
			System.out.println(" ��ϲ�㣬�����C����");
		}else if (score >= 60){
			System.out.println(" ��ϲ�㣬�����D����");
		}else{
			System.out.println(" �����E��,�����񣬱���ģ��´μ��ͣ�");
		}
*/





/*----------------------------------------------------------------------------------------------------------------------------*/
		/*	���� 
				��ʽ�� ���η� ����ֵ���� ������(��ʽ����){
							������
					   }

				�ص㣺1.������Ҫ���ò���ִ��,������(main)��JVM����,����Ҫ�ֶ����á�
					  2.����ֵ���Ϳ����� void (��)��
					  3.���������淶ͬ��������
					  4.���һ�����������е�ʱ�� �����ڵ�������Ҫ������ȷ���ģ���Ӧ�ö�����ʽ���� �ˡ�
				
				��ζ���һ��������
					1.��Ҫȷ������ֵ���͡�
					2.�Ƿ����δ֪�Ĳ���(�Ƿ�Ҫ�β�)

			//	add (3,3);			//	���� ���� ����3��3,ֻ����Ļ����ʾ���
		
	����1������1�������Ƚ�2��int�������Ĵ�С���Ѵ�������ظ����ô�
*/	
			int num = 0;
			num = getMax (135,4646);	//	135, 4646 ��������ʵ�ʲ���
			System.out.println ("�������:" + num);
}	
/*
	//����2������1������ �жϷ����ȼ� �����ѵȼ����ظ�������
		char score = ' ';
		score = level (15);
		System.out.println ("�����ȼ���:" + score);
	

	//����3������1������ ����һ���˷�������ӡ����Ļ��
		
		mul (9, 9);			//9*9�˷���
		System.out.println("------------------------------------");
		mul (3, 3);			//3*3�˷���


		int sum = add (1, 4, 3, 4);
		System.out.println("��ӵĽ���ǣ�" + sum);

	}
*/	
	/*	2������� ֻ����Ļ����ʾ���

	public static void add (int a, int b){
			int sum1 = a + b;
			System.out.println("�����:" + sum1);
	}
	*/
	
/*	����1���Ƚ�2��int�������Ĵ�С���Ѵ�������ظ����ô���*/

	public static int getMax (int a, int b) {
		if (a>b){
			return a;
		}else {
			return b;
		}

	/*
			//����2������1������ �жϷ����ȼ� �����ѵȼ����ظ�������
	public static char level (int a){
		char levels = ' ';
		if (a>100 || a<0){
			System.out.println("��ķ����쳣��");
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
			//����3������1������ ����һ���˷�������ӡ����Ļ��(�޷���ֵ)						
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
		
	//	���������� 
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