package com.company;

import java.math.BigInteger;
import java.util.*;
import java.util.concurrent.atomic.AtomicLong;
import java.util.function.Function;
import java.util.function.IntPredicate;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

import static java.util.stream.Collectors.*;

public class Kata {

    public static int grow(int[] x) {
        int result = 1;
        for (int i : x) {
            result *= i;
        }
        return result;
    }

    public static int Past(int h, int m, int s) {

        int hMilisecond = h * 60 * 60 * 1000;
        int mMilisecond = m * 60 * 1000;
        int sMilisecond = s * 1000;

        return hMilisecond + mMilisecond + sMilisecond;

    }

    public static double find_average(int[] array) {
        double sum = 0;
        for (int i : array) sum += i;
        double average = sum / array.length;
        return average;
    }

    public static int calculateYears(double principal, double interest, double tax, double desired) {
        int years = 0;
        double a;
        double b;
        while (principal < desired) {
            a = principal * interest;
            b = a - (a * tax);
            principal = principal + b;
            years++;
        }
        return years;
    }
    //+111

    public static boolean validatePin(String pin) {
        try {
            if ((pin.length() == 4 || pin.length() == 6) && (Integer.parseInt(pin) >= 0) && !(pin.contains("+") || pin.contains("-"))) {
                return true;
            } else {
                return false;
            }
        } catch (Exception e) {
            return false;
        }

    }

    public static int arithmetic(int a, int b, String operator) {
        int result;
        switch (operator) {
            case "add":
                result = a + b;
                break;
            case "subtract":
                result = a - b;
                break;
            case "multiply":
                result = a * b;
                break;
            case "divide":
                result = a / b;
                break;
            default:
                return 0;
        }
        return result;
    }

    public static List<String> number(List<String> lines) {

        List<String> lista = new ArrayList<>();
        for (int i = 0; i < lines.size(); i++) {
            lista.add((i + 1) + ": " + lines.get(i));
        }
        return lista;
    }

    //dla kazdego i = 1 w array i = i * i


    public static int ConvertBinaryArrayToInt(List<Integer> binary) {
        int number = 0;
        for (int bit : binary)
            number = number << 1 | bit;
        return number;
    }

    public static long numberOfDivisors(int n) {
        int cos = 0;
        int dzielnik = 0;
        while (cos < n) {
            cos++;
            if (n % cos == 0) {
                dzielnik++;
            }
        }
        return dzielnik;
    }

    public static int predictAge(int age1, int age2, int age3, int age4, int age5, int age6, int age7, int age8) {
        age1 = age1 * age1;
        age2 = age2 * age2;
        age3 = age3 * age3;
        age4 = age4 * age4;
        age5 = age5 * age5;
        age6 = age6 * age6;
        age7 = age7 * age7;
        age8 = age8 * age8;
        int all = age1 + age2 + age3 + age4 + age5 + age6 + age7 + age8;
        all = (int) Math.sqrt(all);
        all = all / 2;
        return all;
    }

    public static boolean isAnagram(String test, String original) {
        char[] first = test.toLowerCase().toCharArray();
        char[] second = original.toLowerCase().toCharArray();
        Arrays.sort(first);
        Arrays.sort(second);
        return (Arrays.equals(first, second));

    }

    public static int[] minMax(int[] arr) {
        return null;
    }

    public static String showSequence(int value) {

        int suma = 0;
        String test = "0";
        if (value > 0) {
            for (int i = 1; i <= value; i++) {
                suma += i;
                test += "+" + i;
            }
        } else if (value == 0) {
            System.out.println("0 = 0");
        } else {
            System.out.println(value + " < 0");
        }

        return test += " = " + suma;

    }

    // 03.08/2022

    public static String even_or_odd(int number) {
        if (number % 2 == 0) {
            return "Even";
        } else {
            return "Odd";
        }

    }

    public static boolean betterThanAverage(int[] classPoints, int yourPoints) {
        double sum = 0;
        double average = 0;
        for (int value : classPoints) {
            sum += value;
        }
        average = sum / classPoints.length;
        if (yourPoints > average) {
            return true;
        } else {
            return false;
        }
    }

    public static int[] invert(int[] array) {
        for (int i = 0; i < array.length; i++) {
            array[i] *= -1;
        }
        return array;
    }

    public static int largestPairSum(int[] numbers) {
        int max = Integer.MIN_VALUE;
        int secmax = Integer.MIN_VALUE;

        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] > max) {
                secmax = max;
                max = numbers[i];
            } else if (numbers[i] > secmax) {
                secmax = numbers[i];
            }
        }
        return max + secmax;
    }

    public static int[] multiples(int m, int n) {

        int[] liczby = new int[m];

        for (int i = 0; i < m; i++) {
            liczby[i] = (i + 1) * n;
        }
        return liczby;
    }

    public static long maxProduct(int[] numbers, int sub_size) {
        long wynik = 0;
        int len = numbers.length - 1;
        Arrays.sort(numbers);
        wynik += numbers[len];
        for (int j = 1; j < sub_size; j++) {
            wynik = wynik * numbers[len - j];
        }
        return wynik; // Do your magic!
    }

//    public static long maxProduct(int[] numbers, int sub_size)
//    {
//        Arrays.sort(numbers);
//        long result = 1;
//        for (int i = numbers.length-1;sub_size > 0;sub_size--,i--){
//            result*=numbers[i];
//        }
//        return result; // Do your magic!
//    }

    public static String makeComplement(String dna) {
        String dupa = dna.replace("T", "P");
        dupa = dupa.replace("A", "T");
        dupa = dupa.replace("P", "A");

        dupa = dupa.replace("C", "O");
        dupa = dupa.replace("G", "C");
        dupa = dupa.replace("O", "G");
        return dupa;
    }


    public static int movie(int card, int ticket, double perc) {
        int licznik = 0;
        int bilet = ticket;
        double rabat = ticket * perc;
        while (bilet < rabat) {
            rabat = rabat * perc;
            System.out.println(rabat);
            licznik++;
        }
        ;
        return licznik;
    }

    public static int potatoes(int p0, int w0, int p1) {
        return w0 * (100 - p0) / (100 - p1);
    }


    public static int minSum(int[] passed) {
        int wynik = 0;
        Arrays.sort(passed);
        for (int i = 0; i < passed.length / 2; i++) {
            System.out.println(passed[i]);
            wynik += passed[passed.length - i - 1] * passed[i];
//           System.out.println("wynik: " + wynik);
        }
        return wynik; // Do your magic!
    }

    public static List arrayLeaders(int[] numbers) {

        int suma = 0;
        int[] dupa = new int[5];
        for (int i = 0; i < numbers.length; i++) {
            suma += numbers.length - i - 1;
//            System.out.println(suma);
            if (numbers[i] > suma) {
                System.out.println(numbers[i]);
            }

        }
        return Arrays.asList(dupa); // Do your magic!
    }

    static String toCamelCase(String s) {

        String[] words = s.split("[\\W_]+");
        StringBuilder builder = new StringBuilder();
        for (int i = 0; i < words.length; i++) {
            String word = words[i];
            if (i != 0) {
                word = word.isEmpty() ? word : Character.toUpperCase(word.charAt(0)) + word.substring(1).toLowerCase();
            }
            builder.append(word);
        }
        return builder.toString();
    }

    public static String solution(int n) {
        StringBuilder wynik = new StringBuilder();
        while (n > 0) {
            if (n >= 1000) {
                n -= 1000;
                wynik.append("M");
            } else if (n >= 900) {
                n -= 900;
                wynik.append("CM");
            } else if (n >= 500) {
                n -= 500;
                wynik.append("D");
            } else if (n >= 400) {
                n -= 400;
                wynik.append("CD");
            } else if (n >= 100) {
                n -= 100;
                wynik.append("C");
            } else if (n >= 90) {
                n -= 90;
                wynik.append("XC");
            } else if (n >= 50) {
                n -= 50;
                wynik.append("L");
            } else if (n >= 40) {
                n -= 40;
                wynik.append("XL");
            } else if (n >= 10) {
                n -= 10;
                wynik.append("X");
            } else if (n >= 9) {
                n -= 9;
                wynik.append("IX");
            } else if (n >= 5) {
                n -= 5;
                wynik.append("V");
            } else if (n >= 4) {
                n -= 4;
                wynik.append("IV");
            } else {
                n -= 1;
                wynik.append("I");
            }
            System.out.println(n);
        }
        return wynik.toString();
    }

    public static int[] arrayDiff(int[] a, int[] b) {
//    ArrayList<Integer> test = new ArrayList<>();
//
//        for (int i =0; i < a.length; i++){
//            for (int j = 0; j < b.length; j++){
//                if (a[i] != b[j]) {
//                    test.add(a[i]);
//                }
//            }
//        }
//        System.out.println(test);
//        int[] c = test.stream().mapToInt(i -> i).toArray();
//        for (int x: c){
//            System.out.println(x);
//        }
//        return c;
        final IntPredicate ints = (number) -> Arrays.stream(b).noneMatch(num -> num == number);
        return Arrays.stream(a).filter(ints).toArray();
    }

    static String encode(String word) {
        word = word.toLowerCase();
        String result = "";
        for (int i = 0; i < word.length(); ++i) {
            char c = word.charAt(i);
            result += word.lastIndexOf(c) == word.indexOf(c) ? "(" : ")";
        }
        return result;
    }

    public static int digital_root(int n) {
        String cyfra = String.valueOf(n);
        int wynik = 0;
        while (cyfra.length() != 1) {
            for (int i = 0; i < cyfra.length(); i++) {
                wynik += Integer.parseInt(String.valueOf(cyfra.charAt(i)));
                System.out.println("wynik: " + wynik);
            }
            cyfra = String.valueOf(wynik);
            wynik = 0;
            System.out.println("cyfra: " + cyfra);
        }
        return Integer.parseInt(cyfra);
    }

    public static String longToIP(long ip) {
        String chuj = Long.toBinaryString(ip);
        String cipa = "";
        String niewiem = "";
        int test = 0;
        StringBuilder japierdole = new StringBuilder(chuj);
        while (japierdole.length() < 33) {
            japierdole.insert(0, 0);
            if (japierdole.length() == 32) {
                chuj = japierdole.toString();
            }
        }
        for (int i = 0; i < chuj.length(); i++) {
            cipa += chuj.charAt(i);
            if (cipa.length() % 8 == 0) {
                test = Integer.parseInt(cipa, 2);
                niewiem += test;
                niewiem += ".";
                cipa = "";
            }
        }
        StringBuilder kurwa = new StringBuilder(niewiem);
        kurwa.deleteCharAt(kurwa.length() - 1);
        String result = kurwa.toString();
        return result;
    }

