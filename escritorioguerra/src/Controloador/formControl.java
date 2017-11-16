package Controloador;

import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import vistas.IfrmFindCustomers;
import vistas.frmExtraguerra;

public class formControl implements ActionListener {

    frmExtraguerra dad = new frmExtraguerra();

    public void botones(frmExtraguerra dad1) {
        this.dad = dad1;
        
        this.dad.mniNameCode.setActionCommand("Busqueda por codigo");
        this.dad.mniNameCode.addActionListener(this);

        this.dad.mniSearchTown.setActionCommand("Busqueda por colonia");
        this.dad.mniSearchTown.addActionListener(this);
        
        this.dad.mniList.setActionCommand("Listados");
        this.dad.mniList.addActionListener(this);
    }

    @Override
    public void actionPerformed(ActionEvent en) {
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        String event = en.getActionCommand();

        if (event.equals("Busqueda por codigo")) {
            IfrmFindCustomers a = new IfrmFindCustomers();
            dad.desktopPane.add(a);
            a.setVisible(true);
            a.panCodeName.setVisible(true);
            a.lblNameCode.setVisible(true);
            a.txtNameCode.setVisible(true);
            

        }

        if (event.equals("Busqueda por colonia")) {
            IfrmFindCustomers b = new IfrmFindCustomers();
            dad.desktopPane.add(b);
            b.setVisible(true);
            b.panTown.setVisible(true);
            b.lbldepartment.setVisible(true);
            b.lbltownship.setVisible(true);
            b.lblTown.setVisible(true);
            b.cmbDepartment.setVisible(true);
            b.cmbTownships.setVisible(true);
            b.cmbTown.setVisible(true);
        }
        
        if (event.equals("Listados")){
            IfrmFindCustomers c = new IfrmFindCustomers();
            dad.desktopPane.add(c);
            c.setVisible(true);
            c.panList.setVisible(true);
            c.lblListType.setVisible(true);
            c.cmbListType.setVisible(true);
             Image icon = new ImageIcon(getClass().getResource("/resources/Icons/lista.png")).getImage();
            c.setFrameIcon((Icon) icon);
        }
    }
}
