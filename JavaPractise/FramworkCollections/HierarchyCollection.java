package JavaPractise.FramworkCollections;

public class HierarchyCollection {
    /*
    ===== Java Collection Framework Hierarchy =====

                            Collection (Interface)
                           /            |                   \
                     List(Interface)  Set(Interface)    Queue  (Interfaces)
                         |              |                               \
          -----------------          -------------------                 \
          |      |        |           |                |         |        \
   ArrayList  LinkedList Vector     HashSet         SortedSet(interface)   \
                           |           |                |                   \
                         Stack    LinkedHashSet      NavigableSet(interface) \
                                                        |                     \
                                                       TreeSet                 \
                                                                                \
                                                                    PriorityQueue  ArrayDeque

    ➡ List:
       - Ordered collection (insertion order preserved).
       - Allows duplicate elements.
       - Implementations: ArrayList, LinkedList, Vector.

    ➡ Set:
       - Unordered (HashSet, LinkedHashSet) or Sorted (TreeSet).
       - Does NOT allow duplicate elements.

    ➡ Queue:
       - Typically used for holding elements prior to processing.
       - Follows FIFO (First In First Out).
       - Implementations: PriorityQueue, ArrayDeque.


    💡 NOTE:
    - Collection is the ROOT INTERFACE for List, Set, and Queue.
    - Map (HashMap, TreeMap) is NOT part of the Collection interface
      but is part of the Java Collections Framework.
*/
    /*
    ===== Java Collections Framework: Map Hierarchy =====

                        Map (Interface)
                           /      \
                  HashMap         SortedMap (Interface)
                     |                  |
           LinkedHashMap           TreeMap

     */

}
