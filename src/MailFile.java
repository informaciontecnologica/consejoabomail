
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author daniel
 */
public class MailFile {
    private String host;
    private String user;
    private String password;
    private String Port;
    private String mailFrom;

   File f= new File("configuracionmial.txt");

    public boolean Existefile() throws IOException {

        if (!this.f.exists()) {  //se comprueba si el fichero existe o no
            System.out.println("Fichero " + f.getName() + " no existe");
            return false;
        } else {
            System.out.println("Fichero " + f.getName() + " existe");

            return true;

        }
    }

    public boolean Modificar(String host, String user, String password,String puerto,String mailFrom) throws FileNotFoundException {
        PrintWriter pwInput = new PrintWriter(f);
        System.out.println("Fichero " + f.getName() + " existe");
        // Write a string to the file
        pwInput.println(host);
        pwInput.println(user);
        pwInput.println(password);
        pwInput.println(puerto);
        pwInput.println(mailFrom);
        pwInput.close();
        return true;

    }

    public boolean Leer() throws FileNotFoundException {
        Scanner opnScanner = new Scanner(f);

        // Read each line in the file
        while (opnScanner.hasNext()) {
            setHost(opnScanner.nextLine());// Read each line and display its value
            setUser(opnScanner.nextLine());
            setPassword(opnScanner.nextLine());
            setPort(opnScanner.nextLine());
            setMailFrom(opnScanner.nextLine());
             
            System.out.println(this.toString());
           
        }

        // De-allocate the memory that was used by the scanner
        opnScanner.close();

        return true;
    }

    public String getHost() {
        return host;
    }

    public void setHost(String host) {
        this.host = host;
    }

    public String getUser() {
        return user;
    }

    public void setUser(String user) {
        this.user = user;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

 

   

    public String getPort() {
        return Port;
    }

    public void setPort(String Port) {
        this.Port = Port;
    }
     @Override
    public String toString() {
        return "MailFile{" + "host=" + host + ", user=" + user + ", password=" + password + ",port= "+ Port + ",mailFrom= "+ mailFrom +'}';
    }

    public String getMailFrom() {
        return mailFrom;
    }

    public void setMailFrom(String mailFrom) {
        this.mailFrom = mailFrom;
    }
}
