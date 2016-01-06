package sechalmersmdsdgroup5.hotel.services.impl;

import sechalmersmdsdgroup5.hotel.ordering.RoomBooking;
import sechalmersmdsdgroup5.hotel.services.IService;
import sechalmersmdsdgroup5.hotel.services.Service;
import sechalmersmdsdgroup5.hotel.services.ServiceBlueprint;
import sechalmersmdsdgroup5.hotel.services.ServicesFactory;

public class ServiceFacade implements IService{

    @Override
    public boolean addServiceToBooking(RoomBooking booking, Service service) {
        if (null != booking && null != booking.getServices() && service != null) {
            booking.getServices().add(service);
        }
        return true;
    }

    @Override
    public boolean bookService(RoomBooking booking, ServiceBlueprint wantedService) {
        if (null != booking && null != booking.getServices() && wantedService != null) {
            Service service = ServicesFactory.INSTANCE.createService();
            service.setPrice(wantedService.getBasePrice());
            booking.getServices().add(service);
        }
        return true;
    }
}
