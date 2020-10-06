class LCS
{
     
     static int lcs(int p, int q, String s1, String s2)
     {
      
        int memo[][]= new int[p+1][q+1];
        if(p==0 || q==0)
        memo[p][q]=0;
        else
        {
            for(int i=1;i<=p;i++)
            {
                for(int j=1;j<=q;j++)
                {
                     if(s1.charAt(i-1)==s2.charAt(j-1))
                            memo[i][j]=1+memo[i-1][j-1];
                     else
                            memo[i][j]= Math.max(memo[i][j-1],memo[i-1][j]);
                }
            }
        
        }
        
       return memo[p][q];    
    }
    
}
