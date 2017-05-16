package arithmetic;

public class bubble {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int temp;
		int[] a={2,3,4,523,43,2,1};
		for(int i=0;i<a.length-1;i++){
			for(int j=i+1;j<a.length;j++){
				if(a[i]>=a[j]){
					temp=a[j];
					a[j]=a[i];
					a[i]=temp;
				}
			}
	    }		
		for(int k=0;k<a.length;k++){
			System.out.println(" "+a[k]);
		}			
//		for(i=0;i<a.length;i++){
//			System.out.println(a[i]);
//		}
//		System.out.println(a[2]);
	}
}
