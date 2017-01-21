package controller;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;
import service.MateService;

@ManagedBean(name="mateController")
@RequestScoped
public class MateController {
    private int num1=0;
    private int num2=0;
    private int suma;
    private boolean verFormulario = true;
    
    public MateController() {
    }
    
    public void sumar(){
        MateService ms = new MateService();
        this.suma = ms.sumar(num1, num2);
        this.verFormulario= true;
    }
    
    public void iniciar(){
        this.verFormulario= true;
        this.num1= 0;
        this.num2= 0;
    }
    
    public int getNum1() {
        return num1;
    }

    public void setNum1(int num1) {
        this.num1 = num1;
    }

    public int getNum2() {
        return num2;
    }

    public void setNum2(int num2) {
        this.num2 = num2;
    }

    public int getSuma() {
        return suma;
    }

    public void setSuma(int suma) {
        this.suma = suma;
    }

    public boolean isVerFormulario() {
        return verFormulario;
    }

    public void setVerFormulario(boolean verFormulario) {
        this.verFormulario = verFormulario;
    }
   
}
