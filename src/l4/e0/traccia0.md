# Somma degli elementi di un array

Ti viene data in input un'array di int, e devi calcolarne la somma.

Esempio: `{1, 4, 3, 8}` $\rightarrow 1+4+3+8=16$

Suggerimento: Ricordi quando abbiamo visto i contatori? Forse ce ne serve uno?

Ricorda che puoi fare questi operatori:

```java
int c = 0;

c = c + 1; // Incrementa c di 1, quindi da qui sotto c = 1
c+=1; // Stessa operazione di sopra, ma più compatta
c++; // Stessa operazione di sopra, ma ancora più compatta. Funziona solo per 1

c+=2; // Incrementa di 2, non replicabile con ++
```

Puoi anche usare variabili

```java
int c = 1;

int b = 3;

c+=b; // faccio c+b (4), poi lo metto dentro c
```

Puoi anche usare altre operazioni
```java
c--;
c*=2;
c/=2;
```