package AplicacionDiseño;

import Interfaces.InterfaceFactory.objetosDiseño;

public class DiseñoSuperMarioBros implements objetosDiseño{

    @Override
    public void moneda() {
        System.out.println("Esta es una modena con el diseño de Super Mario Bros");
    }

    @Override
    public void personaje() {
        System.out.println("Este es un personaje con el diseño de Super Mario Bros");
    }

    @Override
    public void enemigo() {
        System.out.println("Este es un enemigo con el diseño de Super Mario Bros");
    }

    @Override
    public void toad() {
        System.out.println("Este es Toad con el diseño de Super Mario Bros");
    }
}
