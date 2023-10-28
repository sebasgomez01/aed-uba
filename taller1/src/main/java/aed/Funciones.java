package aed;
import java.lang.Math;

class Funciones {
    int cuadrado(int x) {
        int res = x*x;
        return res;
    }

    double distancia(double x, double y) {
        double res = Math.sqrt(x*x + y*y);
        return res;
    }

    boolean esPar(int n) {
        boolean res; 
        res = ((n % 2) == 0);
        return res;
    }

    boolean esBisiesto(int n) {
        boolean res1;
        boolean res2;
        boolean res;
        res1 = (n % 400 == 0);
        res2 = (n % 4 == 0) && (n % 100 != 0);
        res = res1 || res2;
        return res;
    }

    int factorialIterativo(int n) {
        int res = 1;
        for(int i = n; i > 0; i--) {
            res = res * i;
        }
        return res;
    }

    int factorialRecursivo(int n) {
        if(n == 0) {
            return 1;
        }
        return n * factorialRecursivo(n - 1);
    }
    // Me quedó medio feita esta  función, hay que optimizarla
    boolean esPrimo(int n) {
        if(n == 0 || n == 1) {
            return false;
        }
        boolean res = true;
        for (int i = n - 1; i > 1; i--) {
            if (n % i == 0) {
                res = false;
            }
        }
        return res;
    }

    int sumatoria(int[] numeros) {
    
        int res = 0;
        for (int i = 0; i < numeros.length; i++) {
            res = res + numeros[i];
        }
        return res;
    }

    int busqueda(int[] numeros, int buscado) {
        int res = 0;
        for (int i = 0; i < numeros.length; i++) {
            if(numeros[i] == buscado) {
                res = i;
            }
        }
        return res;
    }

    boolean tienePrimo(int[] numeros) {
        boolean res = false;
        for (int i = 0; i < numeros.length; i++) {
            if(esPrimo(numeros[i])) {
                res = true;
            }
        }
        return res;
    }

    boolean todosPares(int[] numeros) {
        boolean res = true;
        for (int i = 0; i < numeros.length; i++) {
            if (numeros[i] % 2 != 0) {
                res = false;
            }
        }
        return res;
    }

    boolean esPrefijo(String s1, String s2) {
        boolean res = true;
        int limit = Math.min(s1.length(), s2.length());
        for (int i = 0; i < limit; i++) {
            if(s1.charAt(i) != s2.charAt(i) || s1.length() > s2.length()) {
                res = false;
            }
        }
        return res;
    }
     
    boolean esSufijo(String s1, String s2) {
        boolean res = true;
        int limit = Math.min(s1.length(), s2.length()); 
        for (int i = 0; i < limit; i++) {
            if (s1.charAt(s1.length() - 1 - i) != s2.charAt(s2.length() - 1 - i) || s1.length() > s2.length()) {
                return false;
            }
        } 
        return res;
    }
    
}
