
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.ImageIcon;


public class LerEscrever {
    static ArrayList<Cadastro> banco = new ArrayList<>();
    static ArrayList<Estado> estado = new ArrayList<>();
    public static int cont = 0;
    public static Cadastro cad = new Cadastro(null, null, null, null, 0, 0, null);
    
    
    public static void main(String[] args) throws IOException, ClassNotFoundException,ParseException {
        ler_arquivo_gerar_bd("cadastros.txt",banco);
        ordenarArrayList(banco);
        //banco.sort(null);
        inserir_estados();
     
        TelaCadastro tc = new TelaCadastro();
        TelaInserir ti = new TelaInserir(banco, estado);
        TelaVisualizar tv = new TelaVisualizar(banco);
        TelaRemover tr = new TelaRemover(banco);
        TelaEditar te = new TelaEditar(banco, estado);
        
        tc.setTelaAuxiliar(ti, tv, tr, te);
        ti.setTelaAuxiliar(tc);
        tv.setTelaAuxiliar(tc);
        tr.setTelaAuxiliar(tc);
        te.setTelaAuxiliar(tc);
        
        tc.setVisible(true);
    }
    

    public static void ler_arquivo_gerar_bd(String arqLeitura, ArrayList<Cadastro> bnc) throws FileNotFoundException, IOException, ClassNotFoundException, ParseException {
 
        BufferedReader br = new BufferedReader(new FileReader(arqLeitura));
        String linha = br.readLine();
        if(linha != null){
            FileInputStream readData = new FileInputStream(arqLeitura);
            ObjectInputStream readStream = new ObjectInputStream(readData);
            banco = (ArrayList<Cadastro>) readStream.readObject();
            
            readStream.close();
        }
        else System.out.println("esta vazio bicho!");
        //System.out.println(banco.get(0).getNome());
        
    }
    
    public static void escrever_arquivo() throws IOException{
        FileOutputStream writeData = new FileOutputStream("cadastros.txt");
        ObjectOutputStream writeStream = new ObjectOutputStream(writeData);

        writeStream.writeObject(banco);
        writeStream.flush();
        writeStream.close();

    }
    
    public static void ordenarArrayList(ArrayList<Cadastro> v) throws IOException{
        Cadastro aux;
        for(int i=0; i<v.size()-1;i++){
            for(int j=i; j<v.size();j++){
                if(v.get(i).getNome().compareTo(v.get(j).getNome())> 0){
                    aux = v.get(i);
                    //v.get(i) = v.get(j);
                    v.set(i, v.get(j));
                    v.set(j, aux);
                }
            }
        }
        escrever_arquivo();
    }
    
    public static void inserir_estados(){
        Estado est1 = new Estado("Acre", "AC");
        estado.add(est1);
        est1 = new Estado("Alagoas", "AL");
        estado.add(est1);
        est1 = new Estado("Amapá", "AP");
        estado.add(est1);
        est1 = new Estado("Amazonas", "AM");
        estado.add(est1);
        est1 = new Estado("Bahia", "BA");
        estado.add(est1);
        est1 = new Estado("Ceará", "CE");
        estado.add(est1);
        est1 = new Estado("Espírito Santo", "ES");
        estado.add(est1);
        est1 = new Estado("Goiás", "GO");
        estado.add(est1);
        est1 = new Estado("Maranhão", "MA");
        estado.add(est1);
        est1 = new Estado("Mato Grosso", "MT");
        estado.add(est1);
        est1 = new Estado("Mato Grosso do Sul", "MS");
        estado.add(est1);
        est1 = new Estado("Minas Gerais", "MG");
        estado.add(est1);
        est1 = new Estado("Pará", "PA");
        estado.add(est1);
        est1 = new Estado("Paraíba", "PB");
        estado.add(est1);
        est1 = new Estado("Paraná", "PR");
        estado.add(est1);
        est1 = new Estado("Pernambuco", "PE");
        estado.add(est1);
        est1 = new Estado("Piauí", "PI");
        estado.add(est1);
        est1 = new Estado("Rio de Janeiro", "RJ");
        estado.add(est1);
        est1 = new Estado("Rio Grande do Norte", "RN");
        estado.add(est1);
        est1 = new Estado("Rio Grande do Sul", "RS");
        estado.add(est1);
        est1 = new Estado("Rondônia", "RO");
        estado.add(est1);
        est1 = new Estado("Roraima", "RR");
        estado.add(est1);
        est1 = new Estado("Santa Catarina", "SC");
        estado.add(est1);
        est1 = new Estado("São Paulo", "SP");
        estado.add(est1);
        est1 = new Estado("Sergipe", "SE");
        estado.add(est1);
        est1 = new Estado("Tocantins", "TO");
        estado.add(est1);    
    }
    
  
    /*public static boolean existe(String s) {
        if(cad.getNome().toLowerCase().contains(s.toLowerCase()))
            return true;
        return false;
    }*/
}