//    public static String findRoutes(String[][] routes) {
//        String[] towns1 = new String[routes.length];
//        String[] towns2 = new String[routes.length];
//        String result = "";
//        String test = "";
//        String test2 = "";
//
//        for (int i = 0; i < routes.length; i++) {
//            for (int j = 0; j < routes[i].length; j++) {
//                if (j == 0) {
//                    towns1[i] = routes[i][j];
//                } else {
//                    towns2[i] = routes[i][j];
//                }
//            }
//        }
//        for (int x = 0; x < towns1.length; x++) {
//            boolean contains = Arrays.stream(towns2).anyMatch(towns1[x]::equals);
//            if (!contains) {
//                test = towns1[x];
//                result = test;
//            }
//        }
//        for (int y = 0; y < towns1.length; y++) {
//            boolean contains = Arrays.stream(towns1).anyMatch(towns2[y]::equals);
//            if (!contains) {
//                test2 = towns2[y];
//            }
//        }
//        for (int a = 0; a < towns1.length; a++) {
//            for (int b = 0; b < towns2.length+1; b++) {
////                System.out.println("tw2: " + towns2[b]);
//                if (test == towns1[a]) {
//                    test = towns2[a];
//                    System.out.println("test " + test);
//                    result += ", " + test;
//                    System.out.println("tw2a " + towns2[a]);
//                }
//            }
//        }
//        result += ", " + test2;
//        return result;
//    }
//static Optional<Pair> findPair(List<Pair> pairs, String route) {
//    return pairs.stream().filter(pairToFind -> pairToFind.getLeft().equals(route)).findAny();
//}
//
//    static class Pair {
//        private String left;
//        private String right;
//
//        public Pair(String left, String right) {
//            this.left = left;
//            this.right = right;
//        }
//
//        public String getLeft() {
//            return left;
//        }
//
//        public void setLeft(String left) {
//            this.left = left;
//        }
//
//        public String getRight() {
//            return right;
//        }
//
//        public void setRight(String right) {
//            this.right = right;
//        }
//
//    }
//
//    public static String findRoutes(String[][] routes) {
//        List<Pair> routePairs = Arrays.stream(routes).map(arr -> new Pair(arr[0], arr[1]))
//                .collect(Collectors.toList());
//        List<String> properRoutes = new ArrayList<>();
//        System.out.println(routePairs);
//
//        String toRoute = routePairs.get(0).getRight();
//        properRoutes.add(routePairs.get(0).getLeft());
//        properRoutes.add(routePairs.get(0).getRight());
//        while (true) {
//            System.out.println(toRoute);
//            Optional<Pair> foundNextRoute = findPair(routePairs, toRoute);
//            foundNextRoute.ifPresent(route -> {
//                properRoutes.add(route.getRight());
//            });
//            if (foundNextRoute.isPresent()) {
//                System.out.println(foundNextRoute.get());
//                toRoute = foundNextRoute.get().getRight();
//            } else {
//                break;
//            }
//        }
//        return properRoutes.stream().collect(joining(","));
//    }

    public static long digPow(int n, int p) {
        String nToString = String.valueOf(n);
        if (extracted(p, nToString) % n == 0) {
            return (extracted(p, nToString) / n);
        } else {
            return -1;
        }
    }

    private static int extracted(int p, String nToString) {
        int sum = 0;
        for (int i = 0; i < nToString.length(); i++) {
            sum += Math.pow(Integer.parseInt(String.valueOf(nToString.charAt(i))), p + i);
        }
        return sum;
    }

    public static double[] tribonacci(double[] s, int n) {
        double num1 = s[0], num2 = s[1], num3 = s[2];
        int counter = 0;
        List<Double> solution = new ArrayList<>();
        while (counter < n) {
            double num4 = num1 + num2 + num3;
            solution.add(num1);
            num1 = num2;
            num2 = num3;
            num3 = num4;
            counter++;
        }
        return solution.stream().mapToDouble(Double::doubleValue).toArray();
    }

    public static double[] xbonacci(double[] signature, int n) {
        double[] solution = Arrays.copyOf(signature, n);
        for (int i = signature.length; i < n; i++) {
            for (int j = i; j >= i - signature.length; j--) {
                solution[i] += solution[j];
            }
        }
        return solution;
    }

    public static int bouncingBall(double h, double bounce, double window) {
        int counter = -1;
        if (h > 0 && bounce > 0 && bounce < 1 && window < h) {
            while (h > window) {
                h = h * bounce;
                System.out.println("wysokosc " + h);
                counter += 2;
            }
            return counter;
        } else {
            return -1;
        }
    }

    public static List<Long> sumDigPow(long a, long b) {
        List<Long> listaLongow = new ArrayList<>();
        while (a < b) {
            String aToString = String.valueOf(a);
            char[] chars = aToString.toCharArray();
            long complexNumber = 0;
            for (int i = 0; i < chars.length; i++) {
                complexNumber += Math.pow(Integer.parseInt(String.valueOf(chars[i])), i + 1);
            }
            if (complexNumber == a) {
                listaLongow.add(complexNumber);
            }
            complexNumber = 0;
            a++;
        }
        return listaLongow;
    }

    public int greedy(int[] dice) {
        List<DiceCount> diceCounts = new ArrayList<>();
        for (int i = 0; i < dice.length; i++) {
            int nextNumber = dice[i];
            System.out.println("nextNunmber: " + nextNumber);
            if (diceCounts.stream().anyMatch(x -> x.getDiceNumber() == nextNumber)) {
                continue;
            }
            DiceCount nextDiceCount = new DiceCount(nextNumber, 0);
            for (int j = i; j < dice.length; j++) {
                System.out.println("obecna: " + dice[j]);
                if (nextNumber == dice[j]) {
                    nextDiceCount.setCount(nextDiceCount.getCount() + 1);
                    System.out.println("Znaleziono " + dice[j]);
                }
            }
            diceCounts.add(nextDiceCount);
            System.out.println("koniec");
        }
        System.out.println(diceCounts);

        int points = 0;
        for (DiceCount diceCountElement : diceCounts) {
            switch (diceCountElement.getDiceNumber()) {
                case 1:
                    points += (diceCountElement.getCount() == 3 ? 1000 : diceCountElement.getCount() > 3 ? ((diceCountElement.getCount() - 3) * 100) + 1000 : 100 * diceCountElement.getCount());
                    break;
                case 2:
                    points += (diceCountElement.getCount() >= 3 ? 200 : 0);
                    break;
                case 3:
                    points += (diceCountElement.getCount() >= 3 ? 300 : 0);
                    break;
                case 4:
                    points += (diceCountElement.getCount() >= 3 ? 400 : 0);
                    break;
                case 5:
                    points += (diceCountElement.getCount() == 3 ? 500 : diceCountElement.getCount() > 3 ? ((diceCountElement.getCount() - 3) * 50) + 500 : 50 * diceCountElement.getCount());
                    break;
                case 6:
                    points += (diceCountElement.getCount() >= 3 ? 600 : 0);
                    break;

            }
        }
        return points;
    }

    class DiceCount {
        @Override
        public String toString() {
            return "DiceCount{" +
                    "diceNumber=" + diceNumber +
                    ", count=" + count +
                    '}';
        }

        public int diceNumber;
        public int count;

        public DiceCount(int diceNumber, int count) {
            this.diceNumber = diceNumber;
            this.count = count;
        }

        public int getDiceNumber() {
            return diceNumber;
        }

        public void setDiceNumber(int diceNumber) {
            this.diceNumber = diceNumber;
        }

        public int getCount() {
            return count;
        }

        public void setCount(int count) {
            this.count = count;
        }
    }

    public static Long getLongs(int[] table) {
        Map<String, Long> countings = Arrays.stream(table)
                .mapToObj(String::valueOf)
                .collect(groupingBy(Function.identity(), Collectors.counting()));

        AtomicLong points = new AtomicLong(0);
        countings.forEach((key, value) -> {
            switch (key) {
                case "1":
                    points.getAndAdd(value == 3 ? 1000 : value > 3 ? ((value - 3) * 100) + 1000 : value * 100);
                    break;
                case "2":
                    points.getAndAdd(value == 3 ? 200 : 0);
                    break;
                case "3":
                    points.getAndAdd(value == 3 ? 300 : 0);
                    break;
                case "4":
                    points.getAndAdd(value == 3 ? 400 : 0);
                    break;
                case "5":
                    points.getAndAdd(value == 3 ? 500 : value > 3 ? ((value - 3) * 50) + 500 : value * 50);
                    break;
                case "6":
                    points.getAndAdd(value == 3 ? 600 : 0);
                    break;
            }
        });
        return points.get();
    }

    public static int findIt(int[] a) {
        Map<String, Long> counting = Arrays.stream(a).mapToObj(String::valueOf).collect(groupingBy(Function.identity(), Collectors.counting()));
        return Integer.parseInt(counting.entrySet().stream().filter(entry -> entry.getValue() % 2 == 1).findFirst().get().getKey());
    }


    public static int countBits(int n) {
        String intToBinary = Integer.toBinaryString(n);
        long count = intToBinary.chars().filter(ch -> ch == '1').count();
        return (int) count;
    }

    public static boolean isPrime(int number) {
        if (number < 2)
            return false;
        for (int i = 2; i <= Math.sqrt(number); i++) {
            if (number % i == 0)
                return false;
        }
        return true;
    }

    public static List<Object> filterList(final List<Object> list) {
        List<Object> filtered = list.stream().filter(x -> x instanceof Integer).collect(Collectors.toList());
        return filtered;
    }

    public static int ZGetSum(int a, int b) {
        System.out.println("Math.min: " + Math.min(a, b));
        System.out.println("Math.max: " + Math.max(a, b));
        return IntStream.range(Math.min(a, b), Math.max(a, b) + 1).sum();
    }

    public static String[] TowerBuilder(int nFloors) {
        String tower[] = new String[nFloors], e;
        String star = "*";
        int a = 1;
        for (int i = 0; i < nFloors; i++) {
            tower[i] = (e = " ".repeat(nFloors - i - 1)) + "*".repeat(i + i + 1) + e;
            System.out.println(tower[i]);
        }
        return tower;
    }

    public static String pigIt(String str) {
        List<String> testCase = Arrays.asList(str.split("\\s* \\s*"));
        for (int i = 0; i < testCase.size(); i++) {
            String s1 = testCase.get(i);
            char s2 = s1.charAt(0);
            if (s2 == '!' || s2 == '?') {
                continue;
            }
            String s3 = s1.substring(1) + s2 + "ay";
            testCase.set(i, s3);
        }
        String result = testCase.stream().map(Object::toString).collect(Collectors.joining(" "));
        System.out.println(result);
        return result;
    }

