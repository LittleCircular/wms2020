package p1;

public class Test {

	public static void main(String[] args) {
		int[] arr1 = new int[]{2,4,5,1,2,5,6,4};
	    int[] arr2 = new int[arr1.length];
	    boolean isFlag;
	    for(int i = 0 ; i < arr1.length; i++){
	    	isFlag = true;
	    	for(int j = 0 ; j < arr2.length; j++){
	    		if(arr1[i] == arr2[j]) isFlag = false;
	    	}
	    	if(isFlag) arr2[i] = arr1[i];
	    	System.out.println(arr2[i]);
	    }
	}

}
