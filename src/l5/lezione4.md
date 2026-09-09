# Stringhe
Per ora abbiamo visto e lavorato solamente con tipi cosiddetti _primitivi_.
Si tratta di tipi di variabile standard introdotti direttamente nel linguaggio e che, come abbiamo visto, hanno una grandezza standard (ad esempio 4 byte per un int).

Da adesso ci addentreremo sempre di più nella sezione relativa agli Oggetti, ovvero strutture dati più complesse che ci permettono di comporre qualsiasi elemento vogiamo.

E se volessi avere una coppia di int in una sola variabile? O per esempio un int e un boolean, o altri elementi più complessi? 

Ecco a cosa servono gli oggetti. Prima di addentrarci nella creazione di classi e oggetti, andiamo a vedere com'è fatta una classe dataci da Java stesso: la stringa.

Perché non è un primitivo? Come abbiamo visto, un primitivo ha una grandezza fissa, ma per una stringa, questo non vale.
Una striga (testo) può avere due caratteri come 100, e non possiamo certo allocare 100 byte per ogni stringa. Di conseguenza le stringhe internamente sfruttano delle array per allocare esattamente quanta memoria serve per contenere il testo che vogliamo.

Non voglio parlare troppo, quindi andiamo a vedere nel pratico cosa fanno.

```java
// Con la lettera maiuscola!
// |
// v
String a = "Ciao!"; 
```

Come hai visto fin'ora, ogni classe che abbiamo fatto (`E1`, `E1Tester`, `NomeClasse`) iniziano sempre con la lettera maiuscola. Lo stesso vale per String, che è di fatto una classe.

Esiste una sola operazione aritmetica disponibile per le stringhe, ovvero la somma (chiamata concatenazione):
```java
String a = "Ciao";
String b = " a tutti!"; // nota che ho messo lo spazio all'inizio
String c = a + b; // "Ciao a tutti!"
```

La concatenazione non include spazi fra le due stringhe, quindi li dovrai aggiungere tu se necessario.

## Funzioni delle stringhe
Abbiamo constatato che le stringhe sono classi, quindi esiste una classe `Stirng.java`. Si trova infatti dentro `java.lang.String`.
Ti ho mentito prima su math, in realtà java di base non richiede l'import di `java.lang`, e lo fa in automatico. Quindi puoi usare liberamente le stringhe senza importare nulla.

Essendo una classe, potrebbe avere delle funzioni, no? Esatto, come la nostra `E0.java`, anche `String.java` ha delle funzioni interne, ma sono speciali, perchè non tutte sono _statiche_.
Per ora abbiamo dato questo static dentro le funzioni che scrivevamo per buono senza sapere cosa facesse, ma è il momento di scoprirlo, e lo faremo con `equals`.

Come per le array, non possiamo effettuare `==` per due stringhe, poichè va a controllare il puntatore di quella variabile e non i singoli caratteri che contengono la stringa.
Per controllare due stringhe dobbiamo usare:
```java
String a = "Ciao";
String b = "Ciao";
boolean res = a.equals(b);
```
Ovviamente anche maiuscole e minuscole contano, spazi, etc. Controlliamo se le due stringhe sono esattamente uguali!

Ma hey, che strano... fino ad ora abbiamo visto funzioni che si chiamavano su delle classi, quindi ci aspettavamo qualcosa tipo `String.equals(a, b);`
E infatti questa è una funzione _non statica_, e si chiama direttamente su un oggetto, come in questo caso, la nostra stringa a. Stiamo quindi chiedendo ad `a` se è uguale a `b`.
Possiamo ovviamentr fare il contrario, ovvero `b.equals(a);` chiedendo quindi a `b` di controllare se i suoi caratteri sono uguali ad `a`. Non confondiamoci quindi con `==`!