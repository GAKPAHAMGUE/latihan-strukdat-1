public class kota<E> {
    private E element;

    public kota(E kota){
        element = kota;
    }

    public E getllement(){
        return element;
    }

    public static void main(String[] args) {
    kota<Integer> jumlahkota = new kota<Integer>(9);
    kota<String> namakota = new kota<String>("Malag");
    System.out.println("jumlah kota dijawa timur :"+ jumlahkota.getllement() + "kota" );
    System.out.println("salah satu kota dijawa timur : kota"+ namakota.getllement());

    }
}
