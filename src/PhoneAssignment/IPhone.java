package PhoneAssignment;

public class IPhone extends Phone implements Ringable {

    public IPhone(String versionNumber, int batteryPercentage, String carrier, String ringTone) {
        super(versionNumber, batteryPercentage, carrier, ringTone);
    }

    @Override
    public void displayInfo() {
        System.out.println(getVersionNumber() + " from " + getCarrier()  + "\n" + "IphoneX says: " + getRingTone());
    }

    @Override
    public void unlock() {
        System.out.println("Unlocking via Facial recognition.");
    }

    @Override
    public void ring() {
        getRingTone();
    }
}
