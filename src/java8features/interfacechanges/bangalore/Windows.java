package java8features.interfacechanges.bangalore;

public interface Windows {
    void paint();
    String notePad(String mess);

    default void zoomMeet()
    {
        System.out.println("Download If required");
    }
    static void originalSoftware()
    {
        System.out.println("You have Windows8 Original OS");
    }
}
