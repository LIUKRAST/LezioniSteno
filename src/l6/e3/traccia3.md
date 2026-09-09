# Ereditarietà
Alcune classi possono ereditare altre, ovvero esserne figlie.
Facciamo subito un esempio per non confonderci:

```
         Animale
            |
            |
  *---------*---------*
  |                   |
  v                   v
Cane                Gatto
```

Le classi `Cane` e `Gatto` sono entrambe figlie di `Animale`, quindi ne ereditano attributi, costruttori e funzioni.

Possiamo definire l'ereditarietà fra classi in questo modo:
```java
public class Cane extends Animale {
    // [...]    
}
```

A questo punto, ci verrà richiesto di implementare il costruttore:
```java
public class Cane extends Animale {
    public Cane(String nome) {
        super(nome);
    }

    // [...]
}
```

La chiamata a `super` è simile al `this` che abbiamo visto prima, tuttavia dice "Chiama nella classe madre" (ovviamente per classe madre si intende `Animale`).

```
Animale (classe madre di cane) <----------------*
   |                                            |
   |                                            |
   |                                            |
   v                                            |
 Cane (classe madre di barboncino) <--* super --*
   |                                  |
   |                                  |
   |                                  |
   v                                  |
Barboncino super ---------------------*
```

Infine, sappiamo che Cane eredita da animale la funzione `emettiSuono`.
Di base non bisogna fare nulla per ereditarla, tuttavia possiamo osservare che dentro Cane abbiamo emettiSuono:

```java
@Override
public void emettiSuono() {
    System.out.println("Mi chiamo " + getNome() + " e sto abbaiando");
}
```

- @Override $\rightarrow$ definisce che stiamo sovrascrivendo il comportamento di `emettiSuono`
- Chiamo un system out differente

Cosa fa?

```java
Animale animale = new Animale("Jhonny");
Cane cane = new Cane("Pluto");

animale.emettiSuono(); // Printa "Mi chiamo Jhonny e sto emettendo un suono generico!"
cane.emettiSuono(); // Printa "Mi chiamo Pluto e sto abbaiando"
```

Abbiamo dunque modificato il comportamento della funzione quando viene specificatamente chiamata su cane.

Inolte possiamo notare che abbiamo usato dentro cane `getNome` invece di `nome` come in animale. Questo per la stessa ragione di sempre: nome è privato, e quindi accessibile solo dall'interno del file.

Andiamo a vedere invece `Gatto`

```java
@Override
public void emettiSuono() {
    System.out.println("Miagola");
    super.emettiSuono();
}
```

Come vedi, dopo miagola, abbiamo un `super.emettiSuono()`. Questo andrà a chiamare la funzione originale. Possaimo quindi aspettarci che l'output per un gatto di nome "Neko" sarà:
```
Miagola
Mi chiamo Neko e sto emettendo un suono generico
```

Possiamo ovviamente invertire l'ordine delle chiamate o anche chiamare il super più volte.