//    public static String createPhoneNumber(int[] numbers) {
//        String phoneNumber = "";
//        for (int i = 0; i < numbers.length; i++){
//            if (i == 0)
//                phoneNumber += "(";
//            if (i < 3)
//                phoneNumber += String.valueOf(numbers[i]);
//            if (i == 3)
//                phoneNumber += ") ";
//            if (i < 6 && i >= 3)
//                phoneNumber += String.valueOf(numbers[i]);
//            if (i == 6)
//                phoneNumber += "-";
//            if (i < 10 && i >= 6)
//                phoneNumber += String.valueOf(numbers[i]);
//        }
//        return phoneNumber;
//    }

    public static String createPhoneNumber(int[] n) {
        return String.format("(%d%d%d) %d%d%d-%d%d%d%d", n[0], n[1], n[2], n[3], n[4], n[5], n[6], n[7], n[8], n[9]);
    }

    public static int duplicateCount(String text) {
        Map<String, Long> mapped = Arrays.stream(text.toLowerCase().split("")).map(String::valueOf).collect(groupingBy(Function.identity(), Collectors.counting()));
        return (int) mapped.entrySet().stream().filter(e -> e.getValue() > 1).map(Map.Entry::getKey).count();
    }

    public static String makeReadable(int seconds) {
        int sec = 0, min = 0, hour = 0;
        String time = "";
        while (seconds > 0) {
            sec = seconds % 60;
            seconds /= 60;
            min = seconds % 60;
            seconds /= 60;
            hour = seconds;
            seconds = 0;
        }
        String hourS = String.valueOf(hour);
        if (hourS.length() == 1) {
            hourS = "0" + hourS;
        }
        String minS = String.valueOf(min);
        if (minS.length() == 1) {
            minS = "0" + minS;
        }
        String secS = String.valueOf(sec);
        if (secS.length() == 1) {
            secS = "0" + secS;
        }
        time += hourS + ":" + minS + ":" + secS;
        return time;
    }

    public static String highAndLow(String numbers) {
        List<String> numbersList = Arrays.asList(numbers.split("\\s* \\s*"));
        numbersList.stream().map(e -> Integer.parseInt(e)).collect(Collectors.toList()).stream().min(((o1, o2) -> o1.compareTo(o2)));
        return "";
    }

    static int find(int[] integers) {
        int counter1 = 0;
        int counter2 = 0;
        int result = 0;
        int temp1 = 0;
        int temp2 = 0;
        for (int i = 0; i < integers.length; i++) {
            if (integers[i] % 2 == 0) {
                counter1++;
            } else {
                temp1 = integers[i];
            }
            if (integers[i] % 2 != 0) {
                counter2++;
            } else {
                temp2 = integers[i];
            }
            if (counter1 > 1) {
                result = temp1;
            } else {
                result = temp2;
            }
        }
        return result;
    }

    public static String spinWords(String sentence) {
        List<String> splited = Arrays.asList(sentence.split("\\s* \\s*"));
        for (int i = 0; i < splited.size(); i++) {
            if (splited.get(i).length() > 5) {
                String temp = splited.get(i);
                String s = new StringBuilder(temp).reverse().toString();
                splited.set(i, s);
            }
        }
        return splited.stream().collect(Collectors.joining(" "));
    }

