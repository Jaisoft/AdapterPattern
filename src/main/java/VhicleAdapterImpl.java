public class VhicleAdapterImpl implements VhicleAdapter {

    private Vehicle luxuryCars;


    public VhicleAdapterImpl(Vehicle luxuryCars){
        this.luxuryCars = luxuryCars;
    }
    // returns speed in KM/H
    public double getSpeed() {
        return convertMPHtoKMPH(luxuryCars.getSpeed());
    }

    private double convertMPHtoKMPH(double mph) {
        return mph * 1.60934;
    }
}