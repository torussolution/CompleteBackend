package java8features.interfacechanges.bangalore;

public class System1  implements Windows{
    public System1()
    {
        Windows.originalSoftware();
    }
    @Override
    public void paint() {
        System.out.println("Draw Flower");
    }

    @Override
    public String notePad(String mess) {
        return mess;
    }

    @Override
    public void zoomMeet() {
        Windows.originalSoftware();
        Windows.super.zoomMeet();
        System.out.println("Downloaded Zoom meet, Using zoom for my meetings");
    }

    public static void main(String[] args) {
        System1 obj = new System1();
        obj.paint();
        String mess = obj.notePad("Hello");
        System.out.println(mess);
        obj.zoomMeet();
    }
}
