class Solution {
    public String simplifyPath(String path) {
         ArrayList<String> st=new ArrayList<>();
        String[] ans = path.split("/");
        int top=-1;
        for(String s:ans)
        {
            if(s.equals("") || s.equals("."))
                continue;
            else if(s.equals(".."))
            {
                if(top>-1)
                {
                    st.remove(top);
                    top--;
                }
            }
            else
            {
                st.add("/"+s);
                top++;
            }
        }
        if(top==-1)
            return "/";
        StringBuilder sb=new StringBuilder();
        for(String str:st)
            sb.append(str);
        return sb.toString();
        
    }
}