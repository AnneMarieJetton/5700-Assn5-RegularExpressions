import BinaryDetectorStates.BinaryStartState
import EmailDetectorStates.EmailStartState
import FloatingPointDetectorStates.FloatingPointStartState
import IntegerDetectorStates.IntegerStartState
import PasswordDetectorStates.PasswordStartState

abstract class Detector {
//    var state: State = IntegerStartState(this)

    val binary = BinaryStartState(this)
    val email = EmailStartState(this)
    val floatingPoint = FloatingPointStartState(this)
    val integer = IntegerStartState(this)
    val password = PasswordStartState(this)
    val detectorDictionary = mapOf<String, State>(
        "binary" to binary,
        "email" to email,
        "floatingPoint" to floatingPoint,
        "integer" to integer,
        "password" to password
    )

    var state: State? = detectorDictionary[DetectorType()]

    fun detect(input: String): Boolean? {
        val chars = input
            .trim()
            .split("")
            .drop(1)
            .dropLast(1)
            .toMutableList()

        for(char in chars){
            state?.consumeInput(char)
        }
        val isAccepting = state?.isAccepting
        state = IntegerStartState(this)

        return isAccepting

    }

    abstract fun DetectorType(): String
}