# Lezione 2: Cicli for e while

I programmatori cercano sempre di semplificarsi la vita.
Il motivo per cui esistono i programmi è proprio questo, per semplificare task noiose che non vorremmo fare. E alcune volte vogliamo anche scrivere poco codice.

I cicli servono per ripetere più volte operazioni simili. Vediamo come funzionano

## Ciclo for
```java
for(int i = 0; i < 10; i++) {
    System.out.println("Ciao!");
}
```
Output:
```
Ciao!
Ciao!
Ciao!
Ciao!
Ciao!
Ciao!
Ciao!
Ciao!
Ciao!
Ciao!
```

Ho scritto 10 volte ciao, vediamo perché

```java
//  Valore iniziale
//      |      Condizione di uscita
//      |        |    Incremento
//      |        |      |
//      v        v      v
for(int i = 0; i < 10; i++) {} // Nelle graffe il codice da ripetere
```

Vediamo step per step cosa fa il nostro for
1. Inizializza il valore iniziale
> Crea una variabile `i` con valore iniziale 0

2. Controlla se la condizione di uscita è vera. lo è: `i` (0) è minore di 10
3. Passa nelle graffe gialle, eseguendo il codice
4. Arriva all'incremento, che aumenta il valore di `i` (0 $\rightarrow$ 1)
5. Ritorna al punto 2

Ecco che quindi si forma il nostro ciclo, si ripete si ripete e ogni volta `i++` increementa i
$0 \rightarrow 1 \rightarrow 2 \rightarrow 3 \rightarrow 4 \rightarrow 5 \rightarrow 6 \rightarrow 7 \rightarrow 8 \rightarrow 9 \rightarrow ...$

Attenzione ora! Arriviamo a incrementare i talmente tanto che diventa 10, ma rivediamo il passo 2:

_Controlla se la condizione di uscita è vera. $10 < 10$_

10 NON è minore di 10. Quindi il ciclo finisce qui! Si ferma, e passa dopo le graffe gialle per altre parti del codice.

### E se creo un ciclo infinito?
Può capitare di sbagliare, moltissime volte. In questi casi, il problema si nota molto facilmente: la RAM si continuerà a riempire di schifezze fino a far crashare il codice

### Posso usare i!
La variabile i è di per se una variabile, quindi posso usarla tranquillamente

```java
for(int i = 0; i < 10; i++) {
    System.out.println("Conto " + i);
}
```
Output:
```
Conto 0
Conto 1
Conto 2
Conto 3
Conto 4
Conto 5
Conto 6
Conto 7
Conto 8
Conto 9
```

Hai notato come ha contato da 0 a 9? Riguarda bene i passaggi di prima e vedrai che tutto torna!

## Ciclo while

Il ciclo while è più semplice ma anche più fragile

```java
while(condizione) {
    // Codice
}
```

è un ciclo for che dice "Veditela tu". Non ti da variabili, non ti da numeri, ti chiede solo una condizione.
Ed è in questi casi che devi essere tu a vedere bene come fermare il loop

```java
int i = 1;
while(i < 1_000_000_000) {
    i = i * 2;
}
System.out.println(i);
```

Vediamo cosa succede qui:
1. Creo una variabile i con valore 1
2. Inizio il while
3. Il while controlla se i < 1 miliardo (si)
4. Passa a `i = i * 2`, cambia quindi il valore (i diventa i * 2, e quindi diventa 2)
5. Torna al while, 2 < 1 miliardo? (si)
6. Passa a `i = i * 2` $2 \rightarrow 4$
7. Torna al while, 4 < 1 miliardo? (si)

...

Ad un certo punto, il valore i supererà il miliardo, e quindi il while si romperà.
Il codice salterà quindi alla prima operazione dopo, ovvero il system.out.

Per quanto raggiungere un miliardo sembra altissimo, bastano 30 cicli per arrivare al primo numero maggiore o uguale ad un miliardo, ovvero:
1073741824

Ovviamente avere milioni di cicli (soprattutto se innestati) produce un carico pesantissimo sulla CPU, e per questo è uno dei punti dove più si va ad ottimizzare. Ricorda che ora stiamo facendo moltiplicazioni, ma leggere dalla RAM o addirittura dall'SSD migliaia di volte richiede tanto, tanto tempo.

Puoi andarti a divertire nei file [Crash](Crash.java), [NoCrash](NoCrash.java) e [Miliardo](Miliardo.java) per vedere quanto lontano può spingersi la tua RAM salvando ogni volta memoria che il codice non può svuotare

Ho anche fatto un ultimo esperimento [CrashStack](CrashStack.java) che va a riempire la memoria stack invece dell'heap (tranquillo vedremo poi cosa sono) e usa delle funzioni ricorsive. Ma hey! Vedrai le funzioni nella prossima lezione!

## Cicli innestati

è possibile innestare dei cicli fra di loro

```java
for(int x = -10; x < 10; x++) { // Ciclo A
    for(int y = -10; y < 10; y++) { // Ciclo B
        for(int z = -10; z < 10; z++) { // Ciclo C
            System.out.println("Coordinata " + x + "; " + y + "; " + z + " ispezionata");
        }
    }
}
```

Il comportamento di questo ciclo è molto complesso:
1. Inizia il ciclo A, x = -10;
2. Inizia il ciclo B, y = -10;
3. Inizia il ciclo C, z = -10;
4. Il ciclo C prosegue fino ad arrivare a 9, poi finisce
5. y aumenta di uno e ricomincia il ciclo C, z = -10;
6. Il ciclo C prosegue fino ad arrivare a 9, poi finisce

...
7. Il ciclo B finisce arrivando a 9, quindi il ciclo A aumenta x di 1
8. Ricomincia il ciclo B
9. Ricomincia il ciclo C

...
10. Finisce il ciclo A quando x arriva a 9

Puoi vedere il funzionamento del programma in [Coordinate](Coordinate.java)