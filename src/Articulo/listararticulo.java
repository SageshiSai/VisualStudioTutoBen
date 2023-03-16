package Articulo;

import java.util.ArrayList;

public class listararticulo {

    ArrayList<articulo> lista = new ArrayList<>();

    public void filldata() {
        lista.add(new refresco("c1", "CocaCola", "CocaCola", 1.50, 300, "Dulce", false, true, 90));
        lista.add(new refresco("f2", "fanta", "CocaCola", 1.50, 200, "Naranja", true, true, 100));
        lista.add(new refresco("a3", "Aquarius", "CocaCola", 3.0, 100, "Limon", true, true, 23));
        lista.add(new refresco("s4", "Schweppes", "Pepper Snapple", 4, 45, "Naranja", true, true, 10));
        lista.add(new vino("b5", "BlancoOrgulloso", "LosHumildes", 9.0, 100, "Blanco", "francia", 2010, "Orgullosa"));
        lista.add(new vino("t6", "TintoAgitado", "LosTranquilos", 20.0, 100, "Tinto", "Roma", 1950, "Agita"));
        lista.add(new vino("t7", "LaVerdad", "LaGranMentira", 100.0, 45, "Tinto", "rioja", 1900, "lavita"));
        lista.add(new vino("t8", "Inesperado", "LoMasEsperado", 300.0, 30, "Tinto", "rioja", 1800, "Inespedtus"));
    }

    public ArrayList<articulo> reponer() {
        ArrayList<articulo> ListaStock = new ArrayList<>();
        for (articulo a : lista) {
            if (a.stock < 50) {
                ListaStock.add(a);
            }
        }
        return ListaStock;
    }

    public ArrayList<articulo> mascaro() {
        ArrayList<articulo> ListaMasCaro = new ArrayList<>();
        double max = 0;
        for (articulo b : lista) {
            if (b.getPrecio() > max) {
                max = b.getPrecio();
            }
        }

        for (articulo b : lista) {
            if (b.getPrecio() == max) {
                ListaMasCaro.add(b);
            }
        }
        return ListaMasCaro;
    }

    

    public ArrayList<articulo> equivalente (String Codigo) {
        double d = precio(Codigo);
        ArrayList<articulo> PrecioLista = new ArrayList<>();
        for (articulo b : lista) {
            if (b.getPrecio() == d) {
                PrecioLista.add(b);
            }
        }
        return PrecioLista;

    }
    public double precio(String Codigo) {
        double precio = 0;
		for(articulo a :lista) {
			if(a.getCodigo().equals(Codigo)){
				precio = a.getPrecio();
			}
		}
	
		return precio;
    }
    public int Stock(String Codigo){
        int stock = 0;
        for(articulo a : lista){
            if(a.getCodigo().equals(Codigo)){
            stock = a.getStock();
            }
        }
        return stock;
    }
}
