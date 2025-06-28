package com.demo.consumer;

public class RiderLocation {
    private String riderId;
    private double latitude;
    private double longitude;

    public RiderLocation(){

    }

    public RiderLocation(String riderId, double latitude, double longitude) {
        this.riderId = riderId;
        this.latitude = latitude;
        this.longitude = longitude;
    }

    public void setRiderId(String riderId) {
        this.riderId = riderId;
    }

    public void setLatitude(double latitude) {
        this.latitude = latitude;
    }

    public void setLongitude(double longitude) {
        this.longitude = longitude;
    }

    public String getRiderId() {
        return riderId;
    }

    public double getLatitude() {
        return latitude;
    }

    public double getLongitude() {
        return longitude;
    }

    @Override
    public String toString() {
        return "RiderLocation{" +
                "riderId='" + riderId + '\'' +
                ", latitude=" + latitude +
                ", longitude=" + longitude +
                '}';
    }
}
