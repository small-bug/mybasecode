import java.util.*;
class Day5 
{
	public static void main(String[] args) 
	{
		System.out.println("---------------------------------------------------\n");
/*	����	
				��ʽ����������[] ��������� = new ��������[���鳤��]	
				ʾ����int[] arr   = new int[20]	//����1������Ϊ20�������arr
					  ����arr���� = ����int���������
					   ��ջ�ڴ�			�ڶ��ڴ�
					  arr��Ϊ��ַָ��-->���ڴ��int����
	

		int[] arr = new int[20];

		//	��forѭ����arr����д������
		int a = 10;
		for (int index = 0; index<arr.length; ++index)
		{
			arr[index] += a;
			++a;

		}
		
		//	forѭ����arr�����������
		int count = 1;
		for (int index = 0; index<arr.length; ++index)
		{
			System.out.println("arr����ĳ�Ա" + count +"�ǣ�" + arr[index]);
			++count;
		}

			��ά����
				��ʽ��int[][] arr = new int[����1][����2]
				��ʽ��int[][] arr = {{1,3,4,5,2,3,}, {32,43,45,}, {343,34,34}}

		�ص㣺1.����ֻ�ܴ洢 ͬһ���� �����ݡ�
			  2.����һ����ʼ�����Ⱦ�ȷ���ˣ��޷��ı䡣
			  3.�����Ϊ�����Ԫ���Զ���������ֵ��
			  4.�������Ԫ�ص��ڴ��ַ�������ġ�


����1��дһ������ ����int���� �ж������е����ֵ ������������ֵ			
		
		//int[] arr = new int [20];
		int[] arr = {54, 7, 5, 543, 6, 1324, 15, 5456, 12};

		//	��forѭ����arr����д������
		int a = 10;
		for (int index = 0; index<arr.length; ++index){
			arr[index] += a;
			++a;
		}
		arr[15] = 105;
		
		int max = getMax(arr);
		System.out.println("���������ֵΪ��" + max);
		*/

/*
����2��дһ������ ����	ѡ������  �������������	
		sort(arr);

		//	forѭ����arr�����������
		int count = 1;
		for (int index = 0; index<arr.length; ++index){
			System.out.println("arr����ĳ�Ա" + count +"�ǣ�" + arr[index]);
			++count;
		}
		*/

/*
����3��дһ������ ����	ð������  �������������	
		int[] arr = {54, 7, 5, 543, 6, 1324, 15, 5456, 12};
		bubbleSort (arr);

		//	forѭ����arr�����������
		int count = 1;
		System.out.print("arr����ĳ�Ա�ǣ�");
		for (int index = 0; index<arr.length; ++index){
			System.out.print(arr[index] + ",");
			++count;
		}
		*/

/*
����4��дһ������ ����	���ֲ��ҷ�  ��������в���	
		int[] arr = {54, 7, 5, 543, 6, 1324, 15, 5456, 12};
		bubbleSort (arr);
		int index = halfSort (arr, 10);		//	��������arr��Ҫ���ҵ�ֵ10
		System.out.println(index);
		*/

/*
����5��дһ������ �����ַ������飬����������ַ���ת���� ����ʾ		
		char[] better = {'a','b','c','d','e'};
		//	�� Arrays �������
		String showBetter = Arrays.toString (better);
		System.out.println(showBetter);
		turn (better);
		String showBetter1 = Arrays.toString (better);
		System.out.println(showBetter1);
		*/	

/*	
����6��дһ������	ʵ��toString�Ĺ���  	
		int[] arr = {1,34,5,45,43,453,5,345,534,25,45,45};
		String showArr = toString(arr);//	���
		System.out.println(showArr);
		*/

/*
����7������1����ά���飬Ȼ����������ż�����ܺ�  	
		//int[][] arr = new int[3][4];		��̬�����ά����
		int[][] arr = {{13,34,52,13,1,32,}, {31,24,34,5,4,2,54,23,33,}, {43,5,6,32,7,4,7,23}};
		int sum1 = sum (arr);
		System.out.println(sum1);
		*/
/*
����8��дһ��������һ���������0ȥ�����ڷ���һ��û��0������	
		int[] arr = {0,3,54,6,23,0,43,0,3,0};
		//int[] arrNoZero = dislodgeZero(arr);
		arr = dislodgeZero(arr);
		System.out.println(Arrays.toString(arr));
		//System.out.println(Arrays.toString(arrNoZero));

		
		
		
		
		
		
		
	//�÷�ʽһ��������
	int[] arr1 = new int[3];
	arr1[0] = 1;
	arr1[1] = 2;
	arr1[2] = 3;
	
	//�÷�ʽ����������
	int[] arr2 = {4,5,6};
	
	//�ڿ���̨��ӡ����
	System.out.println("�÷�ʽһ���������飺"+Arrays.toString(arr1));
	System.out.println("�÷�ʽ�����������飺"+Arrays.toString(arr2));
		
	//forѭ����arr�����������
	int count = 1;
	for (int index = 0; index<arr1.length; ++index){
		System.out.println("arr1����ĳ�Ա" + count +"�ǣ�" + arr1[index]);
		++count;
	}
*/
		
	//����һ����ά����
	int[][] arr3 = {{1,2,3},{4,5,6}};
	
	//������forѭ��������ά����
	for (int i = 0; i < arr3.length; ++i){			//����i��������е���
		System.out.print("��"+(i+1)+"�е�Ԫ���ǣ�");
		
		for (int j = 0; j < arr3[i].length; ++j){	//����j��������е��У� ���磺arr3[1][2] �����2�еĵ�3��Ԫ��Ϊ6��
			System.out.print(arr3[i][j] + ",");
		}
		System.out.println();						//��ӡһ�л�һ����
	}

		
	
		

		
		
		
		
		
		
		
		System.out.println("\n---------------------------------------------------\n");
	}



