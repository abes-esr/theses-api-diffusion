package fr.abes.theses.diffusion.controller;

import fr.abes.theses.diffusion.database.Service;
import fr.abes.theses.diffusion.database.These;
import io.swagger.annotations.ApiParam;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.core.io.FileSystemResource;
import org.springframework.http.ContentDisposition;
import org.springframework.http.HttpHeaders;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;
import org.springframework.web.servlet.view.RedirectView;

import java.io.*;
import java.nio.file.Files;

@Slf4j
@RestController
@RequestMapping("/")
public class DiffusionController {

    @Autowired
    Service service;

    @GetMapping("/redirectWithRedirectView")
    public RedirectView redirectWithUsingRedirectView(
            RedirectAttributes attributes) {
        attributes.addFlashAttribute("flashAttribute", "redirectWithRedirectView");
        attributes.addAttribute("attribute", "redirectWithRedirectView");
        return new RedirectView("redirectedUrl");
    }

    @GetMapping(value = "document/protected/{nnt}")
    public ResponseEntity<byte[]> documentProtected(@PathVariable String nnt) throws Exception {

        File file = new File("/74979_GERARDIN_2018_archivage.pdf");
        byte[] bytes = Files.readAllBytes(file.toPath());

        HttpHeaders httpHeaders = new HttpHeaders();
        httpHeaders.set(HttpHeaders.CONTENT_TYPE, MediaType.APPLICATION_OCTET_STREAM_VALUE);
        httpHeaders.set(HttpHeaders.CONTENT_DISPOSITION, ContentDisposition.attachment().filename("74979_GERARDIN_2018_archivage.pdf").build().toString());
        return ResponseEntity.ok().headers(httpHeaders).body(bytes);
    }
    @GetMapping(value = "document/{nnt}", produces = "text/html;charset=UTF-8")
    public String document(
            @PathVariable
            @ApiParam(name = "nnt", value = "nnt de la thèse", example = "2023MON12345") String nnt) throws Exception {

        nnt = nnt.toUpperCase();
        These these = service.findTheseByNnt(nnt);
        these.initTef();
        return these.getTef().getDmdSec().get(1).getMdWrap().getXmlData().getThesisRecord().getTitle().getContent().concat(" ").concat(these.getIps());
    }
}
