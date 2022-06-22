package Detectors

import Detector

class IntegerDetector(): Detector() {

    override fun DetectorType(): String {
        return "Binary"
    }
}