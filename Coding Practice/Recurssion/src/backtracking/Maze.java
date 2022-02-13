package backtracking;

import java.util.ArrayList;

public class Maze {
    public static void main(String[] args) {
//        System.out.println(count(3,3));
//        path("", 3,3);
//        System.out.println(pathRet("",3,3));
//        System.out.println(pathDiagonal("",3,3));

        boolean[][] board ={
                {true, true, true},
                {true, false, true},
                {true, true, true}
        };

        pathRestrictions("", board,0,0);

    }

    static int count(int r,int c) {
        if (r == 1 || c == 1) {
            return 1;
        }
        int left = count(r - 1, c);
        int right = count(r, c - 1);
        return left + right;
    }

    static void path(String p, int r,int c) {
        // Make a note of it when you want to print whole path
        // then in base case you have to use && both R and C should have 1
        if (r == 1 && c == 1) {
            System.out.println(p);
            return;
        }
        if(r > 1) {
            path(p + 'D', r - 1, c);
        }
        if(c > 1) {
            path(p + 'R', r, c - 1);
        }
    }

    static ArrayList pathRet(String p, int r, int c) {
        // Make a note of it when you want to print whole path
        // then in base case you have to use && both R and C should have 1
        if (r == 1 && c == 1) {
            ArrayList<String> list = new ArrayList<>();
            list.add(p);
            return list;
        }

        ArrayList<String> list = new ArrayList<>();
        if(r > 1) {
            list.addAll(pathRet(p + 'D', r - 1, c));
        }
        if(c > 1) {
            list.addAll(pathRet(p + 'R', r, c - 1));
        }
        return list;
    }

    static ArrayList pathDiagonal(String p, int r, int c) {
        // Make a note of it when you want to print whole path
        // then in base case you have to use && both R and C should have 1
        if (r == 1 && c == 1) {
            ArrayList<String> list = new ArrayList<>();
            list.add(p);
            return list;
        }

        ArrayList<String> list = new ArrayList<>();
        if(r > 1 && c>1) {
            list.addAll(pathDiagonal(p + 'D', r - 1, c-1));
        }

        if(r > 1) {
            list.addAll(pathDiagonal(p + 'V', r - 1, c));
        }
        if(c > 1) {
            list.addAll(pathDiagonal(p + 'H', r, c - 1));
        }
        return list;
    }

    static void pathRestrictions(String p, boolean[][] maze , int r,int c) {
        // Make a note of it when you want to print whole path
        // then in base case you have to use && both R and C should have 1

        if (r == maze.length-1 && c == maze[0].length-1) { // if you don't have any
            // what is maze.length & maze[0].length
            System.out.println(p);
            return;
        }
        if(!maze[r][c]){
            return;
        }

        if(r < maze.length-1) {
            pathRestrictions(p + 'D', maze,r + 1, c);
        }
        if(c < maze[0].length- 1) {
            pathRestrictions(p + 'R', maze ,r, c + 1);
        }
    }

}
//commit
