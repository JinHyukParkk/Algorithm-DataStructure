package com.example.algotest.algo;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.jupiter.api.Test;

class TravelPathTest {

    TravelPath travelPath = new TravelPath();

    @Test
    void case1() {
        String[][] tickets = {{"ICN", "JFK"}, {"HND", "IAD"}, {"JFK", "HND"}};

        String[] result = {"ICN", "JFK", "HND", "IAD"};

        String[] answer = travelPath.solution(tickets);

        for (int i = 0; i < answer.length; i++) {
            assertThat(answer[i]).isEqualTo(result[i]);
        }
    }

    @Test
    void case2() {
        String[][] tickets = {{"ICN", "SFO"}, {"ICN", "ATL"}, {"SFO", "ATL"}, {"ATL", "ICN"},
                {"ATL", "SFO"}};

        String[] result = {"ICN", "ATL", "ICN", "SFO", "ATL", "SFO"};

        String[] answer = travelPath.solution(tickets);

        for (int i = 0; i < answer.length; i++) {
            assertThat(answer[i]).isEqualTo(result[i]);
        }
    }
}
