package grafosyArboles;

public class GrafoMatriz {

	// Grafo representando a traves de una matriz de adyacencia
	
	// Dos variables
	private boolean adjMatriz[][]; // A partir de los datos que tenga me representa los vertices agregados 
	private int numVertices;
	
	// Inicializar la mtriz
	
	public GrafoMatriz(int numVertices) {
		this.numVertices = numVertices;
		adjMatriz = new boolean[numVertices][numVertices];
	}
	
	// add nodos
	
	public void addEdge(int i, int j) {
		adjMatriz[i][j] = true;
		adjMatriz[j][i] = true;
	}
	
	// remover nodos
	
	public void removeEdge(int i, int j) {
		adjMatriz[i][j] = false;
		adjMatriz[j][i] = false;
	}
	
	// imprimir matriz
	
	public String toString() {
		StringBuilder s = new StringBuilder();
		for(int i=0; i<numVertices; i++) {
			s.append(i + ": ");
			for(boolean j:adjMatriz[i]) {
				s.append((j ? 1: 0) + " ");
			}
			s.append("\n");
		}
		return s.toString();
	}
	
	public static void main(String[] args) {
		GrafoMatriz g = new GrafoMatriz(4);
		g.addEdge(0, 1);
		g.addEdge(0, 2);
		g.addEdge(1, 2);
		g.addEdge(2, 0);
		g.addEdge(2, 3);
		
		System.out.println(g.toString());
	}

}
