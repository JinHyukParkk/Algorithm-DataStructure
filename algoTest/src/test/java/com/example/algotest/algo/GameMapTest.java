package com.example.algotest.algo;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.jupiter.api.Test;

class GameMapTest {

    GameMap gameMap = new GameMap();

    @Test
    void case1() {
        int[][] maps = {{1, 0, 1, 1, 1}, {1, 0, 1, 0, 1}, {1, 0, 1, 1, 1}, {1, 1, 1, 0, 1},
                {0, 0, 0, 0, 1}};

        int answer = 11;

        assertThat(gameMap.solution(maps)).isEqualTo(answer);
    }

    @Test
    void case2() {
        int[][] maps = {{1, 0, 1, 1, 1}, {1, 0, 1, 0, 1}, {1, 0, 1, 1, 1}, {1, 1, 1, 0, 0},
                {0, 0, 0, 0, 1}, {0, 0, 0, 0, 1}};

        int answer = -1;

        assertThat(gameMap.solution(maps)).isEqualTo(answer);
    }
}
