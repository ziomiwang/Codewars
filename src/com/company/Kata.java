package com.company;

import java.util.*;
import java.util.concurrent.atomic.AtomicLong;
import java.util.function.Function;
import java.util.function.IntPredicate;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

import static java.util.stream.Collectors.groupingBy;

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

    public static long ipsBetween(String start, String end) {


        return -1;
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
        snakesAndLadders.put(28,84);
        snakesAndLadders.put(36,44);
        snakesAndLadders.put(51, 67);
        snakesAndLadders.put(71,91);
        snakesAndLadders.put(78, 98);
        snakesAndLadders.put(87, 94);

        if (snakesAndLadders.containsKey(test)) {
            result = snakesAndLadders.get(test);
        } else {
            result = test;
        }
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
            if (endGame){
                endGame = false;
                p1Score = 0;
                p2Score = 0;
                currentPlayer = true;
                return "Game over!";
            }
            if (p1Score == endpoint){
                endGame = true;
                return "Player 1 Wins!";
            } else if (p2Score == endpoint){
                endGame = true;
                return "Player 2 Wins!";
            }
        return response;
    }
    public static boolean endGame = false;

    public static int overpoint(int score){
        if (score > 100){
           return 100 + (100 - (score));
        } else {
            return score;
        }
    }
}


