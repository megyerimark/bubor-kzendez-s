public class App {


    public static int[] bubiRendez(int[] szamok){
        int[]uj_szamok=szamok;
        for (int i =  uj_szamok.length-1 ; i >0; i--) {
            for (int j = 0; j < i; j++) {
                if(uj_szamok[j]>szamok[j+1]){
                    int csere =szamok[j];
                    uj_szamok[j] = szamok[j+1];
                    uj_szamok[j+1]= csere;
                }
                
            }
            
        }
        return uj_szamok;

    }


public static void kiirTomb(int[] szamok){
    for (int i : szamok){
        System.out.print(i +" ");
    }
System.out.println();
}






    public static void main(String[] args) throws Exception {
        System.out.println("Buborék rendezés");
        System.out.println("-----------------");
        System.out.println("Megyeri Márk Máté");
        System.out.println("-----------------");
        int[] szamok={39,25,12,48,27,38};
       int[] uj_tomb = bubiRendez(szamok.clone());
        kiirTomb(uj_tomb);
    }
}
