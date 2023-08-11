package adityaTeaches.stack;
import java.util.*;
public class AreaOFrectangleinbinarydata {
    public  static void main(String arg[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the size of Array");
        int n=sc.nextInt();
        System.out.println("Enter the value in Array");
        int[][] arr=new int[n][n];
        for(int i=0;i<n;i++)
        {
            for(int j=0;j<n;j++)
            {
            arr[i][j]=sc.nextInt();
            }
        }
        AreaOFrectangleinbinarydata obj=new AreaOFrectangleinbinarydata();
        System.out.println("This is maximum Area which is formed by any rectangle within given binaryArray:"+obj.mha(arr,n));
    }
    public int mha(int[][] nums,int n)
    {
        int[] ar=new int[n];
        int m=n;
        int max=0;
        for(int i=0;i<n;i++)
        {
            for(int j=0;j<m;j++)
            {
                if(nums[i][j]==0)
                {
                    ar[j]=0;
                }
                else
                {
                    ar[j]=ar[j]+nums[i][j];
                }
            }
            max=Math.max(max,findmax(ar,n));
        }
        return max;
    }
    public int findmax(int[]ar,int n)
    {
        for(int kk=0;kk<n;kk++)
        {
            System.out.print(ar[kk]);
        }
        int max=0;
        ArrayList<Integer>nsll=findelementinleft(ar,n);
        ArrayList<Integer>nsrr=findelementinright(ar,n);
        ArrayList<Integer>height=new ArrayList<Integer>();
        for(int i=0;i<n;i++)
        {
            height.add((nsrr.get(i)-nsll.get(i)-1));
        }
        for(int j=0;j<n;j++)
        {
            max=Math.max(max,(height.get(j)*ar[j]));
        }
        System.out.println("this is:"+max);
        return max;
    }
    public ArrayList<Integer> findelementinleft(int[]num,int n)
    {
        Stack <Integer> stack=new Stack<Integer>();
        ArrayList<Integer> res=new ArrayList<Integer>();
        for(int i=0;i<n;i++)
        {
            if(stack.empty())
            {
                res.add(-1);
            }
            else if(stack.size()>0 && num[stack.peek()]<num[i])
            {
                res.add(stack.peek());
            }
            else if(stack.size()>0&&num[stack.peek()]>=num[i])
            {
                while(stack.size()>0&&num[stack.peek()]>=num[i])
                {
                    stack.pop();
                }
                if(stack.size()<=0)
                {
                    res.add(-1);
                }
                else
                {
                    res.add(stack.peek());
                }
            }
            stack.push(i);
        }
        return res;
    }
    public ArrayList<Integer> findelementinright(int[]num,int n)
    {
        Stack <Integer> stack=new Stack<Integer>();
        ArrayList<Integer> res=new ArrayList<Integer>();
        for(int i=n-1;i>=0;i--)
        {
            if(stack.empty())
            {
                res.add(-1);
            }
            else if(stack.size()>0 && num[stack.peek()]<num[i])
            {
                res.add(stack.peek());
            }
            else if(stack.size()>0&&num[stack.peek()]>=num[i])
            {
                while(stack.size()>0&&num[stack.peek()]>=num[i])
                {
                    stack.pop();
                }
                if(stack.size()<=0)
                {
                    res.add(-1);
                }
                else
                {
                    res.add(stack.peek());
                }
            }
            stack.push(i);
        }
        stack=new Stack<Integer>();
        ArrayList<Integer>reverse=new ArrayList<Integer>();
        for(int KK:res)
        {
            stack.push(KK);
        }
        while(!stack.empty())
        {
            reverse.add(stack.peek());
            stack.pop();
        }
        return reverse;
    }
}