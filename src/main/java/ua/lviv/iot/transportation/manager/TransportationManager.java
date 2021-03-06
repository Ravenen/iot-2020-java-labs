package ua.lviv.iot.transportation.manager;

import java.util.LinkedList;
import java.util.List;

import ua.lviv.iot.transportation.model.AbstractVehicle;

public class TransportationManager {

    private List<AbstractVehicle> transports = new LinkedList<>();

    public void addTransports(List<AbstractVehicle> transports) {
        this.transports.addAll(transports);
    }

    public void addTransport(AbstractVehicle transport) {
        this.transports.add(transport);
    }

    public List<AbstractVehicle> findWithCapacityGreaterThan(int capacity) {
        
        List<AbstractVehicle> result = new LinkedList<>();
        for (AbstractVehicle transport : transports) {
            if (transport.getCapacity() > capacity) {
                result.add(transport);
            }
        }
        return result;
    }

}
