package AplicacionDiseño;

import Interfaces.InterfaceFactory.objetosDiseño;

public class DiseñoSuperMarioWorld implements objetosDiseño{

    @Override
    public void moneda() {
        System.out.println("Este es un diseño de una moneda con Super Mario World");
    }

    @Override
    public void personaje() {
        System.out.println("Este es un diseño de un personaje con Super Mario World");
    }

    @Override
    public void enemigo() {
        System.out.println("Este es un diseño de un enemigo con Super Mario World");
    }

    @Override
    public void toad() {
        System.out.println("Este es un diseño de Toad con Super Mario World");
    }
    
}
