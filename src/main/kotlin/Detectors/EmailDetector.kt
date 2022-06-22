package Detectors

import BinaryDetectorStates.BinaryStartState
import Detector
import EmailDetectorStates.EmailStartState
import State

class EmailDetector(): Detector()  {

//    override fun detectorType(): String {
//        return "email"
//    }

    override fun detectorType(): State {
        return EmailStartState(this)
    }

}