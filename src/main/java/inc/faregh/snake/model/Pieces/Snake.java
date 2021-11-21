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
public class Snake {

    private final Table t;
    private Body head,lhead;

    public Snake(Table t){
        this.t = t;
        head = (Body) t.getPieces().get(0);
        lhead = head;
    }

    public boolean move(Point p){
        if(t.getStrategy().execute(p,t)){
            eat(p);
            lhead = head;
            head = new Body(p,t.getStrategy());
            t.getPieces().add(head);
            return true;
        }
        if(lhead.getPos()==p){
            lhead = head;
            head = new Body(new Point(2*head.getPos().x-p.x,2*head.getPos().y-p.y),t.getStrategy());
            t.getPieces().add(head);
            return true;
        }

        return false;
    }

    private boolean eat(Point p) {
        try{
            Fruit f = (Fruit) t.getPieces().stream().filter(e->{
                return (e.getClass().getSimpleName().equals("Fruit")&&e.getPos().equals(p));
            }).findAny().get();
            t.getPieces().remove(f);
        }catch(Exception e){}
        return false;
    }

    public Body getHead(){
        return head;
    }

    @Override
    public String toString(){
        return "a snake to length: "+t.getPieces().stream().filter(e->{
            return (e.getClass().getSimpleName().equals("Body"));
        }).count()+", with head: "+head;
    }

}
