public class sumador {
    public static void main(String[] args) {
        int bit1=1;
        int bit2=0;
        int resultado=sumarBits(bit1,bit2);
        System.out.println("bit1:"+bit1);
        System.out.println("bit1:"+bit2);
        System.out.println("resultado:"+obtenerBits(resultado));
    }
    public static int  sumarBits(int bit1, int bit2){
                   int suma =bit1+bit2;
                   int resultado=suma % 2;
                   int acarreo =suma/ 2;
                   System.out.println("acarreo:" + acarreo);
                                return(acarreo<<1)  | resultado;
    }
    public static String obtenerBits(int numero){
       return String.format("%2s", Integer. toBinaryString(numero)).replace( ' ','0');
    } 
    }