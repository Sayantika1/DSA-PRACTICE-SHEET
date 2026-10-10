class Solution {
    public int minDays(int[] bloomDay, int m, int k) {

        if(bloomDay.length < (long)m*k)
        {
            return -1;
        }
        int low =Integer.MAX_VALUE;
        int high =Integer.MIN_VALUE;

        for(int days:bloomDay)
        {
            high = Math.max(high,days);
            low = Math.min(low,days);
        }

        while(low<high)
        {
            int mid = low+(high-low)/2;

            if(canmake(bloomDay,m,k,mid))
                high=mid;

            else 
                low=mid+1;
        }

        return low;
    }

    public boolean canmake(int[] bloomDay, int m, int k,int day)
    {
        int bouquet = 0;
        int flowers = 0;

        for(int bloomdays:bloomDay)
        {
            if(bloomdays<=day)
            {
                flowers++;

                if(flowers==k)
                {
                    bouquet++;
                    flowers=0;
                }
            }

            else
            {
                flowers=0;
            }

            if(bouquet>=m)
            {
                return true;
            }
        }
        return false;
    }
}