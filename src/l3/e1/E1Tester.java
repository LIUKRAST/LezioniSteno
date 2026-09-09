package l3.e1;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Modifier;
import java.util.function.BiConsumer;
import java.util.function.BiFunction;

public class E1Tester {
    public static void main(String[] args) {
        try {
            boolean found = false;
            for (var method : E1.class.getDeclaredMethods()) {
                if ("f".equals(method.getName())) {
                    found = true;
                    if (!method.getReturnType().equals(boolean.class)) {
                        System.out.println("Il metodo non ritorna boolean!");
                        return;
                    }
                    if (!Modifier.isStatic(method.getModifiers())) {
                        System.out.println("Il metodo non è statico!");
                        return;
                    }

                    var pars = method.getParameterTypes();
                    if (pars.length != 2) {
                        System.out.println("Il metodo non ha il numero corretto di parametri (2)");
                        return;
                    }
                    if (!pars[0].equals(int.class) || !pars[1].equals(int.class)) {
                        System.out.println("Il metodo non ha i parametri corretti (2 int)");
                        return;
                    }

                    Tester fun = (a, b, r) -> {
                        try {
                            boolean res = (Boolean)method.invoke(null, a, b);
                            if(r == res) System.out.println("Ottimo! Test passato");
                            else System.out.printf("Qualcosa non va... {%s, %s} da %s invece di %s\n", a, b, res, r);
                        } catch (IllegalAccessException | InvocationTargetException e) {
                            throw new RuntimeException(e);
                        }
                    };

                    fun.test(3, 4, false);
                    fun.test(-29474, 10283, false);
                    fun.test(-84729104, 392018475, false);
                    fun.test(5820491, -918230491, true);
                    fun.test(-482019, -12093847, true);
                    fun.test(-71029384, 829104958, false);

                    break;
                }
            }
            if(!found) System.out.println("Impossibile trovare funzione f");
        } catch (Exception ignored) {}
    }

    private interface Tester {
        void test(int a, int b, boolean r);
    }
}
