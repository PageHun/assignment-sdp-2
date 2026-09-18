public abstract class Logistics{
    public abstract Transport createTransport();
    public void planDelivery(String cargo, String destination){
        Transport transport = createTransport();
        transport.setCargo(cargo);
        transport.setDestination(destination);
        transport.deliver();
    }
}

class RoadLogistics extends Logistics{
    @Override
    public Transport createTransport(){
        return new Truck();
    };
}

class SeaLogistics extends Logistics{
    @Override
    public Transport createTransport() {
        return new Ship();
    }
}
