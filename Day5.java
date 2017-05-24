import java.util.*;
class Day5 
{
	public static void main(String[] args) 
	{
		System.out.println("---------------------------------------------------\n");
/*	数组	
				格式：数据类型[] 数组变量名 = new 数据类型[数组长度]	
				示例：int[] arr   = new int[20]	//创建1个长度为20数组变量arr
					  声明arr变量 = 创建int型数组对象
					   在栈内存			在堆内存
					  arr内为地址指向-->堆内存的int对象
	

		int[] arr = new int[20];

		//	用for循环向arr数组写入数据
		int a = 10;
		for (int index = 0; index<arr.length; ++index)
		{
			arr[index] += a;
			++a;

		}
		
		//	for循环从arr数组读出数据
		int count = 1;
		for (int index = 0; index<arr.length; ++index)
		{
			System.out.println("arr数组的成员" + count +"是：" + arr[index]);
			++count;
		}

			二维数组
				格式：int[][] arr = new int[长度1][长度2]
				格式：int[][] arr = {{1,3,4,5,2,3,}, {32,43,45,}, {343,34,34}}

		特点：1.数组只能存储 同一类型 的数据。
			  2.数组一旦初始化长度就确定了，无法改变。
			  3.数组会为里面的元素自动加上索引值。
			  4.数组里的元素的内存地址是连续的。


需求1：写一个方法 接收int数组 判断数组中的最大值 并返回这个最大值			
		
		//int[] arr = new int [20];
		int[] arr = {54, 7, 5, 543, 6, 1324, 15, 5456, 12};

		//	用for循环向arr数组写入数据
		int a = 10;
		for (int index = 0; index<arr.length; ++index){
			arr[index] += a;
			++a;
		}
		arr[15] = 105;
		
		int max = getMax(arr);
		System.out.println("数组中最大值为：" + max);
		*/

/*
需求2：写一个方法 调用	选择排序  对数组进行排序	
		sort(arr);

		//	for循环从arr数组读出数据
		int count = 1;
		for (int index = 0; index<arr.length; ++index){
			System.out.println("arr数组的成员" + count +"是：" + arr[index]);
			++count;
		}
		*/

/*
需求3：写一个方法 调用	冒泡排序  对数组进行排序	
		int[] arr = {54, 7, 5, 543, 6, 1324, 15, 5456, 12};
		bubbleSort (arr);

		//	for循环从arr数组读出数据
		int count = 1;
		System.out.print("arr数组的成员是：");
		for (int index = 0; index<arr.length; ++index){
			System.out.print(arr[index] + ",");
			++count;
		}
		*/

/*
需求4：写一个方法 调用	二分查找法  对数组进行查找	
		int[] arr = {54, 7, 5, 543, 6, 1324, 15, 5456, 12};
		bubbleSort (arr);
		int index = halfSort (arr, 10);		//	传入数组arr和要查找的值10
		System.out.println(index);
		*/

/*
需求5：写一个方法 传入字符串数组，把数组里的字符翻转排序 并显示		
		char[] better = {'a','b','c','d','e'};
		//	用 Arrays 工具输出
		String showBetter = Arrays.toString (better);
		System.out.println(showBetter);
		turn (better);
		String showBetter1 = Arrays.toString (better);
		System.out.println(showBetter1);
		*/	

/*	
需求6：写一个方法	实现toString的功能  	
		int[] arr = {1,34,5,45,43,453,5,345,534,25,45,45};
		String showArr = toString(arr);//	输出
		System.out.println(showArr);
		*/

/*
需求7：定义1个二维数组，然后求数组里偶数的总和  	
		//int[][] arr = new int[3][4];		动态定义二维数组
		int[][] arr = {{13,34,52,13,1,32,}, {31,24,34,5,4,2,54,23,33,}, {43,5,6,32,7,4,7,23}};
		int sum1 = sum (arr);
		System.out.println(sum1);
		*/
/*
需求8：写一个方法将一个数组里的0去掉，在返回一个没有0的数组	
		int[] arr = {0,3,54,6,23,0,43,0,3,0};
		//int[] arrNoZero = dislodgeZero(arr);
		arr = dislodgeZero(arr);
		System.out.println(Arrays.toString(arr));
		//System.out.println(Arrays.toString(arrNoZero));

		
		
		
		
		
		
		
	//用方式一创建数组
	int[] arr1 = new int[3];
	arr1[0] = 1;
	arr1[1] = 2;
	arr1[2] = 3;
	
	//用方式二创建数组
	int[] arr2 = {4,5,6};
	
	//在控制台打印数组
	System.out.println("用方式一创建的数组："+Arrays.toString(arr1));
	System.out.println("用方式二创建的数组："+Arrays.toString(arr2));
		
	//for循环从arr数组读出数据
	int count = 1;
	for (int index = 0; index<arr1.length; ++index){
		System.out.println("arr1数组的成员" + count +"是：" + arr1[index]);
		++count;
	}
*/
		
	//创建一个二维数组
	int[][] arr3 = {{1,2,3},{4,5,6}};
	
	//用两个for循环遍历二维数组
	for (int i = 0; i < arr3.length; ++i){			//变量i代表矩阵中的行
		System.out.print("第"+(i+1)+"行的元素是：");
		
		for (int j = 0; j < arr3[i].length; ++j){	//变量j代表矩阵中的列， 例如：arr3[1][2] 代表第2行的第3个元素为6。
			System.out.print(arr3[i][j] + ",");
		}
		System.out.println();						//打印一行换一次行
	}

		
	
		

		
		
		
		
		
		
		
		System.out.println("\n---------------------------------------------------\n");
	}



