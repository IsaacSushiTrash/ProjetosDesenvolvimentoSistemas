package principal;

import javax.swing.JOptionPane;

public class Principal {

    public static void main(String[] args) { 
        //Criando objeto Materia
        Materia a = new Materia();

        int qtd = Integer.parseInt(JOptionPane.showInputDialog("QUANTAS MATÉRIAS VOCÊ DESEJA ADICIONAR?"));
        //Adicionando na LinkedList
        for (int i = 0; i < qtd; i++) {
            String nome_mat = JOptionPane.showInputDialog((i+1)+"ª MATÉRIA");
            a.addMateria(nome_mat);
        }
        //Visualizando a LinkedList     
        a.listaMaterias();

        //Busca de matérias
        String busca = JOptionPane.showInputDialog("QUAL MATÉRIA VOCÊ QUER SABER SE ESTÁ NA LISTA?");
        a.BuscaMateria(busca);

        //Deletando da lista
        String deletar = JOptionPane.showInputDialog("QUAL MATÉRIA VOCÊ DESEJA REMOVER?");
        a.delMateria(deletar);
        
        //Visualizando a LinkedList
        a.listaMaterias();
    }
}
