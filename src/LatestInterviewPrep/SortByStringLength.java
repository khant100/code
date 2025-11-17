package LatestInterviewPrep;

import java.util.Comparator;
import java.util.List;

public class SortByStringLength {
    public static void main(String[] args) {

        List.of("vyas","sneha","cat","rajesh","Manjusesh","aas").stream()
                .sorted(Comparator.comparingInt(String::length).reversed()).forEach(x->System.out.println(x));


    }
}
