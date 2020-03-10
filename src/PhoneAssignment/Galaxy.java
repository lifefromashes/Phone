package PhoneAssignment;

public class Galaxy extends Phone implements Ringable{

    public Galaxy(String versionNumber, int batteryPercentage, String carrier, String ringTone) {
        super(versionNumber, batteryPercentage, carrier, ringTone);
    }

    @Override
    public void displayInfo() {
        System.out.println(getVersionNumber() + " from " + getCarrier()  + "\n" + "Galaxy S9 says: " + getRingTone());
    }

    @Override
    public void unlock() {
        System.out.println("Unlocking via finger print.");
    }

    @Override
    public void ring() {
        getRingTone();
    }
}

