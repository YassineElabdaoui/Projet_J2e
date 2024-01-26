
Ce README fournit un aperçu de l'implémentation du service web SOAP pour les opérations bancaires de base. Le projet comprend un composant côté serveur et un composant côté client pour interagir avec le service.

## Implémentation Côté Serveur

### BanqueService

La classe `BanqueService` est le composant principal côté serveur qui fournit les méthodes web suivantes :

1.  **Conversion** : Cette méthode prend un montant numérique et le convertit en le multipliant par un facteur fixe (dans ce cas, 11).
    
2.  **getCompte** : Renvoie un compte bancaire aléatoire représenté par la classe `Compte` en fonction d'un code de compte donné.
    
3.  **listCompte** : Renvoie une liste de comptes bancaires générés de manière aléatoire.
    

### Compte

La classe `Compte` est une classe Java simple utilisée pour représenter des comptes bancaires. Elle comporte des attributs pour le code de compte, le solde et la date de création.

### Main

La classe `Main` contient la méthode `main` responsable de publier le service `BanqueService` en tant que service web à l'aide de JAX-WS et de la classe `Endpoint`. Le service est exposé à l'adresse `http://0.0.0.0:9000/`.

## Implémentation Côté Client

Le côté client du projet est chargé de consommer le service web SOAP.

### Main

La classe `Main` côté client génère des classes Java côté client à partir du WSDL fourni (`http://0.0.0.0:9000/?wsdl`). Elle crée ensuite un stub client pour le service `BanqueService` et illustre une utilisation simple en appelant la méthode `convert` et en affichant le résultat.

## Test avec SOAP UI

Nous avons également testé ce service web SOAP à l'aide de SOAP UI, un outil permettant de tester et d'inspecter les requêtes et les réponses SOAP. Des captures d'écran des tests SOAP UI et des résultats sont disponibles dans le dossier du projet.

## Démarrage

Pour exécuter le projet :

1.  Démarrez le serveur en exécutant la classe `Main` côté serveur.
2.  Utilisez la classe `Main` côté client pour consommer le service et tester sa fonctionnalité.

## Prérequis

-   Kit de développement Java (JDK)
-   SOAP UI (facultatif pour les tests)
