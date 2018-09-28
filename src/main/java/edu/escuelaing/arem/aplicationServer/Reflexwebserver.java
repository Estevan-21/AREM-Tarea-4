package edu.escuelaing.arem.aplicationServer;

import java.lang.reflect.Constructor;
import java.lang.reflect.Method;

public class Reflexwebserver {
    
    public void load() throws ClassNotFoundException, NoSuchMethodException{
        Class c = Class.forName("components.MyfirstApp");
        for (Method m : c.getMethods()) {
            Constructor cons = c.getConstructor();
            if (m.isAnnotationPresent(Mapping.class)) {
                try {
                    Mapping anot = m.getAnnotation(Mapping.class);
                    System.out.println( anot.value());
                    Object o = cons.newInstance();
                    Object a = m.invoke(o);
                    String resp = a.toString();
                    System.out.println("La respuesta es: " + resp);

                } catch (Throwable ex) {
                    System.out.printf("error on %s: %s %n", m, ex.getCause());
                    ;
                }
            }
        }
        System.out.printf("Finished");
    }
}
