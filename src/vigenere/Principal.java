package vigenere;

import java.util.Scanner;

public class Principal {
    
    public static void main(String []args)
    {
        Scanner scan = new Scanner(System.in);
        //Matrix matrix1 = new Matrix("ABCDEFGHIJKLMNÑOPQRSTUVWXYZ\u00c1\u00c9\u00cd\u00d3\u00da\u00dc ,.;:¿?¡!()‘’0123456789BCDEFGHIJKLMNÑOPQRSTUVWXYZ\u00c1\u00c9\u00cd\u00d3\u00da\u00dc ,.;:¿?¡!()‘’0123456789ACDEFGHIJKLMNÑOPQRSTUVWXYZ\u00c1\u00c9\u00cd\u00d3\u00da\u00dc ,.;:¿?¡!()‘’0123456789ABDEFGHIJKLMNÑOPQRSTUVWXYZ\u00c1\u00c9\u00cd\u00d3\u00da\u00dc ,.;:¿?¡!()‘’0123456789ABCEFGHIJKLMNÑOPQRSTUVWXYZ\u00c1\u00c9\u00cd\u00d3\u00da\u00dc ,.;:¿?¡!()‘’0123456789ABCDFGHIJKLMNÑOPQRSTUVWXYZ\u00c1\u00c9\u00cd\u00d3\u00da\u00dc ,.;:¿?¡!()‘’0123456789ABCDEGHIJKLMNÑOPQRSTUVWXYZ\u00c1\u00c9\u00cd\u00d3\u00da\u00dc ,.;:¿?¡!()‘’0123456789ABCDEFHIJKLMNÑOPQRSTUVWXYZ\u00c1\u00c9\u00cd\u00d3\u00da\u00dc ,.;:¿?¡!()‘’0123456789ABCDEFGIJKLMNÑOPQRSTUVWXYZ\u00c1\u00c9\u00cd\u00d3\u00da\u00dc ,.;:¿?¡!()‘’0123456789ABCDEFGHJKLMNÑOPQRSTUVWXYZ\u00c1\u00c9\u00cd\u00d3\u00da\u00dc ,.;:¿?¡!()‘’0123456789ABCDEFGHIKLMNÑOPQRSTUVWXYZ\u00c1\u00c9\u00cd\u00d3\u00da\u00dc ,.;:¿?¡!()‘’0123456789ABCDEFGHIJLMNÑOPQRSTUVWXYZ\u00c1\u00c9\u00cd\u00d3\u00da\u00dc ,.;:¿?¡!()‘’0123456789ABCDEFGHIJKMNÑOPQRSTUVWXYZ\u00c1\u00c9\u00cd\u00d3\u00da\u00dc ,.;:¿?¡!()‘’0123456789ABCDEFGHIJKLNÑOPQRSTUVWXYZ\u00c1\u00c9\u00cd\u00d3\u00da\u00dc ,.;:¿?¡!()‘’0123456789ABCDEFGHIJKLMÑOPQRSTUVWXYZ\u00c1\u00c9\u00cd\u00d3\u00da\u00dc ,.;:¿?¡!()‘’0123456789ABCDEFGHIJKLMNOPQRSTUVWXYZ\u00c1\u00c9\u00cd\u00d3\u00da\u00dc ,.;:¿?¡!()‘’0123456789ABCDEFGHIJKLMNÑPQRSTUVWXYZ\u00c1\u00c9\u00cd\u00d3\u00da\u00dc ,.;:¿?¡!()‘’0123456789ABCDEFGHIJKLMNÑOQRSTUVWXYZ\u00c1\u00c9\u00cd\u00d3\u00da\u00dc ,.;:¿?¡!()‘’0123456789ABCDEFGHIJKLMNÑOPRSTUVWXYZ\u00c1\u00c9\u00cd\u00d3\u00da\u00dc ,.;:¿?¡!()‘’0123456789ABCDEFGHIJKLMNÑOPQSTUVWXYZ\u00c1\u00c9\u00cd\u00d3\u00da\u00dc ,.;:¿?¡!()‘’0123456789ABCDEFGHIJKLMNÑOPQRTUVWXYZ\u00c1\u00c9\u00cd\u00d3\u00da\u00dc ,.;:¿?¡!()‘’0123456789ABCDEFGHIJKLMNÑOPQRSUVWXYZ\u00c1\u00c9\u00cd\u00d3\u00da\u00dc ,.;:¿?¡!()‘’0123456789ABCDEFGHIJKLMNÑOPQRSTVWXYZ\u00c1\u00c9\u00cd\u00d3\u00da\u00dc ,.;:¿?¡!()‘’0123456789ABCDEFGHIJKLMNÑOPQRSTUWXYZ\u00c1\u00c9\u00cd\u00d3\u00da\u00dc ,.;:¿?¡!()‘’0123456789ABCDEFGHIJKLMNÑOPQRSTUVXYZ\u00c1\u00c9\u00cd\u00d3\u00da\u00dc ,.;:¿?¡!()‘’0123456789ABCDEFGHIJKLMNÑOPQRSTUVWYZ\u00c1\u00c9\u00cd\u00d3\u00da\u00dc ,.;:¿?¡!()‘’0123456789ABCDEFGHIJKLMNÑOPQRSTUVWXZ\u00c1\u00c9\u00cd\u00d3\u00da\u00dc ,.;:¿?¡!()‘’0123456789ABCDEFGHIJKLMNÑOPQRSTUVWXY\u00c1\u00c9\u00cd\u00d3\u00da\u00dc ,.;:¿?¡!()‘’0123456789ABCDEFGHIJKLMNÑOPQRSTUVWXYZ\u00c9\u00cd\u00d3\u00da\u00dc ,.;:¿?¡!()‘’0123456789ABCDEFGHIJKLMNÑOPQRSTUVWXYZ\u00c1\u00cd\u00d3\u00da\u00dc ,.;:¿?¡!()‘’0123456789ABCDEFGHIJKLMNÑOPQRSTUVWXYZ\u00c1\u00c9\u00d3\u00da\u00dc ,.;:¿?¡!()‘’0123456789ABCDEFGHIJKLMNÑOPQRSTUVWXYZ\u00c1\u00c9\u00cd\u00da\u00dc ,.;:¿?¡!()‘’0123456789ABCDEFGHIJKLMNÑOPQRSTUVWXYZ\u00c1\u00c9\u00cd\u00d3\u00dc ,.;:¿?¡!()‘’0123456789ABCDEFGHIJKLMNÑOPQRSTUVWXYZ\u00c1\u00c9\u00cd\u00d3\u00da ,.;:¿?¡!()‘’0123456789ABCDEFGHIJKLMNÑOPQRSTUVWXYZ\u00c1\u00c9\u00cd\u00d3\u00da\u00dc,.;:¿?¡!()‘’0123456789ABCDEFGHIJKLMNÑOPQRSTUVWXYZ\u00c1\u00c9\u00cd\u00d3\u00da\u00dc .;:¿?¡!()‘’0123456789ABCDEFGHIJKLMNÑOPQRSTUVWXYZ\u00c1\u00c9\u00cd\u00d3\u00da\u00dc ,;:¿?¡!()‘’0123456789ABCDEFGHIJKLMNÑOPQRSTUVWXYZ\u00c1\u00c9\u00cd\u00d3\u00da\u00dc ,.:¿?¡!()‘’0123456789ABCDEFGHIJKLMNÑOPQRSTUVWXYZ\u00c1\u00c9\u00cd\u00d3\u00da\u00dc ,.;¿?¡!()‘’0123456789ABCDEFGHIJKLMNÑOPQRSTUVWXYZ\u00c1\u00c9\u00cd\u00d3\u00da\u00dc ,.;:?¡!()‘’0123456789ABCDEFGHIJKLMNÑOPQRSTUVWXYZ\u00c1\u00c9\u00cd\u00d3\u00da\u00dc ,.;:¿¡!()‘’0123456789ABCDEFGHIJKLMNÑOPQRSTUVWXYZ\u00c1\u00c9\u00cd\u00d3\u00da\u00dc ,.;:¿?!()‘’0123456789ABCDEFGHIJKLMNÑOPQRSTUVWXYZ\u00c1\u00c9\u00cd\u00d3\u00da\u00dc ,.;:¿?¡()‘’0123456789ABCDEFGHIJKLMNÑOPQRSTUVWXYZ\u00c1\u00c9\u00cd\u00d3\u00da\u00dc ,.;:¿?¡!)‘’0123456789ABCDEFGHIJKLMNÑOPQRSTUVWXYZ\u00c1\u00c9\u00cd\u00d3\u00da\u00dc ,.;:¿?¡!(‘’0123456789ABCDEFGHIJKLMNÑOPQRSTUVWXYZ\u00c1\u00c9\u00cd\u00d3\u00da\u00dc ,.;:¿?¡!()’0123456789ABCDEFGHIJKLMNÑOPQRSTUVWXYZ\u00c1\u00c9\u00cd\u00d3\u00da\u00dc ,.;:¿?¡!()‘0123456789ABCDEFGHIJKLMNÑOPQRSTUVWXYZ\u00c1\u00c9\u00cd\u00d3\u00da\u00dc ,.;:¿?¡!()‘’123456789ABCDEFGHIJKLMNÑOPQRSTUVWXYZ\u00c1\u00c9\u00cd\u00d3\u00da\u00dc ,.;:¿?¡!()‘’023456789ABCDEFGHIJKLMNÑOPQRSTUVWXYZ\u00c1\u00c9\u00cd\u00d3\u00da\u00dc ,.;:¿?¡!()‘’013456789ABCDEFGHIJKLMNÑOPQRSTUVWXYZ\u00c1\u00c9\u00cd\u00d3\u00da\u00dc ,.;:¿?¡!()‘’012456789ABCDEFGHIJKLMNÑOPQRSTUVWXYZ\u00c1\u00c9\u00cd\u00d3\u00da\u00dc ,.;:¿?¡!()‘’012356789ABCDEFGHIJKLMNÑOPQRSTUVWXYZ\u00c1\u00c9\u00cd\u00d3\u00da\u00dc ,.;:¿?¡!()‘’012346789ABCDEFGHIJKLMNÑOPQRSTUVWXYZ\u00c1\u00c9\u00cd\u00d3\u00da\u00dc ,.;:¿?¡!()‘’012345789ABCDEFGHIJKLMNÑOPQRSTUVWXYZ\u00c1\u00c9\u00cd\u00d3\u00da\u00dc ,.;:¿?¡!()‘’012345689ABCDEFGHIJKLMNÑOPQRSTUVWXYZ\u00c1\u00c9\u00cd\u00d3\u00da\u00dc ,.;:¿?¡!()‘’012345679ABCDEFGHIJKLMNÑOPQRSTUVWXYZ\u00c1\u00c9\u00cd\u00d3\u00da\u00dc ,.;:¿?¡!()‘’012345678",
        //                                56,56);
        Matrix matrix1 = new Matrix("ABCDEFGHIJKLMNOPQRSTUVWXYZ BCDEFGHIJKLMNOPQRSTUVWXYZ ACDEFGHIJKLMNOPQRSTUVWXYZ ABDEFGHIJKLMNOPQRSTUVWXYZ ABCEFGHIJKLMNOPQRSTUVWXYZ ABCDFGHIJKLMNOPQRSTUVWXYZ ABCDEGHIJKLMNOPQRSTUVWXYZ ABCDEFHIJKLMNOPQRSTUVWXYZ ABCDEFGIJKLMNOPQRSTUVWXYZ ABCDEFGHJKLMNOPQRSTUVWXYZ ABCDEFGHIKLMNOPQRSTUVWXYZ ABCDEFGHIJLMNOPQRSTUVWXYZ ABCDEFGHIJKMNOPQRSTUVWXYZ ABCDEFGHIJKLNOPQRSTUVWXYZ ABCDEFGHIJKLMOPQRSTUVWXYZ ABCDEFGHIJKLMNPQRSTUVWXYZ ABCDEFGHIJKLMNOQRSTUVWXYZ ABCDEFGHIJKLMNOPRSTUVWXYZ ABCDEFGHIJKLMNOPQSTUVWXYZ ABCDEFGHIJKLMNOPQRTUVWXYZ ABCDEFGHIJKLMNOPQRSUVWXYZ ABCDEFGHIJKLMNOPQRSTVWXYZ ABCDEFGHIJKLMNOPQRSTUWXYZ ABCDEFGHIJKLMNOPQRSTUVXYZ ABCDEFGHIJKLMNOPQRSTUVWYZ ABCDEFGHIJKLMNOPQRSTUVWXZ ABCDEFGHIJKLMNOPQRSTUVWXY ABCDEFGHIJKLMNOPQRSTUVWXYZ",
                        27,27);
        Vigenere vigenere1 = new Vigenere(matrix1);
        int opcion = 0;
        System.out.println('\u000C');
        
        System.out.println("#############################################");
        System.out.println("########## SISTEMA DE ENCRIPTACIÓN ##########");
        System.out.println("#############################################");
        System.out.println("------------------ CÓDIGO -------------------");
        matrix1.imprimirMatrix();
        System.out.println("");
        do {
            System.out.println("---------------------------------------------");
            System.out.println("(1) Cifrar");
            System.out.println("(2) Descifrar");
            System.out.println("(3) Salir");
            System.out.println("-----------------");
            System.out.print("Ingrese opción\t: ");
            opcion = scan.nextInt();
            
            switch(opcion) {
                case 1:
                System.out.println('\u000C');
                System.out.println("-----  Cifrar   -----");
                System.out.println("---------------------");
                System.out.println("* Permitidas las 26 letras del alfabeto (SIN Ñ) *");
                System.out.print("Mensaje\t: ");
                scan.nextLine();
                String mensaje1 = scan.nextLine();
                System.out.print("Clave\t: ");
                String clave1 = scan.nextLine();
                System.out.println('\u000C');
                Bloque bloque1 = new Bloque(mensaje1,clave1);
                String mensajeCifrado = vigenere1.encriptar(bloque1);
                System.out.println("Criptograma\t: " + mensajeCifrado);
                System.out.println("");
                break;
                
                case 2:
                System.out.println("----- Descifrar -----");
                System.out.println("---------------------");
                System.out.print("Criptograma\t: ");
                scan.nextLine();
                String mensaje2 = scan.nextLine();
                System.out.print("Clave\t\t: ");
                String clave2 = scan.nextLine();
                System.out.println('\u000C');
                Bloque bloque2 = new Bloque(mensaje2,clave2);
                String mensajeDescifrado = vigenere1.desencriptar(bloque2);
                System.out.println("Mensaje\t: " + mensajeDescifrado);
                System.out.println("");
                break;
                
                case 3:
                break;
                
                default:
                System.out.println("");
                System.out.println("--- Número inválido ---");
                System.out.println("");
                break;
            }
        } while(opcion != 3);
        
        System.out.println("");
        System.out.println("*** FIN DEL PROGRAMA ***");
        
        /*\u00e1 -> á       \u00c1\u00c9\u00cd\u00d3\u00da\u00dc
        \u00e9 -> é         0123456789
        \u00ed -> í
        \u00f3 -> ó
        \u00fa -> ú
        \u00c1 -> Á
        \u00c9 -> É
        \u00cd -> Í
        \u00d3 -> Ó
        \u00da -> Ú
        \u00f1 -> ñ
        \u00d1 -> Ñ*/
    }
}