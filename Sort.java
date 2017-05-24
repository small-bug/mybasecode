import java.util.*;
class Sort {
	public static void main(String[] args) 
	{
		System.out.println("Hello World!");
		
		int[] arr = {5,2,1,9,4,3,7,6,8,0};
		System.out.println("ԭ����Ԫ��:   "+Arrays.toString(arr));
		directSort(arr);
		System.out.println("ֱ����������"+Arrays.toString(arr));
		//bubbleSort(arr);
		Sort s = new Sort();
		s.bubbleSort(arr);	//�ö�����ʷǾ�̬����
		System.out.println("ð����������"+Arrays.toString(arr));

		//�ö��ֲ��ҷ���һ������,����������ֵ���������ź�������������ң�
		int result = s.binarySeach(arr, 3);
		System.out.println("�ҵ���ֵ������ֵ�ǣ�"+result);

	}

	// ֱ������
	private static void directSort(int[] arr){
		for (int i = 0; i < arr.length-1; ++i){
			for (int j = i+1; j < arr.length; ++j){
				if (arr[i] > arr[j]){
					int temp = 0;
					temp = arr[i];
					arr[i] = arr[j];
					arr[j] = temp;
				}
			}
		}
	}

	// ð������
	private void bubbleSort(int[] arr){
		for (int i = 0; i < arr.length-1; ++i){
			for (int j = 0; j < arr.length-1-i; ++j){
				if (arr[j] > arr[j+1]){
					int temp = 0;
					temp = arr[j];
					arr[j] = arr[j+1];
					arr[j+1] = temp;
				}
			}
		}
	}

	//���ֲ��ҷ�
	private int binarySeach(int[] arr, int num){
		//���� �����С���м� ������ֵ
		int max = arr.length-1;
		int min = 0;
		int mid = (max+min)/2;

		//��ʼ����
		//���޲���ֱ���ҵ������Ҳ�������while
		while (arr[mid] != num){
			if (arr[mid] < num){	//Ҫ�ҵ�ֵ�����м�ֵ��Ҫ�ҵ�ֵ���ұߣ��ı���С����ֵmin
				min = mid + 1;
			}else if(arr[mid] > num){	//Ҫ�ҵ�ֵС���м�ֵ��Ҫ�ҵ�ֵ����ߣ��ı��������ֵmax
				max = mid -1;
			}
			//���¼����м�ֵmid
			mid = (max+min)/2;
			
			//�Ҳ�������� �������ֵmax����С����ֵminС,����-1;
			if (max < min){
				return -1;
			}
		}
		return mid;
	}
}