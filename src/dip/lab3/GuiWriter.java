/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dip.lab3;

import javax.swing.JOptionPane;

/**
 *
 * @author alancerio18
 */
public class GuiWriter implements MessageWriter {
    @Override
    public void writeln( String line ) {
            JOptionPane.showMessageDialog(null, line);
	}
}