//    static String encode2(String word){
//        Map<String, Long> mapped = Arrays.stream(word.toLowerCase().split("")).map(String::valueOf).collect(groupingBy(Function.identity(), Collectors.counting()));
//        return String.valueOf((int) mapped.entrySet().stream().filter(e -> e.getValue() > 1).map(Map.Entry::getKey).count());
//    }

    public static String high(String s) {
        int highestscore = 0;
        int score = 0;
        String solution = "";
        List<String> split = Arrays.asList(s.split("\\s* \\s*"));
        for (int i = 0; i < split.size(); i++) {
            for (int j = 0; j < split.get(i).length(); j++) {
                score += Integer.valueOf(split.get(i).charAt(j) - 96);
                if (score > highestscore) {
                    highestscore = score;
                    solution = split.get(i);
                }
            }
            score = 0;
        }
        return solution;
    }

    public static boolean isTriangle(int a, int b, int c) {
        if (a <= 0 || b <= 0 || c <= 0)
            return false;
        if (a > b + c && b > a + c || c > a + b)
            return false;
        else
            return true;
    }

    public static String noSpace(final String x) {
//        return Arrays.asList(x.split("\\s* \\s*")).stream().collect(Collectors.joining());
        return x.replace(" ", "");
    }

    public static String siegfried(final int week, final String str) {
        String[] s = str.split(" ");
        for (int i = 0; i < s.length; i++) {
            if (week >= 1) {
                s[i] = s[i].replaceAll("(?i)ci", "si");
                s[i] = s[i].replaceAll("Ci", "Si");
                s[i] = s[i].replaceAll("ce", "se");
                s[i] = s[i].replaceAll("Ce", "Se");
                s[i] = s[i].replaceAll("c(?!h)", "k");
                s[i] = s[i].replaceAll("C(?!h)", "K");
            }
            if (week >= 2) {
                s[i] = s[i].replaceAll("ph", "f");
                s[i] = s[i].replaceAll("Ph", "F");
            }
            if (week >= 3) {
                if (s[i].length() > 3) {
                    s[i] = s[i].replaceAll("e$", "");
                    s[i] = s[i].replaceAll("e-", "-");
                    s[i] = s[i].replaceAll("e!", "!");
                    //usuwa e, jesli po zdaniu jest znak specjalny
                }
                s[i] = s[i].replaceAll("(?i)(\\p{L})\\1+", "$1");
            }
            if (week >= 4) {
                s[i] = s[i].replaceAll("th", "z");
                s[i] = s[i].replaceAll("Th", "Z");
                s[i] = s[i].replaceAll("wr", "r");
                s[i] = s[i].replaceAll("Wr", "R");
                s[i] = s[i].replaceAll("wh", "v");
                s[i] = s[i].replaceAll("Wh", "V");
                s[i] = s[i].replaceAll("w", "v");
                s[i] = s[i].replaceAll("W", "V");
            }
            if (week >= 5) {
                s[i] = s[i].replaceAll("ou", "u");
                s[i] = s[i].replaceAll("an", "un");
                s[i] = s[i].replaceAll("An", "Un");
                s[i] = s[i].replaceAll("ing$", "ink");
                s[i] = s[i].replaceAll("^sm", "schm");
                s[i] = s[i].replaceAll("^Sm", "Schm");
            }
        }
        return String.join(" ", s);
    }


    public static int SnakesLadders(int test) {
        Map<Integer, Integer> snakesAndLadders = new HashMap<Integer, Integer>();
        int result = 0;
        snakesAndLadders.put(16, 6);
        snakesAndLadders.put(46, 25);
        snakesAndLadders.put(49, 11);
        snakesAndLadders.put(62, 19);
        snakesAndLadders.put(64, 60);
        snakesAndLadders.put(74, 53);
        snakesAndLadders.put(89, 68);
        snakesAndLadders.put(92, 88);
        snakesAndLadders.put(95, 75);
        snakesAndLadders.put(99, 80);
        snakesAndLadders.put(2, 38);
        snakesAndLadders.put(7, 14);
        snakesAndLadders.put(8, 31);
        snakesAndLadders.put(15, 26);
        snakesAndLadders.put(21, 42);
        snakesAndLadders.put(28, 84);
        snakesAndLadders.put(36, 44);
        snakesAndLadders.put(51, 67);
        snakesAndLadders.put(71, 91);
        snakesAndLadders.put(78, 98);
        snakesAndLadders.put(87, 94);

        result = snakesAndLadders.getOrDefault(test, test);
        return result;
    }

    public static int p1Score = 0;
    public static int p2Score = 0;
    public static boolean currentPlayer = true;

    public static String play(int die1, int die2) {
        final int endpoint = 100;
        int dices = die1 + die2;
        if (currentPlayer) {
            p1Score += dices;
            p1Score = overpoint(p1Score);
            p1Score = SnakesLadders(p1Score);
        } else {
            p2Score += dices;
            p2Score = overpoint(p2Score);
            p2Score = SnakesLadders(p2Score);
        }
        final String response = currentPlayer ? "Player 1 is on square " + p1Score : "Player 2 is on square " + p2Score;
        if (die1 != die2) {
            currentPlayer = !currentPlayer;
        }
        if (endGame) {
            endGame = false;
            p1Score = 0;
            p2Score = 0;
            currentPlayer = true;
            return "Game over!";
        }
        if (p1Score == endpoint) {
            endGame = true;
            return "Player 1 Wins!";
        } else if (p2Score == endpoint) {
            endGame = true;
            return "Player 2 Wins!";
        }
        return response;
    }

    public static boolean endGame = false;

    public static int overpoint(int score) {
        if (score > 100) {
            return 100 + (100 - (score));
        } else {
            return score;
        }
    }

    public static long ipsBetween(String start, String end) {
        String[] startSplit = start.split("\\.");
        String[] endSplit = end.split("\\.");
        long startSum = Long.parseLong(startSplit[0]) * 256 * 256 * 256 + Long.parseLong(startSplit[1]) * 256 * 256 + Long.parseLong(startSplit[2]) * 256 + Long.parseLong(startSplit[3]);
        long endSum = Long.parseLong(endSplit[0]) * 256 * 256 * 256 + Long.parseLong(endSplit[1]) * 256 * 256 + Long.parseLong(endSplit[2]) * 256 + Long.parseLong(endSplit[3]);
        return endSum - startSum;
    }

    public static int[] twoSum(int[] numbers, int target) {
        int[] solution = new int[2];
        for (int i = 0; i < numbers.length; i++) {
            for (int j = i + 1; j < numbers.length; j++) {
                if (numbers[i] + numbers[j] == target) {
                    System.out.println("znalazłem " + numbers[i] + " " + numbers[j]);
                    solution[0] = i;
                    solution[1] = j;
                }
            }
        }
        return solution;
    }

    public static String abbreviate(String string) {
//        String solution = "";
//        String[] slowa = string.split("[\\W+_]", -1);
//        String[] znaki = string.split("[a-zA-Z]+");
//        for (int i = 0; i < slowa.length; i++) {
//            if (slowa[i].length() >= 4) {
//                String start = slowa[i].substring(0, 1);
//                String end = slowa[i].substring(slowa[i].length() - 1);
//                String mid = slowa[i].substring(0, slowa[i].length() - 2);
//                String test = start + mid.length() + end;
//                if (znaki.length > 1) {
//                    solution += znaki[i] + test;
//                } else {
//                    solution += test;
//                }
//            } else {
//                solution +=znaki[i] + slowa[i];
//            }
//        }
//        return solution;
        String solution = "";
        String[] slowa = string.split("[\\W_1-9]+");
        String[] znaki = string.split("[a-zA-Z]+");
        List<String> slowaG = Arrays.asList(slowa);
        List<String> znakiL = Arrays.asList(znaki);
        List<String> slowaL = slowaG.stream().filter(x -> !(x.isEmpty())).collect(Collectors.toList());
        for (int i = 0; i < slowaL.size(); i++) {
            if (slowaL.get(i).length() >= 4) {
                String start = slowaL.get(i).substring(0, 1);
                String end = slowaL.get(i).substring(slowaL.get(i).length() - 1);
                String mid = slowaL.get(i).substring(0, slowaL.get(i).length() - 2);
                String test = start + mid.length() + end;
                if (znakiL.size() > 1) {
                    solution += znakiL.get(i) + test;
                } else {
                    solution += test;
                }
            } else if (slowaL.size() <= 1 && slowaL.get(i).length() < 4) {
                solution += slowaL.get(i);
            } else {
                solution += znakiL.get(i) + slowaL.get(i);
            }
        }
        return solution;
    }

    public static String expandedForm(int num) {
        StringJoiner join = new StringJoiner(" + ");
        String nums = String.valueOf(num);
        for (int i = 0; i < nums.length(); i++) {
            if (Integer.parseInt(String.valueOf(nums.charAt(i))) > 0) {
                String temp = nums.charAt(i) + "0".repeat(nums.length() - i - 1);
                join.add(temp);
            }
        }
        return join.toString();
    }

    public static String fireAndFury(final String tweet) {
        Pattern pattern = Pattern.compile("(FURY|FIRE)");
        Matcher matcher = pattern.matcher(tweet);
        int fury = 0;
        int fire = 0;
        List<String> matches = new ArrayList<>();
        while (matcher.find()) {
            matches.add(matcher.group());
        }
        for (int i = 0; i < matches.size(); i++) {
            if (matches.get(i).equals("FURY")) {
                fury++;
                fire = 0;
            } else {
                fire++;
                fury = 0;
            }
            System.out.println("jestemwkurwiony".repeat(fury) + "wypierdalasz".repeat(fire));
        }
        return "";
    }

    public static String order(String words) {

        String[] splited = words.split(" ");
        StringJoiner solution = new StringJoiner(" ");
        for (int i = 0; i <= splited.length; i++) {
            for (int j = 0; j < splited.length; j++) {
                if (splited[j].contains(String.valueOf(i))) {
                    solution.add(splited[j]);
                }
            }
        }
        return solution.toString();
    }

    public static int persistence(long n) {
        String nums = String.valueOf(n);
        int test = 1;
        int counter = 0;
        if (nums.length() < 1)
            return 0;
        while (nums.length() > 1) {
            for (int i = 0; i < nums.length(); i++) {
                test *= Integer.parseInt(String.valueOf(nums.charAt(i)));
            }
            counter++;
            nums = String.valueOf(test);
            test = 1;
        }
        return counter;
    }

    public static String formatDuration(int seconds) {
        int sec = 0;
        int min = 0;
        int hrs = 0;
        int day = 0;
        int yrs = 0;
        StringJoiner solution = new StringJoiner(", ");
        if (seconds == 0) {
            return "now";
        }
        if (seconds >= 31536000) {
            yrs = seconds / 31536000;
            seconds = seconds % 31536000;
        }
        if (seconds >= 86400) {
            day = seconds / 86400;
            seconds = seconds % 86400;
        }
        if (seconds >= 3600) {
            hrs = seconds / 3600;
            seconds = seconds % 3600;
        }
        if (seconds >= 60) {
            min = seconds / 60;
            seconds = seconds % 60;
        }
        if (seconds < 60) {
            sec = seconds;
        }
        if (yrs == 1) {
            solution.add(yrs + " year");
        } else if (yrs > 1) {
            solution.add(yrs + " years");
        }
        if (day == 1) {
            solution.add(day + " day");
        } else if (day > 1) {
            solution.add(day + " days");
        }
        if (hrs == 1) {
            solution.add(hrs + " hour");
        } else if (hrs > 1) {
            solution.add(hrs + " hours");
        }
        if (min == 1) {
            solution.add(min + " minute");
        } else if (min > 1) {
            solution.add(min + " minutes");
        }
        if (sec == 1) {
            solution.add(sec + " second");
        } else if (sec > 1) {
            solution.add(sec + " seconds");
        }
        String result = solution.toString();
        if (result.length() > 9) {
            StringBuilder b = new StringBuilder(result);
            b.replace(result.lastIndexOf(","), result.lastIndexOf(",") + 1, " and");
            result = b.toString();
        }
        return result;
    }

    public static String[] inArray(String[] array1, String[] array2) {
        System.out.println("Array1: " + Arrays.toString(array1));
        System.out.println("Array2: " + Arrays.toString(array2));
        StringJoiner solution = new StringJoiner(", ");
        for (int i = 0; i < array1.length; i++) {
            for (int j = 0; j < array2.length; j++) {
                if (array2[j].contains(array1[i])) {
                    solution.add(array1[i]);
                }
            }
        }
        List<String> collect = Arrays.asList(solution.toString().split(", ")).stream().distinct().sorted().filter(x -> !(x.isEmpty())).collect(Collectors.toList());
        String[] result = collect.toArray(new String[collect.size()]);
        return result;
    }

    public static int rowSumOddNumbers(int n) {
        return n * n * n;
    }

    public static String accum(String s) {
        System.out.println("String s: " + s);
        StringJoiner join = new StringJoiner("-");
        for (int i = 0; i < s.length(); i++) {
            String str = String.valueOf(s.charAt(i));
            join.add(str.toUpperCase() + str.repeat(i).toLowerCase());
        }
        return join.toString();
    }

    public static double findUniq(double arr[]) {
        final double x = arr[arr[0] == arr[1] ? 0 : 2];
        for (double y : arr)
            if (y != x)
                return y;
        throw new RuntimeException("no unique number found");
    }

    public static int getLengthOfMissingArray(Object[][] arrayOfArrays) {
        if (arrayOfArrays == null) {
            return 0;
        }
        if (arrayOfArrays.length == 0) {
            return 0;
        }
        for (int i = 0; i < arrayOfArrays.length; i++) {
            if (arrayOfArrays[i] == null) {
                return 0;
            }
            if (arrayOfArrays[i].length == 0) {
                return 0;
            }
        }
        Arrays.sort(arrayOfArrays, Comparator.comparing(a -> a.length));
        int counter = arrayOfArrays[0].length;
        for (int i = 0; i < arrayOfArrays.length; i++) {
            if (arrayOfArrays[i].length != counter) {
                break;
            }
            counter++;
        }
        return counter;
    }

//    public static boolean validParentheses(String parens) {
//        Stack<Character> stack = new Stack<>();
//        for (int i = 0; i < parens.length(); i++){
//            if (parens.charAt(i) == '(' || parens.charAt(i) == '{' || parens.charAt(i) == '['){
//                stack.push(parens.charAt(i));
//            } else if (parens.charAt(i) == ')' && stack.peek() == '(' || parens.charAt(i) == '}' && stack.peek() == '{' || parens.charAt(i) == ']' && stack.peek() == '['){
//                if (stack.empty()){
//                    return false;
//                }
//                stack.pop();
//            }
//        }
//        return stack.empty();
//    }

    public static boolean isValid(String braces) {
        Stack<Character> stack = new Stack<>();
        for (int i = 0; i < braces.length(); i++) {
            if (braces.charAt(i) == '(' || braces.charAt(i) == '{' || braces.charAt(i) == '[') {
                stack.push(braces.charAt(i));
                System.out.println(stack);
            }
            if (stack.empty()) return false;
            if (braces.charAt(i) == ')' && stack.peek() == '(' || braces.charAt(i) == '}' && stack.peek() == '{' || braces.charAt(i) == ']' && stack.peek() == '[') {
                if (stack.empty()) {
                    return false;
                }
                stack.pop();
            } else if (braces.charAt(i) == ')' && stack.peek() != '(' || braces.charAt(i) == '}' && stack.peek() != '{' || braces.charAt(i) == ']' && stack.peek() != '[') {
                return false;
            }
            System.out.println(stack);
        }
        return stack.empty();
    }

    public static boolean isValid2(char[] walk) {
        int counterNS = 0, counterEW = 0;
        if (walk.length == 10) {
            for (char c : walk) {
                if (c == 'n') {
                    counterNS++;
                } else if (c == 's') {
                    counterNS--;
                } else if (c == 'w') {
                    counterEW++;
                } else if (c == 'e') {
                    counterEW--;
                }
            }
        } else {
            return false;
        }
        return counterEW == 0 && counterNS == 0;
    }

    public static String Factorial(int n) {
//        BigInteger bigInteger = BigInteger.ONE;
//        for (int i = n; i > 0; i--){
//            bigInteger = bigInteger.multiply(BigInteger.valueOf(i));
//        }
//        return bigInteger.toString();
        String sol = "";
        int[] res = new int[500];
        res[0] = 1;
        int res_size = 1;

        for (int x = 2; x <= n; x++) {
            res_size = multiply(x, res, res_size);
        }
        for (int i = res_size - 1; i >= 0; i--) {
            sol += res[i];
        }
        return sol;
    }

    static int multiply(int x, int[] res, int res_size) {
        int carry = 0;
        for (int i = 0; i < res_size; i++) {
            int prod = res[i] * x + carry;
            res[i] = prod % 10;
            carry = prod / 10;
        }

        while (carry != 0) {
            res[res_size] = carry % 10;
            carry = carry / 10;
            res_size++;
        }
        return res_size;
    }

    //    public static String phone(String strng, String num) {
