package ClasesFactory;

import AplicacionDiseño.DiseñoSuperMarioBros3;
import Interfaces.InterfaceFactory;
import Interfaces.ServicioFactory;

public class SuperMarioBros3Factory implements ServicioFactory{

    @Override
    public InterfaceFactory.objetosDiseño crearServicio() {
        return new DiseñoSuperMarioBros3();
    }
    
}
