class GraphDriver {
	public static void main(String[] args) {
	// Pick String type for the Graph class (Strings can represent cities)
		Graph<String> graph = new Graph<>(5);
	// Add 5 vertices
		graph.addVertex("Downey");
        graph.addVertex("Santa Ana");
        graph.addVertex("Long Beach");
        graph.addVertex("Inglewood");
        graph.addVertex("Glendale");
	// Add edges between each vertex (pick which vertices you want to connect (i.e. add an Edge to and from))
		graph.addEdge("Downey", "Santa Ana", 22);
        graph.addEdge("Santa Ana", "Long Beach", 28);
        graph.addEdge("Long Beach", "Inglewood", 21);
        graph.addEdge("Inglewood", "Glendale", 20);
        graph.addEdge("Glendale", "Downey", 23);
	// call isEmpty
		System.out.println("Graph Empty? " + graph.isEmpty());
	// call isFull
		System.out.println("Graph Full? " + graph.isFull());
	// call hasVertex for 2 vertices (this checks to see if a particular vertex exists in the Graph, pick any)
		System.out.println("Does graph have vertex of Long Beach? " + graph.hasVertex("Long Beach"));
        System.out.println("Does graph have vertex of Santa Ana? " + graph.hasVertex("Santa Ana"));
	// call weightIs for 3 vertices (pick any)	
		System.out.println("Weight:  Downey and Santa Ana: " + graph.weightIs("Downey", "Santa Ana"));
        System.out.println("Weight:  Long Beach and Inglewood: " + graph.weightIs("Long Beach", "Inglewood"));
        System.out.println("Weight:  Glendale and Downey: " + graph.weightIs("Glendale", "Downey"));
		System.out.println("------------------------------------------------------------------------------------------------");
	// call printGraph (this should print out all the vertices array and the 2D edges array which shows the weights between the vertices)
		graph.printGraph();
	
    }
}

/*public static void main(String[] args) {
        // Create a graph of size 5
        Graph<String> graph = new Graph<>(5);

        // Add vertices to the graph
        graph.addVertex("A");
        graph.addVertex("B");
        graph.addVertex("C");
        graph.addVertex("D");
        graph.addVertex("E");

        // Add edges between vertices with weights
        graph.addEdge("A", "B", 2);
        graph.addEdge("A", "C", 5);
        graph.addEdge("B", "C", 1);
        graph.addEdge("B", "D", 6);
        graph.addEdge("C", "D", 3);
        graph.addEdge("D", "E", 4);

        // Print the graph
        graph.printGraph();

        // Check if the graph is empty or full
        System.out.println("Is the graph empty? " + graph.isEmpty());
        System.out.println("Is the graph full? " + graph.isFull());

        // Check if specific vertices exist in the graph
        System.out.println("Does the graph have vertex 'A'? " + graph.hasVertex("A"));
        System.out.println("Does the graph have vertex 'F'? " + graph.hasVertex("F"));

        // Check weight between vertices
        System.out.println("Weight between A and B: " + graph.weightIs("A", "B"));
        System.out.println("Weight between B and D: " + graph.weightIs("B", "D"));
        System.out.println("Weight between C and E: " + graph.weightIs("C", "E"));
		*/