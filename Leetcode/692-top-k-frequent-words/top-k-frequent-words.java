class Solution {
    public List<String> topKFrequent(String[] words, int k) {
        HashMap<String,Integer> hmap=new HashMap<>();
        for(String i:words){
            hmap.put(i,hmap.getOrDefault(i,0)+1);
        }
        PriorityQueue<String> pq=new PriorityQueue<>(
            (a,b)->{
                int freqA=hmap.get(a);
                int freqB=hmap.get(b);
                if(freqA!=freqB){
                    return Integer.compare(freqA,freqB);
                }
                return b.compareTo(a);
            }
        );
        for(String a:hmap.keySet()){
            pq.offer(a);
            if(pq.size()>k){
                pq.poll();
            }
        }
        List<String> result=new ArrayList<>();
        while(!pq.isEmpty()){
            result.add(pq.poll());
        }
        Collections.reverse(result);
        return result;
    }
}