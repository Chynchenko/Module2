package model;

import lombok.Getter;
import lombok.Setter;

import java.util.Random;

@Getter
@Setter
public abstract class Device {
    protected DeviceTypes deviceTypes;
    protected String series;
    protected String screenType;
    protected double price;
    private final Random random = new Random();

    public Device() {
    }
    public Device(String series, String screenType, double price, DeviceTypes deviceType) {
        this.series = series;
        this.screenType = screenType;
        this.price = price;
        this.deviceTypes = deviceTypes;
    }
}