/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pbo6k;

/**
 *
 * @author Lenovo
 */
public class penilaian {
    private int[] nilai;

    public penilaian(int banyakMahasiswa){
        nilai = new int[banyakMahasiswa];
    }


    /**
     * @param args the command line arguments
     */
   public void setNilai(int index, int nilai){
        this.nilai[index] = nilai;
    }

    public int getNilai(int index){
        return nilai[index];
    }

    public int max(){
        int max = 0;
        for (int var : nilai) {
            max = var > max ? var : max;
        }
        return max;
    }

    public int min(){
        int min = nilai.length > 0 ? nilai[0] : 0;
        for (int var : nilai) {
            min = var < min ? var : min;
        }
        return min;
    }
    
}
