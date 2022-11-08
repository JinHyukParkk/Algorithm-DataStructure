package com.example.algotest.algo;

import java.util.ArrayList;
import java.util.Collections;

public class TravelPath {

    private static final String ICN = "ICN";
    private static final String SEPARATOR_CHAR = "/";

    String[][] tickets;
    boolean[] visited;
    ArrayList<String> resultList = new ArrayList<>();

    public String[] solution(String[][] tickets) {
        this.tickets = tickets;
        visited = new boolean[tickets.length];
        int count = 0;

        dfs(ICN, count, ICN);

        Collections.sort(resultList);

        return resultList.get(0).split(SEPARATOR_CHAR);
    }

    private void dfs(String startAirport, int count, String result) {
        if (count == tickets.length) {
            resultList.add(result);
            return;
        }

        for (int i = 0; i < tickets.length; i++) {
            if (!visited[i] && startAirport.equals(tickets[i][0])) {
                visited[i] = true;
                dfs(tickets[i][1], count + 1, result + "/" + tickets[i][1]);
                visited[i] = false;
            }
        }
    }
}
