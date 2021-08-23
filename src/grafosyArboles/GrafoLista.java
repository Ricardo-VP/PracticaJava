package grafosyArboles;

import java.util.ArrayList;

public class GrafoLista {

	public void addEdge(ArrayList<ArrayList<Integer>> adj, int u, int v) {
		adj.get(u).add(v);
		adj.get(v).add(u);
	}
	
	// Imprimir o graficar
	public void printGrafo(ArrayList<ArrayList<Integer>> adj) {
		for(int i = 0; i<adj.size(); i++) {
			System.out.println("\n Lista de adyacencia del vertice " + 1);
			System.out.println("head");
			for(int j = 0; j<adj.get(i).size(); j++) {
				System.out.print("-->"+ adj.get(i).get(j));
			}
		}
	}
	
	public static void main(String[] args) {
		// Grafo con 5 vertices
		int V = 5;
		// Construir la lista
		ArrayList<ArrayList<Integer>> adj = new ArrayList<ArrayList<Integer>> (V);
		// Crear el grafo
		
		GrafoLista adj1 = new GrafoLista();	
		
		// Inicializando toda la lista de los datos
		for(int i = 0; i<V; i++) {
			adj.add(new ArrayList<Integer>());
		}
		
		// agregar nodos
		adj1.addEdge(adj, 0, 1);
		adj1.addEdge(adj, 0, 4);
		adj1.addEdge(adj, 1, 2);
		adj1.addEdge(adj, 1, 3);
		adj1.addEdge(adj, 1, 4);
		adj1.addEdge(adj, 2, 3);
		adj1.addEdge(adj, 3, 4);
		
		// imprimir el grafo
		adj1.printGrafo(adj);

	}

}
