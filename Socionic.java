package dialog;

import java.util.Scanner;
import javax.swing.JOptionPane;




public class Dialog {

  
    public static void main(String[] args)  {
        
        int t =0 ,d=0 ;
        
          System.out.println("������� ��� ���");
          Scanner name = new Scanner(System.in);
          String n = name.nextLine();
          
          System.out.println("������"+" "+n);
          
         
      
          String[] ask ;
        ask = new String[14];
       /* 
        */
      ask[0] = "������������� ����; �������, ������.";
      ask[1] = "����������, ����������� ����; �������.";
      ask[2] = "������������� ������������; �����������."; 
      ask[3] = "��� ����� - ��� ��������; ������ ������.";
      ask[4] ="������� ������ �� ����� � �� �� �������.";
      ask [5] ="������� �����; ������ ����; �������������.";
      ask [6] ="�������� �������; ����� ������� � ������...";
      
      ask [7] ="��������� ���, ���� � ��������� �������...";
      ask [8] ="� �� ����� ������, ���������� � � �������";
      ask [9] ="���������������� ���; ����������, ��������.";
      ask [10] ="������ �������; ������� ���������.";
      ask [11] ="�������, ������, ��������; ������� ����������.";
      ask [12] ="����������, ��������; �������������.";
       ask[13] ="����, �������, ������; ����������� �������.";
       
       int i = 0;
        int g;
                 while(ask.length>=i){
                   
                    
                    System.out.println(ask[i]);
                    i++;
                        
                    g = new Scanner(System.in).nextInt();
                    if (g!=1) continue;
                    
                    if (g==1 && i%2 == 0){
                       t++;
                    }
                    
                     else if (g==1 && i%2==1){
                          d++;
                     
                     }
                 }
                      
                      System.out.println("���������� t �����"+t+" "+"���������� d �����"+d);     
                       
               
             

                     
                 if(t>d)
         System.out.print("���������� t �����" + t);
          
      
              else
          System.out.print("���������� d �����"+d);
                 JOptionPane.showMessageDialog(null,".!.");
        
         
      }
    
  }