import java.time.LocalDate

open class Conta(

    var numero: String,
    var cliente: Cliente,
    var saldo: Short,

    // Infos
    conta: Conta,

    telefone:  String,
    endereco:   String,
    email:   String,

    cpf: String,
    nomeCompleto: String,
    rg: String,
    dataDeNascimento: LocalDate

    ) : Cliente (

    conta = conta,

    telefone = telefone,
    endereco =  endereco,
    email =  email,

    cpf =  cpf,
    nomeCompleto =  nomeCompleto,
    rg =  rg,
    dataDeNascimento =  dataDeNascimento

)