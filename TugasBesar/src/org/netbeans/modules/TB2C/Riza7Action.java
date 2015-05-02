/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.netbeans.modules.TB2C;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import org.openide.awt.ActionID;
import org.openide.awt.ActionReference;
import org.openide.awt.ActionRegistration;
import org.openide.util.NbBundle.Messages;

@ActionID(
        category = "TB2C",
        id = "org.netbeans.modules.TB2C.Riza7Action"
)
@ActionRegistration(
        displayName = "#CTL_Riza7Action"
)
@ActionReference(path = "Menu/Tools", position = 0)
@Messages("CTL_Riza7Action=Riza7")
public final class Riza7Action implements ActionListener {

    @Override
    public void actionPerformed(ActionEvent e) {
        // TODO implement action body
    }
}
