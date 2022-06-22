package Detectors

import BinaryDetectorStates.BinaryStartState
import Detector
import FloatingPointDetectorStates.FloatingPointStartState
import State

class FloatingPointDetector(): Detector()  {

//    override fun detectorType(): String {
//        return "floatingPoint"
//    }

    override fun detectorType(): State {
        return FloatingPointStartState(this)
    }
}