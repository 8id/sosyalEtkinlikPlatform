/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Duenleyici;

import java.awt.Image;
import javax.swing.ImageIcon;
import javax.swing.JLabel;

/**
 *
 * @author user
 */
public class Duzenleyen {
    
    public static void setBackgroundImage(JLabel label,String mesge){
    ImageIcon icon =new ImageIcon(mesge);
    Image image=icon.getImage();
    Image imageScale=image.getScaledInstance(label.getWidth(), label.getHeight(), Image.SCALE_SMOOTH);
    ImageIcon scaledIcon =new ImageIcon(imageScale);
    label.setIcon(scaledIcon);
} 
    
    
}
