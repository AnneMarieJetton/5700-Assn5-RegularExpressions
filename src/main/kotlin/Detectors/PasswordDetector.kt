package Detectors

import BinaryDetectorStates.BinaryStartState
import Detector
import PasswordDetectorStates.PasswordStartState
import State

class PasswordDetector(): Detector() {

//    override fun detectorType(): String {
//        return "password"
//    }

    override fun detectorType(): State {
        return PasswordStartState(this)
    }
}