//        System.out.println(strng);
//        String phoneN = null;
//        String nameS = null;
//        String s3 = null;
//        int counter = 0;
//        Pattern name = Pattern.compile("(?<=\\<).+?(?=\\>)");
//        Pattern phone = Pattern.compile("\\(?\\+[0-9]{1,3}\\)? ?-?[0-9]{1,3} ?-?[0-9]{3,5} ?-?[0-9]{4}");
//        String s = Arrays.stream(strng.split("\\n")).filter(x -> {
//            Matcher phoneMatcher = phone.matcher(x);
//            try {
//                String numberFromX = phoneMatcher.find() ? phoneMatcher.group().replace("+", "") : null;
//                if (numberFromX == null) return false;
//                return numberFromX.equals(num);
//            } catch (Exception exception) {
//                return false;
//            }
//        }).collect(Collectors.joining());
//        String[] test = s.split("[^a-zA-Z0-9-]+");
//        for (String x : test) {
//            if (x.equals(num)) {
//                counter++;
//                Matcher nameMatcher = name.matcher(s);
//                Matcher phoneMatcher = phone.matcher(s);
//                if (nameMatcher.find()) {
//                    nameS = nameMatcher.group();
//                }
//                if (phoneMatcher.find()) {
//                    phoneN = phoneMatcher.group().replace("+", "");
//                }
//                String s1 = s.replaceAll("\\W{1,2}+[0-9]{1,3}\\)? ?-?[0-9]{1,3} ?-?[0-9]{3,5} ?-?[0-9]{4}+\\W{0}", "");
//                String s2 = s1.replaceAll("\\<.*\\>", "");
//                s3 = s2.replaceAll("\\s+", " ");
//                s3 = s3.replaceAll("_", " ");
//                s3 = s3.replaceAll("[;$?!,*:/\\]]", "");
//                s3 = s3.trim();
//            }
//        }
//        if (counter > 1)
//            return "Error => Too many people: " + num;
//        if (counter == 0)
//            return "Error => Not found: " + num;
//        return "Phone => " + phoneN + ", Name => " + nameS + ", Address => " + s3;
//    }
    public static String phone(String strng, String num) {
        String found = null;
        int count = 0;
        for (String entry : strng.split("\n"))
            if (entry.contains("+" + num)) {
                found = entry;
                count++;
            }

        // error cases
        if (count == 0) return "Error => Not found: " + num;
        if (count > 1) return "Error => Too many people: " + num;

        // process found entry
        String name = found.split("<|>")[1];
        String address = found
                .replace(name, "").replace(num, "") // only address left
                .replaceAll("[^A-Za-z0-9\\. -]", " ") // filter all unnecessary chars
                .trim().replaceAll(" +", " "); // reduce extra spaces

        return "Phone => " + num + ", Name => " + name + ", Address => " + address;
    }

    public static int[] sort(final int array[]) {
        System.out.println(Arrays.toString(array));
        Map<Integer, String> ones = new HashMap<>();
        Map<Integer, String> tens = new HashMap<>();
        Map<String, Integer> sol = new HashMap<>();
        int[] test = Arrays.copyOf(array, array.length);
        List<String> words = new ArrayList<>();
        ones.put(0, "zero");
        ones.put(1, "one");
        ones.put(2, "two");
        ones.put(3, "three");
        ones.put(4, "four");
        ones.put(5, "five");
        ones.put(6, "six");
        ones.put(7, "seven");
        ones.put(8, "eight");
        ones.put(9, "nine");
        ones.put(10, "ten");
        ones.put(11, "eleven");
        ones.put(12, "twelve");
        ones.put(13, "thirteen");
        ones.put(14, "fourteen");
        ones.put(15, "fifteen");
        ones.put(16, "sixteen");
        ones.put(17, "seventeen");
        ones.put(18, "eighteen");
        ones.put(19, "nineteen");
        tens.put(2, "twenty");
        tens.put(3, "thirty");
        tens.put(4, "forty");
        tens.put(5, "fifty");
        tens.put(6, "sixty");
        tens.put(7, "seventy");
        tens.put(8, "eighty");
        tens.put(9, "ninety");
        for (int i = 0; i < array.length; i++) {
            int num = array[i];
            int nw = num;
//            if (num == 0){
//                words.add("zero");
//                sol.put("zero", nw);
//            }
            if (num < 20) {
                words.add(ones.get(num));
                sol.put(words.get(i), nw);
            }
            List<Integer> digits = new ArrayList<>();
            while (num > 0) {
                digits.add(num % 10);
                num /= 10;
            }
            if (digits.size() == 2) {
                if (tens.containsKey(digits.get(1))) {
                    if (ones.containsKey(digits.get(0))) {
                        words.add(tens.get(digits.get(1)) + " " + (digits.get(0) == 0 ? "" : ones.get(digits.get(0))));
                        sol.put(words.get(i), nw);
                    } else {
                        words.add(tens.get(digits.get(1)));
                        sol.put(words.get(i), nw);
                    }
                }
            } else if (digits.size() == 3) {
                System.out.println(digits);
//                words.add(ones.get(digits.get(2)) + " hundred " + (digits.get(1)>= 1? tens.get(digits.get(1)) + " " + ones.get(digits.get(0)) : (digits.get(1) == 0? "" :ones.get(digits.get(1))) + (digits.get(0) == 0 ? "" :ones.get(digits.get(0)))));
                System.out.println(digits.get(1));
                words.add(ones.get(digits.get(2)) + " hundred " + (digits.get(1) == 0 ? "" : digits.get(1) == 1 ? ones.get(nw % 100) : tens.get(digits.get(1))) + (digits.get(0) == 0 ? "" : (digits.get(1) == 1 ? "" : digits.get(1) == 0 ? ones.get(digits.get(0)) : " " + ones.get(digits.get(0)))));
                sol.put(words.get(i), nw);
            }
        }
        List<String> collect = words.stream().sorted().collect(toList());
        System.out.println(collect);
        int counter = 0;
        for (String x : collect) {
            test[counter] = sol.get(x);
            counter++;
        }
        return test;
    }

    public static int[] sortArray(int[] array) {
        List<Integer> index = new ArrayList<>();
        List<Integer> value = new ArrayList<>();
        List<Integer> even = new ArrayList<>();
        for (int i = 0; i < array.length; i++) {
            if (array[i] % 2 == 1) {
                index.add(i);
                value.add(array[i]);
            } else {
                even.add(array[i]);
            }
        }
        List<Integer> collect = value.stream().sorted().collect(toList());
        for (int j = 0; j < value.size(); j++) {
            even.add(index.get(j), collect.get(j));
        }
        int[] solution = even.stream().mapToInt(i -> i).toArray();
        return solution;
    }

    //    public static char findMissingLetter(char[] array) {
