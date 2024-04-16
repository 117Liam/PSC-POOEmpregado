//A fim de representar empregados em uma empresa, crie uma classe chamada Empregado que inclui as três informações a seguir como atributos:
//Um primeiro nome,
//Um sobrenome, e
//Um salário mensal.
//Sua classe deve ter um construtor que inicializa os três atributos. Forneça os métodos método get/set para cada atributo. Se o salário mensal não for positivo, configure-o como 0.0. Escreva um aplicativo de teste que demonstra as capacidades da classe. Crie duas instâncias da classe e exiba o salário anual de cada instância (soma dos salários mensais). Então dê a cada empregado um aumento de 10% e exiba novamente o salário anual de cada empregado.

public class Empregado{
private String primeiroNome;
private String sobrenome;
private float salarioMensal;

  public Empregado(String primeiroNome, String sobrenome, float salarioMensal){
    this.primeiroNome = primeiroNome;
    this.sobrenome = sobrenome;
    this.salarioMensal = salarioMensal;

}


public Empregado(){
    this.primeiroNome = "";
    this.sobrenome = "";
    this.salarioMensal = 0.0f;
 
}
  
public float calcularSalarioAnual(){
return this.salarioMensal * 12;
  
}

public void aumentarSalario(){
this.salarioMensal = this.salarioMensal * 1.10f;  

  
}

// Criar métodos set para cada atributo.

public void setPrimeiroNome(String primeiroNome){
this.primeiroNome = primeiroNome;
  
}

public void setSobrenome(String sobrenome){
this.sobrenome = sobrenome;
  
} 

public void setSalarioMensal(float salarioMensal){
  if(salarioMensal > 0){
    this.salarioMensal = salarioMensal;
  } else {
    this.salarioMensal = 0.0f;
  }
}  

// Criar métodos get para cada atributo.

public String getPrimeiroNome(){
return primeiroNome;

}

public String getSobrenome(){
return sobrenome;

}

public float getsalarioMensal(){
return salarioMensal;

}

  
  
}