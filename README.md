# Activité Pratique N° 2 : Système de Gestion d'Hôpital avec Spring Boot

### Ce projet est réalisé dans le cadre de l'Activité Pratique N° 2 sur ORM JPA Hibernate Spring Data.

![ClasseDiagramm](https://github.com/BouzidiTheCoder/Hospital-Spring-App/assets/134173504/7cffd612-7ddb-45db-84e8-07166dcdf485)


### Ce projet est une application de gestion d'hôpital développée en utilisant Spring Boot. Il permet de gérer les patients, les médecins, les rendez-vous et les consultations.

## Fonctionnalités Principales

1. **Gestion des Patients**: Permet d'ajouter, de modifier et de supprimer des informations sur les patients, y compris leur nom, leur date de naissance et leur état de santé.

2. **Gestion des Médecins**: Permet d'enregistrer les informations des médecins, y compris leur nom, leur adresse e-mail et leur spécialité médicale.

3. **Gestion des Rendez-vous**: Permet de planifier des rendez-vous entre les patients et les médecins à des dates spécifiques.

4. **Gestion des Consultations**: Permet d'enregistrer les rapports de consultation associés à chaque rendez-vous.

## Technologies Utilisées

- **Spring Boot**: Framework Java pour la création d'applications web.
- **Spring Data JPA**: Pour la gestion des données avec JPA et Hibernate.
- **H2 Database**: Base de données en mémoire utilisée pour le développement et les tests.
- **Lombok**: Bibliothèque Java pour la génération automatique de code.

## Objectifs du Projet

Le but de ce projet était de mettre en pratique les concepts clés de développement d'applications avec Spring Boot, notamment la création de modèles de données, la gestion des relations entre les entités, la création de services métier et la mise en place d'une API REST pour interagir avec l'application.

Ce projet a également permis de renforcer les compétences en développement Java, en particulier dans le contexte du développement d'applications web et de la manipulation de bases de données relationnelles.

### Cloner ce dépôt sur votre machine locale en utilisant la commande suivante :

git clone https://github.com/BouzidiTheCoder/Hospital-Spring-App.git

### Configuration de la Base de Données

L'application utilise une base de données H2 en mémoire. Vous pouvez accéder à la console H2 pour consulter les données.

![Config](https://github.com/BouzidiTheCoder/Hospital-Spring-App/assets/134173504/01639786-ab93-41fa-b1b5-f13f4774f0c8)

### Accès à la Console H2

Pour accéder à la console H2, assurez-vous que l'application est en cours d'exécution, puis rendez-vous sur [http://localhost:8086/h2-console](http://localhost:8086/h2-console) dans votre navigateur web.
Utilisez les paramètres par défaut pour se connecter.

![H2 Console](https://github.com/BouzidiTheCoder/Hospital-Spring-App/assets/134173504/d26bd28b-9b10-4fa6-b381-bfd7e961ec6e)

## Captures d'Écran :

### Structure du Projet :
### l'Arborescence du Projet :

![Arborescence du Projet](https://github.com/BouzidiTheCoder/Hospital-Spring-App/assets/134173504/eedc8fe6-a48b-44a8-b5e7-ff7de0aa5cfd)

### Base de Données H2 Console :
### Tables Créées :
![Tables](https://github.com/BouzidiTheCoder/Hospital-Spring-App/assets/134173504/e2c6f894-3b9d-44a6-8b5a-4cd2b0e0f728)

#### Table PATIENT :

![Patient](https://github.com/BouzidiTheCoder/Hospital-Spring-App/assets/134173504/09339424-f332-4fe0-8eb7-e482393f846b)

#### Table MEDECIN :

![Medecin](https://github.com/BouzidiTheCoder/Hospital-Spring-App/assets/134173504/47c9d5cf-828c-4a97-833b-6694c6db34b3)

#### Table RENDEZ_VOUS :

![RendezVous](https://github.com/BouzidiTheCoder/Hospital-Spring-App/assets/134173504/900aaff0-8cb6-4008-8919-e18672422eda)

#### Table CONSULTATION :

![Consultation](https://github.com/BouzidiTheCoder/Hospital-Spring-App/assets/134173504/dced16af-9171-4937-b6ed-54f769fc18e9)

