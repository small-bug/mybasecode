import java.util.*;
class Sort {
	public static void main(String[] args) 
	{
		System.out.println("Hello World!");
		
		int[] arr = {5,2,1,9,4,3,7,6,8,0};
		System.out.println("原数组元素:   "+Arrays.toString(arr));
		directSort(arr);
		System.out.println("直接排序结果："+Arrays.toString(arr));
		//bubbleSort(arr);
		Sort s = new Sort();
		s.bubbleSort(arr);	//用对象访问非静态方法
		System.out.println("冒泡排序结果："+Arrays.toString(arr));

		//用二分查找法找一个整数,返回其索引值（必须在排好升序的数组中找）
		int result = s.binarySeach(arr, 3);
		System.out.println("找到的值的索引值是："+result);

	}

	// 直接排序
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

	// 冒泡排序
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

	//二分查找法
	private int binarySeach(int[] arr, int num){
		//定义 最大、最小、中间 的索引值
		int max = arr.length-1;
		int min = 0;
		int mid = (max+min)/2;

		//开始查找
		//无限查找直到找到或者找不到，用while
		while (arr[mid] != num){
			if (arr[mid] < num){	//要找的值大于中间值，要找的值在右边，改变最小索引值min
				min = mid + 1;
			}else if(arr[mid] > num){	//要找的值小于中间值，要找的值在左边，改变最大索引值max
				max = mid -1;
			}
			//重新计算中间值mid
			mid = (max+min)/2;
			
			//找不到的情况 最大索引值max比最小索引值min小,返回-1;
			if (max < min){
				return -1;
			}
		}
		return mid;
	}
}