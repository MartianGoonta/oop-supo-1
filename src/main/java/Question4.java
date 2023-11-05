package src.main.java;

public class Question4 {
    public int sum(int[] a)
    {
        int total = 0;
        for (int i = 0; i < a.length; i++)
        {
            total += a[i];
        }
        return total;
    } 

    public int[] cumsum(int[] a)
    {
        int [] result = new int[a.length];
        int total = 0;
        int count = 0;
            while (count < a.length)
            {
                total += a[count];
                result[count] = total;
                count++;
            }
        return result;
    }

    public int[] positives(int[] a)
    {
        
        int positives = 0;
        for (int current : a)
        {
            if (current >0)
            {
                positives++;
            }
        }
        int[] result = new int[positives];
        int index = 0;

        for (int current : a)
        {
            if (current > 0)
            {
                result[index] = current;
                index ++ ;
            }
        }
        return result;
    }
}
