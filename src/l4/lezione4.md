# Array
Per ora abbiamo visto come creare variabili per singoli elementi (numeri, booleani, caratteri), ma certe volte, tutto questo non ci basta.
Entrano in gioco quindi gli array, che ci permettono di inserire tanti elementi dentro una singola variabile.

```java
int[] arr = new int[32];
```

Con le quadre ho specificato che questa variabile non è un semplice int, è un array di int.
Si tratta quindi di una lista (o collezione) di molti int.
Come vedi nella seconda parte `new int[32]`, stiamo dicendo che questa array ha dimensione 32 elementi.
Può quindi contenere 32 numeri int tutti in fila.

Per ora abbiamo visto due operazioni per le variabili, assegnazione e lettura, ma con gli array possiamo fare anche le stesse operazioni all'interno dell'array, vediamo meglio

```java
int[] arr = new int[4]; // 4 numeri. Di base sono tutti 0

// Array {0, 0, 0, 0}
arr[0] = 3; // Imposto l'elemento 0 (il primo) su 3
// Array {3, 0, 0, 0}
int a = arr[1]; // Metto l'elemento 1 (il secondo, quindi 0) dentro a
```

Queste operazioni sono da non confondere con le operazioni standard della variabile

```java
int[] arr = new int[4]; // {0,0,0,0}
arr[0] = 1; // {1,0,0,0}

arr = new int[5]; // Ricreo l'array, sta volta da 5 elementi
// {0, 0, 0, 0, 0} // Gli elementi si sono eliminati!

int a = arr; // Sbagliato! a è un int, arr è un array di int!
int[] b = arr; // Corretto! Assegno tutta l'array da 5 numeri dentro b
```

Voglio fare in particolare molta attenzione su questa ultima operazione
```java
int[] a = new int[4];
int[] b = a;
```

Possiamo immaginare che a sia stato completamente copiato dentro b, ma non è così.
Si tratta di un argomento più avanzato che vedremo insieme alla gestione della memoria e i puntatori, ma da questo momento, a e b puntano esattamente alla stessa array.
Cosa significa, ti chiederai:

```java
int[] a = new int[4]; // {0,0,0,0}
int[] b = a;

b[2] = 3; // Sia a che b puntano alla stessa array, quindi modificando un elemento di b modifica anche un elemento di a

int k = a[2]; // 3, anche se abbiamo modificato tramite b
```

Quindi ricorda le 4 operazioni fondamentali
- Leggere/Scrivere la variabile in se
- Leggere/Scrivere gli elementi dell'array

Possiamo quindi dire che
```java
int[] a = new int[4]; // {0,0,0,0}
a[3] = 1; // {0,0,0,1}
int[] b = a; // b punta alla stessa array di a
a = new int[4]; // ora a punta ad una nuova array
// Da questo momento a e b sono scollegate
// a = {0,0,0,0}
// b = {0,0,0,1}
```

## Indici e lunghezza delle array
Come abbiamo visto prima, è possibile andare a leggere o scrivere nella n-esima casella di un array
```java
arr[1] = 3; // Scrivo nel secondo elemento
```
La posizione in cui vogliamo scrivere è chiamato indice

```java
// {6, 4, 8, 7} <-- Elementi dell'array
// {0, 1, 2, 3} <-- Indici dell'array
```

Un array parte sempre da indice 0 e arriva a indice $l-1$ dove $l$ è la lunghezza dell'array
- Array di 4 elementi, indice massimo 3
- Array di 512 elementi, indice massimo 511

Possiamo anche andare ad accedere alla lunghezza di un array
```java
int[] arr = new int[4];

int lunghezza = arr.length; // 4
```

Possiamo infine decidere di inizializzare un array già con dei valori dentro
```java
int[] arr = new int[] {3, 8, 7, 4}; // non devo scrivere 4 nelle quadre, lo sa già!
```
Per finire, ovviamente, un array non deve necessariamente essere di int


```java
char[] chars = new char[] {'c', 'i', 'a', 'o'};
boolean[] flags = new boolean[4]; // {false, false, false, false}
```

Come puoi vedere, ogni primitivo ha un valore di default nel caso in cui non viene specificato (per int è 0, per boolean è false).

## Ciclare un array
Arriviamo al succo delle array, certe volte vogliamo semplicemente ciclare ogni elemento di un array. 
Andremo a vedere un metodo molto macchinoso per analizzare un array, e poi più avanti scoprirai un modo molto più semplice.

```java
char[] arr = new char[]{'c', 'i', 'a', 'o', '!'};
for(int i = 0; i < arr.length; i++) {
    System.out.print(arr[i]); // uso print, non println!
}
```

Puoi testarlo dentro [CharrArrayPrint](CharArrayPrint.java)

Cosa succede qui? Analizziamo il ciclo e vediamo
1. Inizializzo $i = 0$
2. $i < arr.length$? Si, $0 < 5$
3. Faccio print di `arr[i]`, $i = 0$ quindi `arr[0]` che sarebbe `c`
4. i++, aumenta i $0 \rightarrow 1$
5. $i < arr.length$? Si, $1 < 5$
6. Faccio print fi `arr[i]`, $i = 1$ quindi `arr[1]` che sarebbe `i`
7. Prosegue fino a $i = 4$
8. Print di `arr[4]` che sarebbe `!`
9. i++ $4 \rightarrow 5$
10. $i < arr.length$? No, 5 non è minore di 5. Il ciclo termina

Come vedi abbiamo ciclato ogni elemento dell'array e lo abbiamo printato in console.
Abbiamo usato inoltre `print` invece di `println`
Println va accapo prima di scrivere il testo, e invece, con print, mettiamo tutti i caratteri uno dopo l'altro!