package java8features.interfacechanges.mysore;

import java8features.interfacechanges.bangalore.FakeWindows;

public class System2 extends FakeWindows {

    public static void main(String[] args) {
        System2 obj2 = new System2();
        obj2.zoomMeet();
    }

    @Override
    public void paint() {

    }

    @Override
    public String notePad(String mess) {
        return null;
    }
}
