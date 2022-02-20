import java.time.LocalDate

open class ContaPoupanca(

    var rendimento: String,
    
    // INFOS CLASSE MÃE

    conta : Conta,

    telefone :  String,
    endereco :   String,
    email :   String,

    numero: String,
    cliente: Cliente,
    saldo: Short,

    cpf: String,
    nomeCompleto: String,
    rg: String,
    dataDeNascimento: LocalDate

    ): Conta (

    conta = conta,

    telefone =  telefone,
    endereco =  endereco,
    email =  email,

    numero = numero,
    cliente = cliente,
    saldo = saldo,

    cpf =  cpf,
    nomeCompleto =  nomeCompleto,
    rg =  rg,
    dataDeNascimento =  dataDeNascimento
)


