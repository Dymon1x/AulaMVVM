package br.com.digitalhouse.aula32_1311

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class MainViewModel: ViewModel() {

    val soma = MutableLiveData<Int>().apply {
        value = 0
    }

    //Método de incremento
    fun incremento(num: Int){
        var n = num + 100
        soma.value.let{
            soma.value = it!! + n
        }

    }
    //Método para reiniciar a soma
    fun refresh(){
        soma.value = 0
    }
}