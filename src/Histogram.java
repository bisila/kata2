import java.util.HashMap;
import java.util.Set;

public class Histogram {

    private final HashMap<Integer, Integer> data;
    
    public Histogram(int[] values) {
        data = new HashMap<>();
        init(values);
    }

    public Integer get(Object key) {
        return data.get(key);
    }

    public Set<Integer> keySet() {
        return data.keySet();
    }
    
    private int size() {
        return data.size();
    }

    private void init(int[] values) {
        for (int value : values) 
            add(value);
    }
    
    private void add(Integer value) {
        data.put(value, get(value) + 1);
    }

    private Integer get(Integer value) {
        if (data.containsKey(value)) return data.get(value);
        return 0;
    }

    
}
