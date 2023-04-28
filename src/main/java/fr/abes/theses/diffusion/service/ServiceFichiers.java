package fr.abes.theses.diffusion.service;

import fr.abes.theses.diffusion.model.tef.Mets;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.ContentDisposition;
import org.springframework.http.HttpHeaders;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Component;

import javax.servlet.ServletOutputStream;
import javax.servlet.http.HttpServletResponse;
import java.io.File;
import java.io.FileInputStream;
import java.net.HttpURLConnection;
import java.net.URL;
import java.net.URLConnection;
import java.nio.file.Files;

@Slf4j
@Component
public class ServiceFichiers {

    /**
     * fournit le fichieur de thèse
     * uniquement utilisé lorsque le fichier est stocké / diffusé par l'Abes
     * @return
     * @throws Exception
     */
    public ResponseEntity<byte[]> getFichier() throws Exception {
        File file = new File("/74979_GERARDIN_2018_archivage.pdf");
        byte[] bytes = Files.readAllBytes(file.toPath());
        HttpHeaders httpHeaders = new HttpHeaders();
        httpHeaders.set(HttpHeaders.CONTENT_TYPE, MediaType.APPLICATION_OCTET_STREAM_VALUE);
        httpHeaders.set(HttpHeaders.CONTENT_DISPOSITION, ContentDisposition.attachment().filename("74979_GERARDIN_2018_archivage.pdf").build().toString());
        return ResponseEntity.ok().headers(httpHeaders).body(bytes);
    }

    private void renvoyerFichier(HttpServletResponse response) throws Exception {
        File file = new File("/74979_GERARDIN_2018_archivage.pdf");
        ServletOutputStream stream = response.getOutputStream();
        response.setContentLength((int) file.length());
        response.setContentType(MediaType.APPLICATION_OCTET_STREAM_VALUE);
        response.addHeader(HttpHeaders.CONTENT_DISPOSITION, ContentDisposition.attachment().filename("74979_GERARDIN_2018_archivage.pdf").build().toString());
        FileInputStream fs = new FileInputStream(file.getAbsolutePath());
        byte[] buf = new byte[4 * 1024];
        int bytesRead;
        while ((bytesRead = fs.read(buf)) != -1) {
            stream.write(buf, 0, bytesRead);
        }
        stream.flush();
        stream.close();
        response.flushBuffer();
    }
}
