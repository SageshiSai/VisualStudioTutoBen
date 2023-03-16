package Objectos;

public class PersonaMainT5 {

    public static void main(String[] args) {
        // TODO Auto-generated method stub
        //Clase para probar la clase Persona
        PersonaT5 p1 = new PersonaT5();
        System.out.println(p1);
        PersonaT5 p2 = new PersonaT5("456238484","antonio","rodelgo",new FechaT5());
        System.out.println(p2);
        PersonaT5 p3 = new PersonaT5(p2);
        System.out.println(p3);
        //Getters and Setters
        p2.setDni("2");
        p2.setApellidos("a2");
        p3.setNombre("n3");
        FechaT5 f1 = new FechaT5(8,1,2019);
        p3.setFechanacimiento(f1);
        f1.setAño(2020);
        System.out.println("Modificado: " + p2);
        System.out.println("Modificado: " + p3);
        System.out.println("Modificado: " + f1);
        
        //hasCode and equals
        p2.setDni("01");
        if (p3.equals(p2)) {
            //si son iguales
            System.out.println(p3+" y "+ p2 + " son Iguales ");
        } else {
            System.out.println(p3+" y "+ p2 + " No son iguales"); 
            }
        
    }
}
