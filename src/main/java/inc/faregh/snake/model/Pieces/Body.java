/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package inc.faregh.snake.model.Pieces;

import java.awt.Point;

/**
 *
 * @author Amir
 */
public class Body extends Piece {

    public Body(Point pos, String shapename) {
        super(pos, shapename);
    }

    public void move(Point p){
        this.pos = p;
    }

}
