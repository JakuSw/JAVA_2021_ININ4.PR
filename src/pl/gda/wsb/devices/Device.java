package pl.gda.wsb.devices;

import pl.gda.wsb.Brands;

public abstract class Device {
    private Brands producer;
    private String model;
    private Integer yearOfProduction;

    public Device(Brands producer, String model, Integer yearOfProduction) {
        this.producer = producer;
        this.model = model;
        this.yearOfProduction = yearOfProduction;
    }

    public Brands getProducer() {
        return producer;
    }

    public void setProducer(Brands producer) {
        this.producer = producer;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public Integer getYearOfProduction() {
        return yearOfProduction;
    }

    public void setYearOfProduction(Integer yearOfProduction) {
        this.yearOfProduction = yearOfProduction;
    }

    @Override
    public String toString() {
        return "Producer " + producer.toString()
                + " , model " + model.toString()
                + " , year of production " + yearOfProduction.toString();
    }

    public abstract void turnOn();
}
