
public class Min {
	public static void main(String[] args) {
  int i;
	int	arr[]= new int[] {8,4,5,3};
	int min=arr[0];
	for(i=0;i<=arr.length;i++) {
			if(arr[i]<min) {
				min=arr[i];
      }
		}
    System.out.println(min);
	}
}

