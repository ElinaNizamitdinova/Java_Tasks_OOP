package javaTasks.Task_28_S5;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Map<Character,Integer> mapCh = new HashMap<>();
        Scanner scanner = new Scanner(System.in);
        String str = scanner.nextLine();
        for (int i = 0; i < str.length(); i++) {
            if (!mapCh.containsKey(str.charAt(i)))
            {mapCh.put(str.charAt(i),1);
            }else {
                mapCh.put(str.charAt(i),mapCh.get(str.charAt(i))+1);
            }
        }
        for (Map.Entry<Character, Integer> elem : mapCh.entrySet()) {
            System.out.println(elem.getKey()+" встретился : "+ elem.getValue()+" раз");

            }
            
        }

    }

