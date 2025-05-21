import java.util.ArrayList;

public class FixMe {
    public static void main(String[] args) {
        // Test the method with different inputs
        ArrayList<Integer> list = new ArrayList<>(); 
        list.add(1);
        list.add(2);
        list.add(-1);
        list.add(3);
        list.add(-4);
        list.add(-5);
        list.add(6);

        removeNegatives(list);
        System.out.println(list);
    }

    /**
     * The method removes all elements smaller than zero from the list
     * @param list the list from which elements are removed
     */
    public static void removeNegatives(ArrayList<Integer> list) {
        int index = 0;
        while (index < list.size()) { 
            int element = list.get(index);
            if (element < 0) { 
                list.remove(index); 
            } else {
                index++;
            }
        }
    }
}
