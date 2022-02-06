/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package calculos;
/**
 *
 * @author LyrisseC
 */
public class Triangulo {
    private int ba;
    private int al;
    private int resultado;
    
    public Triangulo(String n1,String n2){
        this.setBa(Integer.parseInt(n1));
        this.setAl(Integer.parseInt(n2));
    }
    public void area(){
            int s=this.getBa()*this.getAl();
            this.setResultado(s);
    }
    public void perimetro(){
            int s=3*getBa();
            this.setResultado(s);
    }
    public int getBa(){
        return ba;
    }
    public void setBa(int ba){
        this.ba=ba;
    }
    public int getAl() {
        return al;
    }
    public void setAl(int al) {
        this.al = al;
    }
    public int getResultado() {
        return resultado;
    }
    public void setResultado(int resultado) {
        this.resultado = resultado;
    }
}

    

