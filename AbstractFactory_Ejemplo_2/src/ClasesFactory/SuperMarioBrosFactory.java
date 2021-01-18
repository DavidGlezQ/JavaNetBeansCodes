package ClasesFactory;

import AplicacionDiseño.DiseñoSuperMarioBros;
import Interfaces.InterfaceFactory;
import Interfaces.ServicioFactory;

public class SuperMarioBrosFactory implements ServicioFactory{

    @Override
    public InterfaceFactory.objetosDiseño crearServicio() {
        return new DiseñoSuperMarioBros();
    }
    
}
