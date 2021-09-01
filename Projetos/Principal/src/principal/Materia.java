package principal;

import java.util.LinkedList;
import javax.swing.JOptionPane;

public class Materia{
    LinkedList<String> mat = new LinkedList<>();
    
    public void addMateria(String nome){
    mat.add(nome);
    }
    
    public void listaMaterias(){
        String mensagem = "MATÉRIAS";
        for(String a : mat){
            mensagem = mensagem + "\n" + a;
        }
        JOptionPane.showMessageDialog(null, mensagem);
    }
    
    public void BuscaMateria(String nome_busca){
        String mensagem = "A matéria "+nome_busca+" não está na lista!";
        for(String a: mat){
            if(a.equals(nome_busca)){
                mensagem = "A matéria "+nome_busca+" foi encontrada na lista!";
            }
        }
        JOptionPane.showMessageDialog(null, mensagem);
    }
    public void delMateria(String materia){
        mat.remove(materia);
    }
}