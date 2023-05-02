package org.example;


interface MovableStrategy{
    void move();
}

class RailRoadStrategy implements MovableStrategy{
    public void move(){
        System.out.println("Rail");
    }
}

class RoadStrategy implements MovableStrategy{
    public void move(){
        System.out.println("Road");
    }
}

class Moving {
    private MovableStrategy movableStrategy;

    public void move(){
        movableStrategy.move();
    }

    public void setMovableStrategy(MovableStrategy movableStrategy){
        this.movableStrategy = movableStrategy;
    }
}
class Bus extends Moving{

}

class Train extends Moving{

}


public class Main {
    public static void main(String[] args) {
        Moving train = new Train();
        Moving bus = new Bus();

        train.setMovableStrategy(new RailRoadStrategy());
        bus.setMovableStrategy(new RoadStrategy());

        train.move();
        bus.move();

        //선로를 움직이는 버스
        bus.setMovableStrategy(new RailRoadStrategy());
        bus.move();
    }
}