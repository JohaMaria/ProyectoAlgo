/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business;

import Data.ArchivoData;
import Domain.Pelicula;
import java.io.IOException;

/**
 *
 * @author jeannette
 */
public class ArchivoBusiness {
    ArchivoData archivoData;

    public ArchivoBusiness() {
        archivoData = new ArchivoData();
    }
    
    public void recuperarDelArchivo() throws IOException {
        this.archivoData.leerArchivo();
    }
    public void insertarArchivo(Pelicula pelicula) throws IOException {
        this.archivoData.insertarPelicula(pelicula);
    }
}
