package DSACCodingInt.Recursion;


import java.awt.*;
import java.util.ArrayList;
import java.util.List;

import DSACCodingInt.Recursion.Point;

/**
 *
 * Problem: Imagine a robot sitting on the upper left corner of grid with r rows
 * and c columns. The robot can only move in two directions, right and down, but
 * certain cells are "off limits" such that the robot cannot step on them.
 * Design an algorithm to find a path for the robot from the top left to the
 * bottom right.
 *
 */
public class RobotInMaze {




    public List<Point> robotPath(boolean[][] maze){
        List<Point> res =  new ArrayList<>();
        if(findPath(maze,maze.length-1, maze.length-1, res)){
                return res;
            }
        return null;
    }

    public boolean findPath(boolean[][] maze,int row,int col,List<Point> res){
        if(row<0||col<0||!maze[row][col]){
            return false;
        }
        boolean isOrigin = (row==0)&&(col==0);
        if(findPath(maze,row-1,col,res)||findPath(maze,row,col-1,res)||isOrigin){
            res.add(new Point(row,col));
            return true;

        }
        return false;
    }

    public void findAllPath(boolean[][] maze, int row, int col,List<List<Point>> result,List<Point> temp){
        if(row>=maze.length||col>=maze[0].length||maze[row][col]==false){
            return;
        }


        Point p =new Point(row,col);
        temp.add(p);
        if(row==maze.length-1&&col==maze[0].length-1){
            List<Point> path = new ArrayList<>();
            for(Point point : temp){
                path.add(new Point(point.x, point.y));
            }
            result.add(new ArrayList<>(path));
        }
        findAllPath(maze,row,col+1,result,temp);
        findAllPath(maze,row+1,col,result,temp);
        temp.remove(p);

    }
    public static void main(String args[]){

        boolean[][] maze = new boolean[3][3];
        for (int row = 0; row < maze.length; row++) {
            for (int col = 0; col<maze[0].length; col++) {
                maze[row][col] = true;
            }
        }

        RobotInMaze rb = new RobotInMaze();
        maze[1][1]=false;
        maze[0][1]=false;
        rb.robotPath(maze).stream().forEach(x->System.out.println(x));
        List<List<Point>> result = new ArrayList<>();
        rb.findAllPath(maze,0,0,result,new ArrayList<>());
        System.out.println("---------------->All Paths");
        result.stream().forEach(x->System.out.println(x));


        rb.robotPath(maze).stream().forEach(x->System.out.println(x));
        result.stream().forEach(x->System.out.println(x));


    }

}


