package inc.faregh.snake.model.Pieces;
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import inc.faregh.snake.model.Strategy.Strategy;
import java.awt.Point;

/**
 *
 * @author Amir
 */
public abstract class Piece {

    protected Point pos;
    protected String shapename;
    protected Strategy s;

    public Piece(Point pos, Strategy s) {
        this.pos = pos;
        this.s = s;
    }

    public Point getPos() {
        return pos;
    }

    public String getShapename() {
        return shapename;
    }

    public Strategy getStrategy(){
        return s;
    }

    @Override
    public String toString(){
        return "a piece called: "+this.getClass().getSimpleName()+", in position: "+pos;
    }

}