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
public class VoThayGiao {
    public int id;
    public String name;
    public static int count = 3;
    
    private VoThayGiao(){
    }
    private static VoThayGiao objectVoThayGiao;
    public static VoThayGiao getVoThayGiao(){
        if(count >0){
            objectVoThayGiao = new VoThayGiao();
            count--;
        }else{
            System.out.println("chinh la ba vo thu 3 cua ong thay giao duoc khoi tao");
        }
        return objectVoThayGiao;
    }
    
}
