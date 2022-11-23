
package PERULANGAN3;


public class FOR_WHILE {
    public static void main(String[] args) {
        int count = 1;
        int i=0;
        while (i<9){
            int j=0;
            while (j<i+1){ System.out.print(count);
            j++;
            }
            count++;
            System.out.println();
            i++;
        }
    }
}
//OUTPUT : 
//1
//22
//333
//4444
//55555
//666666
//7777777
//88888888
//999999999