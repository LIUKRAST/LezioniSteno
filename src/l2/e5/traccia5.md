# Congettura di collatz

La congettura di collatz è uno dei problemi di matematica più interessanti, e puoi trovare un [video](https://youtu.be/094y1Z2wpJg?si=f6StDnX7snxzMCFM) davvero interessante sull'argomento.

## Cosa dice la congettura
Ti viene dato un numero, a questo numero devi applicare due regole:
1. Se è pari, dividilo per 2
2. Se è dispari, moltiplicalo per 3 e aggiungi 1

La congettura dice scelto un qualsiasi numero positivo, prima o poi, arriverai a `1`. Una volta arrivato ad 1, sei bloccato in un loop:
1. 1 è dispari, quindi fai $(3 \times 1) + 1 \rightarrow 4$
2. 4 è pari, quindi fai $4 \div 2 \rightarrow 2$
3. 2 è pari, quindi fai $2 \div 2 \rightarrow 1$

Sei al punto di partenza.

In questo caso, se trovi 1, è il momento di fermare il loop.
Non avendo un loop a numeri stabiliti, devi usare un while.

L'esercizio è difficile ed è una sfida sia per te che per edo. Risolvetelo insieme mentre io sono fuori.

Non hai un vero e proprio tester, voglio solo che stampi tutti i numeri della congettura di collatz in console.

Buona fortuna!