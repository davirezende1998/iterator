public class Oficial {
    private String nome;
    private String area;

    public Oficial(String nome, String area) {
        this.nome = nome;
        this.area = area;
    }

    public String getNome() {
        return nome;
    }

    public Oficial setNome(String nome) {
        this.nome = nome;
        return this;
    }

    public String getArea() {
        return area;
    }

    public Oficial setArea(String area) {
        this.area = area;
        return this;
    }
}