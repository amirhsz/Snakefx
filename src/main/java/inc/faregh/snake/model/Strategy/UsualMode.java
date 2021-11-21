/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package inc.faregh.snake.model.Strategy;

import inc.faregh.snake.model.Pieces.Table;
import java.awt.Point;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Amir
 */
public class UsualMode extends Strategy {

    private static UsualMode instance = new UsualMode();

    public UsualMode() {
        this.body = "";
        this.fruit = "";
        this.head = "";
    }

    @Override
    public boolean execute(Point p,Table t) {
        if(t.intable(p)){
            List<Point> ps = new ArrayList<>();
            t.getPieces().stream().filter(e->{
                return e.getClass().getSimpleName().equals("Body");
            }).forEach(e->{
                ps.add(e.getPos());
            });
            return (isnear(t.getSnake().getHead().getPos(),p)&&!ps.contains(p));
        }
        
        return false;
    }

    public boolean isnear(Point headp, Point p) {
        int y = headp.y-p.y;
        int x = headp.x-p.x;
        return ((x==0&&(y==1||y==-1))||(y==0&&(x==1||x==-1)));
    }

    public static UsualMode getinstance(){
        return instance;
    }

}
