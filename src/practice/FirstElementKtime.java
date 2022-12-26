package practice;

import java.util.HashMap;

public class FirstElementKtime {

	/*public static int firstElementKTime(int a[], int n, int k) {
		for (int i = 0; i < n; i++) {
			int count = 0;
			for (int j = i + 1; j < n; j++) {
				if (a[i] == a[j]) {
					count++;
				}
			}
			if (count == k) {
				return a[i];
			}

		}
		return -1;
	}

	public static void main(String[] args) {
		int a[] = { 1, 7, 4, 3, 4, 8, 7 };
		int n = 7;
		int k = 2;
		// System.out.println(firstElementKTime(a,n,k));
		System.out.println(firstElementKTime(a, n, k));
	}*/
	
	public static int firstElementKTime(int[] arr, int n, int k) { 
        HashMap<Integer, Integer> s = new HashMap<Integer, Integer>();
        for(int i=0; i<n; i++){
            if(s.containsKey(arr[i])) {
                s.put(arr[i], s.get(arr[i]) + 1); 
            } else {
                s.put(arr[i], 1);
            } 
            if(s.get(arr[i])==k){
                return arr[i];
            } 
        }
        
        return -1;
    } 
        
        public static void main(String[] args){
            int a[]={1, 7, 4, 3, 4, 8, 7};
            int n=7;
            int k=2;
            //System.out.println(firstElementKTime(a,n,k));
            firstElementKTime(a,n,k);
        }

}
