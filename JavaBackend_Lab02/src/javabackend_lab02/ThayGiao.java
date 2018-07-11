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
public class ThayGiao {
    public int id;
    public String name;
    public static int count=1;
    
    private ThayGiao(){
    }
    private static ThayGiao objectThayGiao;
    public static ThayGiao getThayGiao(){
        if(count >0){
            objectThayGiao = new ThayGiao();
            count--;
        }else{
            System.out.println("chinh la ong thay giao dau tien duoc khoi tao");
        }
        return objectThayGiao;
    }
    
}