	//+++++++++�����Ǻ���++++++++++++

/*	����1->	����int���� �ж������е����ֵ ������������ֵ	
	public static int getMax (int[] arr){	
		//�β�Ϊint���飬�������ֵΪint������
		int index = 0;
		int max = arr[index];
		
		for (; index<arr.length; ++index){
			if (max < arr[index]){
				max = arr[index];
			}	
		}
		return max;
	}
	*/
	
/*	����2->	��	ѡ������  �������������	
	public static void sort (int[] arr){
		for (int j = 0; j < arr.length-1; ++j){	//���1���������ţ����Գ��ȼ�1
			for (int index = j+1; index < arr.length; ++index){
				if (arr[j] < arr[index]){
					//	����2������λ��
					int temp = 0;
					temp = arr[j];
					arr[j] = arr[index];
					arr[index] = temp;
				}
			}
		}
	}
	*/
	
/*	����3-> ��	ð������  �������������	
	public static void bubbleSort (int[] arr){
		for (int j = 0; j < arr.length; ++j){
			for (int index = 0; index < arr.length-1-j; ++index){
				if (arr[index] > arr[index+1]){
					//	����2������λ��
					int temp = 0;
					temp = arr[index];
					arr[index] = arr[index+1];
					arr[index+1]= temp;
				}
			}
		}
	}
	*/

/*	����4-> ��	���ֲ��ҷ�  �������������	
	public static int halfSort (int[] arr, int num){
		int max = arr.length-1;		//	����ֵ���Ϊ(����ĳ���-1)
		int min = 0;				//	����ֵ��0��ʼ
		int mid = (max + min)/2;	//	�м�ֵ

		//	��֪��Ҫ�Ҽ��Σ��� while(true) ѭ��д��
		while (true){
			if (num == arr[mid]){
				return mid;
			}else if (num < arr[mid]){
				max = mid - 1;
				mid = (max + min)/2;
			}else {
				min = mid + 1;
				mid = (max + min)/2;
			}

			if (max < min){
				return -1;
			}
		}
	}
	*/

/*	����5-> �����ַ������飬����������ַ���ת���� ����ʾ	
	public static void turn (char[] better){
		for (int start = 0, end = (better.length - 1); start < end; ++start, --end){
			// ������ĩԪ��
			char temp = 0;
			temp = better[start];
			better[start] = better[end];
			better[end] = temp;
		}
	}
	*/

/*	����6-> ʵ��toString�Ĺ���  	
	public static String toString (int[] arr){
		String result = "";
		for (int index = 0; index < arr.length; ++index){
			result += arr[index] + ",";
		}
		return result;
	}
	*/

/*	����7-> ����1����ά���飬Ȼ����������ż�����ܺ� 
	public static int sum (int[][] arr){
		//	������forѭ��������ά����
		int sum2 = 0;		//	��sum2�洢ż����
		for (int a = 0; a < arr.length; ++a){
			for (int b = 0; b < arr[a].length; ++b){
				System.out.print(arr[a][b] + ",");
				if((arr[a][b])%2 == 0){
					sum2 += (arr[a][b]);
				}
			}
		}
		System.out.println();

		return sum2;
	}
	*/

/*	����8-> дһ��������һ���������0ȥ�����ڷ���һ��û��0������	
	public static int[] dislodgeZero(int[] arr){
		int count = 0;	//��countͳ���������ж��ٸ�0
		for (int i = 0; i < arr.length; ++i){
			if (arr[i] == 0){
				++count;
			}
		}
		int[] arr1 = new int[arr.length - count];
		int a = 0;
		for (int i = 0; i < (arr.length); ++i){
			if (arr[i] != 0){
				arr1[a] = arr[i];
				++a;
			}
		}
		return arr1;
	}
*/	

}








/* Arrays ����
		1.sort			//����		��ָ���� xxx�� ��������
		2.toString		//������ʾ	����ָ���������ݵ��ַ�����ʾ��ʽ
		3.binarySearch	//���ֲ���	ʹ�ö���������������ָ�����飬�Ի��ָ����ֵ
*/