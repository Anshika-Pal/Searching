import java.util.Arrays;
public class DSA_BinarySearching {
	public static void main(String[] args) {
		int arr[]= {2,7,8,11,14,78,89,568};
		
		Arrays.sort(arr);
		
		int value=14;
		boolean flag=true;
		int lower=0,upper=arr.length-1;
		while(lower <= upper){
            int mid = (lower + upper) / 2;
            if(value == arr[mid]){
            		System.out.println(value+" found at "+mid);
            		flag=false;
            		break;
            }
            else if(value < arr[mid]){
                upper = mid -1;
            }
            else{
                lower = mid + 1;
            }
        }
		if(flag) {
			System.out.println(value+" NOT found");
		}
	}
}
