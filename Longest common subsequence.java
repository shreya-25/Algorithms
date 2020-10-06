class LCS
{
    
    // function to find LCS
    
    static int memo[][]= new int[101][101];
    LCS()
    {
        for(int i=0;i<=100;i++)
        {
            for(int j=0;j<=100;j++)
                  memo[i][j]=-1;
        }
    }
    static int lcs(int p, int q, String s1, String s2)
    {
        // your code here
        if(memo[p][q]!=-1)
             return memo[p][q];
        if(p==0 || q==0)
             memo[p][q]=0;
        else
        {
            if(s1.charAt(p-1)==s2.charAt(q-1))
                  memo[p][q]=1+lcs(p-1,q-1,s1,s2);
            else
                  memo[p][q]= Math.max(lcs(p-1,q,s1,s2),lcs(p,q-1,s1,s2));
        }
        return memo[p][q];
             
    }
    
}
