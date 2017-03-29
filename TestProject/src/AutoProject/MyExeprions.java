package AutoProject;

import TestProject.Auto;

/**
 * Created by Dima on 3/16/2017.
 */
public class MyExeprions extends Exception {
    /* public void print(String s){
         System.out.println(s);
     }*/
    public void print(Auto auto) {
        System.out.println("Auto" + auto.getName());
    }
}
