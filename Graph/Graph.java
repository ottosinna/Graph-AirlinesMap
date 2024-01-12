class Graph<T> implements GraphInterface<T> {

	public static final int NULL_EDGE = 0;
	private int numVertices;
	private T[] vertices;
	private int[][] edges;
	
	public Graph(int size) {
		numVertices = 0;
		vertices = (T[]) new Object[size];
		edges = new int[size][size];		
	}
	
	public void addVertex(T vertex) {
		vertices[numVertices] = vertex;
		for(int index = 0; index < numVertices; index++) {
			edges[numVertices][index] = NULL_EDGE;
			edges[index][numVertices] = NULL_EDGE;
		}
		numVertices++;
	}
	
	public void addEdge(T fromVertex, T toVertex, int weight) {
		int from = indexIs(fromVertex);
		int to = indexIs(toVertex);
		edges[from][to] = weight;
	}
	
	private int indexIs(T vertex) {
		int index = 0;
		while(!vertex.equals(vertices[index])) { index++; }
		return index;
	}
	
	public boolean isEmpty() { 
		return numVertices == 0;
	}
	
	public boolean isFull() { 
		return numVertices == vertices.length;
	}
	
	//checks to see if Vertex exists in Graph
	public boolean hasVertex(T vertex) {
		for (int i = 0; i < numVertices; i++) {
			if (vertices[i].equals(vertex)) {
				return true;
			}
		}
		return false;
	}
	
	public int weightIs(T fromVertex, T toVertex) {
		int from = indexIs(fromVertex);
    	int to = indexIs(toVertex);
    	return edges[from][to];
	}
	
	public void printGraph() {
		for (int i = 0; i < numVertices; i++) {
			System.out.print(vertices[i] + " ---> ");
			for (int j = 0; j < numVertices; j++) {
				if (edges[i][j] != NULL_EDGE) {
					System.out.print(vertices[j] + " :(" + edges[i][j] + " miles) ");
				}
			}
			System.out.println();
		}
	}
}