/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package mpxzero;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.IOException;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;

/**
 *
 * @author sth
 */


    public class MpxZero implements ActionListener {




public static void main(String[] args) throws IOException
    {
          
        JFrame front = new JFrame();
        
        
        JTextArea status = new JTextArea();
        JScrollPane scrollpane = new JScrollPane(status);
        JButton Clock = new JButton("Clock");
        JButton Update = new JButton("Update");
        JButton Astana = new JButton("Astana Air 1 comp");
        JButton Astana2 = new JButton ("Astana Air 2 comp");
        JButton Amsterdam1 = new JButton ("Amsterdam Air FV");
        JButton Manual = new JButton ("Manual");
        
        
        


        
        
      front.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
      front.pack();
      front.setLocationRelativeTo(null);
      front.setVisible(true);
      front.setSize(1800, 1000);
      front.setLayout(null);
      front.setResizable(false);
      
      
      
     
      
      front.add(status);
      status.add(scrollpane);
      status.setAutoscrolls(true);
      status.setBounds(10, 750, 200, 200);
      status.setEditable(false);
      
  
      
      front.add(Clock);
      Clock.setSize(4, 4);
      Clock.setBounds(10, 0, 100, 50);
      
      front.add(Update);
      Update.setSize(4, 4);
      Update.setBounds(10, 60, 100, 50);
      
      front.add(Astana);
      Astana.setSize(4, 4);
      Astana.setBounds(150, 0, 200, 50);
      
      front.add(Astana2);
      Astana2.setSize(4, 4);
      Astana2.setBounds(150, 60, 200, 50);
      
      front.add(Amsterdam1);
      Amsterdam1.setBounds(360, 0, 200, 50);
     
      
      
      front.add(Manual);
      Manual.setBounds(250, 900, 100, 50);
      Manual.setForeground(Color.red);
      
    
      
      Clock.addActionListener(new ActionListener(){
          @Override
          public void actionPerformed(ActionEvent e){
              
              try {
                  Runtime.getRuntime().exec("cmd /c start cmd.exe /C \"cd C:\\Program Files (x86)\\CAREL\\Sparkly && Sparkly.exe device update-date-time --connection Serial,COM8,192008N2,199");
              } catch (IOException ex) {
                  
              }
          }
      
      });
      Update.addActionListener(new ActionListener(){
          @Override
          public void actionPerformed(ActionEvent e){
              
              try {
                  Runtime.getRuntime().exec("cmd /c start cmd.exe /C \"cd C:\\Program Files (x86)\\CAREL\\Sparkly && Sparkly.exe app download --src \"Firmware#BCU#Boot1.0.032#OS1.2.005#App-MPXzero_Advanced-1.5.9.pack\"  --connection Serial,COM8,192008N2,199 --working-directory \"T:\\STH\\ZeroFw1.5.9\"");
              } catch (IOException ex) {
                  
              }
          }
      
      });
      
      Astana.addActionListener(new ActionListener(){
          @Override
          public void actionPerformed(ActionEvent e){
              
              try {
                  Runtime.getRuntime().exec("cmd /c start cmd.exe /C \"cd C:\\Program Files (x86)\\CAREL\\Sparkly && Sparkly.exe configurations apply --connection Serial,COM8,192008N2,199 --src \"T:\\STH\\MPXZero Astana, Mini Astana, Wengen, Arvika, Vison Master ET-EVCL Aircooled PLUGIN.stconfiguration\"");
              } catch (IOException ex) {
                  
              }
          }
      
      });
      
      Astana2.addActionListener(new ActionListener(){
          @Override
          public void actionPerformed(ActionEvent e){
              
              try {
                  Runtime.getRuntime().exec("cmd /c start cmd.exe /C  \"cd C:\\Program Files (x86)\\CAREL\\Sparkly && Sparkly.exe configurations apply --connection Serial,COM8,192008N2,199 --src \"T:\\STH\\MPXZero Astana, Mini Astana, Wengen, Arvika Slav ET-EVCL Aircooled PLUGIN.stconfiguration\"");
              } catch (IOException ex) {
                  
              }
          }
      
      });
      
      Amsterdam1.addActionListener(new ActionListener(){
          @Override
          public void actionPerformed(ActionEvent e){
              
              try {
                  Runtime.getRuntime().exec("cmd /c start cmd.exe /C  \"cd C:\\Program Files (x86)\\CAREL\\Sparkly && Sparkly.exe configurations apply --connection Serial,COM8,192008N2,199 --src \"T:\\STH\\MPXZero Astana, Mini Astana, Wengen, Arvika Slav ET-EVCL Aircooled PLUGIN.stconfiguration\"");
              } catch (IOException ex) {
                  
              }
          }
      
      });
      
      Manual.addActionListener(new ActionListener(){
          @Override
          public void actionPerformed(ActionEvent e){
              
              try {
                  Runtime.getRuntime().exec("cmd /c start cmd.exe /C \"cd C:\\Program Files (x86)\\CAREL\\Sparkly && Sparkly.exe manual");
                   
              } catch (IOException ex) {
                  
              }
          }
      
      });
      
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    
}
