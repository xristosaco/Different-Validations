/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package differentvalidation;

import java.util.Scanner;
import java.util.regex.Pattern;
import javax.swing.JOptionPane;

/**
 *
 * @author xristos
 */
public class StringValidation {

    Scanner io = new Scanner(System.in);

    public void ValidationNameWithWile(String firstName) {

        System.out.println("Enter your first name :");
        firstName = io.nextLine();

        {
            while (!firstName.matches("[a-zA-Z ,.]+")) {
                System.out.println("Epitrpodai mono gramata  , kai .");
                firstName = io.nextLine();
            }
        }
    }

    public void validationNameWithIf(String lastName) {
        System.out.println("Enter your lastname");
        lastName = io.nextLine();
        
        if (vali(lastName)) {
            JOptionPane.showMessageDialog(null, "Insert sacces");
        } else {
            JOptionPane.showMessageDialog(null, "Insert Fail");
        }
    }

    public static boolean vali(String val) {
        return Pattern.matches("[a-zAZ]+", val);
    }

}
