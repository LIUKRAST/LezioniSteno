# Inversione della stringa
In questo esercizio vogliamo modificare una stringa invertendola.
`{1,2,3,4}` $\rightarrow$ `{4,3,2,1}`

Attenzione! Modificare la stringa mentre la si cicla può creare problemi!

Per esempio, se io decidessi di provare a mettere il primo elemento (elemento 0) dentro l'ultima casella, otterei un'array del tipo `{1,2,3,1}`!

Attenzione, perché se alla fine voglio poi mettere l'ultimo elemento dentro la prima casella, l'elemento è ora diventato 1 e quindi avrò sbagliato l'esercizio!

Per questo la soluzione è:
1. Creare una copia (E userai la funzione scritta nell'esercizio precedente, quindi lo devi completare prima)
2. Invertire prendendo i valori della copia

Infatti come hai visto, col nostro algoritmo creiamo una copia dell'array scollegata dalla nostra, quindi modificare l'array non modificherà la copia!