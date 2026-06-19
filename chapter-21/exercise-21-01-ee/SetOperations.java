import java.util.LinkedHashSet;
import java.util.Set;

public class SetOperations{
    public static void main(String[] args){
        LinkedHashSet<String> linkedHashSet1 = new LinkedHashSet<>();
        linkedHashSet1.add("George");
        linkedHashSet1.add("Jim");
        linkedHashSet1.add("John");
        linkedHashSet1.add("Blake");
        linkedHashSet1.add("Kevin");
        linkedHashSet1.add("Michael");

        LinkedHashSet<String> linkedHashSet2 = new LinkedHashSet<>();
        linkedHashSet2.add("George");
        linkedHashSet2.add("Katie");
        linkedHashSet2.add("Kevin");
        linkedHashSet2.add("Michelle");
        linkedHashSet2.add("Ryan");

        Set<String> union = new LinkedHashSet<>(linkedHashSet1);
        union.addAll(linkedHashSet2);

        System.out.println("The union of the two sets is " + union);

        Set<String> difference = new LinkedHashSet<>(linkedHashSet1);
        difference.removeAll(linkedHashSet2);

        System.out.println("The difference of the two sets is " + difference);

        Set<String> intersection = new LinkedHashSet<>(linkedHashSet2);
        intersection.retainAll(linkedHashSet2);

        System.out.println("The intersection of the two sets is " + intersection);
    }
}
