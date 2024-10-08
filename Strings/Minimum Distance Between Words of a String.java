ublic class Assignment {
    public static int shortestDistance(List<String> list,String w1,String w2 )
    {
        int ans=Integer.MAX_VALUE;
        int lastPos=-1;

        for(int i=0;i<list.size();i++)
        {
            if(list.get(i).equals(w1) ||list.get(i).equals(w2))
            {
                if(lastPos==-1)
                {
                    lastPos=i;
                }
                else {
                    if(list.get(lastPos).equals(list.get(i)))
                    {
                        lastPos=i;
                    }
                    else {
                        ans=Math.min(ans,((i-lastPos)-1));
                        lastPos=i;
                    }
                }
            }
        }
        return ans;
    }

    public static void main(String args[]) {
       String [] arr={"geeks","for","geeks","contribute","practice"};
        List<String> list=Arrays.asList(arr);
        String w1 = "geeks";
        String w2 = "practice";
        System.out.println(shortestDistance(list, w1, w2));
    }
    }
