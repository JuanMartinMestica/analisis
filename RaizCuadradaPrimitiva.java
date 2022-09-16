package TP2;

public class RaizCuadradaPrimitiva {

    /*
    
    ACLARACIÓN 1:
 
    Se utiliza el tipo de dato LONG ya que es el tipo de dato que permite
    almacenar el número entero más grande posible, que no es posible hacerlo con
    INT
    
    ACLARACIÓN 2:
   
    La idea del algoritmo es ir partiendo de a mitades, y verificando si el cuadrado
    de esa mitad es el número inicial, si se da eso, entonces encontramos la raíz,
    en caso contrario podemos verificar dos cosas: si el cuadrado es más grande que
    el numero 
    
     */
    private static long calcularRaiz(long numero) {

        long resultado = -1;

        //PRIMER CASO: Si es menor a cero (número negativo) no se calcula
        //SEGUNDO CASO: Si es 0 o 1, la raíz es el mismo núnero
        if (numero < 2 && numero >= 0) {

            resultado = numero;

        } else if (numero >= 2){

            //TERCER CASO: Calcular la raíz teniendo en cuenta la mitad
            //Principio y fin actúan como los límites donde se buscará la raíz
            long principio = 1;
            long fin = numero / 2;

            //mitad y cuadrado serviran para hacer comparaciones y verificar
            long mitad;
            long cuadrado;

            //Booleano para cortar en caso de encontrar
            boolean encontrado = false;

            while (!encontrado & principio <= fin) {

                mitad = (principio + fin) / 2;
                cuadrado = mitad * mitad;

                /* Obtenemos la mitad y verificamos si su cuadrado es el número
                    si es el número, entonces encontramos la raíz */
                if (cuadrado == numero) {

                    resultado = mitad;
                    encontrado = true;

                    /*En caso de no encontrarse la raíz, debe identificarse
                        si buscar en la mitad "izquierda" del medio o la mitad
                        "derecha" de la mitad*/
                } else if (cuadrado < numero) {
                    
                       /*Si el cuadrado es menor al número, entonces la mitad es chica
                        y se debe buscar a derecha */
                       principio = mitad + 1;
                       resultado = mitad;
                       
                       
                } else {
                    
                     /*Si el cuadrado es MAYOR al número, entonces la mitad es muy grande
                        y se debe buscar a izquierda */
                
                        fin = mitad - 1;
                     
                }

            }

        }

        return resultado;

    }

}
