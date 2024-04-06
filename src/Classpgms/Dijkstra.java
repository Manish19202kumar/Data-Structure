package Classpgms;
import java.util.*;
public class Dijkstra {
	    public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);

	        System.out.print("Enter the number of vertices: ");
	        int vertices = scanner.nextInt();

	        // Initialize adjacency matrix to represent the graph
	        int[][] graph = new int[vertices][vertices];

	        System.out.println("Enter the weighted adjacency matrix for the graph:");
	        for (int i = 0; i < vertices; i++) {
	            for (int j = 0; j < vertices; j++) {
	                graph[i][j] = scanner.nextInt();
	            }
	        }

	        System.out.print("Enter the starting vertex: ");
	        int startVertex = scanner.nextInt();

	        dijkstra(graph, startVertex);
	    }

	    // Dijkstra's algorithm to find the shortest paths
	    private static void dijkstra(int[][] graph, int startVertex) {
	        int vertices = graph.length;
	        int[] dist = new int[vertices];
	        boolean[] visited = new boolean[vertices];

	        Arrays.fill(dist, Integer.MAX_VALUE);
	        dist[startVertex] = 0;

	        for (int i = 0; i < vertices - 1; i++) {
	            int u = minDistance(dist, visited);
	            visited[u] = true;

	            for (int v = 0; v < vertices; v++) {
	                // Update distance if not visited, there is an edge, and the new path is shorter
	                if (!visited[v] && graph[u][v] != 0 && dist[u] != Integer.MAX_VALUE
	                        && dist[u] + graph[u][v] < dist[v]) {
	                    dist[v] = dist[u] + graph[u][v];
	                }
	            }
	        }

	        // Print the shortest distances from the start vertex
	        System.out.println("Shortest distances from vertex " + startVertex + ":");
	        for (int i = 0; i < vertices; i++) {
	            System.out.println("To vertex " + i + ": " + dist[i]);
	        }
	    }

	    // Helper method to find the vertex with the minimum distance
	    private static int minDistance(int[] dist, boolean[] visited) {
	        int min = Integer.MAX_VALUE;
	        int minIndex = -1;

	        for (int i = 0; i < dist.length; i++) {
	            if (!visited[i] && dist[i] <= min) {
	                min = dist[i];
	                minIndex = i;
	            } 
	        }
	        return minIndex;
	    }
	}
