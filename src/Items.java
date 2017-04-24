/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author daniel
 */
public class Items {

    private String nombre;
    private String apellido; 
    private int documento;
    private String direccion;
    private String email;
     private String vencimiento;
    private String periodo ; 
    private double importe;

    public Items(String vencimiento, String periodo, double importe) {
        this.vencimiento = vencimiento;
        this.periodo = periodo;
        this.importe = importe;
    }

   

    public  Items(int documento,String nombre, String apellido, String direccion, String email) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.documento = documento;
        this.direccion = direccion;
        this.email = email;
    }

   
    public void ItemsPeriodo( String vencimiento, String periodo, double importe) {
        this.vencimiento = vencimiento;
        this.periodo = periodo;
        this.importe = importe;
    }

   

    public String getPeriodo() {
        return periodo;
    }

    public void setPeriodo(String periodo) {
        this.periodo = periodo;
    }

    public double getImporte() {
        return importe;
    }

    public void setImporte(double importe) {
        this.importe = importe;
    }
    

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getVencimiento() {
        return vencimiento;
    }

    public void setVencimiento(String vencimiento) {
        this.vencimiento = vencimiento;
    }

}
