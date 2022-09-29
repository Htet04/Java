package basic;

import java.util.ArrayList;
import java.util.HashMap;

public class ControlStatement {
    public static void main(String[] args) {
        /*
        Control flow statement are
        if(){...}
        if(){...}else{...}
        if(){...}else if(){...}
        if(){...}else if(){...}else{...}
        switch(){
        case():{...}
        }
        while(){...}
        do(){...}while();
        for(){...}
         */
        int a = 1, b = 2, c = 3, d = 4;
        // if statement
        System.out.println("This is if statement");
        //syntax 1
        if (a < b) {
            System.out.println("a is smaller than b");
        }
        //syntax 2
        if (a > b) {
            System.out.println("a is greater than b");
        } else {
            System.out.println("a isn't greater than b");
        }
        //syntax 3
        if (d / 3 == 4) {
            System.out.println("d can divisible with a");
        } else if (d / a == 4) {
            System.out.println("d can divisible with b");
        }
        //syntax 4
        if (d / 3 == 4) {
            System.out.println("d can divisible with a");
        } else if (d / 4 == 4) {
            System.out.println("d can divisible with b");
        } else {
            System.out.println("d can't divide");
        }

        //switch
        switch (12 / d) {
            case 1: {
                System.out.println("case 1");
                break;
            }
            case 4: {
                System.out.println("case 2");
                break;
            }
            case 3: {
                System.out.println("case 3");
                break;
            }
            default: {
                System.out.println("default case");
                break;
            }
        }

        //while statement
        System.out.println("\n\nThis is while statement");
        while (d > a) {
            a += 1;
            System.out.println("d is greater than a so I add 1 to a now a=" + a);
        }
        do {
            d += 1;
            System.out.println("d is smaller than 10 so I add 1 to d now d=" + d);
        } while (d < 10);

        for (int i = 0; i < 10; i++) {
            System.out.println("Looping i=" + i);
        }
        for (int i = 0; i <= 10; i++) {
            System.out.println("Looping i=" + i);
        }
        for (int i = 11; i > 10; i--) {
            System.out.println("Looping i=" + i);
        }
        for (int i = 11; i >= 10; i--) {
            System.out.println("Looping i=" + i);
        }
        HashMap<String, Object> m = new HashMap<>();
        ArrayList<HashMap<String, Object>> lm = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            m.put("k1", "v1" + i);
            m.put("k2", "v2" + i);
            lm.add(m);
        }
        for (HashMap<String, Object> map : lm
        ) {
            System.out.println(map.get("k1").toString());
        }
    }
}
