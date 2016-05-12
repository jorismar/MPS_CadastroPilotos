package cadastroPilotos.piloto;

import aeronave.Aeronave;
import java.util.LinkedList;

public class Piloto {
    private String cpf;
    private String nome;
    private String endereco;
    private String fone;
    private String mail;
    private String breve;
    private String registroP;
    private LinkedList<Titulacao>   titulacoes;
    private LinkedList<Experiencia> expProfissional;
    private LinkedList<Aeronave>    tipoAeronave;
    private int qtde_titulacoes;
    private int qtde_exp;
    private int qtde_tip;

    public Piloto(String cpf, String nome, String endereco, String fone, String mail, String breve, String registroP, LinkedList<Titulacao> titulacoes, LinkedList<Experiencia> expProfissional, LinkedList<Aeronave> tipoAeronave, int qtde_titulacoes, int qtde_exp, int qtde_tip) {
        this.cpf = cpf;
        this.nome = nome;
        this.endereco = endereco;
        this.fone = fone;
        this.mail = mail;
        this.breve = breve;
        this.registroP = registroP;
        this.titulacoes = titulacoes;
        this.expProfissional = expProfissional;
        this.tipoAeronave = tipoAeronave;
        this.qtde_titulacoes = qtde_titulacoes;
        this.qtde_exp = qtde_exp;
        this.qtde_tip = qtde_tip;
    }

    public Piloto(String nome, String endereco, String fone, String mail, String breve,
            String registroP, LinkedList<Titulacao> tit, int qtde1, LinkedList<Experiencia> exp,
            int qtde2, LinkedList<Aeronave> tip, int qtde3) {
        this.nome = nome;
        this.endereco = endereco;
        this.fone = fone;
        this.mail = mail;
        this.breve = breve;
        this.registroP = registroP;
        titulacoes = tit;
        qtde_titulacoes = qtde1;
        expProfissional = exp;
        qtde_exp = qtde2;
        tipoAeronave = tip;
        qtde_tip = qtde3;

    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public void addTitulacao(Titulacao titulacao) {
        titulacoes.add(titulacao);
        qtde_titulacoes++;
    }

    public void addExpProfissional(Experiencia exp) {
        expProfissional.add(exp);
        qtde_exp++;
    }

    public void addTipoAeronave(Aeronave tipo) {
        tipoAeronave.add(tipo);
        qtde_tip++;
    }

    public String getNome() {
        return nome;
    }

    public String getEndereco() {
        return endereco;
    }

    public String getFone() {
        return fone;
    }

    public String getMail() {
        return mail;
    }

    public String getBreve() {
        return breve;
    }

    public String getRegistroP() {
        return registroP;
    }
    
    public LinkedList<Titulacao> getTitulacao() {
        return titulacoes;
    }

    public LinkedList<Experiencia> getExpProfissional() {
        return expProfissional;
    }

    public LinkedList<Aeronave> getTipoAeronave() {
        return tipoAeronave;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public void setFone(String fone) {
        this.fone = fone;
    }

    public void setMail(String mail) {
        this.mail = mail;
    }

    public void setBreve(String breve) {
        this.breve = breve;
    }

    public void setRegistroP(String registroP) {
        this.registroP = registroP;
    }
}
