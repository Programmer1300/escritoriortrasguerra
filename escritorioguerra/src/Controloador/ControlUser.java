package Controloador;

import dao.UserDao;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.DefaultListModel;
import vistas.IfrmSystem;

public final class ControlUser implements ActionListener{
    
    DefaultListModel listUser = new DefaultListModel();
    IfrmSystem viewUser =  new IfrmSystem();
    UserDao usdao = new UserDao();
    
    private int idSession;
    private String username;
    private String pass;

    public ControlUser(IfrmSystem viewUser1, UserDao usdao1 ) {
        System.out.println("ControladorCliente: Constructor");
        
        this.viewUser = viewUser1;
        this.usdao = usdao1;
        
        this.viewUser.btnSaveUser.setActionCommand("Insertar");
        this.viewUser.btnSaveUser.addActionListener(this);
         
        
    }

    public ControlUser() {
       FullListUs();
    }
    
    public void FullListUs(){
        
        int Nus = usdao.displayUser().size();
        
        for (int i = 0; i < Nus; i++) {
            System.out.println("llego al boton");
            listUser.addElement(usdao.displayUser().get(i).getUsername());
            
        }
        viewUser.lstUser.setModel(listUser);
    }

    @Override
    public void actionPerformed(ActionEvent ae) {
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
         String evento = ae.getActionCommand();
             
        
        if (evento.equals("Insertar")) {
            System.out.println("he llegado a insertar");
            //FullListUs();
            
        }
        /* 
        if (evento.equals("Seleccionar")){
            System.out.println("Clic para ver tabla");
            LlenarTabla(vistaCliente.tblClientes);
        }
        
        //otra forma para manejar eventos
        if (ae.getSource()== vistaCliente.btnSelect){
            System.out.println("Click en el boton mostrar");
            LlenarTabla(vistaCliente.tblClientes);
        }*/
            }
}
