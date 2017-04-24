
import java.io.IOException;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author daniel
 */
public class ConsejoAboMail {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws IOException  {
        conector Clasevariables = new conector();
        RegiSMB registro=new RegiSMB();
        if (!registro.VeriArchivo()){
            ServidorSMB ser=new ServidorSMB(Clasevariables);
            ser.setVisible(true);
            
        }else{
            registro.Leer();
            Clasevariables.setHost(registro.getHost());
            Clasevariables.setUser(registro.getUser());
            Clasevariables.setPassword(registro.getPassword());
            Clasevariables.setBase(registro.getBase());
        }
        // TODO code application logic here
        reg1 v1 = new reg1(Clasevariables);
        v1.setVisible(true);

    }
}
