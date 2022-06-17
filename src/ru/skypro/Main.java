package ru.skypro;

import java.util.*;

public class Main {

    public static void printNeChetniyArrayList() {
        List<Integer> nums = new ArrayList<>(List.of(5, 4, 6, 7, 2, 2, 3, 5, 6, 1, 1, 6, 7, 9, 8, 8, 9, 14, 15, 18, 14, 14, 19, 28));
        for (int i = 0; i < nums.size(); i++) {
            if (nums.get(i) % 2 == 1) {
                System.out.println(nums.get(i));
            }
        }
    }
    public static void printOrderArrayList () {//не правильно но мое
        List<Integer> nums = new ArrayList<>(List.of(2, 28, 6, 7, 2, 2, 3, 5, 6, 1, 4, 6, 7, 9, 8, 8, 9, 14, 15, 18, 14, 14, 19, 28));
        Set<Integer> oderNums = new HashSet<>(nums);
        for (Integer elem: oderNums) {
            if(elem%2==0) {
                System.out.println(elem);
            }
        }
        /*
        int prevElem = Integer.MIN_VALUE;
        Collections.sort(nums);
        for (Integer elem: nums) {
            if(elem%2==0&&elem!=prevElem) {
                System.out.println(elem);
                prevElem=elem;
            }
        }
*/ //норм реализация
        /*int max = 0;
        for (int i = 0; i < nums.size(); i++) {
            if (nums.get(i) % 2 == 0) {
                if (nums.get(i) > max) {
                    max = nums.get(i);
                    oderNums.add(nums.get(i));
                } else {
                    if (nums.get(i) < nums.get(0)&&nums.get(i)<nums.get(i-1)) {
                        oderNums.add(0, nums.get(i));
                    }
                }
            }
        }
        for (int i = 0; i < oderNums.size(); i++) {
            System.out.println(oderNums.get(i));
        }
    */
    }
    public static void mnozhestvo(){
        List<String> wordsList = new ArrayList<>(List.of("andrey",
                "andrey",
                "andrey",
                "ivan",
                "andrey",
                "andrey",
                "andrey",
                "evgenij",
                "andrey",
                "andrey",
                "andrey"));
        Set wordsHashSet = new HashSet<>(wordsList);
        for (Object name: wordsHashSet){
            System.out.println(name);
        }

    }
    public static void povtori() {
        List<String> wordsList = new ArrayList<>(List.of("andrey", "andrey", "andrey", "ivan", "andrey", "andrey", "andrey", "evgenij", "andrey", "ivan", "evgenij", "Igor", "Debil"));
        //System.out.println(wordsList.size());
        Set wordsHashSet = new HashSet<>(wordsList);
        int k=0;
        for (Object i: wordsHashSet) {
            k=0;
            for(int j=0;j<wordsList.size();j++){
                if(wordsList.get(j).equals(i)){
                    k++;
                }
                if(j== wordsList.size()-1&&k>1) {
                    System.out.println(k + " kolichestvo povtorov slova " + i);
                }
            }
        }
    }
    public static void main (String[]args){
        printNeChetniyArrayList();
        System.out.println("////////////////////");
        printOrderArrayList();
        System.out.println("////////////////////");
        mnozhestvo();
        System.out.println("////////////////////");
        povtori();
    }
}
