Propants si è appena iscritto all'università.
Ha bisogno di un sistema con il quale può calcolare la media dei suoi primi due voti!

## Modifica il file E0 per risolvere il problema di propants!

Questa è il tuo primo esercizio, quindi ti spiegherò come funziona. Devi modificare esclusivamente E0, e non E0Tester.
E1Tester sfrutterà il codice che scrivi dentro E0 per capire se hai scritto correttamente o meno.
Una volta scritto il codice in E0, vai in E0Tester e avvia il codice. Ti dirà quanti test hai passato.

E il main? Come vedi dentro E0 non hai un main, ma una funzione `calcolaMedia`.
Questa è la funzione dove scriverai il codice, mentre il main la userà più volte per vedere se è corretta.

Quelli in alto, `float a, float b` si chiamano **argomenti**. Sono quelli che ti vengono passati dal tester, per proseguire con il tuo codice.

Immaginalo così: Tu stai scrivendo il codice come prima nel capitolo 0, ma la scaffalatura con le scatole non è vuota, è già piena.
La tua funzione `calcolaMedia` è un operaio. Arriva nella scaffalatura e deve farci qualcosa.
In questo caso trova già due scatole chiamate a e b, con dentro dei float.

Tu quindi devi calcolare la media e metterla in una variabile. Ovviamente puoi mettere anche delle altre variabili nel mentre.

```java
float media = ...; // calcoli vari
```

Alla fine del codice devi mettere
```java
return media;
```

Questo dirà al codice di ridare indietro il valore della scatola media, e, quindi, quello è il risultato dell'esercizio.


Se non ti è molto chiaro, ti metto di sotto la soluzione. Prova a risolverlo da solo, prima di leggerla

```java
public static float calcolaMedia(float a, float b) { // argomenti
    float somma = a + b; // Prima faccio la somma tra a e b
    float media = somma / 2; // Calcolo la media dividendo per 2!
    return media; // Ridò la media indietro! Ora il codice saprà che quella è la soluzione dell'esercizio!
}
```
Vediamo step per step cosa succede:
Se per esempio propants vuole calcolare la media tra 22 e 25, prenderà la scatola A e ci mette 22.

Poi prende la scatola B e ci mette 25, infine dice a `calcolaMedia` di partire!

CalcolaMedia fa 22 + 25, e mette quindi 47 dentro somma.
Poi fa somma / 2, e mette quindi 23.5 dentro media!
Infine, ridà 23.5 come risultato, è proprio questa la media!

## Migliorie
Puoi migliorare il codice e comprimerlo! Ecco la soluzione compressa
```java
public static float calcolaMedia(float a, float b) {
    return (a+b)/2;
}
```