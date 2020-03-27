public class AdapterPatternDemo {

    public static void main(String[] args){

        Vehicle ferrari = new Ferrari();
        VhicleAdapter ferrariAdapter = new VhicleAdapterImpl(ferrari);

        System.out.print(ferrariAdapter.getSpeed() + "  kmh");

    }
}
