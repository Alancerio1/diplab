/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dip.lab3;

import java.util.Scanner;

/**
 *
 * @author alancerio18
 */
public class KeyboardReader implements MessageReader {
    
    
    @Override
    public String readln() {
            System.out.println("Please enter some text, then press return:");

            Scanner input = new Scanner(System.in);
            return input.nextLine();
	}
}
