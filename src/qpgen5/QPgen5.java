/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package qpgen5;
import java.awt.FlowLayout;
import javax.swing.*;
/**
 *
 * @author erl
 */
public class QPgen5 extends JFrame{

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        QPgen5 obj=new QPgen5();
        obj.setSize(500,500);
        obj.setLayout(new FlowLayout());
        obj.add(new log5());
        obj.setVisible(true);
        p1 op1=new p1();
        p2 op2=new p2();
        //op2.setVisible(false);
        obj.add(op1);
        while(op1.isVisible())
        {
            System.out.println("i");
        }
        System.out.println("ooooooooooooooooooooo");
        op2.setVisible(true);
        obj.add(op2);
        // TODO code application logic here
    }
    
}
