import java.util.*;
 
class e
{
    static int remainingCard(int n)
    {
        Queue<Integer> queCards = new LinkedList<>();
        for (int i = 1; i <= n; i++)
        {
            queCards.add(i);
        }
        int c=1;
i
        // while (((int) queCards.size()) >= 2)
        // {
        //     System.out.println(c);
        //     queCards.remove();
        //     queCards.add(queCards.peek());
        //     queCards.remove();  
        //     c++;
        // }
        return queCards.peek();
    }
    public static void main(String[] args)
    {
        int n = 10000;
        System.out.println(remainingCard(n));
    }
}