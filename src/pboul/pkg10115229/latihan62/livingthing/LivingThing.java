/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pboul.pkg10115229.latihan62.livingthing;

/**
 *
 * @author Lukman
 * NIM      : 10115229
 * NAMA     : MUHAMMAD LUKMAN HAKIM
 * KELAS    : PBO ULANG
 */
public class LivingThing implements Breath, Eat , Walk{
    
    private final String nama;
    
    public LivingThing(String nama){
        this.nama = nama;
        
    }
    

    @Override
    public void bernafas() {
        System.out.println(nama+" sedang berjalan");
        
    }

    @Override
    public void makan() {
        System.out.println(nama+" sedang makan");

    }

    @Override
    public void berjalan() {
        System.out.println(nama+" sedang berjalan");

    }
    
    
   }
