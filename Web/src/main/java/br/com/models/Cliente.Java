package br.com.inovacode.inovacode.controllers;

public class Client {

    private ObjectId id;

    private String nome;

    private String email; 

    private Patrimonio patrimonio; 
    
    private List<Estoque> estoque;



  public ObjectId getId() {
    return id;
  }
  public void setId(ObjectId id) {
    this.id = id;
  }
  public String getNome() {
    return nome;
  }
  public void setNome(String nome) {
    this.nome = nome;
  }

  public String getEmail() {
    return dataNascimento;
  }
  public void setEmail (String email) {
    this.email = email;
  }
  public String getPatrimonio() {
    return patrimonio;
  }
  public void setPatrimonio (Patrimonio patrimonio) {
    this.patrimonio = patrimonio;
  }
  public List<Estoque> getEstoque() {
    return estoque;
  }
  public void setEstoque (List<Estoque> estoque) {
    this.estoque = estoque;
  }

}