package Target;

import java.io.IOException;

public class Arrayexample {
    public static void main(String[] args) {
        int arr[] = {1,2,3,4,5};
        try {
            System.out.println(arr[0]);
            System.out.println(arr[6]);
        }
        catch (ArrayIndexOutOfBoundsException e)
        {
            System.out.println(e+ ". you are trying to access is out of bound");
        }
        finally {
            arr=new int[10];
            System.out.println("Resized the array");
            System.out.println("Array size: "+arr.length);
        }
    }
}

/* Output
1
java.lang.ArrayIndexOutOfBoundsException: 6. you are trying to access is out of bound
Resized the array
Array size: 10

 */