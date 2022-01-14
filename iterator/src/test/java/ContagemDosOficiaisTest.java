import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
class ContagemDosOficiaisTest {
    @Test
    void retornaOficiaisMilitares() {
        Batalhao batalhao = new Batalhao(
                new Oficial("Davi", "Militar"),
                new Oficial("Laura", "Militar"),
                new Oficial("Jose", "Civil"),
                new Oficial("Maria", "Federal"),
                new Oficial("Carlos", "Federal"),
                new Oficial("Sonia", "Federal")
        );
        assertEquals(2, ContagemDosOficiais.contarOficiaisMilitares(batalhao));
    }

    @Test
    void retornaOficiaisFederais() {
        Batalhao batalhao = new Batalhao(
                new Oficial("Davi", "Militar"),
                new Oficial("Laura", "Militar"),
                new Oficial("Jose", "Civil"),
                new Oficial("Maria", "Federal"),
                new Oficial("Carlos", "Federal"),
                new Oficial("Sonia", "Federal")
        );
        assertEquals(3, ContagemDosOficiais.contarOficiaisFederais(batalhao));
    }

    @Test
    void retornaOficiaisCivis() {
        Batalhao batalhao = new Batalhao(
                new Oficial("Davi", "Militar"),
                new Oficial("Laura", "Militar"),
                new Oficial("Jose", "Civil"),
                new Oficial("Maria", "Federal"),
                new Oficial("Carlos", "Federal"),
                new Oficial("Sonia", "Federal")
        );
        assertEquals(1, ContagemDosOficiais.contarOficiaisCivis(batalhao));
    }

    @Test
    void retornaTotalDeOficiaisNoBatalhao() {
        Batalhao batalhao = new Batalhao(
                new Oficial("Davi", "Militar"),
                new Oficial("Laura", "Militar"),
                new Oficial("Jose", "Civil"),
                new Oficial("Maria", "Federal"),
                new Oficial("Carlos", "Federal"),
                new Oficial("Sonia", "Federal")
        );
        assertEquals(6, ContagemDosOficiais.contarOficiaisBatalhao(batalhao));
    }
}