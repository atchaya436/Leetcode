class Solution 
{
    public String longestCommonPrefix(String[] strs) 
    {
        if (strs == null || strs.length == 0)
            return "";

        String result = "";
        int i = 0;
        boolean x = true;

        while (x && i < strs[0].length())
        {
            char c = strs[0].charAt(i);

            for (int j = 1; j < strs.length; j++)
            {
                if (i >= strs[j].length() || strs[j].charAt(i) != c)
                {
                    x = false;
                    break;
                }
            }

            if (x)
            {
                result += c;
                i++;
            }
        }
        return result;
    }
}