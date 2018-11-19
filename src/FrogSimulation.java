public class FrogSimulation
{
    private int goalDistance;
    private int maxHops;
    public FrogSimulation(int dist,int numHops)
    {
        goalDistance= dist;
        maxHops = numHops;
    }
    private int hopDistance()
    {
        int a= (int)(Math.random()*32)-7;
        return a;
    }
    public boolean simulate()
    {
        int b;
        int a=0;
        int i=0;
        while(a<goalDistance&&i<=maxHops&&a>-1)
        {
            i++;
            b=hopDistance();
            a=a+b;
        }
        if(a>goalDistance&&i<=maxHops&&a>-1)
        {
            return true;
        }
        else {
            return false;
        }
    }
    public double runSimulations(int num)
    {
        int a=0;double re;int b=0;

        while(a<=num)
        {
            if(simulate())
            {
                b+=1;
            }
            a++;
        }
        re=(double) b/num;
        return re;
    }



}
