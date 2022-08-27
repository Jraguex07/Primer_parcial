/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Archivos;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 *
 * @author Raguex
 */
public class Archivos {
    
    /**
     * MÃ©todo main que lee un archivo de texto y muestra su contenido en
     * pantalla
     *
     * @throws IOException ExcepciÃ³n que indica que no se pudo leer el archivo
     */
    public static void main(String[] args) throws FileNotFoundException, IOException, Exception {
        String nombreArchivo = "C:/prueba.txt";
        /* DefiniciÃ³n del archivo de texto a leer */
        FileInputStream archivo; // DefiniciÃ³n de flujo de datos
        InputStreamReader conversor; // DefiniciÃ³n del flujo de lectura
        BufferedReader filtro; // DefiniciÃ³n del buffer
        String lÃ­nea;
        /* Crea los objetos FileInputStream, BufferedReader y BufferedReader */
        try {
            archivo = new FileInputStream(nombreArchivo);
        } catch (FileNotFoundException e) {
            System.out.println("El archivo no se encuentra");
        }catch (IOException e){
            System.err.println("El programa fallo");
        }catch(Exception e){
            System.err.println("El programa fallo");
        } finally {
            System.out.println("Finalizar programa");
        }
        archivo = new FileInputStream(nombreArchivo);
        conversor = new InputStreamReader(archivo);
        filtro = new BufferedReader(conversor);
        lÃ­nea = filtro.readLine();
        while (lÃ­nea != null) {
            System.out.println(lÃ­nea);
            /* Imprime en pantalla una lÃ­nea del archivo */
            lÃ­nea = filtro.readLine(); // Lee la siguiente lÃ­nea 
        }
        filtro.close(); // Cierra el archivo
    }
}

    


