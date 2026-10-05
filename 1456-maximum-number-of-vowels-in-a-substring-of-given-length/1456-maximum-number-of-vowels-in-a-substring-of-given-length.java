class Solution {
    public int maxVowels(String s, int k) {

        int windowLeft = 0;
        int windowVowelsCount = 0;
        int maxVowelsCount = 0;//1

    //    a b c i i i d e f 

    for(int windowRight = 0; windowRight < s.length(); windowRight++)
    {
        char recievedChar = s.charAt(windowRight);

        if(recievedChar == 'a' || recievedChar == 'e' || recievedChar == 'i' 
        || recievedChar == 'o' || recievedChar == 'u'  )
        {
            windowVowelsCount++;
        }
    

   if(windowRight - windowLeft + 1 == k )
   {
       maxVowelsCount = Math.max(windowVowelsCount,maxVowelsCount );

        char left = s.charAt(windowLeft);
        
        if(left == 'a' ||left == 'e' ||left == 'i' ||left == 'o' ||
        left == 'u')
        {
            windowVowelsCount--;
        }

       windowLeft++;

      
   }
    }
    return maxVowelsCount;

        
    }
}