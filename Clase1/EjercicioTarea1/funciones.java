package EjercicioTarea1;

public class funciones {

    // Ejercicio 1
    public int sumaRecursiva(int n){
        // Caso base: la suma es 1
        if(n==1)
            return n;
        else
        {
            return n + sumaRecursiva(n-1);
        }
    }

    // Ejercicio 2
    public int valMenor(int[] v, int ini){
        // Caso base: se ha recorrido todo el array
        if (ini == v.length-1){
            return v[ini];
        }else{
            int menor = valMenor(v, ini + 1);
            if (v[ini] < menor){
                return v[ini];
            }else{
                return menor;
            }
        }
    }

    // Ejercicio 3
    public int sumArr(int[] v,int length){
        // Casos base: unico elemento del array
        if(length==1){
            return v[length-1];
        }else{
            return v[length-1] + sumArr(v, length-1);
        }
    }

    // Ejercicio 4
    public boolean Palindroma(String palabra) {
        palabra = palabra.toLowerCase();
        // Casos base: siempre es palindroma
        if (palabra.length() == 0 || palabra.length() == 1) {
            return true;
        }
        if (palabra.charAt(0) == palabra.charAt(palabra.length() - 1)) {
            return Palindroma(palabra.substring(1, palabra.length() - 1));
        } else {
            return false;
        }
    }
    
    // Ejercicio 5
    public int contarX(int[] a, int x, int ini, int contador) {
        // Caso base: se ha recorrido todo el array
        if (ini == a.length) {
            return contador;
        }
        if (a[ini] == x) {
            contador++;
        }
        return contarX(a, x, ini + 1, contador);
    }
}

