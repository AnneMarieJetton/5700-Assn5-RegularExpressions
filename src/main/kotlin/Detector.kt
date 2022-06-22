
abstract class Detector {
    var state: State = detectorType()

    fun detect(input: String): Boolean? {

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
        state = detectorType()

        return isAccepting

    }
    abstract fun detectorType(): State
}