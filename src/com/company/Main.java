package com.company;

import java.sql.SQLOutput;
import java.util.*;

public class Main {

    public static void main(String[] args) {
//        System.out.println(Kata.fireAndFury("FURYFARFURYKAFURYFIREFURYFIREFIREFURYFIRE"));
//        System.out.println(Kata.order("is2 Thi1s T4est 3a"));
//        System.out.println(Kata.persistence(39));
//        System.out.println(Kata.formatDuration(62));
//        System.out.println(Kata.inArray(new String[]{"arp", "live", "strong"}, new String[]{"lively", "alive", "harp", "sharp", "armstrong"}));
//        System.out.println(Kata.inArray(new String[]{"ohio, code, 1346, 1028, art"}, new String[]{"Carolina, Ohio, 4600, NY, California"}));
//        System.out.println(Kata.deleteNth(new int[]{1,2,3,1,2,1,2,3}, 2));
//        System.out.println(Kata.rowSumOddNumbers(3));
//        System.out.println(Kata.findUniq(new double[]{0, 0, 0, 0, 1}));
//        System.out.println(Kata.getLengthOfMissingArray(new Object[][]{{5,2,9}, {4,5, 1, 1}, {1}, {5,6,7,8,9}}));
//        System.out.println(Kata.getLengthOfMissingArray(new Object[][]{{'a','a','a'}, {'a','a'}, {'a','a','a','a'},{'a'}, {'a','a','a','a','a','a'}}));
//        System.out.println(Kata.getLengthOfMissingArray(new Object[][]{null, {4,5,1,1}, {1}, {5,6,7,8,9}}));
//        System.out.println(Kata.getLengthOfMissingArray(new Object[][]{{null}, {null, null, null}}));
//        System.out.println(Kata.getLengthOfMissingArray(new Object[][]{}));
//        System.out.println(Kata.getLengthOfMissingArray(null));
//        System.out.println(Kata.isValid("(())"));
//        System.out.println(Kata.isValid2(new char[]{'n','n','n','s','n','s','n','s','n','s'}));
//        System.out.println(Kata.Factorial(150));
//        System.out.println(Kata.phone("/+1-541-754-3010] 156 Alphand_St. <J Steeve>\n 133, Green, Rd. <E Kustur> NY-56423 ;+1-541-914-3010\n"
//                + "+1-541-984-3012 <P Reed> /PO Box 530; Pollocksville, NC-28573\n :+1-321-512-2222 <Paul Dive> Sequoia Alley PQ-67209\n"
//                + "+1-741-984-3090 <Peter Reedgrave> _Chicago\n :+1-921-333-2222 <Anna Stevens> Haramburu_Street AA-67209\n"
//                + "+1-111-544-8973 <Peter Pan> LA\n +1-921-512-2222 <Wilfrid Stevens> Wild Street AA-67209\n"
//                + "<Peter Gone> LA ?+1-121-544-8974 \n <R Steell> Quora Street AB-47209 +1-481-512-2222\n"
//                + "<Arthur Clarke> San Antonio $+1-121-504-8974 TT-45120\n <Ray Chandler> Teliman Pk. !+1-681-512-2222! AB-47209,\n"
//                + "<Sophia Loren> +1-421-674-8974 Bern TP-46017\n <Peter O'Brien> High Street +1-908-512-2222; CC-47209\n"
//                + "<Anastasia> +48-421-674-8974 Via Quirinal Roma\n <P Salinger> Main Street, +12-098-512-2222, Denver\n"
//                + "<C Powel> *+19-421-674-8974 Chateau des Fosses Strasbourg F-68000\n <Bernard Deltheil> +1-498-512-2222; Mount Av. Eldorado\n"
//                + "+1-099-500-8000 <Peter Crush> Labrador Bd.\n +1-931-512-4855 <William Saurin> Bison Street CQ-23071\n"
//                + "<P Salinge> Main Street, +11-098-512-2222, Denve\n"+ "<P Salinge> Main Street, +1-098-512-2222, Denve\n", "1-121-504-8974"));
//        System.out.println(Kata.phone("<Anastasia> +48-421-674-8974 Via Quirinal Roma\n" + "<Elizabeth Corber> +8-421-674-8974 Via Papa Roma", "8-421-674-8974"));
//        System.out.println(Kata.sort(new int[]{80, 88}));
//        System.out.println(Kata.sortArray(new int[]{9, 8, 7, 6, 5, 4, 3, 2, 1, 0}));
//        System.out.println(Kata.findMissingLetter(new char[]{'O','Q','R','S'}));
//        System.out.println(Kata.validPhoneNumber("(1111)555 2345"));
//        System.out.println(Kata.solution("HelloWorld"));
//        System.out.println(Kata.dblLinear(100));
//        System.out.println(Kata.comp(new int[]{2,2,3}, new int[]{4,4,9}));
//        System.out.println(Kata.validateUsr("asd43_34"));
//        System.out.println(Kata.isLockNessMonster("qweqwrqrw"));
//        System.out.println(Kata.explode("1234567890"));
//        System.out.println(Kata.removeConsecutiveDuplicates("alpha beta beta gamma gamma gamma delta alpha beta beta gamma gamma gamma delta"));
//        System.out.println(Kata.makePassword(""));
//        System.out.println(Kata.howManyYears("1997/10/10", "2015/10/10"));
//        System.out.println(Kata.disemvowel("This website is for losers LOL!"));
//        System.out.println(Kata.findE(null));
//        System.out.println(Kata.vowel2Index("Tomorrow is going to be raining"));
//        System.out.println(Kata.initials("code wars"));
//        System.out.println(Kata.sequence(new int[]{-2, 1, -3, 4, -1, 2, 1, -5, 4}));
//        System.out.println(Kata.FibDigits(5000));
//        System.out.println(Kata.palindrome("Oozy rat in a sanitary zoo"));
//        System.out.println(Kata.palindrome("The quick fox jumped over the sleeping dog"));
//        System.out.println(Kata.palindromeArr(new String[]{"The quick brown fox jumped over the sleeping dog", "Oozy rat in a sanitary zoo", "Carla loves chocolate"}));
//        System.out.println(Kata.pageDigits(555666));
//        System.out.println(Kata.solve(40));
//        System.out.println(Kata.smallest(261235));
//        System.out.println(Kata.nthRank("COLIN,AMANDBA,AMANDAB,CAROL,PuaL,PauL,JOSEPH", new Integer[]{1, 4, 4, 5, 2, 2 ,1}, 4));
//        System.out.println(Kata.nthRank("Addison,Jayden,Sofia,Michael,Andrew,Lily,Benjamin", new Integer[]{4, 2, 1, 4, 3 ,1 ,2}, 8));
//        System.out.println(Kata.nthRank("", new Integer[]{4, 2, 1, 4, 3 ,1 ,2}, 4));
//        System.out.println(Kata.snail(new int[][]{  {1,2,3,1},
//                                                    {4,5,6,4},
//                                                    {7,8,9,7},
//                                                    {7,8,9,7}}));
//        System.out.println(Kata.amountOfPages(3222891));
//        System.out.println(Kata.name(new String[]{"co", "de", "w", "ar", "s"}));
//        System.out.println(Kata.name(new String[]{"k", "a", "t", "a"}));
//        System.out.println(Kata.solution35(200));
//        System.out.println(Kata.findEvenIndex(new int[]{1,2,3,4,3,2,1}));
//        System.out.println(Kata.findEvenIndex(new int[]{1,100,50,-51,1,1}));
//        System.out.println(Kata.decode("   .   . "));
//        System.out.println(Kata.longestConsec(new String[]{"zone", "abigail", "theta", "form", "libe", "zas", "theta", "abigail"}, 2));
//        System.out.println(Kata.solveSuperMarketQueue(new int[]{5,3,4}, 1));
//        System.out.println(Kata.solveSuperMarketQueue(new int[]{10, 2,3, 3}, 2));
//        System.out.println(Kata.countSmileys(Arrays.asList(":)", ";(", ";}", ":-)")));
//        System.out.println(Kata.wave("two "));
//        System.out.println(Kata.camelCase("camelcasingtest"));
//        System.out.println(Kata.comp(new int[]{0, -14, 191, 161, 19, 144, 195, 1}, new int[]{1, 0, 196, 36481, 25921, 361, 20736, 38025}));
//        System.out.println(Kata.sqInRect(37, 14));
//        System.out.println(Kata.parse("iiisdoso"));
//        System.out.println(Kata.longest("loopingisfunbutdangerous", "lessdangerousthancoding"));
//        System.out.println(Kata.solution("abc", "d"));
//        System.out.println(Kata.isIsogram(""));
//        System.out.println(Kata.stockSummary(new String[]{"ABART 20", "CDXEF 50", "BKWRK 25", "BTSQZ 89", "DRTYM 60"}, new String[]{"A", "B", "C", "W"}));
//        System.out.println(Kata.encrypt("This kata is very interesting!", 1));
//        System.out.println(Kata.decrypt("hsi  etTi sats!", 1));
//        System.out.println(Kata.decrypt("hsi  etTi sats!", 0));
//        System.out.println(Kata.encryptThis("A"));
//        System.out.println(Kata.sumParts(new int[]{0, 1, 3, 6, 10}));
//        System.out.println(Kata.meeting("Alexis:Wahl;John:Bell;Victoria:Schwarz;Abba:Dorny;Grace:Meta;Ann:Arno;Madison:STAN;Alex:Cornwell;Lewis:Kern;Megan:Stan;Alex:Korn"));
//        System.out.println(Kata.DataReverse(new int[]{1,1,1,1,1,1,1,1,0,0,0,0,0,0,0,0,0,0,0,0,1,1,1,1,1,0,1,0,1,0,1,0}));
//        System.out.println(Kata.TripleDouble(666789L, 12345667L));
//        System.out.println(Kata.dirReduc(new String[]{"WEST", "SOUTH", "WEST", "EAST", "NORTH", "SOUTH", "SOUTH", "WEST", "EAST", "NORTH"}));
//        System.out.println(Kata.orderWeight("2000 10003 1234000 44444444 9999 11 11 22 123"));
//        System.out.println(Kata.scramble("fwpgbucaijeztkzmenednikhwdnzfnhrqefcfwukgrundvzjijajsfgekobckisnxrtvzdepldorlvcankfgfbgsaxevfohahsugijjnexyikcwbhyhzwqakbrmgfiiovzdntpvwsjcpiiahrvndsyctyywoqmnzhqrdicypwyoyxmkdbmfrslgukpgmnrvaxtrawuhohpakudzogkacrkcafxkokbtnvqicrxmrinldydcwusnkfwanceeuuzsglxiztqgcezffpqgjnlcpgkihyxyncdxubizwpmpoyjuqgcsqojaxpkqybuerzrbtbjkwqnjjjtmnaxumiqvdwrmlznnbqytbzoajivbhnhmuftywvlaenahhikwcqdwyzmgtpqtrtkevzuqkhatyjflywisppkikptolzflefpsmquytcqckbkpidczcudwzthqbthnhebsmujrlsigyciowwywccllowc", "wpsonvgntzutbflhvviziagzsczrplumldfhklrellzvirmbgvconzmxtubkptyntfnziofhshkaxfnahtzjrtsrrwwttteejtsvwmjrdptzzznygxnrlztvabyhwhystvytdevjggminnahhmbqvlgodzcoouegdtcmwfpbeoudljedebvovnnccxkrpplxmqarw"));
//        System.out.println(Kata.deleteNth(new int[]{1,2,3,1,2,1,2,3}, 2));
//        System.out.println(Kata.zeros(417474154));
//        System.out.println(Kata.listSquared(250, 100000));
//        System.out.println(Kata.getPeaks(new int[]{}));
//        System.out.println(Kata.loopSize(1, 3));
//        System.out.println(Kata.removNb(1000003));
//        System.out.println(Kata.lcs("abcdef", "abc"));
//        System.out.println(Kata.isMerge("Bananas from Bahamas", "Bahas", "Bananas from am"));
//        System.out.println(Kata.isMerge("codewars", "cdw", "oears"));
//        System.out.println(Kata.decomp(17));
//        System.out.println(Kata.hexStringToRGB("#FF9933"));
//        System.out.println(Kata.smallest(187863002809L));
//        System.out.println(Kata.chuj(2051));
    }
}

