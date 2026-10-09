class Solution {
    public int numJewelsInStones(String jewels, String stones) {
        int ans=0;
        for(int i=0;i<stones.length();i++){
            char ch=stones.charAt(i);
            boolean found=false;
            for(int j=0;j<jewels.length();j++){
                char ch1=jewels.charAt(j);
                if(ch==ch1){
                     found=true;
                    break;
                }
            }
            if(found== true){
                ans =ans+1;
            }
        }
        return ans;
        
    }
}