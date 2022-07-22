package crudclientes;

import java.io.File;
import java.io.FileWriter;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

public class Cliente {

    private String nome;
    private String email;

    public String getNome(){
        return nome;
    }
    public String getEmail(){
        return email;
    }
    public void setNome(String nome){
        this.nome = nome;
    }
    public void setEmail(String email){
        this.email = email;
    }
    
    public String salvar() {
        File fl = new File("C:\\Users\\Vini\\Desktop\\java\\clientes.txt");

        if (!fl.exists()) {
            try {
                fl.createNewFile();
                FileWriter writer = new FileWriter(fl);
                writer.write(this.nome + " - " + this.email);
                writer.flush();
                writer.close();
            } catch (Exception ex) {
                JFrame frame = new JFrame("JOptionPane conta Paga");
                JOptionPane.showMessageDialog(frame,
                        "Arquivo não foi criado." + ex.getMessage(),
                        "Erro",
                        JOptionPane.DEFAULT_OPTION);
                System.exit(0);
            }
        }
        return "Suceso ao cadastrar!";
    }

    void setNome(JTextField jTextNome) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    void setEmail(JTextField jTextEmail) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
