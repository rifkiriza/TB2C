/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.TB2C.netbeansmodule;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import org.openide.awt.ActionID;
import org.openide.awt.ActionReference;
import org.openide.awt.ActionRegistration;
import org.openide.util.NbBundle.Messages;

@ActionID(
        category = "TB",
        id = "org.TB2C.netbeansmodule.Coba"
)
@ActionRegistration(
        displayName = "#CTL_Coba"
)
@ActionReference(path = "Menu/Tools", position = 0)
@Messages("CTL_Coba=TB")
public final class Coba implements ActionListener {

    @Override
    public void actionPerformed(ActionEvent e) {
        // TODO implement action body
    }
}
