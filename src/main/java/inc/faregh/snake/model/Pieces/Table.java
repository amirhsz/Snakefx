/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package inc.faregh.snake.model.Pieces;

import inc.faregh.snake.model.Strategy.Strategy;
import java.awt.Point;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

/**
 *
 * @author Amir
 */
public class Table {

    private final Strategy strategy;
    private Snake snake;
    private List<Piece> pieces;
    private final int height,width;

    public Table(Strategy strategy,int width, int height){
        this.strategy = strategy;
        this.width = width;
        this.height = height;
        pieces = new ArrayList<>();
        Random rnd = new Random();
        Body bfirst = new Body(new Point(rnd.nextInt(width),
                rnd.nextInt(height)),strategy);
        Fruit ffirst = new Fruit(new Point(rnd.nextInt(width),
                rnd.nextInt(height)),strategy);
        pieces.add(bfirst);
        pieces.add(ffirst);
        snake = new Snake(this);
    }

    public Table(Strategy strategy,int width, int height,Body bf, Fruit ff){
        this.strategy = strategy;
        this.width = width;
        this.height = height;
        pieces = new ArrayList<>();
        pieces.add(bf);
        pieces.add(ff);
        snake = new Snake(this);
    }

    public Strategy getStrategy() {
        return strategy;
    }

    public Snake getSnake() {
        return snake;
    }

    public List<Piece> getPieces() {
        return pieces;
    }

    public int getHeight() {
        return height;
    }

    public int getWidth() {
        return width;
    }

    public void addfruit(Fruit f){
        pieces.add(f);
    }

    public boolean intable(Point p){
        int x = p.x;
        int y = p.y;
        return(x>=0&&y>=0&&x<=width&&y<=height);
    }

    @Override
    public String toString(){
        return "a table with width: "+width+", height: "+height+", snake: "+snake;
    }

}
