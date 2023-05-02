package org.example;


interface MovableStrategy{
    public void move();
}

class RailLoadStrategy implements MovableStrategy{
    public void move(){
        System.out.println("선로 따라 이동");
    }
}

class LoadStrategy implements MovableStrategy{
    public void move(){
        System.out.println("도로 따라 이동");
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

        train.setMovableStrategy(new RailLoadStrategy());
        bus.setMovableStrategy(new LoadStrategy());

        train.move();
        bus.move();

        //선로를 움직이는 버스
        bus.setMovableStrategy(new RailLoadStrategy());
        bus.move();
    }
}