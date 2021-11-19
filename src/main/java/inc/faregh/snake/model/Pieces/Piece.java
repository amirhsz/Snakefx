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
public abstract class Piece {
    Point pos;
    String shapename;

    public Piece(Point pos, String shapename) {
        this.pos = pos;
        this.shapename = shapename;
    }

    public Point getPos() {
        return pos;
    }

    public String getShapename() {
        return shapename;
    }

}