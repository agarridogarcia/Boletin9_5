
package boletin9_5;

import javax.swing.JOptionPane;


public class Elementos {
    public void serieUn (){
        int cont;//contador
        int numE=0;//número de elementos
        int num=0;
        numE=Integer.parseInt(JOptionPane.showInputDialog("Introduce o número de elementos"));
        
        for(cont=1;cont<=numE;cont++){
            System.out.println((num=num+2)+"+");
        }
    }
    public void serieDuas(){
        int cont;
        int numE=0;
        int num=1;
        numE=Integer.parseInt(JOptionPane.showInputDialog("Introduce o número de elementos"));
        
        for(cont=1;cont<=numE;cont++){
        if(num%2==0)
                System.out.println("+" + num);
        else
                System.out.println("-" + num);
        num++;
        }
        
    }
    public void serieTres () {
        int num1=0, num2=1;
        int cont;
        int numE=0;
        int acu=0;
        numE=Integer.parseInt(JOptionPane.showInputDialog("Introduce o número de elementos"));
        System.out.println("0, 1,");
        for(cont=3;cont<=numE;cont++){
            acu=num1+num2;
            System.out.println(acu);
            num1=num2;
            num2=acu;
            
            
        }
      
    }
}
