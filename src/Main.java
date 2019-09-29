public class Main {

    public static void main(String[] args) {

        String ogrenci1="Caner";
        String ogrenci2="Osman";
        String ogrenci3="Turgut";


        System.out.println(ogrenci1);
        System.out.println(ogrenci2);
        System.out.println(ogrenci3);

        System.out.println("----------------------");
        String[] ogrenciler=new String[3];
        ogrenciler[0]="x";
        ogrenciler[1]="y";
        ogrenciler[2]="z";

        for (int i=0;i<ogrenciler.length;i++){
            System.out.println(ogrenciler[i]);
        }

        System.out.println("------------------------");

        //foreach kullanımı...
        for (String ogrenci:ogrenciler){
            System.out.println(ogrenci);
        }
    }
}
