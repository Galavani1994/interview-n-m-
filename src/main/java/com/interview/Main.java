package com.interview;

import java.util.*;

public class Main {
    public static void main(String[] args) {

        System.out.println(Main.findNumber(new Integer[]{1, 3, 8, 12, 15, 17, 25, 80, 145, 156},15));
    }
    public static Set<Integer> findNumber(Integer[] integers,int xx){

        List<Integer> mainList = Arrays.asList(integers);//list of number
        List<Integer> arrayList = mainList.subList(0, mainList.indexOf(xx) + 1);//because of sorted number just select integers<=25
        int x = arrayList.indexOf(xx);//get index of xx
        Set<Integer> set = new HashSet<>();
        int end = x;
        int start = 0;
        for (int i = start; i <= end; i++) {
            if (arrayList.get(start) + arrayList.get(end) == xx) { //if n+m=xx plus to index of start and minus from end
                set.add(arrayList.get(start));//save number
                set.add(arrayList.get(end));//save number
                start++;
                end--;
            }
            if (arrayList.get(start) + arrayList.get(end) > xx) { //if n+m>xx minus from end
                end--;

            } else if (arrayList.get(start) + arrayList.get(end) < xx) { // if n+m<xx plus to start
                start++;

            }
        }
        TreeSet<Integer> mytreeset=new TreeSet<>(); //sorted saved numbers
        mytreeset.addAll(set);
        return mytreeset;

    }
}
