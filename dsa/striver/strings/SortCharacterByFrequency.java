package Practice.dsa.striver.strings;

import java.util.PriorityQueue;

public class SortCharacterByFrequency {
    class Pair{
        int count;
        char value;

        Pair(int i, char c){
            this.count = i;
            this.value = c;
        }
    }

    public String frequencySort(String s) {
        StringBuilder sb = new StringBuilder();
        PriorityQueue<Pair> pq = new PriorityQueue<Pair>((p1,p2)->{
            return p2.count - p1.count;
        });
        int[] count = new int[256];
        for(char c: s.toCharArray()){
            count[c]++;
        }
        for(int i=0;i<256;i++){
            if(count[i] != 0){
                pq.add(new Pair(count[i], (char)(i)));
            }
        }
        while(!pq.isEmpty()){
            Pair current = pq.poll();
            for(int i=0;i<current.count;i++){
                sb.append(current.value);
            }
        }
        return sb.toString();
    }
}