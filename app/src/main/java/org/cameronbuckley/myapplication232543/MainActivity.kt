package org.cameronbuckley.myapplication232543

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import kotlinx.android.synthetic.main.activity_main.*
import kotlin.random.Random

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }
    //whatWeChose, whatTheyChose, winLoseView
    //use a random number generator to generate a random value for the opponent and have a choice based on that value
    // 0 = paper, 1 = rock, 2 = scissors
    // new line
    fun paperButtonPressed(view: View){
        val opponentChoice = Random.nextInt(2)
        when(opponentChoice){
            0 -> whatTheyChose.text = "They picked paper"
            1 -> whatTheyChose.text = "They picked rock"
            2 -> whatTheyChose.text = "They picked scissors"
        }
        whatWeChose.text = "We picked paper "
        //win conditions here
        when(opponentChoice){
            0 -> winLoseView.text = "It's a draw"
            1 -> winLoseView.text = "We won!"
            2 -> winLoseView.text = "We lost :("
        }

    }
    fun rockButtonPressed(view: View){
        val opponentChoice = Random.nextInt(2)
        when(opponentChoice){
            0 -> whatTheyChose.text = "They picked paper"
            1 -> whatTheyChose.text = "They picked rock"
            2 -> whatTheyChose.text = "They picked scissors"
        }
        whatWeChose.text = "We picked rock "
        //win conditions here
        when(opponentChoice){
            0 -> winLoseView.text = "We lost :("
            1 -> winLoseView.text = "It's a draw"
            2 -> winLoseView.text = "We won!"
        }
    }
    fun scissorsButtonPressed(view: View){
        val opponentChoice = Random.nextInt(2)
        when(opponentChoice){
            0 -> whatTheyChose.text = "They picked paper"
            1 -> whatTheyChose.text = "They picked rock"
            2 -> whatTheyChose.text = "They picked scissors"
        }
        whatWeChose.text = "We picked scissors "
        //win conditions here
        when(opponentChoice){
            0 -> winLoseView.text = "We won!"
            1 -> winLoseView.text = "We lost :("
            2 -> winLoseView.text = "It's a draw"
        }
    }

}
