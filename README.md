# timer
Timer.

# Spec
Spécification fonctionnelle générale de la solution de Timer personnalisé

Besoin : une application mobile Android permettant de paramétrer à sa guise un timer

Définitions :
Séance : enchaînement de 1 à n séquences.
Séquence : enchaînement de 1 à n exercices
Exercice : un exercice a une durée définie 


Il faut pouvoir paramétrer des séquences d’exercices différents sans avoir à reprogrammer le timer entre chaque exercice. Une séquence doit pouvoir se répéter autant de fois que souhaitée.

Exemple d’une séance 
4 séquences de l’enchaînement suivant :
-	Exercice 1 (1 minute)
-	Exercice 2 (30 secondes)
-	Exercice 3 (30 secondes)
-	Exercice 4 (30 secondes)
-	Exercice 5 (30 secondes)
-	Exercice 6 (30 secondes)
-	Exercice 7 (1 minute 30)

Il faut pouvoir paramétrer la durée de chaque exercice indépendamment et aucune limite de temps par exercice n’est à prévoir.
A la fin de chaque exercice un son indique la fin de l’exercice et le passage au suivant. Un délai de 5 à 10 secondes est donc à prévoir entre deux exercices.
A la fin de la séance complète, un son différent indique la fin de la séance.

Il doit être possible d’enregistrer des séances ou des séquences pour pouvoir les rejouer sans avoir à les reparamétrer. Il faut également pouvoir les éditer et/ou les supprimer.
