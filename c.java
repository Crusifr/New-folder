import java.io.*;
import java.util.*;
import java.math.*;
public class c {
    public static void main(String[] args) {
        int n=1;
        int res=GetMinimalPerimeter(n);
        System.out.print(res*2);
        System.out.println(res);
        System.out.print(res/2);
    }
    static int CalculateApples(int x)
    {
        int result = 0;
        for (int i = -x+1; i <= x-1; i++)
        {
            result += Math.abs(i) + x;
        }
    
        result = result * 4 + (x+x)*4;
    
        return result;
    }
    
    static int GetMinimalPerimeter(int X)
    {
        int result;
    
        int cur = 1;
        while (true)
        {
            int num_apples = CalculateApples(cur);
            if (num_apples == X)
            {
                result = 8 * cur;
                return result;
            }
    
            if (num_apples > X)
            {
                result = 8 * cur;
                break;
            }
            cur *= 2;
        }
    
        if (cur == 1) return result;
    
        int left = cur / 2, right = cur;
        while (left <= right)
        {
            int m = left + (right - left) / 2;
            int num_apples = CalculateApples(m);
            if (num_apples == X)
            {
                result = 8 * m;
                return result;
            }
            else if (num_apples > X)
            {
                result = 8 * m;
                right = m - 1;
            }
            else
            {
                left = m + 1;
            }
        }
    
        return result;
    }
    
}
