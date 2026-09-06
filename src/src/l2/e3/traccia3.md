# La sequenza

Ti vengono dati s e m.

Devi ripetere questo calcolo fino a che `s > m`

$$
s = (s \times 3) + 1
$$

Esempio con $s = 3$ e $m = 15$
1. $s<15$? Si, continua
2. $s = (s \times 3) + 1 \rightarrow (3 \times 3) + 1 = 10$
3. $s<15$? Si ($s=10$), continua
4. $s = (s\times 3) + 1 \rightarrow (10 \times 3) + 1 = 31$
5. $s<15$? No, ritorna $s$