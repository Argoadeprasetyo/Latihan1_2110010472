
package hitung;

public class MatematikaBeraksi {
    public static void main(String[] args) {
        //membuat objek
        Matematika argo = new Matematika(7,2);
        
        System.out.println("Hasil penjumlahan: "+argo.setPenjumlahan());
        System.out.println("Hasil pengurangan: "+argo.setPengurangan());
        System.out.println("Hasil perkalian: "+argo.setPerkalian());
        System.out.println("Hasil pembagian: "+argo.setPembagian());
    }

}
