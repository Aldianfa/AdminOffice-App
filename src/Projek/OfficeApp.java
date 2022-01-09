/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Projek;

import java.util.logging.Level;
import java.util.logging.Logger;
/**
 *
 * @author ASUS
 */
public class OfficeApp {
    public static void main(String[] args) throws InterruptedException {
        Loadingpage lp = new Loadingpage();
        lp.show();
        
        lp.setVisible(true);
            for (int i=0;i<=100;i++){
                Thread.sleep(40);
                lp.setVisible(true);
                lp.barload.setValue(i);
                
                if(i==100){
                    QApp tes = new QApp();
                    tes.setVisible(true);
                    lp.dispose();
                }
            }
    }
}
