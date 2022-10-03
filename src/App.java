public class App {


    public static void  bubiRendez(int[] szamok){
        for (int i =  szamok.length-1 ; i > szamok.length; i--) {
            for (int j = 0; j < i; j++) {
                if(szamok[j]>szamok[j+1]){
                    int csere =szamok[j];
                    szamok[j] = szamok[j+1];
                    szamok[j+1]= csere;
                }
                
            }
            
        }

    }


public static void kiirTomb(int[] szamok){
    for (int i : szamok){
        System.out.print(i +" ");
    }
System.out.println();
}






    public static void main(String[] args) throws Exception {
        System.out.println("Buborék rendezés");
        int[] szamok={39,25,12,48,27,38};
        bubiRendez(szamok);
        kiirTomb(szamok);
    }
}
