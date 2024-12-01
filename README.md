# MovieManagementSystem
Movie Management System 🎥
Description
Le Movie Management System est une application Java permettant de gérer une collection de films. Les fonctionnalités incluent :
●	Ajout, suppression, et recherche de films.
●	Gestion des utilisateurs : les administrateurs peuvent modifier la base de films, tandis que les membres peuvent uniquement consulter la liste des films.
●	Un système simple basé sur une base de données en mémoire.
________________________________________
Fonctionnalités
1.	Ajouter des films avec titre, réalisateur, et année de sortie.
2.	Supprimer des films par leur titre.
3.	Rechercher des films dans la collection.
4.	Lister tous les films disponibles.
________________________________________
Prérequis
●	Java 17 ou supérieur
●	Maven installé (Guide d'installation Maven)
________________________________________
Installation
1. Clonez le dépôt GitHub :

git clone https://github.com/kilanions16/MovieManagementSystem.git    


3. Compilez le projet avec Maven :

mvn compile

4. Lancez les tests pour vérifier que tout fonctionne :

mvn test

________________________________________
Exécution
1. Générez le fichier JAR :

mvn package

2.	Exécutez le fichier généré :

java -cp target/MovieManagementSystem-1.0-SNAPSHOT.jar main.App
	
________________________________________
Exemple d'utilisation
Lors de l'exécution, le programme affiche les films ajoutés par l'administrateur et permet de visualiser la collection entière.
________________________________________
Technologies utilisées
●	Langage : Java
●	Build Tool : Maven
●	Tests : JUnit 5
________________________________________
Contribuer
Les contributions sont les bienvenues ! Suivez ces étapes :
1.	Forkez le projet.
2.	Créez une branche pour votre fonctionnalité :

git checkout -b feature/ma-nouvelle-fonctionnalite

3. Faites vos modifications et poussez-les :

git push origin feature/ma-nouvelle-fonctionnalite
4.	Ouvrez une Pull Request.
________________________________________
Auteur:
●	Nom : Ons kilani
●	Email : kilanionss@gmail.com
________________________________________
Licence
Ce projet est sous licence MIT.


