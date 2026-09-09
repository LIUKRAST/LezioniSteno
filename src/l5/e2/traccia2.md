# Trovare un carattere dentro una stringa
Abbiamo già visto questo esercizio con le char array, ma ora vediamo come farlo con le stringhe.

## A. Estrarre il char array
Una stringa internamente è un char array. Possiamo estrarre quest'ultimo con:
```java
String a = "...";
char[] arr = a.toCharArray();
```
## B. Prendere il carattere
```java
String a = "...";
char c = a.charAt(2); // prende il carattere ad index 2
```
e quindi sfruttare una logica simile all'esercizio prima!