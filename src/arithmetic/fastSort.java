package arithmetic;

public class fastSort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        int[] numbers = {10,20,15,0,6,7,2,1,-5,55};
        System.out.print("����ǰ��");
        printArr(numbers);        
        quick(numbers);        
        System.out.print("���������");
        printArr(numbers);
	}
	public static void printArr(int[] numbers)
    {
        for(int i = 0 ; i < numbers.length ; i ++ )
        {
        System.out.print(numbers[i] + ",");
        }
        System.out.println("��-");
    }
    public static void quick(int[] numbers)
    {
        if(numbers.length > 0)   //�鿴�����Ƿ�Ϊ��
        {
        quickSort(numbers, 0, numbers.length-1);
        }
    }
    public static void quickSort(int[] numbers,int low,int high)
    {
        if(low < high)
        {
        int middle = getMiddle(numbers,low,high); //��numbers�������һ��Ϊ��
        quickSort(numbers, low, middle-1);   //�Ե��ֶα���еݹ�����
        quickSort(numbers, middle+1, high); //�Ը��ֶα���еݹ�����
        }
    
    }
    public static int getMiddle(int[] numbers, int low,int high)
    {
        int temp = numbers[low]; //����ĵ�һ����Ϊ����
        while(low < high)
        {
        while(low < high && numbers[high] > temp)
        {
            high--;
        }
        numbers[low] = numbers[high];//������С�ļ�¼�Ƶ��Ͷ�
        while(low < high && numbers[low] < temp)
        {
            low++;
        }
        numbers[high] = numbers[low] ; //�������ļ�¼�Ƶ��߶�
        }
        numbers[low] = temp ; //�����¼��β
        return low ; // ���������λ��
    }
}
