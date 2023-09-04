package se.codemnky.leetcode.Solution;

import java.util.*;

public class Solution {
    public boolean isValid(String[] plan, boolean[][] visited, int x, int y) {
        // We nedd to check that x is not larger than plan[x].length
        if (x >= 0 && x < plan.length && y >= 0 && y < plan[0].length()) {
            return plan[x].charAt(y) != '#' && !visited[x][y];
        } else {
            return false;
        }
    }

    public void bfs(String[] plan, boolean[][] visited, int x, int y) {
        int[] dx = {0, 0, 1, -1};
        int[] dy = {1, -1, 0, 0};

        Queue<Integer> qx = new LinkedList<>();
        Queue<Integer> qy = new LinkedList<>();
        qx.offer(x);
        qy.offer(y);
        while (!qx.isEmpty()) {
            x = qx.poll();
            y = qy.poll();
            for (int i = 0; i < 4; i++) {
                int nx = x + dx[i], ny = y + dy[i];
                if (isValid(plan, visited, nx, ny)) {
                    visited[nx][ny] = true;
                    qx.offer(nx);
                    qy.offer(ny);
                }
            }
        }
    }

    public int solution(String[] plan) {
        int n = plan.length, m = plan[0].length();
        boolean[][] visited = new boolean[n][m];

        int robots = 0;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                if (plan[i].charAt(j) == '*' && !visited[i][j]) {
                    bfs(plan, visited, i, j);
                    robots++;
                }
            }
        }
        return robots;
    }
}
