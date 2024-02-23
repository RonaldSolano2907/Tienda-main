 
package com.tienda.service;

import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

@Service
public interface FirebaseStorageService {

    public String cargaImagen(MultipartFile archivoLocalCliente, String carpeta, Long id);

    //El BuketName es el <id_del_proyecto> + ".appspot.com"
    final String BucketName = "techshop-5f03b.appspot.com";

    //Esta es la ruta básica de este proyecto Techshop
    final String rutaSuperiorStorage = "Techshop";

    //Ubicación donde se encuentra el archivo de configuración Json
    final String rutaJsonFile = "Firebase";
    
    //El nombre del archivo Json
    final String archivoJsonFile = "techshop-5f03b-firebase-adminsdk-t0xha-0c76766aa4_1";
}