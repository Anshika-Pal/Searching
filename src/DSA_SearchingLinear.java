
public class DSA_SearchingLinear {
	public static void main(String[] args) {
		int arr[]= {4,56,8,2,56,14,6,5,2,56,14,5};

		int value=14;
		boolean flag=true;
		for(int x=0;x<=arr.length-1;x++) {
			if(value==arr[x]) {
				System.out.println(value+" found at "+x);
				flag=false;
				break;
			}
		}
		if(flag) {
			System.out.println(value+" not found");
		}
	}
}
