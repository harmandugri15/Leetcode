import java.util.LinkedList;
import java.util.Queue;

class Solution { 
    public int timeRequiredToBuy(int[] tickets, int k) { 
        Queue<Integer> q = new LinkedList<>(); 
        int ro = 0; 
        for (int i = 0; i < tickets.length; i++) {
            q.add(i);
        }
        while (tickets[k] != 0) { 
            int idx = q.poll(); 
            tickets[idx]--;     
            ro++;               
            if (tickets[idx] > 0) { 
                q.add(idx); 
            } 
        } 
        return ro; 
    } 
}
