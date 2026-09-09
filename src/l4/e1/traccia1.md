# Trovare un elemento

Vogliamo creare una funzione che cerca un elemento dentro un array. Se lo trova, ritorna true, se non lo trova, ritorna false.

Esempio:
- `{'c','i','a','o'}`, `'o'` $\rightarrow$ true
- `{'o','h','h','h','h'}`, `'h''` $\rightarrow$ false

## Complessità di un algoritmo

_Da leggere dopo aver svolto l'esercizio (o almeno averci provato)_

Per risolvere questo esercizio dovrai andare a ricercare carattere per carattere. 
Nel momento in cui trovi un singolo carattere che è uguale a val, puoi fare il return true.
Ricordo che il `return` blocca istantaneamente la funzione e quindi termina il ciclo, e va bene così. Se hai trovato anche solo un carattere buono, allora non serve controllare altri caratteri.
Se esci dal ciclo, vuol dire che non hai trovato nulla, e quindi puoi ritornare false.

Proviamo dunque ad analizzare la _complessità_ del nostro algoritmo.
Quanto impatta sul nostro computer?
In particolare quello che ci interessa è quanti cicli faremo prima di arrivare al risultato.

Sappiamo che cicliamo tutta l'array dal primo all'ultimo elemento, quindi possiamo dire che la complessità di questo algoritmo è $O(n)$, dove $n$ è il numero di elementi dell'array.

Cosa vuol dire?

Semplice, se l'array ha 10 elementi, la complessità è $O(10)$, ovvero 10 operazioni. Per operazioni non si intende una singola operazione, come un ++ o una sottrazione. Possiamo scegliere noi cosa si intende per singola operazione, come in questo caso il semplice controllo se i due caratteri sono uguali.

Esistono algoritmi che ad esempio hanno complessità $O(n^2)$. Ovvero la complessità è polinomiale.

Se ho 2 elementi nell'array, 4 operazioni, se ne ho 5, 25 operazioni, e così via.
Puoi notare che più è grande l'array più cicli servono, e quindi più risorse servono alla macchina.


Ovviamente, come hai già notato in questo esercizio, la complessità può variare in base all'array stessa.
Se ho `{'c','i','a','o'}` e devo trovare `'i'`, ci metterò semplicemente due cicli e gli altri due li salto.
Per la complessità di un algoritmo si prende infatti il caso "peggiore", ovvero se l'array deve essere ciclata tutta.