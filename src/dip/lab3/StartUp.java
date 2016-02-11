/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dip.lab3;

/**
 *
 * @author alancerio18
 */
public class StartUp {
    public static void main(String[] args) {
            MsgService msger = new MsgService(new FilerReader(), new FileWriter());
            
            msger.sendMsg();
            
    }
    
    
}
