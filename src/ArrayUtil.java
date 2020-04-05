


public class ArrayUtil {
	
	/** Reverse elements of array arr
	*   Precondition: arr.length > 0.
	*   Postcondition: The elements of arr have been reversed
	*   @param arr the array to manipulate
	*/
	public static void reverseArray(int[] arr){
		/* code goes here */
		// way 1
		//int[] arr2 = new int[arr.length];
		
		//for (int i = arr.length - 1; i >= 0; i--) {
		//	arr2[arr.length - 1 - i] = arr[i];
		//}
		
		//for (int i = 0; i < arr.length; i++) {
		//	arr[i] = arr2[i];
		//}
		
		// way 2 -> more intuitive
		for (int i = 0; i < arr.length/2; i++) {
			int end  = arr.length - 1;
			
			int tempVal = arr[i]; /* must include or you lose your data*/ 
			arr[i] = arr[end - i];
			arr[end - i] = tempVal;
			
		}
	}
}

class Matrix{
	private int[][] mat;
	
	public Matrix(int[][] m){
		mat = m;
	}
	
	/** Revereses the elements in each row of mat.
	*   Postcondition: The elements in each row have been reversed
	*/
	public void reverseAllRows(){
		/* code goes here */
		for (int row = 0; row < mat.length; row++) {
			ArrayUtil.reverseArray(mat[row]);
		}
	}
	
	/** Reverses the elements of mat.
	*   Postcondition:
	*   - The final elements of mat, when read in row-major order, 
	*     are the same as the original elements of mat when read
	*     from the bottom corner, right to left, going upward.
	*   - mat[0][0] contains what was originally the last element.
	*   - mat[mat.length - 1][mat[0].length -1] contains what was
	*     originally the first element.
	*/
	public void reverseMatrix(){
		/* code goes here */
		reverseAllRows();
		
		for (int i = 0; i < mat.length/2; i++) {
			int end = mat.length - 1;
			
			int[] tempRow = mat[i];
			mat[i] = mat[end - i];
			mat[end - i] = tempRow;
			
		}
	}
	
	public int[][] getIntArray(){
		return mat;
	}
}
