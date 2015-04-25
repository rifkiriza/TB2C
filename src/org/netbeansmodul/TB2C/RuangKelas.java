/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.netbeansmodul.TB2C;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import org.openide.awt.ActionID;
import org.openide.awt.ActionReference;
import org.openide.awt.ActionRegistration;
import org.openide.util.NbBundle.Messages;
//cok
@ActionID(
        category = "TB2C",
        id = "org.netbeansmodul.TB2C.RuangKelas"
)
@ActionRegistration(
        displayName = "#CTL_RuangKelas"
)
@ActionReference(path = "Menu/Tools", position = 0)
@Messages("CTL_RuangKelas=TB2C")
public final class RuangKelas implements ActionListener {

    @Override
    public void actionPerformed(ActionEvent e) {
        // TODO implement action body
    }
}
