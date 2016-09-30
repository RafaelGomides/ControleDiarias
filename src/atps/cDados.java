/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package atps;

import java.util.ArrayList;

/**
 *
 * @author rafaelgs
 */
public class cDados {

    ArrayList<cPessoa> info = new ArrayList();
    ArrayList<cQuarto> infoQ = new ArrayList();
    

    public void cadInfo(cPessoa cad) {
        info.add(cad);
    }

    public int numInfo() {
        return info.size();
    }
    
    public void cadInfoQ(cQuarto cad){
        infoQ.add(cad);
    }
    
    public int numInfoQ() {
        return infoQ.size();
    }

    public ArrayList<cPessoa> getInfo() {
        return info;
    }

    public void setInfo(ArrayList<cPessoa> info) {
        this.info = info;
    }

    public ArrayList<cQuarto> getInfoQ() {
        return infoQ;
    }

    public void setInfoQ(ArrayList<cQuarto> infoQ) {
        this.infoQ = infoQ;
    }

}
