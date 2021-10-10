package fundamentos.desafios


fun calDias(dias: Int, meses: Int, anos: Int): Int{
    return dias + (meses * 30) + (anos * 365)
}