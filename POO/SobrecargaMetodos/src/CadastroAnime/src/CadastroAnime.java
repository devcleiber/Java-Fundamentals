package CadastroAnime;
import domain.Anime;

public class CadastroAnime {
    public static void main(String[] args) {
        Anime anime = new Anime();
        anime.cadastrarAnime("Dragon Ball", "Ação", 150);//opção 1: nome, genero e episodios

        anime.cadastrarAnime("Avatar-Lenda de Aang", "Aventura", 100, 10);//opção 2: nome, genero, episodios e temporadas

        anime.cadastrarAnime("Bleach", "Shounen", 700, 22, " Tite Kubo");//opção 3: nome, genero, episodios, temporadas e autor

    }
}