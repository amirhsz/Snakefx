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
public class Fruit extends Piece {

    public Fruit(Point pos, Strategy s) {
        super(pos, s);
        shapename = s.getFruit();
    }

}
