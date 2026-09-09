package l6.e0;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;

public class E0Tester {
    private static Result result = null;

    public static void main(String[] args) {
        var analysis = analyze();
        if(analysis == null) return;
        result = analysis;
        test("R2D2", 1001);
        test("C3PO", 2002);
        test("OptimusPrime", 9999);
        test("Wall-E", 1);
        test("PatapimBot", 0);
        test("SlimTron", -50);
        test("PropantsPC", 6);
        test("", 1234);
        test(null, 5555);
        test("A zi Bot", 2026);
    }

    private static Result analyze() {
        var constructors = Robot.class.getConstructors();
        for(var c : constructors) {
            var pars = c.getParameterTypes();
            if(pars.length != 2) {
                System.out.println("Il costruttore di robot deve avere 2 argomenti");
                return null;
            }
            if (!pars[0].equals(String.class) || !pars[1].equals(int.class)) {
                System.out.println("Il costruttore deve avere argomenti (String, int)");
                return null;
            }

            Field nome;
            Field codiceSeriale;
            try {
                //noinspection JavaReflectionMemberAccess
                nome = Robot.class.getDeclaredField("nome");
                if(!nome.getType().equals(String.class)) {
                    System.out.println("L'attributo nome deve essere String");
                    return null;
                }
            } catch (NoSuchFieldException e) {
                System.out.println("Attributo nome non trovato");
                return null;
            }
            try {
                //noinspection JavaReflectionMemberAccess
                codiceSeriale = Robot.class.getDeclaredField("codiceSeriale");
                if(!codiceSeriale.getType().equals(int.class)) {
                    System.out.println("L'attributo codiceSeriale deve essere int");
                    return null;
                }
            } catch (NoSuchFieldException e) {
                System.out.println("Attributo codiceSeriale non trovato");
                return null;
            }

            //noinspection unchecked
            return new Result((Constructor<Robot>) c, nome, codiceSeriale);


        }
        return null;
    }

    public static void test(String nome, int codiceSeriale) {
        try {
            Robot r = result.c.newInstance(nome, codiceSeriale);
            String nomeF = (String)result.nome.get(r);
            int codiceSerialeF = (int)result.codiceSeriale.get(r);


            if(test(nome, nomeF, codiceSeriale, codiceSerialeF)) System.out.printf("Ottimo! Robot{%s, %s}\n", nomeF, codiceSerialeF);
            else System.out.printf("Qualcosa non va... è uscito Robot{%s, %s} quando sarebbe dovuto uscire Robot{%s, %s}\n", nomeF, codiceSerialeF, nome, codiceSeriale);

        } catch (InstantiationException | IllegalAccessException | InvocationTargetException e) {
            throw new RuntimeException(e);
        }
    }

    private static boolean test(String nome, String nome1, int codiceSeriale, int codiceSeriale1) {
        if(nome == null && nome1 != null) return false;
        if(nome1 == null && nome != null) return false;
        if(nome1 == null) return codiceSeriale == codiceSeriale1;
        if(nome.equals(nome1)) return codiceSeriale == codiceSeriale1;
        return false;
    }

    private record Result(Constructor<Robot> c, Field nome, Field codiceSeriale) {}
}
