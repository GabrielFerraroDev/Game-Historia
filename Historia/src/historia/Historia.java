/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package historia;
import java.util.Scanner;
import javax.swing.JOptionPane;

/**
 *
 * @author 41521994
 */
public class Historia {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        boolean controle = true;
        Scanner entrada= new Scanner(System.in);
         Object[] options = { "Entrar", "Continuar" };
         Object[] options2 = { "Fugir", "Ajudar" };
         Object[] options3 = { "Correr", "Atacar" };
         Object[] saida = { "nao", "sim" };
         Object[] options4 = { "Avançar", "Ajudar" };
         
         
        while(controle){
            
        String nome = JOptionPane.showInputDialog("Qual o nome do seu personagem?");
        Personagem p = new Personagem(nome);
        
        
        TrechoInicial t = new TrechoInicial(p);
        JOptionPane.showMessageDialog(null,t.getTexto());
        int decisao1 = JOptionPane.showOptionDialog(null,t.trecho1Cabana,"Capitulo 1: A Floresta",JOptionPane.YES_NO_OPTION, 
      JOptionPane.QUESTION_MESSAGE,null,options ,options[0]);
        System.out.println(decisao1);
        if (decisao1 == 0){
            JOptionPane.showMessageDialog(null,t.trecho2entradaCabana);
            int decisao2 = JOptionPane.showOptionDialog(null,t.trecho3vilaemchamas,"Capitulo 2: A Vila",JOptionPane.YES_NO_OPTION, 
      JOptionPane.QUESTION_MESSAGE,null,options4 ,options4[0]);
            if (decisao2 == 0){
                JOptionPane.showMessageDialog(null,t.trecho4montanha);
                int decisao3 = JOptionPane.showOptionDialog(null,t.trecho5DragãoPoção,"Capitulo 3: A Caverna",JOptionPane.YES_NO_OPTION, 
      JOptionPane.QUESTION_MESSAGE,null,options3 ,options3[0]);
                
                        
                        
                
                        
                        
                if (decisao3 == 0){
                    JOptionPane.showMessageDialog(null,t.Trecho6Dragãofuga);
                    
                    
                }else{
                    JOptionPane.showMessageDialog(null,t.trecho6ConfrontoDragaoPocao);
                    JOptionPane.showMessageDialog(null,t.getFinalfeliz(p));
                    
                    
                }
                
                
                
            }else{
                JOptionPane.showMessageDialog(null,t.trecho3AjudaVila);
                int decisao3 = JOptionPane.showOptionDialog(null,t.trecho4montanhavila,"Capitulo 3: A Caverna",JOptionPane.YES_NO_OPTION, 
      JOptionPane.QUESTION_MESSAGE,null,options3 ,options3[0]);
                if (decisao3 == 0){
                    JOptionPane.showMessageDialog(null,t.trecho5Dragao);
                    
                    
                }else{
                    JOptionPane.showMessageDialog(null,t.trecho5AtacaDragão);
                    JOptionPane.showMessageDialog(null,t.getFinalfeliz(p));
                    
                    
                    
                }
                
            }
            
        }
            
        
        else{
            JOptionPane.showMessageDialog(null,t.trecho3puladacabana);
            int decisao2 = JOptionPane.showOptionDialog(null,t.trecho3hospedagem,"Capitulo 2: A Vila",JOptionPane.YES_NO_OPTION, 
      JOptionPane.QUESTION_MESSAGE,null,options2 ,options2[0]);
            if(decisao2 == 0){
                JOptionPane.showMessageDialog(null,t.trecho4fuga);
                int decisao3 = JOptionPane.showOptionDialog(null,t.trecho4cavernaedragao,"Capitulo 3: A Caverna",JOptionPane.YES_NO_OPTION, 
      JOptionPane.QUESTION_MESSAGE,null,options3 ,options3[0]);
                if(decisao3 == 0){
                     JOptionPane.showMessageDialog(null,t.trecho5Dragao);
                     
                    
                    
                }else{
                  JOptionPane.showMessageDialog(null,t.trecho5atacacomnada);
                    
                    
                }
                
                
            }else{
                JOptionPane.showMessageDialog(null,t.trecho4enfrentaOrcs);
                int decisao3 = JOptionPane.showOptionDialog(null,t.trecho4montanhavila,"Capitulo 3: A Caverna",JOptionPane.YES_NO_OPTION, 
      JOptionPane.QUESTION_MESSAGE,null,options3 ,options3[0]);
                if (decisao3 == 0){
                    JOptionPane.showMessageDialog(null,t.trecho5Dragao);
                    
                    
                }else{
                    JOptionPane.showMessageDialog(null,t.trecho6AtacaDragaoCajado);
                    JOptionPane.showMessageDialog(null,t.getFinalfeliz(p));
                    
                }
                
            }
            
        }
        
       int saidaa = JOptionPane.showOptionDialog(null,"Quer jogar novamente?","Você morreu",JOptionPane.YES_NO_OPTION, 
      JOptionPane.QUESTION_MESSAGE,null,saida ,saida[0]);
      if (saidaa == 0){
         controle=false; 
      }
         
    }
    }
    
}
