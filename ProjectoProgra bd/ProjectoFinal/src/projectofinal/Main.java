package projectofinal;

import javax.swing.UIManager;

public class Main {

    public static void main(String[] args) {
        
        try {
            UIManager.setLookAndFeel(new com.jtattoo.plaf.graphite.GraphiteLookAndFeel());
        } catch (Exception e) {
        }
        new Login().setVisible(true);
      
    }
}
