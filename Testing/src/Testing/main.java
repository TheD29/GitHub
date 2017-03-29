package Testing;

/**
 * Created by Dima on 3/16/2017.
 */
public class main {
    public static void main(String[] args) {
            try {
                throw  new  Exception();
            }catch (Throwable e){
                System.out.println("Exeprions");
            }
    }
}
