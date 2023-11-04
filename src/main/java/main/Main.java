package main;

import controller.Controller;
import view.View;

/**
 *
 * @author jcgd
 */
public class Main {
    public static void main (String[] args){
        View view = new View(new Controller());
        view.run();
    }
    
}
