package Detectors

import IntegerDetectorStates.StartState
import State

class IntegerDetector {
    var state: State = StartState(this)

    fun detectInt(input: String): Boolean {
        val chars = input
            .trim()
            .split("")
            .drop(1)
            .dropLast(1)
            .toMutableList()

        for(char in chars){
            state.consumeInput(char)
        }
        val isAccepting = state.isAccepting
        state = StartState(this)

        return isAccepting

    }
}