package gyakorlás.hilfe;

public class StringMetódusok {

    /*
        egyenlőségének vizsgálata – equals()
            String s1 = "abcd";
            String s2 = new String("abcd");

            System.out.println( s1.equals(s2) );

       összefűzése – concat()
            String s = "Indul";
            s = s.concat(" a");
            s = s.concat(" gorog");
            s = s.concat(" aludni");
            System.out.println(s);

        Stringek hossza – length()

        String adott karaktere – charAt()
            s.charAt(3) // a 4. karakter (3-as index!)
            s.charAt(0) // első karakter (üres Stringre indexelési hiba!)
            s.charAt(s.length() - 1) // utolsó karakter

        összehasonlítása rendezési szempontból - compareTo()
            String s1 = "Geza";
            String s2 = "Bela";
            System.out.println(s1.compareTo(s2));

        kis-nagybetűs átalakítása – toLowerCase() és toUpperCase()
            String nev = "Miko Csaba";
            System.out.println(nev.toUpperCase()); // "MIKO CSABA"
            System.out.println(nev.toLowerCase()); // "miko csaba"

        Keresés Stringben – indexOf(), lastIndexOf()
            String s = "abrakadabra";
            System.out.println(s.indexOf("rak")); // 2
            //  A 2. indexű (3. karakternél) található a rak szócska.

            String s= "abrakadabra";
            int elso = s.indexOf("r");
            System.out.println(s.indexOf("r", elso + 1));
            // a második előfordulás //

        String kezdete és vége – startsWith(), endsWith()
            String s = "abrakadabra";
            System.out.println(s.startsWith("ab")); // true
            System.out.println(s.endsWith("ab")); // false
            System.out.println(s.startsWith("Ab")); // false(!)

            String s = "Abrakadabra";
            System.out.println(s.startsWith("ab")); // false, nem meglepő
            System.out.println(s.toLowerCase().startsWith("ab")); // true!

        karaktereinek cseréje – replace(), replaceFirst()
            String s = "abrakadabra";
            System.out.println(s.replace("a","A")); // AbrAkAdAbrA

            System.out.println(s.replaceFirst("a","A")); // Abrakadabra

        String részének kinyerése – substring()
            String s = "abrakadabra";
            System.out.println(s.substring(0,5)); // abrak
            System.out.println(s.substring(2,5)); // rak
            System.out.println(s.substring(5,8)); // ada
            System.out.println(s.substring(6));   // dabra

        tartalmazza-e? – contains()
            String s = "Abrakadabra";
            System.out.println(s.contains("rak")); // true
            System.out.println(s.contains("Rak")); // false
            System.out.println(s.contains("abra")); // true (a vegen van!)
            System.out.println(s.contains("abrak")); // false
            System.out.println(s.toLowerCase().contains("abrak")); // true(!)

        String szétdarabolása – split()
            String nevsor2 = "Geza,Eva,Pal";
            String[] nevek2 = nevsor2.split(","); // { "Geza", "Eva", "Pal" }

        Stringet karakterekre bontása – toCharArray()
            String s = "hokusz";
            char[] tomb = s.toCharArray(); // { 'h', 'o', 'k', 'u', 's', 'z' }

        String trim() - szóköz levágása






     */

}
