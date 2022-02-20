import java.time.LocalDate

open class Cliente(

    var cpf: String,
    var nomeCompleto: String,
    var rg: String,
    var dataDeNascimento: LocalDate,

    // INFOS CLASSE MÃE

    conta : Conta,

    telefone: String,
    endereco: String,
    email: String,

    ) : Pessoa (

    endereco =  endereco,
    telefone = telefone,
    email =  email

)
