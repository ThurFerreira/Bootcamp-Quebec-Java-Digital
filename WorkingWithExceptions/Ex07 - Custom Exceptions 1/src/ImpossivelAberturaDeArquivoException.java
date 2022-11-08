public class ImpossivelAberturaDeArquivoException extends Exception{
   
    private String nomeArquivo;
    private String diretorio;

    ImpossivelAberturaDeArquivoException(String nomeArquivo, String diretorio){
        
        super("Arquivo" + nomeArquivo + "não existe no diretório" + diretorio);
        this.nomeArquivo = nomeArquivo;
        this.diretorio = diretorio;
    }
}
