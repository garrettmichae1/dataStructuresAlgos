package csci2010.adjacencylistdemo;

/**
 * @author Garrett Woodside
 */
public class AdjacencyListDemo {

    //adjecencyList = an array / list of linkedlists.
    // each linked list has a unique node at the head.
    //all adjacent neighbors to that node are added to that node's linked list.
    //runtime complexity to check an edge: O(v)
    // spacetime complexity of O(v + e)
    public static void main(String[] args) {

        Graph graph = new Graph();

        graph.addNode(new Node('A'));
        graph.addNode(new Node('B'));
        graph.addNode(new Node('C'));
        graph.addNode(new Node('D'));
        graph.addNode(new Node('E'));

        graph.addEdge(0, 1);
        graph.addEdge(1, 2);
        graph.addEdge(1, 4);
        graph.addEdge(2, 3);
        graph.addEdge(2, 4);
        graph.addEdge(4, 0);
        graph.addEdge(4, 1);
        
        graph.print();

    }
}
