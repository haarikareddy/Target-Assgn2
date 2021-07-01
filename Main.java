package Target;

import java.io.IOException;
import java.util.Locale;

public class Main {
    public String method1()
    {
        String s= null;
        try
        {
            s=method2(s);
            return s;
        }
        catch (Exception e)
        {
            System.out.println(e);
            return "Exception occurred";
        }
    }
    public String  method2(String str) throws NullPointerException
    {
        try{
            System.out.println(str.toLowerCase());
            return str;
        }
        catch (NullPointerException e)
        {
            System.out.println(e+": Null point exception caught");
            return "Exception caught";
        }
    }
    public static void main(String[] args) {
        Main M = new Main();
        try {
            System.out.println(M.method1());
        }
        catch (Exception e)
        {
            System.out.println(e);
        }
    }
}

/* Output
java.lang.NullPointerException: Null point exception caught
Exception caught

 */