package ClasesFactory;

import AplicacionDiseño.DiseñoSuperMarioWorld;
import Interfaces.InterfaceFactory;
import Interfaces.ServicioFactory;

public class SuperMarioWorldFactory implements ServicioFactory{

    @Override
    public InterfaceFactory.objetosDiseño crearServicio() {
        return new DiseñoSuperMarioWorld();
    }
    
}
