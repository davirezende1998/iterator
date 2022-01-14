import java.util.Iterator;
public class ContagemDosOficiais {
    public static Integer contarOficiaisMilitares(Batalhao batalhao) {
        int militar = 0;
        for (Oficial oficial : batalhao) {
            if (oficial.getArea().equals("Militar")) {
                militar++;
            }
        }
        return militar;
    }

    public static Integer contarOficiaisFederais(Batalhao batalhao) {
        int federal = 0;
        for (Oficial oficial : batalhao) {
            if (oficial.getArea().equals("Federal")) {
                federal++;
            }
        }
        return federal;
    }

    public static Integer contarOficiaisCivis(Batalhao batalhao) {
        int civil = 0;
        for (Oficial oficial : batalhao) {
            if (oficial.getArea().equals("Civil")) {
                civil++;
            }
        }
        return civil;
    }

    public static Integer contarOficiaisBatalhao(Batalhao batalhao) {
        int total = 0;
        for (Oficial oficial : batalhao) {
            total++;
        }
        return total;
    }
}