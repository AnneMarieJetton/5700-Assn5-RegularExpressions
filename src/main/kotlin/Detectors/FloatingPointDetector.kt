package Detectors

import Detector

class FloatingPointDetector(): Detector()  {

    override fun DetectorType(): String {
        return "Binary"
    }
}