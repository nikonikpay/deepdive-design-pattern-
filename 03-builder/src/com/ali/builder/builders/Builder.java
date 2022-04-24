package com.ali.builder.builders;

import com.ali.builder.cars.Type;
import com.ali.builder.components.Engine;
import com.ali.builder.components.GPSNavigator;
import com.ali.builder.components.Transmission;
import com.ali.builder.components.TripComputer;
public interface Builder {

    void setType(Type type);
    void setSeats(int seats);
    void setEngine(Engine engine);
    void setTransmission(Transmission transmission);
    void setTripComputer(TripComputer tripComputer);
    void setGPSNavigator(GPSNavigator gpsNavigator);

}
