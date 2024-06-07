package pe.cibertec.examen_cl1.util;

import org.springframework.stereotype.Component;

import java.util.Random;

@Component
public class RandomPass {

    public String generar(int longitud){
    String cadena = "Datasdasdasdasdasdas";
    Random random = new Random();
    StringBuilder password = new StringBuilder();
    for(int i = 0; i < longitud; i++) {
        int index = random.nextInt(cadena.length());
        password.append(cadena.charAt(index));
    }
    return password.toString();
    }
}
