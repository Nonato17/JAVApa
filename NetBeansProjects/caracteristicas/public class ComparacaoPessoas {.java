public class ComparacaoPessoas {
    public static void main(String[] args) {
        // Informações da pessoa
        int idadePessoa = 25;
        double pesoPessoa = 70.0;
        double alturaPessoa = 1.75;
        String serieFavoritaPessoa = "Breaking Bad";
        String musicaFavoritaPessoa = "Bohemian Rhapsody";
        String jogoFavoritoPessoa = "The Witcher 3";

        // Suas informações
        int minhaIdade = 25;
        double meuPeso = 70.0;
        double minhaAltura = 1.75;
        String minhaSerieFavorita = "Breaking Bad";
        String minhaMusicaFavorita = "Bohemian Rhapsody";
        String meuJogoFavorito = "The Witcher 3";

        // Contador de características iguais
        int caracteristicasIguais = 0;

        // Comparação
        if (idadePessoa == minhaIdade) {
            caracteristicasIguais++;
        }

        if (pesoPessoa == meuPeso) {
            caracteristicasIguais++;
        }

        if (alturaPessoa == minhaAltura) {
            caracteristicasIguais++;
        }

        if (serieFavoritaPessoa.equals(minhaSerieFavorita)) {
            caracteristicasIguais++;
        }

        if (musicaFavoritaPessoa.equals(minhaMusicaFavorita)) {
            caracteristicasIguais++;
        }

        if (jogoFavoritoPessoa.equals(meuJogoFavorito)) {
            caracteristicasIguais++;
        }

        // Verificação com IF aninhado
        if (caracteristicasIguais >= 3) {
            if (caracteristicasIguais == 3) {
                System.out.println("Esta pessoa é um pouco parecida comigo!");
            } else {
                System.out.println("Esta pessoa é bem parecida comigo!");
            }
        } else {
            System.out.println("Esta pessoa não é muito parecida comigo.");
        }
    }
}