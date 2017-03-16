package MyInner;

/**
 * Created by Dima on 3/16/2017.
 */
public class Doors {

    boolean isClosed;

    public Doors(boolean isClosed) {
        this.isClosed = isClosed;
    }

    class Glass {

        private String glass;
        private String colour;

        public Glass(String colour) {
            this.colour = colour;
        }

        public void print( ) {
            System.out.println("Двері мають стікло" + " Колір стікла" + " " + colour);
        }

        public String getGlass( ) {
            return glass;
        }
    }

        public void printHeadndl( ) {
            class HandleCL implements DoorInterface {
                public void handle( ) {
                    if (isClosed = true)
                        System.out.println("Двері закрито");
                    else
                        System.out.println("Дері вікрито");
                }

                HandleCL handleCL = new HandleCL();
            }
        }

    }

