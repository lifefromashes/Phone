package PhoneAssignment;

public class Main {

    public static void main(String[] args) {
        Galaxy S9 = new Galaxy("Galaxy S9", 99, "Verizon", "Ring Ring Ring!");
        IPhone iPhoneTen = new IPhone("iPhoneX", 100, "AT&T", "Zing Zing!");

        S9.displayInfo();
        S9.unlock();
        S9.ring();
        System.out.println(S9);


        iPhoneTen.displayInfo();
        iPhoneTen.unlock();
        System.out.println(iPhoneTen);


    }
}
