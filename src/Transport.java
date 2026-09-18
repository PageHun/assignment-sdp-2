import java.util.List;

public interface Transport {
    void deliver();
}

class Truck implements Transport{
    @Override
    public void deliver(){
        System.out.println("Truck delivers");
    }
}
class Ship implements Transport{
    @Override
    public void deliver(){
        System.out.println("Ship delivers");
    }
}
