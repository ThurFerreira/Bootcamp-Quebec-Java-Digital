package WorkingWithCollections.Map.Ordenação;

class ComparatorNome implements Comparator<Map.Entry<String, Livro>>{

        @Override
        public int compare(Map.Entry<String, Livro> l1, Map.Entry<String, Livro> l2) {
            return l1.getValue().getNome().compareToIgnoreCase(l2.getValue().getNome());
        }
    }
