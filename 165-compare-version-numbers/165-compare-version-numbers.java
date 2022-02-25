class Solution {
    public int compareVersion(String version1, String version2) {
        String []v1 = version1.split("\\.");
        String []v2 = version2.split("\\.");
        
        for(int i = 0,j = 0;i < v1.length || j < v2.length;i++,j++){
            int one = i < v1.length ? Integer.parseInt(v1[i]) : 0;
            int two = j < v2.length ? Integer.parseInt(v2[j]) : 0;
            if(one > two){
                return 1;  
            }else if(two > one){
                return -1;
            }
        }
        
        return 0;
    }
}