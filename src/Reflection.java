public class Reflection {
    public static void main(String[] args) {

        Class<?> classe = NomeTabela.class;

        if (classe.isAnnotationPresent(Tabela.class)) {
            Tabela tabelaAnnotation = classe.getAnnotation(Tabela.class);
            String nomeDaTabela = tabelaAnnotation.value();

            System.out.println("Nome da tabela: " + nomeDaTabela);
        } else {
            System.out.println("A anotação @Tabela não está presente na classe.");
        }
    }
}
