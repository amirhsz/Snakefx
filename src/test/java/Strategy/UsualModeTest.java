/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Strategy;

import inc.faregh.snake.model.Pieces.Body;
import inc.faregh.snake.model.Pieces.Fruit;
import inc.faregh.snake.model.Pieces.Snake;
import inc.faregh.snake.model.Pieces.Table;
import inc.faregh.snake.model.Strategy.UsualMode;
import java.awt.Point;
import org.junit.Test;
import static org.junit.Assert.*;
import org.junit.Before;
import org.junit.Ignore;

/**
 *
 * @author Amir
 */
public class UsualModeTest {

    Table t;
    UsualMode instance;

    @Before
    public void setup(){
        instance = UsualMode.getinstance();
        Fruit tar = new Fruit(new Point(0,4),instance);
        t = new Table(instance,8,8,new Body(new Point(0,3),instance),tar);
        Snake s = t.getSnake();
        System.out.println(s);
        s.move(new Point(0,4));
        System.out.println(s);
        tar = new Fruit(new Point(1,4),instance);
        t.addfruit(tar);
        s.move(tar.getPos());
        System.out.println(s);
    }

    /**
     * Test of execute method, of class UsualMode.
     */
    @Test
    public void testExecute() {
        System.out.println("execute:");
        Point p[] = {new Point(0,0),new Point(2,4),new Point(0,4)};
        boolean exc[] = {false,true,false};
        boolean result[] = new boolean[p.length];
        for(int i = 0 ; i<p.length ; i++){
            result[i] = instance.execute(p[i],t);
        }
        assertArrayEquals(exc, result);
    }

    /**
     * Test of is near method, of class UsualMode.
     */
    @Test
    public void testisnear() {
        System.out.println("is near:");
        Point a[] = {new Point(0,0),
        new Point(10,0),new Point(0,0),new Point(0,1),new Point(1,1)};
        Point b[] = {new Point(0,0),
        new Point(11,0),new Point(10,0),new Point(0,0),new Point(2,2)};
        boolean expResult[] = {false,true,false,true,false};
        boolean result[] = new boolean[a.length];
        for(int i = 0 ; i<a.length ; i++){
            result[i] = instance.isnear(a[i], b[i]);
        }
        assertArrayEquals(expResult, result);
    }

}
