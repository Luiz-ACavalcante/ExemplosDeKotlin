package fundamentos.desafios

fun CKelvinCelsius (temperaturaKelvin: Double): Double {
    return temperaturaKelvin - 273.15
}

fun CKelvinFahrenheit (temperaturaKelvin: Double): Double {
    return (temperaturaKelvin - 273.15 ) * 1.8 + 32
}

fun CCelsiusKelvin (temperaturaCelsius: Double): Double {
    return temperaturaCelsius + 273.15
}

fun CCelsiusFahrenheit(temperaturaCelsius: Double): Double {
    return temperaturaCelsius * 1.8 + 32
}

fun CFahrenheitCelsius (temperaturaFahrenheit: Double): Double {
    return (temperaturaFahrenheit - 32)/1.8
}

fun CFeahrenheitKelvin (temperaturaFahrenheit: Double): Double {
    return (temperaturaFahrenheit - 32) * (5/9) + 273
}