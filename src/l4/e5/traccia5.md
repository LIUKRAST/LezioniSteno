# Confronto array
Arriviamo alla parte più interessante: il confronto tra array.

Ti verrebbe da pensare: vabbè, faccio `return a == b;` e via, e invece no.

Come abbiamo detto prima, il concetto di puntatori è molto complesso, ma per ora ci interessa che: controllare se le due variabili sono uguali non controlla se gli elementi sono uguali!

Vediamo meglio:
```java
int[] a = new int[2]; // {0,0}
int[] b = a;

if(a == b) return true;
```

In questo caso è corretto: b e a puntano allo stesso array, quindi si può dire che sono uguali!
```java
int[] a = new int[2]; // {0,0}
a[1] = 2; // {0, 2}
int[] b = new int[2]; // {0,0}
b[1] = 2; // {0, 2}

if(a == b) return true; // false!
```

Tuttavia ora le due variabili puntano a due array diverse. Si trovano in due sezioni diverse della memoria e anche se contengono gli stessi elementi, non sono la stessa array in memoria.

è quindi importante che controlliamo, numero per numero, che tutti i numeri sono uguali. Se ne trovi uno sbagliato, le array non possono essere uguali!

## Grandezze diverse

Nell'esercizio troverai grandezze diverse di array! Per esempio dovrai controllare se `{1,2,3}` e `{1,2,3,4}` sono uguali.
Attenzione a ciclare le due array:
- Se cicli in base alla grandezza della prima, finirai per controllare solo i primi 3 elementi e quindi per il tuo codice le due array sono uguali
- Se cicli in base alla grandezza della seconda, finirai per controllare il quarto elemento della prima array, e questo genera una `IndexOutOfBoundsException`. Ovvero stai provando a leggere un elemento fuori da quell'array!

Di base, se le lunghezze sono diverse, le due array sono necessariamente diverse. Puoi quindi controllare le lunghezze ed effettuare un return prima del controllo numero a numero, in modo da essere certo che il controllo non avvenga.