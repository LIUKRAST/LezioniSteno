# Stringhe: Funzioni utili
Una volta finiti gli esercizi, vieni a vedere un po di funzioni che puoi far fare alle tue stringhe!

A differenza delle array, le stringhe sono _Immutabili_. Non troverai una funzione che modifica un carattere dentro la stringa, ma tutte le funzioni ti daranno un copia nuova della stringa modificata.

Per modificare realmente la stringa devi riassegnarla:
```java
String a = "Esempio";
String b = a.replace('o', 'a'); // "Esempia"
a = b; // ora a = "Esempia"
```

Funzioni utili:
```java
String testo = "Ciao a tutti io sono steno!";
// Sostituire un carattere con un altro
String rep = testo.replace(' ', ','); // ",,Ciao,a,tutti,io,sono,steno!,,"
// Controllare se una stringa contiene un carattere
boolean contains = testo.contains('C');
// Lunghezza della stringa
int lunghezza = testo.length(); // Ritorna il numero di caratteri
// Convertire in Maiuscolo / Minuscolo
String maiuscolo = testo.toUpperCase(); // "  CIAO A TUTTI IO SONO STENO!  "
String minuscolo = testo.toLowerCase(); // "  ciao a tutti io sono steno!  "

// Rimuovere gli spazi all'inizio e alla fine
String pulito = testo.trim(); // "Ciao a tutti io sono steno!"

// Estrarre una parte di stringa (Substring)
String nome = pulito.substring(21, 26); // "steno" (dall'indice 21 al 25)

// Verificare come inizia o finisce
boolean inizia = pulito.startsWith("Ciao"); // true
boolean finisce = pulito.endsWith("!");     // true

// Trovare la posizione di un carattere o di una parola
int posizione = pulito.indexOf("steno"); // Ritorna l'indice iniziale (es. 21)

// Dividere una stringa in un Array (Split)
String[] parole = pulito.split(" "); // Separa la stringa a ogni spazio
```