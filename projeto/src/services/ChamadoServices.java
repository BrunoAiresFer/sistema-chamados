package services;
import java.io.File;
import java.io.IOException;
import java.lang.reflect.Array;
import java.time.LocalDateTime;
import model.Chamados;
import java.io.File;
import java.io.IOException;

public class ChamadoServices {

    Chamados nomeChamado = new Chamados();
    String nomeArquivo = nomeChamado.getNomeArquivo();

    String pastaDestino = System.getProperty("user.home") + File.separator + "Desktop" + File.separator + "Chamados";

    File diretorio = new File(pastaDestino);
    if(!diretorio.exists()){
        diretorio.mkdirs();
    }

    File criarChamado = new File(diretorio, nomeArquivo + ".txt");

                    try{
        if(criarChamado.createNewFile()){
            criarChamado.getAbsolutePath();
            System.out.println("Arquivo criado!: " + criarChamado.getName());

        } else {
            System.out.println("Arquivo já existe!");
        }
    } catch (IOException e){
        System.out.println("Ocorreu um erro.");
        e.printStackTrace();
    }


}
