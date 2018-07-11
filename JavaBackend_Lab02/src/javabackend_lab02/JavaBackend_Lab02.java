/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javabackend_lab02;

/**
 *
 * @author ngomi
 */
public class JavaBackend_Lab02 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        ThayGiao tg1,tg2;
        tg1 = ThayGiao.getThayGiao();
        tg2 = ThayGiao.getThayGiao();
        tg1.id=10;
        System.out.println(tg2.id);
        VoThayGiao vtg1,vtg2, vtg3,vtg4;
        vtg1 = VoThayGiao.getVoThayGiao();
        vtg2 = VoThayGiao.getVoThayGiao();
        vtg3 = VoThayGiao.getVoThayGiao();
        vtg4 = VoThayGiao.getVoThayGiao();
        
        vtg1.id = 1;
        vtg2.id = 2;
        vtg3.id = 3;
        
        
        System.out.println(vtg1.id);
        System.out.println(vtg2.id);
        System.out.println(vtg4.id);
        vtg4.id = 5;
        System.out.println(vtg3.id);
        
        
        
    }
    
}
