//Declração do pacote
package com.example.composetutorial

//Declaração de bibliotecas
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.tooling.preview.Preview

class MainActivity : ComponentActivity() {
    //Sobrescrita de método e chamada do bundle:
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        //Define o layout da atividade em que as funções de composição são chamadas
        setContent {
            //Função que recebe texto e participa da configuração dos elementos de texto
            MessageCard("Android")
        }
    }
}

//Composição de um novo componente
@Composable
//Método MessageCard
fun MessageCard(name: String) {
    //O Text é definido pela biblioteca UI, mostrando um identificador de texto
    Text(text = "Hello $name!")
}

//Permite vizualizar as funções
@Preview(showBackground = false)

//Anotação de criação de função que pode ter composição de componentes
@Composable

//Método PreviewMessageCard
fun PreviewMessageCard() {
    //Função MessageCard que está assumindo o papel do $name
        MessageCard("Android")

}