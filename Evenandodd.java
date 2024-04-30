
public class EvenOdd  {

	public static void main(String[] args) {
		int a[]= {1,3,5,2,4,6,11,12,15,16};
		System.out.println("Even Numbers in Array....");
		for (int i=0;i<a.length;i++) {
			if(a[i]%2==0) {
				System.out.println(a[i]);
			}
			
		    	   }
		System.out.println("Odd Numbers in Array......");
		for (int i=0;i<a.length;i++) {
			if(a[i]%2!=0) {
				System.out.println(a[i]);
			}
		
		       }

		}
}
	


