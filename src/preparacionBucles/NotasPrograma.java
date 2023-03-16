package preparacionBucles;

import java.util.Scanner;

public class NotasPrograma {

    public static void main(String[] args) {
        // TODO Auto-generated method stub
Scanner teclado = new Scanner(System.in);
int a,b,c,d=0,e=0;
do {
   System.out.println("introduzca la nota de la primera asignatura");
  a = teclado.nextInt();  
}
while(a<0 || a>10);

do {
    System.out.println("introduzca la nota de la primera asignatura");
    b = teclado.nextInt();  
}
while(b<0 || b>10);

do {
    System.out.println("introduzca la nota de la primera asignatura");
    c = teclado.nextInt();   
}
while(c<0 || c>10);

if (a>=5)
      d++;
else 
   e++;
if (b>=5)
    d++;
else 
    e++;
if (c>=5)
    d++;
else 
    e++;
System.out.println("Has Aprobado "+d+" y has suspendido "+e+ "asignaturas");
System.out.println("La nota media es: " +(a+b+c)/3);
teclado.close();

    
    }


}
