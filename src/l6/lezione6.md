# Lezione 6: Oggetti
Java è il re assoluto della OOP (Object oriented programming).
Ovvero, come abbiamo visto, la possibilità di creare strutture dati esattamente come la stringa che ci permettono di contenere valori dinamici.

Andremo a vedere quello che in università è lo spaventosissimo esame di Algoritmi e Strutture dati, che in realtà possiamo facilmente affrontare con il giusto impegno.
Vedremo che da adesso dobbiamo calarci in 3 ruoli durante la programmazione, e affrontare tre fasi importanti: **Progettazione**, **Realizzazione** ed **Esecuzione**.

## Progettazione
La prima fase della creazione di un programma: Si tratta di progettare classi che possano creare le nostre strutture dati.
## Realizzazione
La seconda fase, si tratta di utilizzare i progetti (classi) scritti in precedenza per fare algoritmi, risolvere problemi.
## Esecuzione
L'unica fase in cui noi siamo spettatori. Si tratta di eseguire il programma e vederlo in azione. Noi non dobbiamo fare nulla, ma l'esito del programma (come ad esempio un crash) ci dice come dobbiamo lavorare nelle due fasi precedenti per sistemare il codice.

Andiamo a vedere nello specifico cosa intendiamo per classe, oggetto, e così via.

```java
public class CartaIdentita {
    public String nome;
    public String cognome;
    public int numeroCarta;
    
    public CartaIdentita(String nome, String cognome, int numeroCarta) {
        this.nome = nome;
        this.cognome = cognome;
        this.numeroCarta = numeroCarta;
    }
}
```

Questo codice ci sembra estremamente strano rispetto a prima, ma andiamo ad immergerci nella progettazione:

In questo momento noi siamo lo stato. Si, lo stato italiano. Dobbiamo progettare la carta d'identità, per dire alla stampante come crearle per ogni cittadino.

Dobbiamo quindi definire i campi (attributi) che ogni carta d'identità deve avere. Infatti, ogni carta d'identità deve avere un nome, un cognome, e un numero identificativo.

```java
CartaIdentita carta = new CartaIdentita("Luca", "Rastrelli", 120874);
```
Con questo codice qui sotto siamo invece nella fase di **Realizzazione**. Abbiamo finito di progettare i campi che la carta d'identità deve avere e siamo passati a creare la vera e propria carta di qualcuno (in questo caso io).
Torniamo un attimo indietro per vedere com'è strutturata questa classe `CartaIdentita`

```java
public class CartaIdentita {
    // Attributi
    public String nome;
    public String cognome;
    public int numeroCarta;
    // Costruttore
    public CartaIdentita(String nome, String cognome, int numeroCarta) {
        this.nome = nome;
        this.cognome = cognome;
        this.numeroCarta = numeroCarta;
    }
}
```

- Attributi: Definiamo quali campi la carta d'identià deve avere, e di che tipo sono. Definiamo inoltre lo scopo (public) per dire che sono accessibili dall'esterno
- Costruttore: La macchina che serve a creare una carta d'identità. Come vedi è una funzione, non statica, molto particolare. Il nome della funzione è il nome stesso della classe, e gli argomenti in questo caso sono i 3 attributi.
Successivamente i tre attributi vengono assegnati `this.nome = nome;`... cosa sta succedendo?

Il costruttore viene chiamato con `new NomeClasse(parametri)`, e infatti abbiamo visto che possiamo creare una carta d'identità con `new CartaIdentita("Luca", "Rastrelli", 2836)`.
Il costruttore quindi internamente fa queste 2 cose:
1. Crea la struttura vuota. Crea le scatole per i 3 attributi, e le mette tutte e 3 da qualche parte in RAM (vuote)
2. Chiama l'interno della funzione, che dice "inserisci luca dentro il nome, rastrelli dentro la scatola cognome e così via"

È possibile dunque accedere agli attributi di un oggetto. Attenzione: Per oggetto si intende la singola istanza di una classe. In parole povere
- CartaIdentita $\rightarrow$ classe (progetto)
- CartaIdentita di Luca Rastrelli $\rightarrow$ oggetto, istanza di CartaIdentita

```java
CartaIdentita id = new CartaIdentita("Luca", "Rastrelli", 1234);

String nome = id.nome; // Prendo il nome da dentro id, quindi "Luca"
```