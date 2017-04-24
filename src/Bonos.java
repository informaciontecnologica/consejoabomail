


/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author daniel
 */
public class Bonos {

    private int numero_expediente ;
    private String ano ;
    private String caratula ;
    private String juzgado ;
    private String fecha_pago;
    private double monto_bono ;

    public Bonos(int numero_expediente, String ano, String caratula, String juzgado, String fecha_pago, double monto_bono) {
        this.numero_expediente = numero_expediente;
        this.ano = ano;
        this.caratula = caratula;
        this.juzgado = juzgado;
        this.fecha_pago = fecha_pago;
        this.monto_bono = monto_bono;
    }

 
   
    
    public int getNumero_expediente() {
        return numero_expediente;
    }

    public void setNumero_expediente(int numero_expediente) {
        this.numero_expediente = numero_expediente;
    }

    public String getAno() {
        return ano;
    }

    public void setAno(String ano) {
        this.ano = ano;
    }

    public String getCaratula() {
        return caratula;
    }

    public void setCaratula(String caratula) {
        this.caratula = caratula;
    }

    public String getJuzgado() {
        return juzgado;
    }

    public void setJuzgado(String juzgado) {
        this.juzgado = juzgado;
    }

    public String getFecha_pago() {
        return fecha_pago;
    }

    public void setFecha_pago(String fecha_pago) {
        this.fecha_pago = fecha_pago;
    }

    public double getMonto_bono() {
        return monto_bono;
    }

    public void setMonto_bono(double monto_bono) {
        this.monto_bono = monto_bono;
    }

  

}
