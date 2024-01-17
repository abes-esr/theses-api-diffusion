# theses-api-diffusion

Cette API permet de :
- télécharger les fichiers de thèses et leurs éventuelles annexes.
- fournir en json la liste des boutons d'accès avec leur lien aux différentes versions d'une thèse.

Une thèse peut être intégralement accessible en ligne, peut être accessible en ligne sous une forme incomplète, peut être accessible après authentification, par exemple si elle est stockée sur l'intranet d'un établissement. Les boutons d'accès peuvent également renvoyer sur la notice de la thèse dans le Sudoc indiquant où trouver d'autres formats de diffusion de la thèse (version papier, version microfichée etc.)

Nous utilisons Spring boot web pour exposer les services.
Ils se trouvent dans deux classes de type controller : ```BoutonController.java``` et ```DiffusionController.java```.
- __BoutonController__ fournit la liste des boutons d'accès aux thèses, qu'elles proviennent de l'application STAR ou du Sudoc.
- __DiffusionController__ fournit les services pour télécharger les fichiers de thèses.

Les services :
- vérifient que la thèse est accessible (les droits sont vérifiés via les métadonnées associées à la thèse en format TEF XML, mappés en Java via JAXB, cf. la classe ```VerificationDroits.java```)
- sélectionnent la version à diffuser (cf. la méthode ```versionADiffuser``` dans la classe ```Diffusion.java```)
- choisissent la plateforme de diffusion : en priorité les plateformes des établissements puis la plateforme du CCSD (HAL) et enfin la plateforme Abes (dans le corps de chaque controller).

Si la thèse est constituée de plusieurs fichiers, une liste de liens HTML permettant d'accéder à chaque fichier est renvoyée.

