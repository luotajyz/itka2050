import java.util.Random;

/**
 * @author andre
 * @version 15.5.2022
 *
 */
public class Ajastus {

    /**
     * @param args d
     */
    public static void main(String[] args) {       

        //luodaan 50 merkin merkkijonot
        int vasenReuna = 97; // kirjain 'a'
        int oikeaReuna = 122; // kirjain 'z'
        int lauseenPituus = 50; //
        Random randomi = new Random();
        Random randomi2 = new Random();
        StringBuilder buffer = new StringBuilder(lauseenPituus);
        StringBuilder buffer2 = new StringBuilder(lauseenPituus);
        for (int i = 0; i < lauseenPituus; i++) {
            int randomiLimitoitu = vasenReuna + (int) 
              (randomi.nextFloat() * (oikeaReuna - vasenReuna + 1));
            buffer.append((char) randomiLimitoitu);
            int randomiLimitoitu2 = vasenReuna + (int) 
              (randomi2.nextFloat() * (oikeaReuna - vasenReuna + 1));
            buffer2.append((char) randomiLimitoitu2);
        }
        String luotuMerkkijono = buffer.toString();
        String luotuMerkkijono2 = luotuMerkkijono;
        String luotuMerkkijono3 = buffer2.toString();
        
        System.out.println("Identtiset merkkijonot: " + "\n" + luotuMerkkijono + "\n" 
                            + luotuMerkkijono2 + "\n" + "\n" + "Epäidenttiset merkkijonot: " + "\n"
                            + luotuMerkkijono + "\n" + luotuMerkkijono3 + "\n");    
       
        
        //lasketaan identtisten merkkijonojen tarkastamiseen kulunut aika
        long startTime = System.nanoTime();        
        vertaileString(luotuMerkkijono, luotuMerkkijono2);        
        long endTime = System.nanoTime();
        
        long startTime2 = System.nanoTime();        
        vertaileString(luotuMerkkijono, luotuMerkkijono3);        
        long endTime2 = System.nanoTime();

        
        System.out.println("Identtisten merkkijonojen vertailuun kului aikaa: " + (endTime - startTime) + "\n"
                            + "Epäidenttisten merkkijonojen vertailuun kului aikaa: " + (endTime2 - startTime2) + "\n");        
        
    }
    
    /**
     * @param luotuMerkkijono ensimmäinen merkkijono
     * @param luotuMerkkijono2 toinen mekkijono
     */
    public static void vertaileString(String luotuMerkkijono, String luotuMerkkijono2) {
        
        if(luotuMerkkijono == luotuMerkkijono2) return; 
        
        for (int i = 0; i < luotuMerkkijono.length(); i++) {
            if (luotuMerkkijono.charAt(i) != luotuMerkkijono2.charAt(i)) {
                continue;
            }  
            continue;                
        }
        
        return;
    }

}
