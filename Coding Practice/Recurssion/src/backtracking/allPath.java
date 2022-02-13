package backtracking;

import java.util.Arrays;

public class allPath {
    public static void main(String[] args) {
        boolean[][] board = {
                {true, true, true},
                {true, true, true},
                {true, true, true}
        };

        allPath("", board,0, 0);


        int[][] path = new int[board.length][board[0].length];
        allPathStep("", board, 0,0, path,1);

    }


    static void allPath(String p, boolean[][] maze, int r, int c) {
        // Make a note of it when you want to print whole path
        // then in base case you have to use && both R and C should have 1

        //checkout video for this at 1:07 min time stamp in the given video link
        //https://www.youtube.com/watch?v=zg5v2rlV1tM&list=PL9gnSGHSqcnp39cTyB1dTZ2pJ04Xmdrod&index=10

        if (r == maze.length - 1 && c == maze[0].length - 1) { // if you don't have any
            // what is maze.length & maze[0].length
            System.out.println(p);
            return;
        }

        if (!maze[r][c]) {
            return;    // if it false means return it
        }
            // if it is not false means that we can consider this path in my block
            maze[r][c] = false;

            if (r < maze.length - 1) {
                allPath(p + 'D', maze, r + 1, c);
            }
            if (c < maze[0].length - 1) {
                allPath(p + 'R', maze, r, c + 1);
            }

            if (r > 0) {
                allPath(p + 'U', maze, r - 1, c);
            }

            if (c > 0) {
                allPath(p + 'L', maze, r, c - 1);
            }

            // this is the line where the function will be over
            // so before the function gets removed , also removed the changes were made by that function
            maze[r][c] = true;


        }


        static void allPathStep(String p, boolean[][] maze, int r, int c,int[][] path, int steps) {
        // Make a note of it when you want to print whole path
        // then in base case you have to use && both R and C should have 1

        //checkout video for this at 1:07 min time stamp in the given video link
        //https://www.youtube.com/watch?v=zg5v2rlV1tM&list=PL9gnSGHSqcnp39cTyB1dTZ2pJ04Xmdrod&index=10

        if (r == maze.length - 1 && c == maze[0].length - 1) { // if you don't have any
            // what is maze.length & maze[0].length

            path[r][c]  = steps;  // this last step is also a step so so it shoul also be considered
            for (int[]arr :path) {
                System.out.println(Arrays.toString(arr));
            }

            System.out.println(p);
            return;
        }

        if (!maze[r][c]) {
            return;    // if it false means return it
        }

        // if it is not false means that we can consider this path in my block
            maze[r][c] = false;
            path[r][c]  = steps;

            if (r < maze.length - 1) {
                allPathStep(p + 'D', maze, r + 1, c, path, steps + 1);
            }
            if (c < maze[0].length - 1) {
                allPathStep(p + 'R', maze, r, c + 1, path, steps + 1);
            }

            if (r > 0) {
                allPathStep(p + 'U', maze, r - 1, c, path, steps + 1);
            }

            if (c > 0) {
                allPathStep(p + 'L', maze, r, c - 1, path, steps + 1);
            }

            // this is the line where the function will be over
            // so before the function gets removed , also removed the changes were made by that function
            maze[r][c] = true;
            path[r][c] = 0;
        }


}

