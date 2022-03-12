import java.util.*;
 
class d
{
    static int remainingCard(int n)
    {
        Queue<Integer> q = new LinkedList<>();
        for (int i = 1; i <= n; i++)
        {
            q.add(i);
        }
        while (((int) q.size()) >= 2)
        {
            q.remove();
            q.add(q.peek());
            q.remove();  
        }
        return q.peek();
    }
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println(remainingCard(n));
    }
}