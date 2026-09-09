# Il robot, getter e setter
Puoi vedere anche qui un riadattamento della classe robot vista in precedenza. 
In questo caso tuttavia andiamo a vedere bene:
```java
private String nome; // Mutabile
private final int numeroSeriale; // Immutabile
```

Essendo nome mutabile, potremmo in teoria modificarlo

```java
Robot robot = new Robot("R2D2", 0);

robot.nome = "C3PO"; // Cambia nome!
```

Tuttavia questo non è fattibile in questo caso, perché nome è `private`.

Sotto troviamo due funzioni: `getNome` e `setNome`.
Queste due funzioni, chiamate getter e setter, servono proprio a leggere e scrivere in quell'attributo:

```java
Robot robot = new Robot("R2D2", 0);
String nome = robot.getNome();
robot.setNome("C3PO");
```

## Ok, ma perché non metto public e via?
Si, puoi assolutamente mettere il valore pubblico e usare `robot.nome`, tuttavia qui c'è un concetto non necessario ma estremamente consigliato.
Si tratta di manetenere il codice pulito e accessibile dall'esterno, sopratutto se un cliente va ad usare la nostra classe e un giorno decidiamo di modificarla.

```java
public class Vettore {
    private int x;
    private int y;

    public Vettore(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }
}
```

Prendiamo questo Vettore come esempio. é una semplice coordinata come quelle di minecraft, ma con solo x e y.
Un utente attualmente può fare
```java
Vettore vettore = new Vettore(3, 2);
int x = vettore.getX();
```

Se un giorno decidessimo di modificare la definizione per usare invece angolo e lunghezza:
```java
public class Vettore {
    private int angolo;
    private int lunghezza;
    
    public Vettore(int x, int y) {
        double len = Math.hypot(x, y);
        double angGradi = Math.toDegrees(Math.atan2(y, x));
        if (angGradi < 0) {
            angGradi += 360;
        }
        this.lunghezza = (int) Math.round(len);
        this.angolo = (int) Math.round(angGradi);
    }

    public int getX() {
        double rad = Math.toRadians(this.angolo);
        return (int) Math.round(this.lunghezza * Math.cos(rad));
    }

    public int getY() {
        double rad = Math.toRadians(this.angolo);
        return (int) Math.round(this.lunghezza * Math.sin(rad));
    }
}
```

Come puoi vedere, per quanto in realtà abbiamo complicato molto il codice, quello che è importante è:
Anche se abbiamo modificato il funzionamento interno della classe, il costruttore e i getter non sono cambiati. Dunque il cliente non ha motivo di modificare in alcun modo il suo codice, nonostante noi lo abbiamo fatto.
Lo stesso concetto vale per `setNome`, che va a modificare il nome del robot.

Usiamo dunque setter e getter _sempre_ per prendere e impostare gli attributi, e rendiamo gli attributi privati.

Ovviamente, un attributo privato **e finale** non potrà avere il setter, ma solo il getter, in quanto immutabile.