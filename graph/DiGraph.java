package graph;

import java.util.List;
 

public interface DiGraph {
	public Boolean addNode(GraphNode node);
	public Boolean removeNode(GraphNode node);
	public Boolean setNodeValue(GraphNode node, String newNodeValue);
	public String getNodeValue(GraphNode node);
	
	public Boolean addEdge(GraphNode fromNode, GraphNode toNode, Integer weight);
	public Boolean removeEdge(GraphNode fromNode, GraphNode toNode);
	public Boolean setEdgeValue(GraphNode fromNode, GraphNode toNode, Integer newWeight);
	public Integer getEdgeValue(GraphNode fromNode, GraphNode toNode);

	public List<GraphNode> getAdjacentNodes(GraphNode node);
	public Boolean nodesAreAdjacent(GraphNode fromNode, GraphNode toNode);
	public Boolean nodeIsReachable(GraphNode fromNode, GraphNode toNode);
	public Boolean hasCycles();
	
	public List<GraphNode> getNodes();
	public GraphNode getNode(String nodeValue);
	
	public int fewestHops(GraphNode fromNode, GraphNode toNode);
	public int shortestPath(GraphNode fromNode, GraphNode toNode);

}
