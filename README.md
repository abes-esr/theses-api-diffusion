# theses-api-diffusion

[![build-test-pubtodockerhub](https://github.com/abes-esr/theses-api-diffusion/actions/workflows/build-test-pubtodockerhub.yml/badge.svg)](https://github.com/abes-esr/theses-api-diffusion/actions/workflows/build-test-pubtodockerhub.yml) [![Docker Pulls](https://img.shields.io/docker/pulls/abesesr/theses.svg)](https://hub.docker.com/r/abesesr/theses/)

Le moteur de recherche theses.fr recense l’ensemble des thèses de doctorat soutenues en France depuis 1985, les sujets de thèse préparés au sein des établissements de l’enseignement supérieur français, et les personnes impliquées dans la recherche doctorale française. 

Ce dépôt héberge le code source de l'API Diffusion de theses.fr.

L’API gère la diffusion des fichiers de thèses, en accès libre ou en accès restreint, sur theses.fr.

L'API s'adresse à toutes les personnes qui souhaitent récupérer les fichiers de thèses de doctorat, ou les modalités d’accès aux thèses de doctorat, pour les réutiliser au sein de leur propre système d'information, à des fins de recherche ou pour constituer une base de données, c'est à dire la DSI, data scientists, bibliothecaires, etc.

URL publique : [https://theses.fr/api/v1/diffusion/](https://theses.fr/api/v1/diffusion/openapi.yaml)

![logo theses.fr](https://theses.fr/icone-theses-beta.svg)

L'application complète peut être déployée via Docker à l'aide du dépôt https://github.com/abes-esr/theses-docker

## Données exposées par l'API : 

Pour les thèses diffusées en accès libre, l’API :
* envoie le fichier
* permet d’obtenir un lien d’accès direct au fichier de thèse ou à ses annexes

Pour les thèses diffusées en accès restreint, l’API :
* envoie le fichier, après authentification
* ou redirige vers l’intranet local de l’établissement qui détient le fichier

Pour l’ensemble des thèses, l’API gère les boutons d’accès qui s’affichent sur theses.fr.

## Architecture technique

Il y a 3 API pour Theses.fr : 
* https://github.com/abes-esr/theses-api-recherche pour la recherche et l'affichage de theses
* https://github.com/abes-esr/theses-api-export pour les exports des theses en différents formats (CSV, XML, BIBTEX, etc)
* **https://github.com/abes-esr/theses-api-diffusion pour la mise à disposition des documents (PDFs et autres)** correspondant à ce dépot

L'API présente est écrite en Java 11, à l'aide du framework Spring Boot 2.

Nous utilisons Spring boot pour exposer les services.
Ils se trouvent dans deux classes de type controller : ```BoutonController.java``` et ```DiffusionController.java```.
- __BoutonController__ fournit la liste des boutons d'accès aux thèses, qu'elles proviennent de l'application STAR ou du Sudoc.
- __DiffusionController__ fournit les services pour télécharger les fichiers de thèses.

Les services :
- vérifient que la thèse est accessible (les droits sont vérifiés via les métadonnées associées à la thèse en format TEF XML, mappés en Java via JAXB, cf. la classe ```VerificationDroits.java```)
- sélectionnent la version à diffuser (cf. la méthode ```versionADiffuser``` dans la classe ```Diffusion.java```)
- choisissent la plateforme de diffusion : en priorité les plateformes des établissements puis la plateforme du CCSD (HAL) et enfin la plateforme Abes (dans le corps de chaque controller).

Si la thèse est constituée de plusieurs fichiers, une liste de liens HTML permettant d'accéder à chaque fichier est renvoyée.

