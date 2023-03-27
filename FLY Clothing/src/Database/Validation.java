/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Database;

import java.awt.event.KeyEvent;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 *
 * @author dmoth
 */
public class Validation {
//validation
   

    public static void isNumaric(KeyEvent evt) {
        if (!Character.isDigit(evt.getKeyChar())) {
            evt.consume();
        }
    }

    public static void checkLength(KeyEvent evt, String text, int lenght) {
        if (text.length() > lenght - 1) {
            evt.consume();
        }
    }
}
