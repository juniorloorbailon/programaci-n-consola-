paquete  ejercicio ;

import  java.util.Scanner ;
import  java.util.Stack ;

Todos los derechos reservados
 *
 * @author junior loor
 * /
 clase  pública Ejercicio {

    Todos los derechos reservados
     * @param args los argumentos de la línea de comandos
     * /
    
    public  static  void  Menú () {
        Sistema . a cabo . println ( " \ n \ n \ t \ t \ t ========= Menú Manejo PILA (PILA) ====== " );
        Sistema . a cabo . println ( " \ t \ t \ t = = " );
        Sistema . a cabo . println ( " \ t \ t \ t = 1 - elemento Insertar = " );
        Sistema . a cabo . println ( " \ t \ t \ t = 2 - Eliminar elemento = " );
        Sistema . a cabo . println ( " \ t \ t \ t = 3 Buscar elemento = " );
        Sistema . a cabo . println ( " \ t \ t \ t = 4- Imprimir pila = " );
        Sistema . a cabo . println ( " \ t \ t \ t = 5 - Imprimir Toda la pila = " );
        Sistema . a cabo . println ( " \ t \ t \ t = 6- Salir = " );
        Sistema . a cabo . println ( " \ t \ t \ t ====================================== " );
        Sistema . a cabo . imprimir ( " \ t \ t \ t Ingrese Opcion: " );
    }
    public  static  void  main ( String [] args ) {
        Pila pila =  nueva  pila ();
        
        Scanner teclado =  nuevo  Escáner ( System . In );
        int opcion;
        String dato;
        

        hacer {
            Menú();
            opcion = teclado . nextInt ();
            switch (opcion) {
                caso  1 :
                    dato = teclado . nextLine ();
                    dato = teclado . nextLine ();
                    Pila . añadir (dato);
                    romper ;
                Caso  2 :
                    si (pila . empty () ==  true ) {
                        Sistema . a cabo . println ( " LA COLA ESTA VACIA " );
                    } else {
                         Sistema . a cabo . println ( " ELEMENTO A ELIMINAR: "  + pila . pop ());
                    }          
                    romper ;
                caso  3 :
                    Sistema . a cabo . println ( " INGRESO EL DATO A BUSCAR: " );
                    dato = teclado . nextLine ();
                    dato = teclado . nextLine ();
                    si (pila . contiene (dato)) {
                        Sistema . a cabo . println (dato +  " SI ENCUENTRA EN LA PILA " );
                    } else {
                        Sistema . a cabo . println (dato +  " NO SE ENCUENTRA EN LA PILA " );
                    }
                    romper ;
                caso  4 :
                     Sistema . a cabo . println ( " LA CIMA DE LA PILA: "  + pila . peek ());
                    romper ;
                caso  5 :
                    Sistema . a cabo . println (pila);
                    romper ;
                caso  6 :
                    Sistema . a cabo . println ( " PROGRAMA FINALIZADO .. !!! " );
                    romper ;                    
                por defecto :
                   Sistema . a cabo . println ( " INGRESE UNA OPCION CORRECTA. !!! " );
                    romper ;
             
            }
        } while (opcion ! =  6 );
        
    }
}