//        char[] alphabet = {'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k', 'l', 'm', 'n', 'o', 'p', 'q', 'r', 's', 't', 'u', 'v', 'w', 'x', 'y', 'z'};
//        List<Character> collect = IntStream.range(0, array.length).filter(i -> array[i] != alphabet[i]).mapToObj(i -> alphabet[i]).collect(toList());
//        return collect.get(0);
//    }
    public static char findMissingLetter(char[] array) {
        char sol = 0;
        int start = array[0];
        for (char c : array) {
            if (c != start) {
                sol = (char) start;
                start++;
            }
            start++;
        }
        return sol;
    }

    public static boolean validPhoneNumber(String phoneNumber) {
        return Pattern.matches("\\([0-9]{3}\\) [0-9]{3}-[0-9]{4}", phoneNumber);
    }

    public static String[] solution(String s) {
        if (s.length() % 2 == 1) {
            s += "_";
        }
        String[] split = s.split("(?<=\\G.{" + 2 + "})");
        return split;
    }

    public static int dblLinear(int n) {
//        System.out.println(n);
//        int x = 1;
//        List<Integer> u = new ArrayList<>();
//        u.add(x);
//        for (int i = 0; i < n; i++){
//            x = u.get(i);
//            int y = 2 * x + 1;
//            u.add(y);
//            int z = 3 * x + 1;
//            u.add(z);
////            if (u.size() > n){
////                break;
////            }
//        }
//        List<Integer> collect = u.stream().sorted().distinct().collect(toList());
//        System.out.println(u);
//        System.out.println(collect);
//        System.out.println(collect.size());
//        return collect.get(n);
        List<Integer> u = new ArrayList<>();
        u.add(1);
        int x = 0;
        int y = 0;
        for (int i = 0; i < n; i++) {
            int nextX = 2 * u.get(x) + 1;
            int nextY = 3 * u.get(y) + 1;
            if (nextX <= nextY) {
                u.add(nextX);
                x++;
                if (nextX == nextY)
                    y++;
            } else {
                u.add(nextY);
                y++;
            }
        }
        return u.get(n);
    }

    public static boolean comp(int[] a, int[] b) {
        if (a == null || b == null || a.length != b.length) {
            return false;
        }
        for (int i = 0; i < a.length; i++) {
            a[i] = a[i] * a[i];
        }
        Arrays.sort(a);
        Arrays.sort(b);
        System.out.println(Arrays.toString(a));
        System.out.println(Arrays.toString(b));
        int counter = 0;
        for (int i = 0; i < a.length; i++) {
            if (a[i] == b[i]) {
                counter++;
            }
        }
        return counter == a.length;
    }


    public static boolean isDigit(String s) {
        return Pattern.matches("\\d", s);

    }

    public static boolean validateUsr(String s) {
        System.out.println(s.matches("[a-z\\d\\_]{4,16}"));
        return Pattern.matches("[a-z\\d\\_]{4,16}", s);

    }

    public static boolean isLockNessMonster(String s) {
        Pattern pat = Pattern.compile("tree fiddy|three fifty|3.50");
        Matcher match = pat.matcher(s);
        return match.find();
    }

    public static String explode(String digits) {
        StringBuilder solution = new StringBuilder();
        for (int i = 0; i < digits.length(); i++) {
            solution.append(String.valueOf(digits.charAt(i)).repeat(Integer.parseInt(String.valueOf(digits.charAt(i)))));
        }
        return solution.toString();
    }

    public static String removeConsecutiveDuplicates(String s) {
        StringJoiner join = new StringJoiner(" ");
        String[] s1 = s.split(" ");
        join.add(s1[0]);
        for (int i = 1; i < s1.length; i++) {
            if (s1[i].equals(s1[i - 1])) {
            } else {
                join.add(s1[i]);
            }
        }
        return join.toString();
    }

    public static String makePassword(String phrase) {
        String[] s = phrase.split(" ");
        String solution = "";
        if (phrase.length() == 0) return phrase;
        for (int i = 0; i < s.length; i++) {
            solution += (s[i].charAt(0) == 'i' || s[i].charAt(0) == 'I' ? '1' : s[i].charAt(0) == 'o' || s[i].charAt(0) == 'O' ? '0' : s[i].charAt(0) == 's' || s[i].charAt(0) == 'S' ? '5' : s[i].charAt(0));
        }
        return solution;
    }

    public static int howManyYears(String date1, String date2) {
        Pattern pat = Pattern.compile("(\\d*)");
        Matcher d1 = pat.matcher(date1);
        Matcher d2 = pat.matcher(date2);
        if (d1.find() && d2.find()) {
            String d11 = d1.group();
            String d22 = d2.group();
            if (Integer.parseInt(d11) > Integer.parseInt(d22)) {
                return Integer.parseInt(d11) - Integer.parseInt(d22);
            } else {
                return Integer.parseInt(d22) - Integer.parseInt(d11);
            }
        }
        return 0;
    }

    public static String disemvowel(String str) {
        return str.replaceAll("[aeiouAEIOU]", "");
    }

    public static String findE(String str) {
        if (str == null) return null;
        if (str.length() == 0) return str;
        int counter = 0;
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == 'e' || str.charAt(i) == 'E') {
                counter++;
            }
        }
        return counter == 0 ? "There is no \"e\"" : String.valueOf(counter);
    }

    public static String removeDuplicateWords(String s) {
        // Your code here, good sir.
        return Stream.of(s.split(" ")).distinct().collect(joining());
    }

    public static String vowel2Index(String s) {
        String g = s;
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == 'a' || s.charAt(i) == 'e' || s.charAt(i) == 'i' || s.charAt(i) == 'o' || s.charAt(i) == 'u') {
                g = g.replaceFirst(String.valueOf((s.charAt(i))), String.valueOf(i + 1));
            }
        }
        return g;
    }

    public static String initials(String name) {
        String[] s = name.split(" ");
        StringJoiner join = new StringJoiner(".");
        for (int i = 0; i < s.length; i++) {
            if (i < s.length - 1) {
                join.add(String.valueOf(s[i].charAt(0)).toUpperCase());
            } else {
                String d = s[i].substring(0, 1).toUpperCase() + s[i].substring(1);
                join.add(d);
            }
        }
        return join.toString();
    }

    //    public static int sequence(int[] arr) {
//        System.out.println(Arrays.toString(arr));
//        if (arr.length < 1) return 0;
//        int suma = 0;
//        for (int i = 0; i < arr.length; i++) {
//            int temp = 0;
//            for (int j = i; j < arr.length; j++) {
//                temp += arr[j];
//                if (temp > suma){
//                    suma = temp;
//                }
//            }
//        }
//        return suma;
//    }
    public static int sequence(int[] arr) {
        int suma = 0, max = 0;
        for (int j : arr) {
            suma += j;
            if (suma < 0) suma = 0;
            if (suma > max) max = suma;
        }
        return max;
    }

    public static int[][] FibDigits(int n) {
        Map<Integer, Integer> digitsCount = new HashMap<>();
        digitsCount.put(1, 0);
        digitsCount.put(2, 0);
        digitsCount.put(3, 0);
        digitsCount.put(4, 0);
        digitsCount.put(5, 0);
        digitsCount.put(6, 0);
        digitsCount.put(7, 0);
        digitsCount.put(8, 0);
        digitsCount.put(9, 0);
        BigInteger f3 = BigInteger.ONE;
        BigInteger f4 = BigInteger.ONE;
        BigInteger f5 = BigInteger.ZERO;
        long f0 = 1, f1 = 1, f2 = 0;
        for (int i = 1; i < n; i++) {
            System.out.println(f3);
            f5.add(f3.add(f4));
            f3 = f4;
            f4 = f5;
        }
        System.out.println(f3);
        char[] chars = String.valueOf(f0).toCharArray();
        for (int j = 0; j < chars.length; j++) {
            int digit = Integer.parseInt(String.valueOf(chars[j]));
            if (digitsCount.containsKey(digit)) {
                int value = digitsCount.get(digit);
                value++;
                digitsCount.put(digit, value);
            }
        }
        System.out.println(digitsCount);
        return new int[][]{new int[]{0, 0}};
    }

    public static String palindrome(String s) {
        s = s.toLowerCase();
        s = s.replaceAll(" ", "");
        char[] chars = s.toCharArray();
        for (int i = 0; i < chars.length; i++) {
            System.out.println(chars[i]);
            System.out.println(chars[chars.length - 1 - i]);
            if (chars[i] != chars[chars.length - i - 1]) {
                return "is not palindrome";
            }
        }
        return "is palindrome";
    }

    public static String palindromeArr(String[] arr) {
        StringJoiner solution = new StringJoiner(" ");
        for (int i = 0; i < arr.length; i++) {
            String s = arr[i].toLowerCase().replaceAll(" ", "");
            StringBuilder s2 = new StringBuilder();
            char[] chars = s.toCharArray();
            for (int j = 0; j < chars.length; j++) {
                s2.append(chars[chars.length - 1 - j]);
            }
            System.out.println(s2);
            if (s.equals(s2.toString())) {
                solution.add("true");
            } else {
                solution.add("false");
            }
        }
        return solution.toString();
    }

    public static long pageDigits(long pages) {
        long rTotal = 0;
        long tens = 1;
        long test = 0;
        int length = String.valueOf(pages).length();
        for (int i = 1; i < length; i++) {
            long temp = 9 * tens * i;
            test += 9 * tens;
            tens *= 10;
            rTotal += temp;
        }
        return rTotal + ((pages - test) * length);
    }

    public static int solve(long n) {
        String test = "";
        String d = "";
        for (long i = 1; i < n; i++) {
            test += i;
            d += test;
        }
        System.out.println(d);
        return 0;
    }


    public static String nthRank(String st, Integer[] we, int n) {
        if (st.length() == 0) return "No participants";
        String[] split = st.split(",");
        if (split.length < n) return "Not enough participants";
        int[] scores = new int[split.length];
        for (int i = 0; i < split.length; i++) {
            int sum = 0;
            char[] chars = split[i].toLowerCase().toCharArray();
            for (char aChar : chars) {
                sum = sum + ((int) aChar - 96);
            }
            scores[i] = (sum + split[i].length()) * we[i];
        }
        final List<String> stringListCopy = Arrays.asList(split);
        List<String> sortedList = new ArrayList<>(stringListCopy);
        sortedList.sort((left, right) -> {
            if (scores[stringListCopy.indexOf(right)] - scores[stringListCopy.indexOf(left)] == 0) {
                return left.compareToIgnoreCase(right);
            }
            return scores[stringListCopy.indexOf(right)] - scores[stringListCopy.indexOf(left)];
        });
        return sortedList.get(n - 1);
    }

