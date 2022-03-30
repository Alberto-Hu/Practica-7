import java.util.Scanner;

public class Main{
    public static void main(String[] args) {
        int aux=0, op;

        Bird[] Pajaros = new Bird[3];

        Pajaros[0]=new Red("Red","Rojo","Ninguna","Cicular",100);
        Pajaros[1]=new Blue("Blue","Azul","Dividirse en 3","Cicular",50);
        Pajaros[2]=new Chuck("Chuck","Amarillo","Aceleracion","Triangular",70);

        Scanner sc= new Scanner(System.in);

        do{
            System.out.print("""

                    Selecciona el pajaro con el que quieres atacar:\s
                    1.Pajaro: Red
                    2.Pajaro: Blue
                    3.Pajaro: Chuck
                    4.Salir

                    Ingresa numero:\s""");
            op = sc.nextInt();

            switch (op) {
                case 1 -> Pajaros[0].imprimir();
                case 2 -> Pajaros[1].imprimir();
                case 3 -> Pajaros[2].imprimir();
                case 4 -> aux = 1;
                default -> System.out.println("\n-Ingresa una de las opciones--\n");
            }
        }while(aux==0);
    }
}

