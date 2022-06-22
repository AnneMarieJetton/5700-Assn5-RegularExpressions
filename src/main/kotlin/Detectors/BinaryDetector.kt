package Detectors

import BinaryDetectorStates.BinaryStartState
import Detector
import State

class BinaryDetector(): Detector() {

//    override fun detectorType(): String {
//        return "binary"
//    }
    override fun detectorType(): State {
        return BinaryStartState(this)
    }
}