package ClasesFactory;

import AplicacionDiseño.DiseñoSuperMarioBrosU;
import Interfaces.InterfaceFactory;
import Interfaces.ServicioFactory;

public class NewSuperMarioBrosUFactory implements ServicioFactory{

    @Override
    public InterfaceFactory.objetosDiseño crearServicio() {
        return new DiseñoSuperMarioBrosU();
    }
}
