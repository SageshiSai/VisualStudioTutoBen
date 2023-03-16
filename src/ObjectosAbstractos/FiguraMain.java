package ObjectosAbstractos;

public class FiguraMain {

    public static void main(String[] args) {
        // TODO Auto-generated method stub
        
        
        //Pruebo la jerarquia de clases de Figura
        Circulo c=new Circulo(0, 0, 10.0);
        System.out.println("Area del Circulo "+c.area());
        System.out.println("Perimetro del Círculo"+c.perimetro());
        Rectangulo r=new Rectangulo(0, 0, 3.0, 2.0);
        System.out.println("Area del Rectangulo"+r.area());
        System.out.println("Perimetro del Rectangulo"+r.perimetro());
        Triangulo t=new Triangulo(0,0,4.0,3.0);
        System.out.println("Area del Triangulo"+t.area());
        System.out.println("Perimetro del Triangulo"+t.perimetro());
        Cuadrado cu=new Cuadrado(0,0,2.0);
        System.out.println("Area del Cuadrado"+cu.area());
        System.out.println("Perimetro del Cuadrado"+cu.perimetro());
      //Constructor Circulo
        Circulo c1= new Circulo();
        System.out.println(c1);
        Circulo c2= new Circulo(c);
        System.out.println(c2);
      //Constructor Rectangulo
        Rectangulo r1=new Rectangulo(0, 0, 3.0, 2.0);
        System.out.println(r1);
        Rectangulo r2= new Rectangulo(r);
        System.out.println(r2);
      //Constructor Triangulo
        Triangulo t1=new Triangulo();
        System.out.println(t1);
        Triangulo t2=new Triangulo(t);
        System.out.println(t2);
        //Constructor Cuadrado
        Cuadrado cu1 = new Cuadrado();
        System.out.println(cu1);
        Cuadrado cu2= new Cuadrado(cu);
        System.out.println(cu2);
        //Equals Circulo
        Circulo c3 = new Circulo(0,0,3);
        Circulo c4 = new Circulo(0,0,3);
        if(c4.equals(c3)) {
            System.out.println("Son iguales");
        }
        else {
            System.out.println("No son iguales");
        }
        
        //Equals Cuadrado
        Cuadrado cu3 = new Cuadrado(0,0,3);
        Cuadrado cu4 = new Cuadrado(0,0,4);
        if(cu4.equals(cu3)) {
            System.out.println("Son iguales");
        }
        else {
            System.out.println("No son iguales");
        }
        
        //Equals Triangulo
        Triangulo t3 = new Triangulo(0,0,3,2);
        Triangulo t4 = new Triangulo(0,0,2,3);
        if(t4.equals(t3)) {
            System.out.println("Son iguales");
        }
        else {
            System.out.println("No son iguales");
        }
        
        //Equals Rectangulo
        Rectangulo r3 = new Rectangulo(0,0,3,2);
        Rectangulo r4 = new Rectangulo(0,0,2,3);
        if(r4.equals(r3)) {
            System.out.println("Son iguales");
        }
        else {
            System.out.println("No son iguales");
        }
        //Circulo CompareTo
        if(c3.CompareTo(c4)<0) {
        //Si es menor
        System.out.println("Es menor");
    }
        else if (c3.CompareTo(c4)>0) {
          //Si es mayor
            System.out.println("Es mayor");
        }else {
          //Son iguales
            System.out.println("Son iguales");
        }
        
        //Triangulo CompareTo
        if(t3.compareTo(t4)<0) {
            //Si es menor
            System.out.println("Es menor");
        }
        else if (t3.compareTo(t4)>0) {
            //Si es mayor
            System.out.println("Es mayor");
        }else {
            //Son iguales
            System.out.println("Son iguales");
        }
        
        //Cuadrado CompareTo
        if(cu3.compareTo(cu4)<0) {
            //Si es menor
            System.out.println("Es menor");
        }
        else if (cu3.compareTo(cu4)>0) {
            //Si es mayor
            System.out.println("Es mayor");
        }else {
            //Son iguales
            System.out.println("Son iguales");
        }
        
        //Rectangulo CompareTo
        if(r3.compareTo(r4)<0) {
            //Si es menor
            System.out.println("Es menor");
        }
        else if (r3.compareTo(r4)>0) {
            //Si es mayor
            System.out.println("Es mayor");
        }else {
            //Son iguales
            System.out.println("Son iguales");
        }

}
}
