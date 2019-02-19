/*
 * Angus Henry
 * 19/02/2019
 * This program calculates the area of a triangle
 */

package areaoftriangle.java;

import static java.lang.Math.sin;
import javax.swing.JOptionPane;

/**
 *
 * @author anhen3335
 */
public class AreaofTriangleJava {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // declares varialbes
        int a, b ,c; // The side lengths
        int angle; // The angle of the triangle
        
        String sideaAsk = JOptionPane.showInputDialog("Input side a");
        String sidebAsk = JOptionPane.showInputDialog("Input side b");
        String sidecAsk = JOptionPane.showInputDialog("Input side c");
        String angleAsk = JOptionPane.showInputDialog("Input angle");
        a = Integer.parseInt(sideaAsk);
        b = Integer.parseInt(sidebAsk);
        c = Integer.parseInt(sidecAsk);
        angle = Integer.parseInt(angleAsk);
        System.out.println ((a +b + sin(angle))/2);
    }
    
}
