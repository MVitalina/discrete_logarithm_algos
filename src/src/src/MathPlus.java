package src;

import static java.lang.Math.*;

public class MathPlus { //TODO library
    MathPlus(){}

    public int mod(int number, int modulo) { // return x = number (mod modulo)
        return number - (int)floor(number/modulo) * modulo ;
    }
}
