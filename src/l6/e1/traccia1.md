# Il cane
In questo esercizio già completo vorrei parlare di vari aspetti che non abbiamo visto in precedenza

```java
private final nome;
```

Come vedi lo scopo è privato, quindi da fuori non posso accedere o modificare il nome del cane
```java
Cane cane = new Cane("Pluto");

String nome = cane.nome; // Errore: nome è privato
```

Inoltre è anche `final`, ovvero immutabile una volta assegnato. Se crei un cane di nome `Pluto`, il nome non può essere cambiato successivamente!

Possiamo osservare sotto che questa classe ha due costruttori: è infatti possibile creare più costruttori per la stessa classe solo ed esclusivamente se hanno parametri diversi.
Possiamo quindi vedere che abbiamo un costruttore `Cane(String nome)`

```java
public Cane(String nome, String forza) { // <--*
    this.nome = nome; //                       |
    this.forza = forza; //                     |
} //                                           |
 //                                            |
public Cane(String nome) { //                  |
    this(nome, "leggermente"); // chiama ------*
}
```

In questo modo posso creare un cane in due modi:

```java
Cane pluto = new Cane("Pluto"); // forza sarà "leggermente"
Cane kira = new Cane("Kira", "fortemente"); // forza sarà "fortemente"
```

Andiamo ad analizzare meglio il primo costruttore:

```java
private final String nome; // <--------------*
// [...]                                     |
public Cane(String nome, String forza) { //  |
    this.nome = nome; // --------------------*
    this.forza = forza;
}
```

In questo caso stiamo andando ad impostare l'argomento passato dall'utente (nome) dentro la scatola this.nome.

In questo caso usiamo `this` per specificare che si tratta dell'argomento nome, dato che esiste anche un parametro/variabile locale nome.
Avremmo potuto evitare il this con:

```java
private final String nome; // <--------------*
// [...]                                     |
public Cane(String n, String forza) { //     |
    nome = n; // ----------------------------*
    this.forza = forza;
}
```

Qui nome non ha bisogno per forza di `this`. Infatti non c'è collisione con nessun'altra variabile!

Passiamo quindi infondo: abbiamo visto come è possibile scrivere funzioni per le stringhe, e quindi possiamo farlo anche noi! In questo caso abbiamo una funzione `abbaia` che come vedi non è `static`!
Possiamo chiamare la funzione su un qualsiasi cane:

```java
Cane pluto = new Cane("Pluto");

Cane.abbaia(); // NO! Questa funzione non è statica
pluto.abbaia(); // Abbiamo bisogno di un vero cane per poterlo far abbaiare
```

In questo caso la funzione concatena delle stringhe e le manda in output, leggendo il suo nome e la sua forza.
```java
public void abbaia() {
    System.out.println("Io sono " + this.nome + " e sto abbaiando " + forza + "!!");
}
```
Anche qui, come mostrato, possiamo decidere di usare o meno il `this`
