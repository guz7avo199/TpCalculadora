/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package tpcalculadora;

import java.awt.Frame;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import javax.swing.JFrame;


/**
 *
 * @author Usuario-Gustavo
 */
public class Controlador implements ActionListener,MouseListener, KeyListener {
    MainCalculadora _calc;
    OperacionesCalculo _op=new OperacionesCalculo();
    
    Controlador(MainCalculadora calcu){
    this._calc=calcu;
    
 }

    @Override
    public void actionPerformed(ActionEvent e) {
        
        if(e.getSource()==_calc.botonmas){
            
            /* _op._cantOp++;
             
             
               if(_op._cantOp>1){
                   
                   
                 _calc.textResultado.setText(_op.Operar());
                 _op._digitosIngresados=_calc.textResultado.getText();
                 _op._cantOp=1;
                 _op._operacion="";
             }*/
            Maniobrar();
              
             _calc.textResultado.setText(_op.Concatenar("+"));
               
              
             _op._operacion="+";
 
            
        }
        
         if(e.getSource()==_calc.botonmenos){
             
            /*  _op._cantOp++;
             
             
               if(_op._cantOp>1){
               
                 _calc.textResultado.setText(_op.Operar());
                 _op._digitosIngresados=_calc.textResultado.getText();
                 _op._cantOp=1;
                 _op._operacion="";
             }*/
            Maniobrar();
             _calc.textResultado.setText(_op.Concatenar("-"));
             _op._operacion="-";
 
            
        }
          if(e.getSource()==_calc.botonmulti){
            /*   _op._cantOp++;
             
             
               if(_op._cantOp>1){
                   
                 _calc.textResultado.setText(_op.Operar());
                 _op._digitosIngresados=_calc.textResultado.getText();
                 _op._cantOp=1;
                 _op._operacion="";
             }
               */
               Maniobrar();
             _calc.textResultado.setText(_op.Concatenar("*"));
              _op._operacion="*";
 
            
        }
           if(e.getSource()==_calc.botondiv){
    
            /*    _op._cantOp++;
             
             
               if(_op._cantOp>1){
                   
                 _calc.textResultado.setText(_op.Operar());
                 _op._digitosIngresados=_calc.textResultado.getText();
                 _op._cantOp=1;
                 _op._operacion="";
             }
               */ 
               Maniobrar();
               
             _calc.textResultado.setText(_op.Concatenar("/"));
              _op._operacion="/";
 
            
        }
        
        
        
        
        
        if(e.getSource()==_calc.botonigual){
             _op._cantOp=0;
            _calc.textResultado.setText(_op.Operar());
            _op._digitosIngresados=_calc.textResultado.getText();
            _op._operacion="";
        }
        
         if(e.getSource()==_calc.boton0){
            _calc.textResultado.setText(_op.Concatenar("0"));
            
            
        }
        
        if(e.getSource()==_calc.boton1){
            _calc.textResultado.setText(_op.Concatenar("1"));
            
            
        }
        else if(e.getSource()==_calc.boton2){
            
            _calc.textResultado.setText(_op.Concatenar("2"));
        }
        
        else if(e.getSource()==_calc.boton3){
            _calc.textResultado.setText(_op.Concatenar("3"));
            
        }
        else if(e.getSource()==_calc.boton4){
            
            _calc.textResultado.setText(_op.Concatenar("4"));
        }
        else if(e.getSource()==_calc.boton5){
            _calc.textResultado.setText(_op.Concatenar("5"));
            
        }
       else if(e.getSource()==_calc.boton6){
            
            _calc.textResultado.setText(_op.Concatenar("6"));
        }
        else if(e.getSource()==_calc.boton6){
            
            _calc.textResultado.setText(_op.Concatenar("7"));
        }
        else if(e.getSource()==_calc.boton7){
            
            _calc.textResultado.setText(_op.Concatenar("7"));
        }
        else if(e.getSource()==_calc.boton8){
            
            _calc.textResultado.setText(_op.Concatenar("8"));
        }
        else if(e.getSource()==_calc.boton9){
            _calc.textResultado.setText(_op.Concatenar("9"));
            
        }
        else if(e.getSource()==_calc.botonc){
            _op._cantOp=0;
            _op._digitosIngresados="";
            _calc.textResultado.setText("");
            _op._resultado=0;
        }
      
        
    }

    @Override
    public void mouseClicked(MouseEvent e) {
       if(e.getSource()==_calc.botonx){
        _calc.dispose();
    }
       else if(e.getSource()==_calc.botonminizar){
           _calc.setState(JFrame.ICONIFIED);
           
       }
    }

    @Override
    public void mousePressed(MouseEvent e) {
         if(e.getSource()==_calc.botonx){
        _calc.dispose();
    }
    }

    @Override
    public void mouseReleased(MouseEvent e) {
       
    }

    @Override
    public void mouseEntered(MouseEvent e) {
        if(e.getSource()==_calc.botonx){
            _calc.botonx.setIcon(new javax.swing.ImageIcon(getClass().getResource("/tpcalculadora/botoncerrar02.png")));
        }
        else if(e.getSource()==_calc.botonminizar){
            _calc.botonminizar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/tpcalculadora/botonminimizar02.png"))); 
            
        }
      
    }

    @Override
    public void mouseExited(MouseEvent e) {
        
        
           if(e.getSource()==_calc.botonx){
             _calc.botonx.setIcon(new javax.swing.ImageIcon(getClass().getResource("/tpcalculadora/botoncerrar01.png")));
        }
        else if(e.getSource()==_calc.botonminizar){
            
            _calc.botonminizar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/tpcalculadora/botonminimizar01.png"))); 
        }
       
    }

    @Override
    public void keyTyped(KeyEvent e) {
        
    }

    @Override
    public void keyPressed(KeyEvent e) {
        if(e.getKeyCode()>=96&&e.getKeyCode()<=105){
             _calc.textResultado.setText(_op.Concatenar(String.valueOf(e.getKeyChar())));
        }
        else if(e.getKeyCode()==107){
             
                Maniobrar();
                 _calc.textResultado.setText(_op.Concatenar("+"));
               
              
             _op._operacion="+";
            }
        else if(e.getKeyCode()==109){
            
            Maniobrar();
             _calc.textResultado.setText(_op.Concatenar("-"));
               
              
             _op._operacion="+";
        }
                
       else if(e.getKeyCode()==106){
           
                    Maniobrar();
                     _calc.textResultado.setText(_op.Concatenar("*"));
               
              
             _op._operacion="+";
                }
                        
         else if(e.getKeyCode()==111){
             
                      Maniobrar();      
                       _calc.textResultado.setText(_op.Concatenar("/"));
               
              
             _op._operacion="/";
          }
         
        else if(e.getKeyCode()==10){
               _op._cantOp=0;
            _calc.textResultado.setText(_op.Operar());
            _op._digitosIngresados=_calc.textResultado.getText();
            _op._operacion="";
            
                     
          }
       // System.out.println("letra"+ e.getKeyChar()+"codigo"+e.getKeyCode());
              
    }

    @Override
    public void keyReleased(KeyEvent e) {
        
    }

  public void Maniobrar(){
          _op._cantOp++;
             
             
               if(_op._cantOp>1){
                   
                   
                 _calc.textResultado.setText(_op.Operar());
                 _op._digitosIngresados=_calc.textResultado.getText();
                 _op._cantOp=1;
                 _op._operacion="";
             }
      
  }
    
}
