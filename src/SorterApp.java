import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;


class Learner {
    String name;
    int marks;

    public Learner(String name, int marks) {
        this.name = name;
        this.marks = marks;
    }

    public String toString() {
        return name + " - " + marks;
    }
}

// Renamed Sorter → GenericSorter
class GenericSorter<T> {
    public void sort(List<T> list, Comparator<T> comparator) {
        list.sort(comparator);
    }

    public static <T> boolean contains(List<T> list, T item) {
        return list.contains(item);
    }
}


public class SorterApp {
    public static void main(String[] args) {
        List<Learner> learners = new ArrayList<>();
        learners.add(new Learner("Hari", 90));
        learners.add(new Learner("Sai", 85));
        learners.add(new Learner("Neon", 95));

        GenericSorter<Learner> sorter = new GenericSorter<>();

        // Sort learners by marks (ascending)
        sorter.sort(learners, (l1, l2) -> l1.marks - l2.marks);

        System.out.println("Sorted Learners:");
        for (Learner l : learners) {
            System.out.println(l);
        }

        // Check if a specific learner exists
        boolean exists = GenericSorter.contains(learners, learners.get(0));
        System.out.println("First learner exists: " + exists);
    }
}
