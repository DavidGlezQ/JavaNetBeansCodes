package AplicacionDiseño;

import Interfaces.InterfaceFactory.objetosDiseño;

public class DiseñoSuperMarioBros3 implements objetosDiseño{

    @Override
    public void moneda() {
        System.out.println("Este es un diseño de la moneda con Super Mario Bros 3");
    }

    @Override
    public void personaje() {
        System.out.println("Este es un diseño de un personaje con Super Mario Bros 3");
    }

    @Override
    public void enemigo() {
        System.out.println("Este es un diseño de un enemigo Super Mario Bros 3");
    }

    @Override
    public void toad() {
        System.out.println("Este es un diseño de Toad con Super Mario Bros 3");
    }
    
}
