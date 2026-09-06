# Contatori
Mettiamo in pausa gli esercizi divertenti con propants per entrare in un sotto argomento molto importante quando si studiano i cicli.

Voglio prendere questo esercizio per dedicarci all'apprendimento approfondito dello scopo di una variabile. Vedremo più avanti cos'è lo scopo di una funzione e di una classe, ma lo scopo esiste anche per le variabili e vediamo cosa si intende

```java
int a = 3; // Creo la variabile a
// |
// |
// v
System.out.println(a); // Printo a in console
```

è ovvio che invertire gli operandi non è possibile e produce un crash:

```java
System.out.println(a); // a non esiste a questa riga
// |
// |
// v
int a = 3; // a viene creato qui
```

Questo perché lo scopo di A inizia dopo la sua creazione. Vediamo alcuni scopi più complessi

```java
int a = 3;

if(condizione) {
    int b = 2;
}

int c = 4;
```

In questo caso a ha scopo in tutto il codice. Posso usarlo dalla riga in cui viene creato, posso usarlo dentro l'if, posso usarlo dopo l'if

B, tuttavia, viene creato dentro l'if. Essendo che l'IF esegue la creazione di B SOLO se condizione è true, b SICURAMENTE non esiste prima e POTREBBE non esistere dopo.
Di conseguenza java preferisce gestire semplicemente il POTREBBE con SICURAMENTE. In poche parole non può essere usato ne prima ne dopo l'if

```java
int a = 3;
System.out.println(a); // Corretto
System.out.println(b); // Errato, non esiste ancora
System.out.println(c); // Errato, non esiste ancora

if(condizione) {
    int b = 2;
    System.out.println(a); // Corretto
    System.out.println(b); // Corretto
    System.out.println(c); // Errato, non esiste ancora
}

int c = 4;
System.out.println(a); // Corretto
System.out.println(b); // Errato, non esiste più
System.out.println(c); // Corretto
```

## Ok, ma quindi cosa c'entrano i contatori?
Il concetto vale anche per un for:

```java
// non posso usare i qui
for(int i = 0; i < 10; i++) {
    // posso usare i qui
}
// non posso usare i qui
```

In alcuni linguaggi è possibile usare la i dopo la condizione, così come negli if, ma se provi a leggerli male crasha il codice

L'esercizio svolto che troverai in E1 chiede di trovare quanti numeri esistono divisibili per 3 da 1 a 1000.
L'esercizio contiene troppe nozioni che ancora non hai visto, quindi l'ho svolto perché voglio che tu possa comprenderlo.


```java
int contatore = 0;
for(int i = 0; i < 1000; i++) { // range 0 -> 999
    int k = i + 1; // Porto a range 1 -> 1000

    if(k % 3 == 0) {
        contatore = contatore + 1;
    }
}
```

Vediamo cosa succede passo passo
1. Creo contatore con valore 0
2. Inizio il mio for loop da 0 a 999
3. Creo k che è sempre i + 1. Se i inizia a 0 k inizia a 1, se i finisce a 999 k finisce a 1000
4. Controllo se il resto della divisione per 3 è 0, se lo è, il numero è divisibile per 3
5. Se lo è, aggiungo 1 a contatore

Come vedi contatore è una variabile esterna al loop, ma viene modificata dentro al loop.
In qesto modo, noi iniziamo a contare da 0, e ogni volta che troviamo un multiplo di 3 aggiungiamo 1 al nostro contatore.

