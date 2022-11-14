package WorkingWithCollections.Map.Ordenação;

import java.util.Objects;

public class Livro {
    
        private String nome;
        private Integer paginas;
    
        public Livro(String nome, Integer paginas) {
            this.nome = nome;
            this.paginas = paginas;
        }
    
        public String getNome() {
            return nome;
        }
    
        public Integer getPaginas() {
            return paginas;
        }
    
        @Override
        public boolean equals(Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;
            Livro livro = (Livro) o;
            return nome.equals(livro.nome) && paginas.equals(livro.paginas);
        }
    
        @Override
        public int hashCode() {
            return Objects.hash(nome, paginas);
        }
    
        @Override
        public String toString() {
            return "Livro{" +
                    "nome='" + nome + '\'' +
                    ", paginas=" + paginas +
                    '}';
        }
    }
