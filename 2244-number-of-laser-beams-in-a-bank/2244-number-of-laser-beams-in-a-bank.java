class Solution {
    public int numberOfBeams(String[] bank) {
        int prev=0;int sum=0;int i=0;
        while(i<bank.length){
            char[] ch=bank[i].toCharArray();
            int count=0;
            for(int j=0;j<ch.length;j++){
                if(ch[j]=='1'){count++;}
            }
            if(prev!=0){sum+=(prev*count);}
            if(count!=0){prev=count;}
            i++;
        }
        return sum;
    }
}