//    public static int[] snail(int[][] array) {
//        int[] result = new int[array.length * array.length];
//       int count = 0;
//       while (count < array.length * array.length){
//           for (int i = 0; i < array.length; i++){
//
//           }
//           count++;
//       }
//        return null;
//    }

    public static int amountOfPages(int summary) {
//        int length = String.valueOf(summary).length();
//        int result = 0;
//        int tens = 1;
//        int test = 0;
//
//        for (int i = 1; i < length; i++){
//            result += 9 * tens;
//            test += (9 * tens) * i;
//            tens *= 10;
//        }
//        System.out.println("result: " + result);
//        System.out.println("len: " + length);
//        System.out.println((summary - test) / length);
//        return result + ((summary - test) / length);
        int multi = 1, count = 1, newSummary = 0;
        int result = 0;
        while (true) {
            newSummary = summary - (9 * multi * count);
            if (newSummary > 0) {
                result += (9 * multi);
                summary = newSummary;
                count++;
                multi *= 10;
            } else if (count > 0) {
                result += (summary / count);
                break;
            } else {
                result += summary;
                break;
            }
        }
        return result;
    }

    public static int name(String[] s) {
        int result = 0;
        int chuj = 0;
        for (int i = 0; i < s.length; i++) {
            int compare = 0;
            int counter = 0;
            char[] chars = s[i].toCharArray();
            for (int j = 0; j < chars.length; j++) {
                System.out.println("znak: " + chars[j]);
                System.out.println("wartosc znaku: " + ((int) chars[j] - 96));
                compare += (int) chars[j] - 96;
                counter++;
            }
            System.out.println("compare: " + compare);
            System.out.println("counter: " + 10 * counter);
            System.out.println(compare <= 10 * counter);
            if (chuj + compare <= 10 * counter) {
                result += counter;
            }
        }
        return result;
    }

    public static int solution35(int number) {
        int solution = 0;
        for (int i = 0; i < number; i++) {
            if (i % 3 == 0 || i % 5 == 0) {
                solution += i;
            }
        }
        return solution;
    }

    public static int findEvenIndex(int[] arr) {
        int leftSum = 0, rightSum = 0;
        for (int i = 0; i < arr.length; i++) {
            leftSum += arr[i];
        }
        for (int i = 0; i < arr.length; i++) {
            if (rightSum == leftSum - arr[i]) return i;
            rightSum += arr[i];
            leftSum -= arr[i];
        }
        return -1;
    }

    public static String decode(String morseCode) {
        morseCode = morseCode.trim();
        String[] splited = morseCode.split(" {3}");
        StringJoiner solution = new StringJoiner(" ");
        for (String s : splited) {
            StringBuilder test = new StringBuilder();
            String[] secondSplit = s.split(" ");
            for (String s1 : secondSplit) {
                //                    test.append(MorseCode.get(s1));
            }
            solution.add(test);
        }
        return solution.toString();
    }

    public static String longestConsec(String[] strarr, int k) {
        if (k > strarr.length || k <= 0) return "";
        String result = "";
        int longest = 0;
        for (int i = 0; i < strarr.length; i++) {
            String str = strarr[i];
            int counter = 1;
            if (k != 1) {
                for (int j = i + 1; j < strarr.length; j++) {
                    str += strarr[j];
                    counter++;
                    if (counter == k) break;
                }
            }
            System.out.println("str: " + str);
            System.out.println("len: " + str.length());
            if (str.length() > longest) {
                result = str;
                longest = str.length();
            }
        }
        return result;
    }

    public static int solveSuperMarketQueue(int[] customers, int n) {
        System.out.println(Arrays.toString(customers));
        System.out.println(n);
        ArrayList<Integer> chuj = new ArrayList<>();
        List<Integer> chuj2 = new ArrayList<>();
        PriorityQueue<Integer> pq = new PriorityQueue<>();
        Queue<Integer> pq2 = new PriorityQueue<>();

        return 0;

    }

    public static int countSmileys(List<String> arr) {
        return (int) arr.stream().filter(x -> x.matches("[:;][-~]?[)D]")).count();
    }

    public static String[] wave(String str) {
        if (str.length() == 0) return new String[str.length()];
        List<String> solution2 = new ArrayList<>();
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == ' ') {
                continue;
            }
            StringBuilder test = new StringBuilder(str);
            test.setCharAt(i, Character.toUpperCase(str.charAt(i)));
            solution2.add(test.toString());

        }
        String[] solution = solution2.toArray(new String[solution2.size()]);
        return solution;
    }

    public static String camelCase(String input) {
        String[] split = input.split("(?=[A-Z])");
        StringJoiner result = new StringJoiner(" ");
        for (String s : split) {
            result.add(s);
        }
        return result.toString();
    }

    public static List<Integer> sqInRect(int lng, int wdth) {
        if (lng == wdth) return null;
        System.out.println("lng: " + lng + " wdth: " + wdth);
        List<Integer> solution = new ArrayList<>();
        int surface = lng * wdth;
        if (lng == wdth) return solution;
        while (surface != 0) {
            int diff = Math.abs(lng - wdth);
//            System.out.println(diff);
            if (lng > wdth) {
                solution.add(wdth);
                lng = diff;
            } else {
                solution.add(lng);
                wdth = diff;
            }
            surface = lng * wdth;
            System.out.println(surface);
        }
        return solution;
    }

    public static int[] parse(String data) {
        char[] chars = data.toCharArray();
        List<Integer> solution = new ArrayList<>();
        int value = 0;
        for (char c : chars) {
            switch (c) {
                case ('i'):
                    value++;
                    break;
                case ('d'):
                    value--;
                    break;
                case ('s'):
                    value = value * value;
                    break;
                case ('o'):
                    solution.add(value);
                    break;
            }
        }
        return solution.stream().mapToInt(i -> i).toArray();
    }

    public static String longest(String s1, String s2) {
        return Stream.of((s1 + s2).split("")).sorted().distinct().collect(joining());
    }

    public static boolean solution(String str, String ending) {
        return str.endsWith(ending);
    }

    public static boolean isIsogram(String str) {
        return str.toLowerCase().equals(Stream.of(str.toLowerCase().split("")).distinct().collect(joining()));
//       str.length() == str.toLowerCase().chars().distinct().count();
    }

    public static String stockSummary(String[] lstOfArt, String[] lstOf1stLetter) {
        if (lstOfArt.length == 0 || lstOf1stLetter.length == 0)
            return "";
        StringJoiner solution = new StringJoiner(" - ");
        for (int i = 0; i < lstOf1stLetter.length; i++) {
            int current = 0;
            for (int j = 0; j < lstOfArt.length; j++) {
                if (lstOfArt[j].startsWith(lstOf1stLetter[i])) {
                    String test = lstOfArt[j].replaceAll("\\D+", "");
                    current += Integer.parseInt(test);
                }
            }
            solution.add("(" + lstOf1stLetter[i] + " : " + current + ")");
        }
        return solution.toString();
    }

    public static String encrypt(final String text, final int n) {
        String solution = text;
        for (int j = 0; j < n; j++) {
            char[] chars = solution.toCharArray();
            StringBuilder left = new StringBuilder();
            StringBuilder right = new StringBuilder();
            for (int i = 0; i < chars.length; i++) {
                if (i % 2 == 0) {
                    right.append(chars[i]);
                } else {
                    left.append(chars[i]);
                }
                solution = left.toString() + right.toString();
            }
        }
        return solution;
    }

    public static String decrypt(final String text, final int n) {
        String result = text;
        for (int i = 0; i < n; i++) {
            StringBuilder solution = new StringBuilder();
            String left = result.substring(0, result.length() / 2);
            String right = result.substring(result.length() / 2, result.length());
            char[] rights = right.toCharArray();
            char[] lefts = left.toCharArray();
            for (int j = 0; j < rights.length; j++) {
                solution.append(rights[j]);
                if (text.length() % 2 == 0) {
                    solution.append(lefts[j]);
                } else {
                    if (j != rights.length - 1) {
                        solution.append(lefts[j]);
                    }
                }
            }
            result = solution.toString();
        }
        return result;
    }

    public static String encryptThis(String text) {
        String[] splited = text.split(" ");
        StringJoiner solution = new StringJoiner(" ");
        for (String s : splited) {
            String changed = "";
            char[] chars = s.toCharArray();
            for (int i = 0; i < chars.length; i++) {
                if (i == 0) {
                    changed += (int) chars[i];
                } else if (i == 1) {
                    changed += chars[chars.length - 1];
                } else if (i == chars.length - 1) {
                    changed += chars[1];
                } else {
                    changed += chars[i];
                }
            }
            solution.add(changed);
        }
        return solution.toString();
    }

    //    public static int[] sumParts(int[] ls) {
