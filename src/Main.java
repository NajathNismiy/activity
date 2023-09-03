
public class Main {
    public static void main(String[] args) {
        landphone phone1 = new landphone("panasonic", 112347869);
        phone1.call();

        buttonphone phone2 = new buttonphone("nokia", 234524);
        phone2.call();
        phone2.sms();

        smartphone phone3 = new smartphone("iphone", 4563678);
        phone3.call();
        phone3.sms();
        phone3.browseinternet();



    }
}