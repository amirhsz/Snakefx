/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package inc.faregh.snake.model.Strategy;

import java.awt.Point;
import inc.faregh.snake.model.Pieces.Table;

/**
 *
 * @author Amir
 */
public abstract class Strategy {

    protected String body,head,fruit;

    public String getBody() {
        return body;
    }

    public String getHead() {
        return head;
    }

    public String getFruit() {
        return fruit;
    }

    public abstract boolean execute(Point p,Table t);

    @Override
    public String toString() {
        return "a strategy called: "+this.getClass().getSimpleName();
    }

}
