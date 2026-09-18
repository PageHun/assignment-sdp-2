public abstract class Logistics{
    public abstract Transport createTransport();
    public void planDelivery(){
        Transport transport = createTransport();
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
