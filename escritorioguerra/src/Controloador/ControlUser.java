package Controloador;

import dao.UserDao;
import java.awt.event.ActionListener;
import vistas.IfrmSystem;

public class ControlUser implements ActionListener{
    
    IfrmSystem viewUser =  new IfrmSystem();
    UserDao usdao = new UserDao();
    
    private int idSession;
    private String username;
    private String pass;

    public ControlUser(IfrmSystem viewUser1, UserDao usdao1 ) {
        System.out.println("ControladorCliente: Constructor");
        
        this.modeloCliente = modeloCli;
        this.vistaCliente = vistaCli;
        
        this.vistaCliente.btnInsert.setActionCommand("Insertar");
        this.vistaCliente.btnInsert.addActionListener(this);
        
        
        this.vistaCliente.btnSelect.setActionCommand("Seleccionar");
        this.vistaCliente.btnSelect.addActionListener(this);
        
}
