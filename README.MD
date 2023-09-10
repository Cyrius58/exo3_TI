# Projet MaListe

Ce projet est une implémentation simple d'une structure de liste avec des fonctionnalités de base. Il est écrit en Java et utilise Maven pour la gestion des dépendances et le build. L'objectif principal de ce projet est de démontrer les tests unitaires et la génération de documentation avec JavaDoc.

## Fonctionnalités

- Ajout d'un élément à la liste.
- Suppression d'un élément à un index donné.
- Recherche d'un élément et renvoi de son index.

## Prérequis

- Java JDK 11 ou supérieur
- Maven

## Installation

1. Clonez le dépôt :

```
git clone https://github.com/Cyrius58/exo2_TI.git
```

2. Accédez au dossier du projet :

```
cd exo2_TI
```

3. Compilez et testez le projet avec Maven :

```
mvn clean install
```

## Documentation

La documentation JavaDoc peut être générée en utilisant :

```
mvn javadoc:javadoc
```

Après l'exécution, la documentation sera disponible dans le dossier `target/site/apidocs`.

## Tests

Les tests unitaires sont écrits avec JUnit et peuvent être exécutés avec Maven :

```
mvn test
```