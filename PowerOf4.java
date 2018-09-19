public class PowerOf4 {
    public boolean checker(int x)
    {
        int z=0;
        while(x>3)
        {
            if(x%4!=0)
                break;
            else if(x/4==1)
            {
                z = 1;
                break;
            }
            else
                x=x/4;
        }

        if(z==1){
            return  true;
        }
        else
            return false;
    }
}
