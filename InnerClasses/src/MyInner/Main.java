package MyInner;

import jdk.internal.org.objectweb.asm.Handle;

/**
 * Created by Dima on 3/16/2017.
 */
public class Main {
    public static void main(String[] args) {
        Doors doors = new Doors(true);
        Doors.Glass glass = doors.new Glass("Blue");
        glass.print();

           }

}