//        int[] result = new int[ls.length + 1];
//        for (int i = 0; i < ls.length; i++) {
//            int[] ints = Arrays.copyOfRange(ls, i, ls.length);
//            int sum = IntStream.of(ints).sum();
//            result[i] = sum;
//        }
//        result[result.length - 1] = 0;
//        return result;
//    }
    public static int[] sumParts(int[] ls) {
        int sum = IntStream.of(ls).sum();
        int[] result = new int[ls.length + 1];
        for (int i = 0; i < ls.length; i++) {
            result[i] = sum;
            sum -= ls[i];
        }
        result[result.length - 1] = sum;
        return result;
    }

    public static String meeting(String s) {
        String[] split = s.toUpperCase().split(";");
        StringBuilder solution = new StringBuilder();
        Arrays.sort(split, new Comparator<String>() {
            public int compare(String o1, String o2) {
                String substr1 = o1.substring(o1.indexOf(":"));
                String substr2 = o2.substring(o2.indexOf(":"));
                String substr3 = o1.substring(0, o1.indexOf(":"));
                String substr4 = o2.substring(0, o2.indexOf(":"));
                return substr1.compareTo(substr2) == 0 ? substr3.compareTo(substr4) : substr1.compareTo(substr2);
            }
        });
        System.out.println(Arrays.toString(split));
        for (int i = 0; i < split.length; i++) {
            solution.append("(" + (split[i].substring(split[i].indexOf(":") + 1) + ", " + split[i].substring(0, split[i].indexOf(":")) + ")").toUpperCase());
        }
        return solution.toString();
    }

    public static int[] DataReverse(int[] data) {
        int[] solution = new int[data.length];
        int cos = (data.length / 8);
        int counter = 0;
        System.out.println(cos);
        for (int i = 0; i < data.length; i++) {
            if (i % 8 == 0) {
                cos--;
                counter = 0;
            }
            solution[(8 * cos) + counter] = data[i];
            counter++;
        }
        return solution;
    }

    public static int TripleDouble(long num1, long num2) {
        char c = 0;
        String num1ToString = String.valueOf(num1);
        int counter1 = 0;
        String num2ToString = String.valueOf(num2);
        int counter2 = 0;
        for (int i = 0; i < num1ToString.length() - 2; i++) {
            if (num1ToString.charAt(i) == num1ToString.charAt(i + 1) && num1ToString.charAt(i) == num1ToString.charAt(i + 2)) {
                c = num1ToString.charAt(i);
                counter1++;
            }
        }
        for (int i = 0; i < num2ToString.length() - 1; i++) {
            if (num2ToString.charAt(i) == num2ToString.charAt(i + 1)) {
                if (num2ToString.charAt(i) == c) {
                    return 1;
                }
            }
        }
        return 0;
    }

    public static String[] dirReduc(String[] arr) {
        Stack<String> stack = new Stack<>();
        for (String s : arr) {
            if (!stack.isEmpty()) {
                if ((s.equals("NORTH") && stack.peek().equals("SOUTH")) || (s.equals("SOUTH") && stack.peek().equals("NORTH")) || (s.equals("WEST") && stack.peek().equals("EAST")) || (s.equals("EAST") && stack.peek().equals("WEST"))) {
                    stack.pop();
                    continue;
                }
            }
            stack.push(s);
        }
        String[] solution = new String[stack.size()];
        for (int i = 0; i < stack.size(); i++) {
            solution[i] = stack.get(i);
        }
        return solution;
    }

    public static String orderWeight(String strng) {
        if (strng.length() == 0) return strng;
        String[] s = strng.split(" ");
        Arrays.sort(s);
        int[] values = new int[s.length];
        for (int i = 0; i < s.length; i++) {
            int value = 0;
            String[] split = s[i].split("");
            for (int j = 0; j < split.length; j++) {
                value += Integer.parseInt(split[j]);
            }
            values[i] = value;
        }
        final List<String> stringListCopy = Arrays.asList(s);
        List<String> sortedList = new ArrayList<>(stringListCopy);
        Collections.sort(sortedList, Comparator.comparing(x -> values[stringListCopy.indexOf(x)]));
        return sortedList.stream().collect(joining(" "));
    }

    public static int[] deleteNth(int[] elements, int maxOccurrences) {
        Map<Integer, Integer> occurence = new HashMap<>();
        int[] ints = IntStream.of(elements).filter(kek -> occurence.merge(kek, 1, Integer::sum) <= maxOccurrences).toArray();
        System.out.println(occurence);
        System.out.println(Arrays.toString(ints));
        return ints;
    }

    public static boolean scramble(String str1, String str2) {
        char[] chars = str2.toCharArray();
        for (char c : chars) {
            if (str1.contains(String.valueOf(c))) {
                str1 = str1.replaceFirst(String.valueOf(c), "");
            } else {
                return false;
            }
        }
        return true;
    }

    public static int zeros(int n) {
        int result = 0;
        while (n >= 5) {
            result += n / 5;
            n /= 5;
        }
        return result;
    }

    public static String listSquared(long m, long n) {
        StringJoiner solution = new StringJoiner(", ");
        for (long i = m; i <= n; i++) {
            long sum = 0;
            for (long j = 1; j <= i; j++) {
                if (i % j == 0) {
                    sum += j * j;
                }
            }
            if (Math.sqrt((double) sum) % 1 == 0) {
                solution.add("[" + i + ", " + sum + "]");
            }
        }
        return "[" + solution.toString() + "]";
    }

    public static Map<String, List<Integer>> getPeaks(int[] arr) {
        System.out.println(Arrays.toString(arr));
        Map<String, List<Integer>> peaks = new HashMap<>();
        List<Integer> peakList = new ArrayList<>();
        List<Integer> posList = new ArrayList<>();
        if (arr.length != 0) {
            int peak = arr[0];
            int count = 0;
            int plateau = 0;
            for (int i = 0; i < arr.length; i++) {
                if (arr[i] > peak) {
                    peak = arr[i];
                    plateau = i;
                    count++;
                } else if (arr[i] < peak) {
                    if (count > 0) {
                        peakList.add(peak);
                        posList.add(plateau);
                    }
                    peak = arr[i];
                    plateau = i;
                    count = 0;
                }
            }
        }
        peaks.put("pos", posList);
        peaks.put("peaks", peakList);
        return peaks;
    }

//    public static List<long[]> removNb(long n) {
//        System.out.println(n);
//        long sum = LongStream.range(0, n + 1).sum();
//        System.out.println(sum);
//        List<long[]> solution = new ArrayList<>();
//        for (long i = 0; i < n; i++) {
//            long a = i;
//            for (long j = 0; j < n; j++) {
//                long b = j;
//                if (a * b == (sum - a - b)){
//                    System.out.println(a + ", " + b);
//                    solution.add(new long[]{a, b});
//                }
//            }
//            if (solution.size() > 2){
//                break;
//            }
//        }
//        return solution;
//    }

    public static List<long[]> removNb(long n) {
        long sum = (n * (n + 1)) / 2;
        List<long[]> solution = new ArrayList<>();
        for (long i = 0; i < n; i++) {
            long b = i;
            long a = ((sum - b) / (b + 1));
            if (((a * b) == sum - a - b) && a < n) {
                System.out.println(a + ", " + b);
                solution.add(new long[]{a, b});
            }
        }
        return solution;
    }

    public static String lcs(String x, String y) {
        char[] yChars = y.toCharArray();
        char[] xChars = x.toCharArray();
        StringBuilder temp = new StringBuilder();
        int pos = 0;
        for (char yChar : yChars) {
            for (int j = pos; j < xChars.length; j++) {
                if (yChar == xChars[j]) {
                    pos = j + 1;
                    temp.append(xChars[j]);
                    break;
                }
            }
        }
        return temp.toString();
    }

    //    public static boolean isMerge(String s, String part1, String part2) {
//        System.out.println("s: " + s);
//        System.out.println("p1: " + part1);
//        System.out.println("p2: " + part2);
//        String bigger = "";
//        String smaller = "";
//        if (part1.length() > part2.length()){
//            bigger = part1;
//            smaller = part2;
//        } else {
//            bigger = part2;
//            smaller = part1;
//        }
//        char[] sChars = s.toCharArray();
//        char[] p1Chars = bigger.toCharArray();
//        char[] p2Chars = smaller.toCharArray();
//        int p1Iterator = 0;
//        int p2Iterator = 0;
//        System.out.println("p1 len: " + p1Chars.length);
//        System.out.println("p2 len: " + p2Chars.length);
//        for (char sChar : sChars) {
//            System.out.println("current s char: " + sChar);
//            if ((sChar == p1Chars[p1Iterator])) {
//                System.out.println("p1char: " + p1Chars[p1Iterator]);
//                if (p1Iterator == p1Chars.length - 1) continue;
//                p1Iterator++;
//                System.out.println("p1Iterator: " + p1Iterator);
//            } else if ((sChar == p2Chars[p2Iterator])) {
//                System.out.println("pp2char: " + p2Chars[p2Iterator]);
//                if (p2Iterator == p2Chars.length - 1) continue;
//                p2Iterator++;
//                System.out.println("p2Iterator: " + p2Iterator);
//
//            } else {
//                return false;
//            }
//        }
//        return true;
//    }
//    public static boolean isMerge(String s, String part1, String part2) {
//
//        s = s.replaceAll(part2, "");
//        System.out.println(s);
//        return false;
//    }

    public static String decomp(int n) {
        StringJoiner solution = new StringJoiner(" * ");
        for (int i = 0; i <= n; i++) {
            if (isPrime2(i)) {
                int temp = n;
                int result = 0;
                while (temp >= i) {
                    result += temp / i;
                    temp /= i;
                }
                if (result > 1) {
                    solution.add(i + "^" + result);
                } else {
                    solution.add(String.valueOf(i));
                }
            }
        }
        return solution.toString();
    }

    public static boolean isPrime2(int num) {
        if (num < 2)
            return false;
        for (int i = 2; i <= Math.sqrt(num); i++) {
            if (num % i == 0)
                return false;
        }
        return true;
    }

    public static int[] hexStringToRGB(String hex) {
        int[] solution = new int[3];
        String[] splited = hex.replace("#", "").split("(?<=\\G..)");
        for (int i = 0; i < splited.length; i++) {
            solution[i] = Integer.parseInt(splited[i], 16);
        }
        return solution;
    }

    public static long[] smallest(long n) {
        System.out.println(n);
        char[] chars = String.valueOf(n).toCharArray();
        long[] solution = new long[3];
        long testing = 0;
        long cipesting = 0;
        int start = 0;
        while (start != chars.length) {
            StringBuilder chuj = new StringBuilder(String.valueOf(n));
            StringBuilder cipa = new StringBuilder(String.valueOf(n));
            int minIndex = 0;
            int min = Integer.MAX_VALUE;
            int max = Integer.MIN_VALUE;
            int maxIndex = 0;
            int limit = 0;
            for (int i = chars.length - start - 1; i > 0; i--) {
                int i1 = Integer.parseInt(String.valueOf(chars[i]));
                if (i1 < min) {
                    min = i1;
                    minIndex = i;
                }
            }
            for (int i = start; i < chars.length; i++){
                int i1 = Integer.parseInt(String.valueOf(chars[i]));
                if (i1 > max){
                    max = i1;
                    maxIndex = i;
                }
            }
            System.out.println("max index: " + maxIndex);
            System.out.println("Min index: " + minIndex);
            chuj.replace(minIndex, minIndex + 1, "");
            chuj.insert(start, min);
            cipa.replace(maxIndex, maxIndex +1, "");
            cipa.insert(cipa.length(), max);
            testing = Long.parseLong(chuj.toString());
            System.out.println("testing: " + testing);
            cipesting = Long.parseLong(cipa.toString());
            System.out.println("cipesting: " + cipesting);
            if (testing < n || cipesting < n){
                if (cipesting < testing){
                    solution[0] = cipesting;
                    solution[1] = maxIndex;
                    solution[2] = cipa.length() - 1 - start;
                    System.out.println("maxIndex: " + maxIndex);
                    System.out.println("start: " + start);
                    break;
                } else {
                    if (minIndex < 2 && min == 0){
                        solution[0] = testing;
                        solution[1] = start;
                        solution[2] = minIndex;
                        System.out.println("minIndex: " + start);
                        System.out.println("start: " + minIndex);
                        break;
                    } else {
                        solution[0] = testing;
                        solution[1] = minIndex;
                        solution[2] = start;
                        System.out.println("minIndex: " + minIndex);
                        System.out.println("start: " + start);
                        break;
                    }
                }
            }
            chuj.replace(0, chuj.length() - 1, String.valueOf(n));
            cipa.replace(0, chuj.length() - 1, String.valueOf(n));
            start++;
        }
//        System.out.println(testing);
        System.out.println(Arrays.toString(solution));
        return solution;
    }

    public static boolean chuj(int x) {
        int y = 2501;
        return x > y;
    }

}




















