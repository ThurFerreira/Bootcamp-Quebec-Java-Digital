import java.io.*;

//Imprimir um arquivo no console.
public class CheckedException {
    public static void main(String[] args) {
        String nomeDoArquivo = "romance-blake-crouch.txt";

        try{

            imprimirArquivoNoConsole(nomeDoArquivo);
        }catch(FileNotFoundException e){
            System.out.println("Arquivo inexistente, confira o nome informado e tente novamente.");
        }
        catch(IOException e){
            System.out.println("Ocorreu um erro inesperado.");
        }

        System.out.println("Apesar da exception ou não, o programa continua...");
    }

    public static void imprimirArquivoNoConsole(String nomeDoArquivo) throws IOException{ 
        //FileNotFoundException é filha da IOException, então se lançarmos apenas a IOException, já cobre os erros que a FileNotFoundException pode dar
        File file = new File(nomeDoArquivo);

        BufferedReader br = new BufferedReader(new FileReader(file.getName()));
        String line = br.readLine();

        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        do{
            bw.write(line);
            bw.newLine();
            line=br.readLine();
        } while(line != null);
        
        bw.flush();
        br.close();
    }
}