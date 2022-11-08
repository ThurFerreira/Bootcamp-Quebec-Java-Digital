import javax.swing.*;
import java.io.*;

public class App {
    public static void main(String[] args) {
        String nomeDoArquivo = JOptionPane.showInputDialog("Nome do arquivo a ser exibido: ");

        imprimirArquivoNoConsole(nomeDoArquivo);
        System.out.println("\nCom exception ou não, o programa continua...");
    }

    public static void imprimirArquivoNoConsole(String nomeDoArquivo) {

        try {
            BufferedReader br = lerArquivo(nomeDoArquivo);
            String line = br.readLine();
            BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
            do {
                bw.write(line);
                bw.newLine();
                line = br.readLine();
            } while (line != null);
            bw.flush();
            br.close();

        } catch(ImpossivelAberturaDeArquivoException e){ //arquivo não existe

            JOptionPane.showMessageDialog(null, e.getMessage());

        } catch (IOException ex) {

            JOptionPane.showMessageDialog(null,
            "Ocorreu um erro não esperado, por favor, fale com o suporte." + ex.getMessage());
            ex.printStackTrace();

        }
    }

    public static BufferedReader lerArquivo(String nomeDoArquivo) throws ImpossivelAberturaDeArquivoException {

        File file = new File(nomeDoArquivo);
       try{
            return new BufferedReader(new FileReader(nomeDoArquivo));
       
        } catch(FileNotFoundException e){

        throw new ImpossivelAberturaDeArquivoException(file.getName(), file.getPath());

       }
        
    }
}