	//+++++++++以下是函数++++++++++++

/*	需求1->	接收int数组 判断数组中的最大值 并返回这个最大值	
	public static int getMax (int[] arr){	
		//形参为int数组，返回最大值为int型数据
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
	
/*	需求2->	用	选择排序  对数组进行排序	
	public static void sort (int[] arr){
		for (int j = 0; j < arr.length-1; ++j){	//最后1个数不用排，所以长度减1
			for (int index = j+1; index < arr.length; ++index){
				if (arr[j] < arr[index]){
					//	交换2个数的位置
					int temp = 0;
					temp = arr[j];
					arr[j] = arr[index];
					arr[index] = temp;
				}
			}
		}
	}
	*/
	
/*	需求3-> 用	冒泡排序  对数组进行排序	
	public static void bubbleSort (int[] arr){
		for (int j = 0; j < arr.length; ++j){
			for (int index = 0; index < arr.length-1-j; ++index){
				if (arr[index] > arr[index+1]){
					//	交换2个数据位置
					int temp = 0;
					temp = arr[index];
					arr[index] = arr[index+1];
					arr[index+1]= temp;
				}
			}
		}
	}
	*/

/*	需求4-> 用	二分查找法  对数组进行排序	
	public static int halfSort (int[] arr, int num){
		int max = arr.length-1;		//	索引值最大为(数组的长度-1)
		int min = 0;				//	索引值从0开始
		int mid = (max + min)/2;	//	中间值

		//	不知道要找几次，用 while(true) 循环写死
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

/*	需求5-> 传入字符串数组，把数组里的字符翻转排序 并显示	
	public static void turn (char[] better){
		for (int start = 0, end = (better.length - 1); start < end; ++start, --end){
			// 交换首末元素
			char temp = 0;
			temp = better[start];
			better[start] = better[end];
			better[end] = temp;
		}
	}
	*/

/*	需求6-> 实现toString的功能  	
	public static String toString (int[] arr){
		String result = "";
		for (int index = 0; index < arr.length; ++index){
			result += arr[index] + ",";
		}
		return result;
	}
	*/

/*	需求7-> 定义1个二维数组，然后求数组里偶数的总和 
	public static int sum (int[][] arr){
		//	用两个for循环遍历二维数组
		int sum2 = 0;		//	用sum2存储偶数和
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

/*	需求8-> 写一个方法将一个数组里的0去掉，在返回一个没有0的数组	
	public static int[] dislodgeZero(int[] arr){
		int count = 0;	//用count统计数组里有多少个0
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








/* Arrays 工具
		1.sort			//排序		对指定的 xxx型 数组排序。
		2.toString		//遍历显示	返回指定数组内容的字符串表示形式
		3.binarySearch	//二分查找	使用二分搜索法来搜索指定数组，以获得指定的值
*/