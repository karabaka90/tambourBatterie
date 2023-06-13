import java.util.Collection;
import java.util.HashMap;
import java.util.List;

public class MediaUtils {

    public MediaUtils() {
    }

    public static void remix1(List<Object> developpeur1) {
        for (Object beat : developpeur1) {
            if (beat instanceof Tambour)
                ((Tambour) beat).play();
            if (beat instanceof Batterie)
                ((Batterie) beat).play();
        }
    }

    public static void remix2(List<?> developpeur1et2) {
        for (Object beat : developpeur1et2) {
            if (beat instanceof Tambour)
                ((Tambour) beat).play();
            if (beat instanceof Batterie)
                ((Batterie) beat).play();
        }
    }

    public static void remix3(Collection<?> developpeur1et2et3) {
        for (Object beat : developpeur1et2et3) {
            ((Media) beat).play();
        }
    }

}
