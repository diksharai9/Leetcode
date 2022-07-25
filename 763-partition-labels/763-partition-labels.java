class Solution {
    public List<Integer> partitionLabels(String s) {
        Map<Character,Integer>h=new HashMap();
        for(int i=0;i<s.length();i++){
            h.put(s.charAt(i),i);
        }
        ArrayList<Integer>list=new ArrayList();
        int max=0;
        int n=-1;
        for(int i=0;i<s.length();i++){
            char ch=s.charAt(i);
            max=Math.max(max,h.get(ch));
            if(max==i){
                list.add(max-n);
                    n=max;
            }
            
        }
        return list;
    }
}