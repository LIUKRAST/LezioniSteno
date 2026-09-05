# Lezione 3: Funzioni, Stringhe, Array

Dovresti avere a questo punto abbastanza familiarità con il codice java.
Per ora ti sei allenato a scrivere codice puramente logico, ma ora ci spostiamo lentamente verso il vero cuore di java: le strutture dati.

Java si caratterizza come il miglior linguaggio per OOP (Object Oriented Programming), e dobbiamo piano piano imparare le parti più complesse del linguaggio

## Funzioni
Per ora hai lavorato nel corpo di una funzione, andiamo a vedere però nello specifico **cosa è** e **come possiamo creare** una funzione

Una funzione non è altro che un blocco di codice a se stante che prende in ingresso più dati e ne restituisce uno in uscita.

Lasciamo stare la formalità, andiamo a vedere pezzo per pezzo

```java
/*
Scopo
   |        Risultato
   |            |       Nome
   |            |         |      Argomenti
   |            |         |          |
   v            v         v          v                      */
public static boolean numeroPari(int n) {
    
}
```

### Lo scopo di una funzione
Definisce dove questa funzione può essere vista.
Ovviamente, come hai già visto nei vari esercizi, un codice java può essere sviluppato in più file (chiamati classi)
Lo scopo definisce quali altre classi possono vedere e usare la nostra funzione. Per ora vedremo solo due scopi
- Public (accessibile da tutti i file)
- Private (accessibile solo dal file corrente)

Se io voglio ad esempio chiamare la funzione `numeroPari` che si trova in `E0.java` dal file `E1.java`, posso farlo solo se è pubblica.
Al contrario, se io ho un altra funzione dentro `E0.java` che vuole accedere a `numeroPari`, potrà farlo anche se è privata

### Perché?
Lo scopo serve a nascondere codice agli altri. Ricorda che sviluppare vuol dire produrre un infrastruttura, e non sempre la userai solo tu.
Infatti possiamo per esempio decidere di fare una funzione pubblica che chiama più funzioni private dentro la sua stessa classe.
In questo modo chi usa il tuo codice (lo chiameremo il cliente) potrà solo chiamare la funzione pubblica e non quella privata

### Risultato
Lo abbiamo già visto con tutti gli esercizi: è il tipo di dato che la funzione si aspetta come risultato.
Dicendo `boolean`, stiamo specificando che il codice vuole in output un booleano, non un int ne un float!

### Nome
è il nome della funzione. è a scelta tua, ovviamente cambiarlo comporta che chi vuole usare la tua funzione deve cambiarne il nome

### Argomenti
Sono gli argomenti della funzione: tutti i valori di cui tu hai bisogno per svolgere correttamente la funzione.
Immagina il teorema di pitagora. Come lo calcoli? Beh per un triangolo rettangolo devi avere le grandezze dei due cateti, quindi puoi creare la formula come:
$$$
i = \sqrt{a^2+b^2}
$$$

Qui arriva il concetto di progettista: tu non sei chi esegue il codice, ma chi lo progetta.
Noi abbiamo scritto la formula generale, non la formula per il triangolo preciso con $a=3$ e $b=5$.
Sarà il cliente ad inserire i dati nella nostra formula e ricevere il risultato.

Quindi noi siamo il matematico, scriviamo la formula, la mettiamo lì, e a chi serve mette i dati e ottiene il risultato.
Ovviamente in matematica gli argomenti sono numeri, ma nel nostro caso possono essere booleani, stringhe, e tutto il resto.

Un argomento si specifica come una variabile, senza impostarne il valore

```java
(float a, int b, char c, String d, boolean e)
```

```java

// TU: Progettista, scrivi la formula senza conoscere a e b
public static float pitagora(float a, float b) { // <-------------*
    // Qui, al return, avviene il secondo salto                   |
    return Math.sqrt(a*a + b*b); // ---------------------*        |
} //                                                     |        |
//                                                       |        |
// Il cliente: Sceglie a e b, e chiama la tua formula    |        |
public static void main() { //                           |        |
    float a = 2; //                                      |        |
    float b = 5; //                                      |        |
    // Qui,  avviene il salto                            |        |
    float c = pitagora(a,b); // -------------------------|--------*
    // <-------------------------------------------------*
}
```

Abbiamo visto, che creata una funzione, chiamarla è piuttosto facile

```java
float c = pitagora(1, 2); // Chiamo pitagora con argomenti 1 e 2
```

La funzione ritorna float quindi il risultato lo mettiamo dentro c
```java
int c = pitagora(1, 2); // ERRORE! pitagora da float, ma c è int!
```

è possibile anche chiamare funzioni in classi diverse
```java
// Classe1.java
public static boolean pari(int n) {
    return n%2==0;
}

// Classe2.java
public static void controlla() {
    boolean pari = Classe1.pari(2); // Chiamo la funzione pari con argomento 2 dentro la classe Classe1
}
```

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

## Array
Per ora abbiamo visto come salvare singoli elementi. Un numero, un carattere, un booleano... e se volessi salvarne di più? Se non sapessi quanti me ne servono?
Arriviamo dunque al concetto di array