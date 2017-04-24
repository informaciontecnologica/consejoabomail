
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;
import java.util.logging.Logger;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author daniel
 */
public class RegiSMB {

    private File file;
    private String host;
    private String user;
    private String password;
    private String base;

    File f = new File("coneccion.txt");

    public boolean VeriArchivo() throws IOException {

        if (!this.f.exists()) {  //se comprueba si el fichero existe o no
            System.out.println("Fichero " + f.getName() + " no existe");
            return false;
        } else {
            System.out.println("Fichero " + f.getName() + " existe");

            return true;

        }
    }

    public boolean Modificar(String host, String user, String password, String base) throws FileNotFoundException {
        PrintWriter pwInput = new PrintWriter(f);
        System.out.println("Fichero " + f.getName() + " existe");
        // Write a string to the file
        pwInput.println(host);
        pwInput.println(user);
        pwInput.println(password);
        pwInput.println(base);
        pwInput.close();
        return true;

    }

    public boolean Leer() throws FileNotFoundException {
        Scanner opnScanner = new Scanner(f);

        // Read each line in the file
        while (opnScanner.hasNext()) {
            // Read each line and display its value
           
            setHost(opnScanner.nextLine());
           
            setUser(opnScanner.nextLine());
           
            setPassword(opnScanner.nextLine());
           
            setBase(opnScanner.nextLine());
        }

        // De-allocate the memory that was used by the scanner
        opnScanner.close();

        return true;
    }

    /**
     * @return the host
     */
    public String getHost() {
        return host;
    }

    /**
     * @param host the host to set
     */
    public void setHost(String host) {
        this.host = host;
    }

    /**
     * @return the user
     */
    public String getUser() {
        return user;
    }

    /**
     * @param user the user to set
     */
    public void setUser(String user) {
        this.user = user;
    }

    /**
     * @return the password
     */
    public String getPassword() {
        return password;
    }

    /**
     * @param password the password to set
     */
    public void setPassword(String password) {
        this.password = password;
    }

    /**
     * @return the base
     */
    public String getBase() {
        return base;
    }

    /**
     * @param base the base to set
     */
    public void setBase(String base) {
        this.base = base;
    }

}
