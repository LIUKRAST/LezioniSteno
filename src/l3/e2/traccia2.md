# Ricorsione e Fibonacci
La ricorsione è un altro tema estremamente importante e fragile, come i cicli.
Vediamo infatti che una funzione può tranquillamente chiamare se stessa direttamente o indirettamente, creando un ciclo di funzioni innestate una dentro l'altra.
Partiamo con un esempio: Vogliamo creare la funzione `mul` che fa ma moltiplicazione fra due int.

```java
// Si assume che b sia positivo
    public static int mul(int a, int b) {
    if(b == 1) return a;
    int in = mul(a, b-1);
    return in + a;
}
```

Vediamo step per step cosa succede se ad esempio usassimo $a=3, b= 4$

1. `if(b == 1) return a;` fallisce, $b = 4$
2. Chiama mul, sta volta con `3, 3` (b-1)
3. Siamo ora innestati dentro un altra chiamata di mul, e controlliamo di nuovo
4. `if(b == 1) return a;` fallisce, $b' = 3$ (scriviamo $b'$ per riferirci al nuovo b dentro l'innestazione)
5. Chiama mul, sta volta con `3, 2`
6. Ripete l'innestazione fino a chiamare `mul(3, 1)`
7. `if(b == 1) return a;` funziona! $b''' = 1$
8. Sappiamo che $a$ non è mai cambiato, quindi nella funzione innestata ritorniamo 3, è il momento di risalire
9. Torniamo alla funzione precedente, ora $in = 3$ ($in = a$)
10. Facciamo return di $in + 3$ ($3+3$)
11. Torniamo ancora su, e ripetiamo, sta volta $in = 6$
12. Facciamo return di $in + 3$ ($6+3$)
14. Abbiamo finito l'innesto, siamo tornati alla funzione più alta (meno profonda). Ritorniamo quindi $9 + 3 = 12$
15. Abbiamo fatto la moltiplicazione!

Qui ho fatto una piccola visualizzazione di come si innestano tutte le funzioni una dentro l'altra

```java
    public static int mulVisual(int a, int b) {
        if(b == 1) return a;
        int in;
        innesto: {
             int b1 = b-1; // 3
             if(b1 == 1) {
                 in = a;
                 break innesto;
             }
             int in1;
             innesto1: {
                 int b2 = b1-1; // 2
                 if(b2 == 1) {
                     in1 = a;
                     break innesto1;
                 }
                 int in2;
                 innesto2: { // <---------------------*
                     int b3 = b2-1; // 1              |
                     if(b3 == 1) { //                 |
                         in2 = a; //                  |
                         break innesto2; // salta ----*
                     } else throw new IllegalStateException("Impossibile da raggiungere");
                 }
                 in1 = in2 + a;
             }
             in = in1 + a;
        }
        return in + a;
    }
```

## Fibonacci
L'esercizio richiede di creare la sequenza di fibonacci usando la ricosione
- Se il numero n è 0, ritorna 0
- Se il numero n è 1, ritorna 1
- Se il numero n è maggiore di 1, ritorna il fibonacci di $n-1$ sommato al fibonacci di $n-2$