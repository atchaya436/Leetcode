class Solution 
{
    public int lengthOfLastWord(String s) 
    {
        int count=0;
        String[] words =s.trim().split("\\s");
        int length=words.length-1;
        String a=words[length];
        for(int i=0;i<a.length();i++)
        {
            count++;
        }
        return count;
    }
}