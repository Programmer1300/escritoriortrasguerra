package vistas;

import java.awt.Dimension;
import java.awt.Toolkit;

public class Escritorioguerra {
    
    public static frmLogin ini;
    
    public static void main(String[] args) {
      ini = new frmLogin();
      ini.setTitle("Trasportes Guerra | Extracción de desechos sólidos");
      Dimension dim = Toolkit.getDefaultToolkit().getScreenSize();
      int x = (dim.width / 2) - (ini.getSize().width / 2);
      int y = (dim.height / 2) - (ini.getSize().height / 2);
      ini.setLocation(x,y);
      ini.setVisible(true);
    }
}
