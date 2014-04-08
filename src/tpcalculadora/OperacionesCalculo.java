/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package tpcalculadora;

/**
 *
 * @author Usuario-Gustavo
 */
public class OperacionesCalculo {
    String _digitosIngresados="";
    String _operacion="";
    int _resultado=0;
    int _cantOp=0;
    
    
    public String Concatenar(String s){
        _digitosIngresados=_digitosIngresados+s;
        return _digitosIngresados;
        
    }
    public String Operar(){
        System.out.println(this._operacion);
        String[] valores=this._digitosIngresados.split("\\"+this._operacion);
        System.out.println(valores[0]+valores[1]);
        try{
         switch(this._operacion){
             case "+": _resultado=Integer.parseInt(valores[0])+Integer.parseInt(valores[1]);
                 break;
             case "-": _resultado=Integer.parseInt(valores[0])-Integer.parseInt(valores[1]); 
                 break;
             case "*": _resultado=Integer.parseInt(valores[0])*Integer.parseInt(valores[1]); 
                 break;
             case "/": _resultado=Integer.parseInt(valores[0])/Integer.parseInt(valores[1]); 
                 break;
            }   
        }
       catch(Exception e){
           if(valores.length==1){  
                _resultado=Integer.parseInt(valores[0]);
            }
        }
      
        return String.valueOf(_resultado);
   }
}
