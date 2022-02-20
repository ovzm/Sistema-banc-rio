import java.time.LocalDate

open class Gerente(

    var cpf: String,
    var nomeCompleto: String,
    var rg: String,
    var dataDeNascimento: LocalDate,
    var matricula: Short,
    var salario: Short,
    var turno: String,

    // INFOS CLASSE MÃE

    telefone: String,
    endereco: String,
    email: String,

    ) : Pessoa (

    telefone = telefone,
    endereco =  endereco,
    email =  email

)

