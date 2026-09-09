## Stringhe
Hai per caso notato che `String` è l'unico tipo di variabile che ha la lettera maiuscola e non diventa arancione?
Beh infatti, le stringhe **NON** sono primitivi. Un singolo carattere, scritto con `char` è un primitivo, ma una stringa non lo è.
Abbiamo infatti parlato del fatto che ogni primitivo ha una sua grandezza (int 32bit, boolean 8bit e così via), ma una stringa può essere lunga quanto vuoi (finchè la RAM ce la fa) e quindi si devono essere inventati qualche altro modo per gestirla!
Infatti si tratta di un elemento non primitivo. Non ci interessa molto per ora sulle stringhe, ma iniziamo a scoprire qualcosa:

### 1. Non puoi controllarle con ==
```java
String a = "Ciao";
String b = "Ciao";

boolean e = a == b; // SBAGLIATO!
boolean r = a.equals(b); // GIUSTO!
```

Che strano... come mai? Si tratta di qualcosa di speciale, ovvero i puntatori. Il concetto è molto complesso, quindi per ora lo prenderei come un "RICORDATI ASSOLUAMENTE DI QUESTA REGOLA ANCHE SE NON SAI IL PERCHE'"

Vediamo invece questo .equals... che strano, sembra quasi una funzione!
### 2. Funzioni interne
Le stringhe non sono primitivi, e possono avere delle funzioni interne!
```java
String a = "Ciao";
String b = "Ciao";

boolean r = a.equals(b); // Chiamo la funzione equals su a con argomento b
```

Esiste quindi dentro `String.java` una funzione
```java
public boolean equals(String b) {
    // ...
}
```
Che controlla in qualche modo se a è uguale a b. Però attenzione, in precedenza abbiamo visto che posso chiamare una funzione in una classe diversa mettendo il nome della classe prima del nome della funzione, quindi mi aspetto qualcosa tipo `String.equals(b)`... eppure...

Manca lo static! Infatti questa è una funzione NON statica. Vedremo più avanti cos'è una funzione non statica, ma per ora quello che ci interessa è che la funzione non statica va chiamata su un oggetto (una variabile) e non su una classe
```java
String a = "Ciao";
String b = "Ciao";

boolean e = String.equals(b); // Sbagliato
boolean r = a.equals(b); // Chiamo equals su a, e controllo se è uguale a b
boolean r1 = b.equals(a); // Chiamo equals su b, e controllo se è uguale ad a
```