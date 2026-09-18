public interface Transport {
    void deliver();
}

class Truck implements Transport{
    @Override
    public void deliver(){
        System.out.println("Delivering by land");
    }
}
class Ship implements Transport{
    @Override
    public void deliver(){
        System.out.println("Delivering by sea");
    }
}
