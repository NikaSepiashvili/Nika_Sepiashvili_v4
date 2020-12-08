package ge.edu.btu;

public class Demo3 {
    public static void main(String[] args) {
        IphoneX iphoneX = new IphoneX();
        Nokia nokia = new Nokia();
        Panasonic panasonic = new Panasonic();
        SamsungNote samsungNote = new SamsungNote();

        System.out.println(iphoneX.toString());
        System.out.println(nokia.toString());
        System.out.println(panasonic.toString());
        System.out.println(samsungNote.toString());
    }
}
