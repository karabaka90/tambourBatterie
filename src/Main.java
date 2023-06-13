import com.sun.xml.internal.ws.api.ha.StickyFeature;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        Batterie b1 = new Batterie();
        Batterie b2 = new Batterie();
        Batterie b3 = new Batterie();
        Tambour t1 = new Tambour();
        Tambour t2 = new Tambour();
        Tambour t3 = new Tambour();

        List<Media> beats = new ArrayList<>();
        beats.add(b2);
        beats.add(b1);
        beats.add(t3);
        beats.add(t2);
        beats.add(b3);
        beats.add(t1);

        System.out.println("faire play les beats : ");
        for (Media beat : beats) {
            beat.play(); // methode 1 , creer un class abstraite pour tambour et batterie et une interface pour medias ( play , .. )
        }

        // 1er developpeur
        System.out.println("1er developpeur");
        List<Object> objectBeats = new ArrayList<>();
        objectBeats.add(b2);
        objectBeats.add(b1);
        objectBeats.add(t1);
        MediaUtils.remix1(objectBeats);

        //2 em developpeur
        System.out.println("2 em developpeur");
        List<Tambour> randomBeats = new ArrayList<>();
        randomBeats.add(t1);
        randomBeats.add(t2);
        randomBeats.add(t3);
        MediaUtils.remix2(randomBeats);

        //3 em developpeur
        System.out.println("3 em developpeur");
        HashMap beatsMap = new HashMap<>();
        beatsMap.put(1, b1);
        beatsMap.put(2, t1);
        beatsMap.put(3, b2);
        beatsMap.put(4, t2);
        MediaUtils.remix3(beatsMap.values());

        System.out.println("end ! :) ");
    }
}
