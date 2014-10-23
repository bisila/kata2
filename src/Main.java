public class Main {
    
    public static void main(String args[]){
        int[] vector = new int[]{2, 2, 11, 4, 2, 6, 11, 2, 3, 5, 11, 5};
        Histogram h = new Histogram(vector);
        for (Integer key : h.keySet()) 
            System.out.println(key + ": " + h.get(key));
    }
    
}
