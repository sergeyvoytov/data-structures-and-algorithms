package code401challenges.graph;

import java.util.ArrayList;
import java.util.HashSet;

public class GetEdge {
    public static String getEdge(Graph graph, String[] cities) {

        if (cities.length <= 0 || graph.listNodes.size() == 0) return "False,0";

        Node currentCity = null;

        ArrayList<Edge> neighbors;

        int cost = 0;

        boolean hasDirectFlight = false;

        for (Node node : graph.listNodes) {
            if (cities[0] != null) {
                currentCity = node;
            }
        }


        if (currentCity == null) return "False,0";


        for (int i = 1; i < cities.length; i++) {

            neighbors = currentCity.listEdges;

            for (Edge edge : neighbors) {
                if (edge != null) {
                    cost += (int) edge.weight;
                    currentCity = edge.nextNode;
                    hasDirectFlight = true;
                }
            }
            if (hasDirectFlight) {
                hasDirectFlight = false;
            } else {
                return "False,0";
            }
        }
        return "True" + cost;
    }
}
