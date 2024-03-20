import java.util.Arrays;

/*
default value of array is 0 after initialization

 ava arrays do not provide a direct remove method to remove an element. In fact, we have already
 discussed that arrays in Java are static so the size of the arrays cannot change once they are instantiated.
 Thus we cannot delete an element and reduce the array size.*/
public class ArrayOperation {
    public static void main(String[] args) {
        int[] intArray = new int[10]; //deault value o {0,0,0,0,0,0,0}
        intArray[0]=1;
        intArray[1]=2;
        int[] intArray1= {1,2,3,4,5,6,7,8};
        System.out.println(Arrays.toString(intArray));
        Arrays.fill(intArray,3); // initialize all value of array to 3
        System.out.println(Arrays.toString(intArray));
        int intArray1Copy[] = Arrays.copyOf(intArray1,intArray1.length);
        System.out.println(Arrays.toString(intArray1Copy));
        int intArray2CopyRange[] = Arrays.copyOfRange(intArray1,1,intArray1.length-1);
        System.out.println(Arrays.toString(intArray2CopyRange));


    }
}
