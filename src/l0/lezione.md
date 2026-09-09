# Introduzione: Variabili

## Codice template iniziale

```java
public class Main {
    public static void main(String[] args) {
        // Codice qui
    }
}
```
Capiremo più avanti il significato di tutto questo

## Come creare una variabile

```java
tipo_variabile nome_variabile = valore_iniziale;
```
Variabile: è un modo per salvare un informazione per usarla nel codice


## Tipi *Primitivi* di variabili
| tipo    | significato          | numero bit | numero byte |
|---------|----------------------|------------|-------------|
| long    | numeri interi        | 64 bit     | 8 byte      |
| int     | numeri interi        | 32 bit     | 4 byte      |
| short   | numeri interi        | 16 bit     | 2 byte      |
| byte    | numeri interi        | 8 bit      | 1 byte      |
| char    | caratteri            | 8 bit      | 1 byte      |
| float   | decimali             | 32 bit     | 4 byte      |
| double  | decimali (+ precisi) | 64 bit     | 8 byte      |
| boolean | vero/falso           | 8 bit      | 1 byte      |

1 byte -> 8 bit

# Domande da porsi
- Quanti byte sono 1 KB? e quanti bit?

La risposta è 1024 byte, non 1000!
- Cosa cambia tra un numero intero a pochi bit contro uno a molti?

La capienza! Più bit significa numeri più grandi (o più piccoli, negativi).
Immagina un lucchetto con password, se hai 4 caselle, puoi scrivere fino a 9999, ma con 8 caselle, fino a 99999999

- Perché esistono così tanti tipi di numeri interi?

Non sempre abbiamo bisogno di dei long, che occupano ben 8 byte in RAM! Ovviamente su un programma base non fanno nulla contro i tuoi 16gb DDR4, ma immaginalo su programmi massicci come minecraft stesso. Inoltre i calcoli sono più lenti.
Immagina la differenza tra calcolare $3 \times 3$ e $129396479271 \times 2389127478946187$

_Piccola curiosità: anche se occupa 8 bit, il boolean ne usa solo 1. Ovviamente basta 1 bit (0 per false, 1 per true). Purtroppo tutti i salvataggi in RAM etc si effettuano per un byte minimo, e quinti deve occupare più spazio in ram di quanto ne serve realmente_

## Primo codice
```java
public class Main {
    public static void main(String[] args) { // <--- inizio funzione
        int a = 10;
        int b = 20;
        
        int c = a + b;
        
        System.out.println(c);
    } // <--- Fine funzione
}
```
Vediamo per bene cosa succede. Come analizzare correttamente il codice?
Il trucco è farlo dal basso verso l'alto. Il `main` è la nostra funzione di partenza.
Tutto ciò che viene eseguito nella funzione avviene progressivamente dall'alto verso il basso.

```java
int a = 10;
```

Come abbiamo visto prima, stiamo creando una variabile.
Immagina di avere uno scaffale vuoto, con delle scatole. Ogni scatola ha una lettera sopra (a,b,c).
Dentro la scatola A, stiamo mettendo un 10!

Successivamente succede lo stesso con b, ma viene messo su 20

Ora andiamo a prendere la scatola C, ma l'operazione dice: Scrivici dentro a + b.
Questo vuol dire che andremo a prendere la scatola A e la leggiamo. Poi leggiamo la scatola B. Facciamo quindi la somma, trovando 30.
Adesso andiamo a mettere il 30 dentro la scatola c!

**Attenzione:** ora che abbiamo scritto 30 nella scatola c, se modifichiamo a o b, il valore che è dentro la scatola c **NON** cambia!

Infine chiamiamo questa operazione
```java
System.out.println(c);
```
Questa è una chiamata a println. Ci permette di scrivere nella console del programma!

Perfetto! Il codice è andato e il processo è terminato con exit code 0 (nessun crash)!

# Operatori
- `+` somma
- `-` sottrazione
- `*` moltiplicazione
- `/` divisione
