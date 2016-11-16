package model;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author zefelix
 */
public class Curriculo {

    private String nome;
    private String endereco;
    private String nacionalidade;
    private String estadoCiv;
    private String cidade;
    private String estado;
    private String telefone;
    private String email;
    private String objetivo;
    //formacao academica
    private String instituicao;
    private String status;
    private String periodo;
    private String formacoes;
    //esperiencias profissionais
    private String funcao;
    private String empresa;
    private String periodoEP;
    private String experiencias;
    //cursos extracurriculares
    private String instituicaoEC;
    private String cursoEC;
    private String periodoEC;
    private String cursosExtrasEC;

    public Curriculo(String nome, String endereco, String nacionalidade, String estadoCiv, String cidade, String estado, String telefone, String email, String objetivo, String instituicao, String status, String periodo, String formacoes, String funcao, String empresa, String periodoEP, String experiencias, String instituicaoEC, String cursoEC, String periodoEC, String cursosExtrasEC) {
        this.nome = nome;
        this.endereco = endereco;
        this.nacionalidade = nacionalidade;
        this.estadoCiv = estadoCiv;
        this.cidade = cidade;
        this.estado = estado;
        this.telefone = telefone;
        this.email = email;
        this.objetivo = objetivo;
        this.instituicao = instituicao;
        this.status = status;
        this.periodo = periodo;
        this.formacoes = formacoes;
        this.funcao = funcao;
        this.empresa = empresa;
        this.periodoEP = periodoEP;
        this.experiencias = experiencias;
        this.instituicaoEC = instituicaoEC;
        this.cursoEC = cursoEC;
        this.periodoEC = periodoEC;
        this.cursosExtrasEC = cursosExtrasEC;
    }

    public Curriculo() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
    

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public String getNacionalidade() {
        return nacionalidade;
    }

    public void setNacionalidade(String nacionalidade) {
        this.nacionalidade = nacionalidade;
    }

    public String getEstadoCiv() {
        return estadoCiv;
    }

    public void setEstadoCiv(String estadoCiv) {
        this.estadoCiv = estadoCiv;
    }

    public String getCidade() {
        return cidade;
    }

    public void setCidade(String cidade) {
        this.cidade = cidade;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getObjetivo() {
        return objetivo;
    }

    public void setObjetivo(String objetivo) {
        this.objetivo = objetivo;
    }

    public String getInstituicao() {
        return instituicao;
    }

    public void setInstituicao(String instituicao) {
        this.instituicao = instituicao;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getPeriodo() {
        return periodo;
    }

    public void setPeriodo(String periodo) {
        this.periodo = periodo;
    }

    public String getFormacoes() {
        return formacoes;
    }

    public void setFormacoes(String formacoes) {
        this.formacoes = formacoes;
    }

    public String getFuncao() {
        return funcao;
    }

    public void setFuncao(String funcao) {
        this.funcao = funcao;
    }

    public String getEmpresa() {
        return empresa;
    }

    public void setEmpresa(String empresa) {
        this.empresa = empresa;
    }

    public String getPeriodoEP() {
        return periodoEP;
    }

    public void setPeriodoEP(String periodoEP) {
        this.periodoEP = periodoEP;
    }

    public String getExperiencias() {
        return experiencias;
    }

    public void setExperiencias(String experiencias) {
        this.experiencias = experiencias;
    }

    public String getInstituicaoEC() {
        return instituicaoEC;
    }

    public void setInstituicaoEC(String instituicaoEC) {
        this.instituicaoEC = instituicaoEC;
    }

    public String getCursoEC() {
        return cursoEC;
    }

    public void setCursoEC(String cursoEC) {
        this.cursoEC = cursoEC;
    }

    public String getPeriodoEC() {
        return periodoEC;
    }

    public void setPeriodoEC(String periodoEC) {
        this.periodoEC = periodoEC;
    }

    public String getCursosExtrasEC() {
        return cursosExtrasEC;
    }

    public void setCursosExtrasEC(String cursosExtrasEC) {
        this.cursosExtrasEC = cursosExtrasEC;
    }
    

}
