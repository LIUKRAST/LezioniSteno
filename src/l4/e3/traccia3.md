# Copiare due array

Come abbiamo detto assegnare un array ad un altra variabile non la copia

```java
int[] a = new int[2];
int[] b = a; // Non copia
```

Per copiare dobbiamo dunque fare due cose:
1. Creare una nuova array con la stessa grandezza della prima
2. Copiare tutti gli elementi della prima array nella seconda

Ovviamente puoi creare un'array di dimensione dinamica:
```java
int a = 5;

int[] b = new int[a];
```

(p.s, ricorda che puoi leggere la grandezza di un array con `arr.length`)