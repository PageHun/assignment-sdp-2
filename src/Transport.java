public interface Transport {
    void deliver();
    void setCargo(String cargo);
    void setDestination(String destination);
}

class Truck implements Transport{
    private String cargo;
    private String destination;
    @Override
    public void setCargo(String cargo){
        this.cargo = cargo;
    }
    @Override
    public void setDestination(String destination){
        this.destination = destination;
    }
    @Override
    public void deliver(){
        System.out.printf("Truck delivers %s to %s%n", cargo, destination);
    }
}
class Ship implements Transport{
    private String cargo;
    private String destination;
    @Override
    public void setCargo(String cargo){
        this.cargo = cargo;
    }
    @Override
    public void setDestination(String destination){
        this.destination = destination;
    }
    @Override
    public void deliver(){
        System.out.printf("Ship delivers %s to %s%n", cargo, destination);
    }
}
