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
public class Body extends Piece {

    public Body(Point pos, Strategy s) {
        super(pos, s);
        this.shapename = s.getBody();
        
    }

    public void move(Point p){
        this.pos = p;
    }

}
