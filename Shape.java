package Target;

import java.util.Scanner;
import java.io.IOException;

class NotASquareException extends RuntimeException
{
    String msg;
    NotASquareException()
    {
        super();
    }
    NotASquareException(String message)
    {
        super(message);
    }
}
public class Shape {
    private int len, width;
    public boolean isSquare(int length, int wid)
    {
        try {
            if (length==wid) {
                System.out.println("It's a square");
                return true;
            }
            else
                throw new NotASquareException("Not a square");
        }
        catch (NotASquareException e)
        {
            System.out.println(e);
            return false;
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter length and breadth: ");
        int len = sc.nextInt();
        int wid = sc.nextInt();
        Shape S = new Shape();
        System.out.println();
        S.isSquare(len,wid);
        return;
    }
}

/* Output
Enter length and breadth:
2
2

It's a square

Enter length and breadth:
2
5

Target.NotASquareException: Not a square

 */